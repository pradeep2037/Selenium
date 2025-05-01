package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonDropDown {

	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Test
	public void amazonDropDown() throws InterruptedException {
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
