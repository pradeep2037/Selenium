package webtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQTable {
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Test
	public void automatingTable() {
		WebElement element = driver.findElement(By.xpath("//div[@class=\"rt-tbody\"]"));
		List<WebElement> rows = element.findElements(By.xpath("//div[@role=\"rowgroup\"]"));
		System.out.println("rows-size : "+rows.size());
		
		for (WebElement eachRow : rows) {
			
			WebElement row = eachRow.findElement(By.tagName("div"));
			List<WebElement> data = row.findElements(By.tagName("div"));
			
			for (WebElement singleData : data) {
				System.out.print(singleData.getText()+"\t");
			}
			
			System.out.println();
		}
	}
	

	@AfterMethod
	public void closingSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
