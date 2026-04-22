package framesandclosingpopup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99 {

	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}

	@Test
	public void framesAndWindowHandling() throws InterruptedException {

		String homeWindow = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		driver.switchTo().defaultContent();

		Set<String> multiPages = driver.getWindowHandles();

		Set<String> multipleWindows = driver.getWindowHandles();

		for (String eachTab : multipleWindows) {

			if (!eachTab.equalsIgnoreCase(homeWindow)) {
				driver.switchTo().window(eachTab);
				break;
			}
		}

		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@class,'kt-blocks-info-box-link')]")));
		System.out.println("Size : "+elements.size());
				
		for(int i=1;i<=elements.size();i++) {
			try {
				WebElement relocatingEle = driver.findElement(By.xpath("(//a[contains(@class,'kt-blocks-info-box-link')])["+i+"]"));
				js.executeScript("arguments[0].click();", relocatingEle);
				wait.until(driver -> js.executeScript("return document.readyState").equals("complete"));
				System.out.println("Url : "+driver.getCurrentUrl());
				System.out.println("Title : "+driver.getTitle());
				System.out.println("======================================================");
				driver.navigate().back();
			}
			catch (Exception e) {
				System.out.println("Error at index : "+i);
				System.out.println(e.getMessage());
			}
			
		}

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
