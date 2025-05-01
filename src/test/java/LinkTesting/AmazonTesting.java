package LinkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Program Not Working

public class AmazonTesting {

	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Test
	public void linkTesting() throws InterruptedException {
		
		WebElement block=driver.findElement(By.xpath("//div[@class='navFooterColHead' and text()='Make Money with Us']/parent::div"));
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement link : allLinks) {
//			block=driver.findElement(By.xpath("//div[@class='navFooterColHead' and text()='Make Money with Us']/parent::div"));
//			allLinks=block.findElements(By.tagName("a"));
//			System.out.println(link.getText());
			link.click();
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println("--------------------------------");
			driver.navigate().back();
		}

	}

	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
