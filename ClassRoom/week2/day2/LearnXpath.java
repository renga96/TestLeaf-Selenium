package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();
		System.out.println("Title of Page :" + title);

		WebElement username = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		username.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		String title1 = driver.getTitle();
		System.out.println("Title of Page :" + title1);

		WebElement crmsfalink = driver.findElement(By.xpath("//a[@style='color: black;']"));
		crmsfalink.click();
		
		String title2 = driver.getTitle();
		System.out.println("Title of Page :" + title2);
		
	}

}
