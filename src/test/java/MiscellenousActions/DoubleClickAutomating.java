package MiscellenousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoubleClickAutomating {

	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	public void amazonDropDown() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		int count = 0;

		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();

		doubleClickMethod();
		Thread.sleep(2000);
		doubleClickMethod();

		//Condition
		while (count < 5) {
			WebElement element1 = driver.findElement(By.xpath("//button[text()='Double Click']"));
			action.doubleClick(element1).build().perform();
			count = count + 1;
		}

	}

	private void doubleClickMethod() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"))).build()
				.perform();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//a[text()='Double Click']"));
		js.executeScript("arguments[0].click();", element);
	}

	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
