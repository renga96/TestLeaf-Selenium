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

public class Facebook {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement createAcnt = driver.findElement(By.linkText("Create New Account"));
		createAcnt.click();

		WebElement fName = driver.findElement(By.xpath("//input[@data-type='text']"));
		fName.sendKeys("Renga");

		WebElement lName = driver.findElement(By.name("lastname"));
		lName.sendKeys("R");

		WebElement mblNum = driver.findElement(By.name("reg_email__"));
		mblNum.sendKeys("9123456789");

		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("9123456789");

		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("8");

		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jul");

		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1996");

		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();

		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/FaceBook.png");
		FileUtils.copyFile(src1, dst);

		driver.close();
	}

}
