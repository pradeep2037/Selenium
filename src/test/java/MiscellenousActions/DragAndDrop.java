package MiscellenousActions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	ChromeDriver driver = new ChromeDriver();

	
	@BeforeMethod
	public void initialSetUp() {
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void dragAndDrop() {
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"draggable\"]")), driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).build().perform();
		
	}
	
	

	@AfterMethod
	public void closeUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
