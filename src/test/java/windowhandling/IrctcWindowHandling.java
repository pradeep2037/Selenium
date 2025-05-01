package windowhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class IrctcWindowHandling {

	ChromeDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("id : " + driver.getWindowHandle());
	}
	
	
	@Test
	public void automatingIrctc() throws InterruptedException {
		String homeWindowId = driver.getWindowHandle();
		WebElement element = driver.findElement(By.xpath("//span[text()='Get Connected with us on social networks']/parent::div"));
		List<WebElement> elements = element.findElements(By.tagName("a"));
		
		for (WebElement singleElement : elements) {
			js.executeScript("arguments[0].scrollIntoView(true)", singleElement);
			js.executeScript("arguments[0].click();", singleElement);
			
			Set<String> allWindowIds = driver.getWindowHandles();
			
			for (String singleId : allWindowIds) {
				
				if(!homeWindowId.equals(singleId)) {
					driver.switchTo().window(singleId);
					break;
				}
			}
			
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println("===================================================================");
			driver.close();
			driver.switchTo().window(homeWindowId);
		}
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
