package MiscellenousActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RevenueCalculator {
	
ChromeDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void initialSetUp() {

		driver.get("https://fitpeo.com/revenue-calculator");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void revenueCalculator() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDropBy(driver.findElement(By.xpath("//span[@class=\"MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh\"]")), 70, 0).build().perform();

	}
	
	
	
	@AfterMethod
	public void closeUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
