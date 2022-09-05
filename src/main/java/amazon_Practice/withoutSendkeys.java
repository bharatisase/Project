package amazon_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutSendkeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement amz=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
			Thread.sleep(3000);

		  jse.executeScript("arguments[0].click();",amz);
		 System.out.println(jse);
		driver.close();
	}

}
