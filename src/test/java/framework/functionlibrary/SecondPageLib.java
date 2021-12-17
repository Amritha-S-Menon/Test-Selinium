package framework.functionlibrary;

import java.util.List;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.HomePagePO;
import framework.pageobjects.SearchResultsPO;
import framework.pageobjects.SecondPagePO;

public class SecondPageLib {
	
	WebDriver driver;
	SearchResultsPO searespo;
	SecondPagePO secpo;
	
	public SecondPageLib(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void getProductName() {
		secpo = new SecondPagePO(driver);
		secpo.switchWindowTest();
		
	}

}
