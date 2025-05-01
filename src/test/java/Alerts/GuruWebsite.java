package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GuruWebsite {
	
	
	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}

	@Test
	public void amazonDropDown() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mngr589366");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("yjahunA");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("32");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals(alert.getText(), "Do you really want to delete this Customer?");
		alert.accept();
		
		

		Assert.assertEquals(alert.getText(), "Customer does not exist!!");
		alert.accept();
	}

	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}





