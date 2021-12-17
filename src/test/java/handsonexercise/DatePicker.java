package handsonexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DatePicker {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;
	
	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
	}
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	@Test
	public void datePickerTest() {
		driver.findElement(By.cssSelector("i.glyphicon.glyphicon-th")).click();
		List<WebElement> oListDays = driver.findElements(By.cssSelector("th.dow"));
		
		//there should be 7 days in the week
		sf.assertEquals(oListDays.size(),7);
		
		//first day is monday
		sf.assertEquals(oListDays.get(0).getText(),"Mo");
		
		//Days of the week should be Mo,Tu,We,Th,Fr,Sa,Su
		String[] arrDaysOfWeek = new String[] {"Mo","Tu","We","Th","Fr","Sa","Su"};
		for(int loop=0; loop<oListDays.size();loop++) {
			String actual = oListDays.get(loop).getText();
			String expected = arrDaysOfWeek[loop];
			sf.assertEquals(actual, expected);
		}
		sf.assertAll();
		

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
