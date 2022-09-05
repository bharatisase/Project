package amazon_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon_EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		WebElement account = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		action.moveToElement(account).build().perform();
		List<WebElement> lis = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		
		for (WebElement webElement : lis) {
			String listofElement = webElement.getText();
			System.out.println(listofElement);
		}
		driver.findElement(By.xpath("//div[@id='nav-xshop']//following-sibling::a[3]")).click();
		List <WebElement> list=driver.findElements(By.xpath("//div[@id='nav-subnav']//following-sibling::a[@class='nav-a nav-hasArrow']"));
for(WebElement list1:list) {
	String size=list1.getText();
	System.out.println(size);
}
driver.findElement(By.xpath("//span[contains(text(),'Laptops & Accessories')]")).click();
	}

}
