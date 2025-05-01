package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountingDropDownItemsInAmazon {
	

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
		List<WebElement> allLinks = dropDown.findElements(By.tagName("option"));
		
		for (WebElement link : allLinks) {
			
			System.out.println(link.getText());
		}
	}
	
	
	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
