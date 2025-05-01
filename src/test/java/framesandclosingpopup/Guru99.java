package framesandclosingpopup;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void automatingFrames() throws InterruptedException {

		String homeWindowId = driver.getWindowHandle();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//a[contains(@href,'guru99')]")).click();
		driver.switchTo().defaultContent();

		Set<String> allWindowIdS = driver.getWindowHandles();

		for (String singleWindowId : allWindowIdS) {
			driver.switchTo().window(singleWindowId);
			if (driver.getTitle().equalsIgnoreCase("Selenium Live Project for Practice")) {
				break;
			}
		}

		List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@class,'kt-blocks')]"));

		for (int i = 0; i < elements.size(); i++) {
			Thread.sleep(2000);
			elements = driver.findElements(By.xpath("//a[contains(@class,'kt-blocks')]"));
			elements.get(i).click();
			Thread.sleep(2000);
			System.out.println("Title : " + driver.getTitle());
			driver.navigate().back();
		}
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
