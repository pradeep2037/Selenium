package robotclassandfileuploading;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploading {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Test
	public void automatingFileUploading() throws AWTException, InterruptedException {
		
		Robot rb = new Robot();
		driver.findElement(By.xpath("//span[text()='New post']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@src,'desktop-assets')]/parent::label")).click();
		Thread.sleep(2000);
		
		String path = "C:\\Users\\kravm\\OneDrive\\Desktop\\IRCTC\\2_.png";
		
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
