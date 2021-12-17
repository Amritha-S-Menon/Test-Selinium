package handsonexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

import org.testng.annotations.BeforeClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class MouseHover {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;
	
	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demoqa.com/menu/");
	}
	
	@Test
	public void mouseHoverTest() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement oLem =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		action.moveToElement(oLem).build().perform();
		Thread.sleep(9000);
		

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
