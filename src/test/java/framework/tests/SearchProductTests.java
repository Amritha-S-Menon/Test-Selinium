package framework.tests;

import java.util.List;

import org.apache.tools.ant.taskdefs.optional.PropertyFile;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import framework.functionlibrary.HomePageLib;
import framework.functionlibrary.SearchResultsLib;
import utilities.DataProvider;
import utilities.selenium.WebDriverManager;

public class SearchProductTests {
	
	WebDriver driver;
	WebDriverManager webDrvMgr;
	private HomePageLib homePageLib;
	private SearchResultsLib seareslib;
	SoftAssert sf;
	
	//Test input
	private String propFile = "src/test/resources/base.prop";
	private String url = DataProvider.getTestData(propFile, "url");
	private String searchParam = DataProvider.getTestData(propFile, "searchParam");

	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get(url);
	}
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	
	@Test
	public void searchProductTest() {
		Reporter.log("Search for product in homepage");
		homePageLib = new HomePageLib(driver);
		homePageLib.searchForProduct(searchParam);
		seareslib = new SearchResultsLib(driver);
		List<String> listProdNames = seareslib.getListOfProductNames();
		for(String prodName : listProdNames) {
			sf.assertTrue(prodName.toLowerCase().contains(searchParam.toLowerCase()),
					"FAIL | Actual product name " + prodName + "doesn't containthe search parameter" + searchParam);
			
		}
		sf.assertAll();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
