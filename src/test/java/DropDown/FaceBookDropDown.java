package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookDropDown {

	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void initialSetUp() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void facebookDropDown() {

		driver.findElement(By.xpath("//a[@href=\"/r.php?entry_point=login\"]")).click();

		// Day
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByValue("25");

		// Month
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByValue("1");

		// Year
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByValue("2000");

	}

	@AfterMethod
	public void finalSetUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
