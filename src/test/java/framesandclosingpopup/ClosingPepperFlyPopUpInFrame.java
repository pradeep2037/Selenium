package framesandclosingpopup;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClosingPepperFlyPopUpInFrame {
	


	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void automatingPepperFry() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		mywait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@title,'notification-frame')]")));
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);

		js.executeScript("arguments[0].click();", element);
	}
	
	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
