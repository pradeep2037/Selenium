package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpinnerWait {
	
	

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void automatingSpinner() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='=']")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@id=\"spinner\"]")));
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"screen\"]")).getText(), "5");
		



	}
	

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}




