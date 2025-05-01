package robotclassandfileuploading;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AuthenticatingPopUpHandlingAndTypingTextInAlertPopUp {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	
	@Test
	public void automatingPopUp() throws AWTException, InterruptedException {
		Robot rb = new Robot();
		
		String username = "admin";
		String password = "admin";
		
		StringSelection usrname = new StringSelection(username);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(usrname, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
//		=========================================================================================
		
		StringSelection pswd = new StringSelection(password);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pswd, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"));
		Assert.assertEquals(element.getText(), "Congratulations! You must have the proper credentials.");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
