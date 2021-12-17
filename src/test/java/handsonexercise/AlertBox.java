package handsonexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AlertBox {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	}
	
	

	@Test
	public void alertBoxTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement oElem = driver.findElement(By.id("confirm-demo"));
		String innertext = oElem.getText();
		Assert.assertEquals(innertext, "You pressed OK!");
		Thread.sleep(2000);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
