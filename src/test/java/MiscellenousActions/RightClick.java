package MiscellenousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {

	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

	}

	@Test
	public void rightClick() throws InterruptedException {
		Actions action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).keyDown(Keys.DOWN)
				.keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).build().perform();

//		pause(2000);
//		action.keyDown(Keys.DOWN).
//		pause(2000);
//		action.keyDown(Keys.DOWN).
//		pause(2000);
//		action.keyDown(Keys.DOWN).
//		pause(2000);
//		action.keyDown(Keys.ENTER)
//		.build().perform();

//		Actions c1 = action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
////		pause(2000);
//		c1.keyDown(Keys.DOWN).
//		pause(2000);
//		c1.keyDown(Keys.DOWN).
//		pause(2000);
//		c1.keyDown(Keys.DOWN).
//		pause(2000);
//		c1.keyDown(Keys.ENTER)
//		.build().perform();
	}

	@AfterMethod
	public void closeUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
