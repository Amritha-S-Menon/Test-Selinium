package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;


public class NavigateToGoogleAssertion {
	org.testng.asserts.SoftAssert sf;
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	
	@BeforeClass
	public void setUp(){
		WebDriverManager webDrvMgr =new WebDriverManager();
		driver=webDrvMgr.launchBrowser("chrome");
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogle() {
		String title= driver.getTitle();
		sf.assertEquals("Google", title);
		String url= driver.getCurrentUrl();
		sf.assertEquals("https://www.google.co.in/", url);
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		sf.assertEquals("India", innerText);
		String attribClass = oelem.getAttribute("Class");
		sf.assertEquals("uU7dJb", attribClass);
		
		List<WebElement> oList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		String[] arr = new String[] {"About","Advertising","Business","How search works"};
		int i=0;
		for (WebElement oElem : oList) {
			String innertext = oElem.getText();
			sf.assertEquals(arr[i], innerText);
			i++;
		}
		sf.assertAll();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
