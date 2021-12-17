package handsonexercise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class InputBox {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
	}

	@Test
	public void inputBoxTest() {

		WebElement iBoxA = driver.findElement(By.id("sum1"));
		iBoxA.clear();
		iBoxA.sendKeys("6");
		WebElement iBoxB = driver.findElement(By.id("sum2"));
		iBoxB.clear();
		iBoxB.sendKeys("8");

		String value1 = iBoxA.getAttribute("value");
		String value2 = iBoxB.getAttribute("value");
		driver.findElement(By.xpath("//button[@onclick='return total()']")).click();

		WebElement oBox = driver.findElement(By.id("displayvalue"));
		String expected = oBox.getText();

		try {
			int a = Integer.parseInt(value1);
			int b = Integer.parseInt(value2);
			int r = Integer.parseInt(expected);
			Assert.assertEquals(r, a + b);
		} catch (Exception e) {
			Assert.assertEquals(expected, "NaN");

		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
