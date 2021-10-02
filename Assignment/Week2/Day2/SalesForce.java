package week2.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("UserFirstName")).sendKeys("Tester1stName");
		driver.findElement(By.name("UserLastName")).sendKeys("TesterLastName");
		driver.findElement(By.name("UserEmail")).sendKeys("tester@gmail.com");

		WebElement titleDropDown = driver.findElement(By.name("UserTitle"));
		Select title = new Select(titleDropDown);
		title.selectByVisibleText("Developer / Software Engineer / Analyst");

		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9500095000");

		WebElement employeesDropDown = driver.findElement(By.name("CompanyEmployees"));
		Select employees = new Select(employeesDropDown);
		employees.selectByVisibleText("501 - 1500 employees");

		WebElement cntryDropDown = driver.findElement(By.name("CompanyCountry"));
		Select cntry = new Select(cntryDropDown);
		cntry.selectByVisibleText("India");

		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		// driver.findElement(By.name("start my free trial")).click();
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/SalesForce.png");
		FileUtils.copyFile(src1, dst);

		System.out.println("Successfully Started Free trial!!!");

	}

}
