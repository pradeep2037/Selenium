package LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingTheAllLinks {
	
	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void testingLinks() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		System.out.println("---------------------------------------------------------");
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
			link.click();
			System.out.println(driver.getCurrentUrl());
			System.out.println("---------------------------------------------------------");
			driver.navigate().back();
		}
	}
	
	
	
	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
