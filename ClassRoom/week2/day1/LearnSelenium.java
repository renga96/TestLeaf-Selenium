package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();
		System.out.println("Title of Page :" + title);

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		String title1 = driver.getTitle();
		System.out.println("Title of Page :" + title1);

		WebElement crmsfalink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfalink.click();
		
		String title2 = driver.getTitle();
		System.out.println("Title of Page :" + title2);
		

		// driver.close();

	}

}
