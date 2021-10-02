package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/login");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");

		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();

		WebElement crmBtn = driver.findElement(By.linkText("CRM/SFA"));
		crmBtn.click();

		WebElement leadsBtn = driver.findElement(By.linkText("Leads"));
		leadsBtn.click();

		WebElement createLeadBtn = driver.findElement(By.linkText("Create Lead"));
		createLeadBtn.click();

		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Accenture");

		/*
		 * WebElement companyName =
		 * driver.findElement(By.id("createLeadForm_parentPartyId"));
		 * companyName.sendKeys("Parent Account");
		 */
		WebElement fName = driver.findElement(By.id("createLeadForm_firstName"));
		fName.sendKeys("Jon");

		WebElement lName = driver.findElement(By.id("createLeadForm_lastName"));
		lName.sendKeys("Snow");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		source.sendKeys("Conference");

		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		market.sendKeys("Automobile");

		WebElement fNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fNameLocal.sendKeys("Tyrion");

		WebElement lNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lNameLocal.sendKeys("Lannistar");

		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Mr.");

		WebElement bDate = driver.findElement(By.id("createLeadForm_birthDate"));
		bDate.sendKeys("27/09/21");

		WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title.sendKeys("Lead");

		WebElement dept = driver.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("Mechanical");

		WebElement annualRevenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		annualRevenue.sendKeys("900000");

		// ====>>Contact Information<<====//

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.sendKeys("91");

		WebElement phnNo = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phnNo.sendKeys("9876543210");

		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("abc@gmail.com");

		// =====> Primary Address<=======//

		WebElement tName = driver.findElement(By.id("createLeadForm_generalToName"));
		tName.sendKeys("department");

		WebElement attentionName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		attentionName.sendKeys("department");

		WebElement address1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		address1.sendKeys("123 BROWN STREET");

		WebElement address2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		address2.sendKeys("department");

		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("Chennai");

		WebElement stateProv = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		stateProv.sendKeys("Alaska");

		WebElement zip = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		zip.sendKeys("6200114");

		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		country.sendKeys("India");

		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("Entred First Name is : " + firstName);
		
		String lastName = lName.getAttribute("value");
		System.out.println("Last Name: "+ lastName);

		WebElement createLead = driver.findElement(By.name("submitButton"));
		createLead.click();

		String pageTitle = driver.getTitle();
		System.out.println("In Page : " + pageTitle);

		if (pageTitle.equals("View Lead | opentaps CRM")) {
			System.out.println("The Page is Valid!!!! Lead created successfully for FirstName : " + firstName);
			driver.close();
		} else {
			System.out.println("The Page is Invalid! Lead not created!!!");
			driver.close();

		}

	}
}
