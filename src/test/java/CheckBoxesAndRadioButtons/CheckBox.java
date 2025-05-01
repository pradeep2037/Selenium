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

public class CheckBox {
	

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Test
	public void checkBox1() {
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());

	}
	
	@Test
	public void checkBox2() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@value='Milk']/parent::td"));
		List<WebElement> elements = element.findElements(By.tagName("input"));
		for (WebElement singleElement : elements) {
			if(singleElement.isSelected()) {
				js.executeScript("arguments[0].scrollIntoView(true)", singleElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", singleElement);
				Thread.sleep(2000);
			}
		}
		
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}
	
	
	@Test
	public void checkBox3() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@value='Milk']/parent::td"));
		List<WebElement> elements = element.findElements(By.tagName("input"));
		
		for (WebElement singleElement : elements) {
			if(!singleElement.isSelected()) {
				js.executeScript("arguments[0].scrollIntoView(true)", singleElement);
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", singleElement);
				Thread.sleep(2000);
			}
		}
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected());
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
