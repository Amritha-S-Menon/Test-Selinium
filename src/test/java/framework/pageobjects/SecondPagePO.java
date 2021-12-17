package framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class SecondPagePO {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;
	
	public SecondPagePO (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);	
	}


	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("https://demoqa.com/browser-windows/");
	}

	@Test
	public void switchWindowTest() {
		driver.findElement(By.xpath("//div[@data-component-id='1']")).click();
		webDrvUtil.switchWindow();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.close();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
