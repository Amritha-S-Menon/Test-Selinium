package handsonexercise;

import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

import org.testng.annotations.BeforeClass;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class SwitchWindow {

	WebDriver driver;
	WebDriverManager webDrvMgr;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;


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
		driver.findElement(By.xpath("//a[@href='/gp/slredirect/picassoRedirect.html/ref=pa_sp_atf_aps_sr_pg1_1?ie=UTF8&adId=A0061188357EPZKQ9BR4I&url=%2FNew-Apple-iPhone-XR-64GB%2Fdp%2FB08L8D44ZM%2Fref%3Dsr_1_1_sspa%3Fkeywords%3Diphone%26qid%3D1639746607%26sr%3D8-1-spons%26psc%3D1&qualifier=1639746607&id=4869292951988744&widgetName=sp_atf\']")).click();
		webDrvUtil.switchWindow();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		webDrvUtil.switchWindow();
		driver.findElement(By.id("tabButton")).click();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
