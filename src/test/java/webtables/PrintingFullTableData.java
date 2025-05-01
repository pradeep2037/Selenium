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


public class PrintingFullTableData {
	
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void automatingTableData() {
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println("rows-size : "+rows.size());
		
		for (WebElement eachRow : rows) {
			
			List<WebElement> columns = eachRow.findElements(By.tagName("td"));
			

			
			for (WebElement eachColumn : columns) {
				
				System.out.print(eachColumn.getText()+"\t");
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
