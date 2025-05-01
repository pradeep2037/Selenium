package MiscellenousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOver {
	
	ChromeDriver driver = new ChromeDriver();

	
	@BeforeMethod
	public void initialSetUp() {
		
		driver.get("https://www.kvb.co.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void mouseOverAction() throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[@data-href=\"/personal/#loans\"]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Vehicle Loans']")).click();
		System.out.println(driver.getTitle());

		
		
	}
	
	@AfterMethod
	public void closeUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
