package amazon_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {
	WebDriver driver;

	@Test
	public void m1() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		WebElement xyz = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions action = new Actions(driver);
		action.moveToElement(xyz).build().perform();
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		FileInputStream fis = new FileInputStream("E:\\Bharati_Automation\\secondMProject\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(prop.getProperty("uname"));
		driver.quit();
	}

}
