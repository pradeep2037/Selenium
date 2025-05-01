package LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactInHotelApp {
	
	ChromeDriver driver = new ChromeDriver();

	
	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void likTesting() {
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("TotalSize : "+elements.size());
		
		for (WebElement webElement : elements) {
			
			System.out.println(webElement.getText());
			
//			elements = driver.findElements(By.tagName("a"));
//			driver.findElement(By.linkText(webElement.getText())).click();
//			System.out.println(driver.getTitle());
//			driver.navigate().back();
//			System.out.println("---------------------------------------------------------");
		}
	}
	
	
	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
