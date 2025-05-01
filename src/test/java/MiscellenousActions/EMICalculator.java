package MiscellenousActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EMICalculator {

	ChromeDriver driver = new ChromeDriver();
	
	
	@BeforeMethod
	public void initialSetUp() {

		driver.get("https://emicalculator.net/#google_vignette");
		driver.manage().window().maximize();
	}

	@Test
	public void emiCalculator() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		Actions homeLoan = action.dragAndDropBy(driver.findElement(By.xpath("//span[@style='left: 25%;' and @tabindex=\"0\"]")), 80, 0);
		homeLoan.build().perform();
		Thread.sleep(2000);
		Actions interestRate = action.dragAndDropBy(driver.findElement(By.xpath("//span[@style=\"left: 26.6667%;\"]")), 150, 0);
		interestRate.build().perform();
		Thread.sleep(2000);
		Actions loanTenure = action.dragAndDropBy(driver.findElement(By.xpath("//span[@style=\"left: 66.6667%;\"]")), -107, 0);
		loanTenure.build().perform();
	}

	@AfterMethod
	public void closeUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
