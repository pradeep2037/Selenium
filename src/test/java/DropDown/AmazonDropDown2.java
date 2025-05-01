package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonDropDown2 {
	
ChromeDriver driver = new ChromeDriver();

	
	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	
	@Test
	public void amazonDropDown() throws InterruptedException {
		
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

		Select select = new Select(dropDown);
		select.selectByValue("search-alias=stripbooks");

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
