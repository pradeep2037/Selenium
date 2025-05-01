package CheckBoxesAndRadioButtons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtons {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void radioButton1() {
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}
	
	
	@Test
	public void radioButton2() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Milk']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element);
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}



