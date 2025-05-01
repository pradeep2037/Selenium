package screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakingScreenShotOfAdactHotel {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Test
	public void takingScreenShots() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\kravm\\OneDrive\\Documents\\SeleniumScreenShots\\Adact1.png");
		FileUtils.copyFile(screenShot, path);
	}
	
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
