package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssertion {
org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp() {
		sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority=1)
	public void softAssertTest() {
		
		sf.assertEquals("Amritha", "Amritha");
		sf.assertEquals("Menon", "Menon");
		sf.assertEquals("amritha@gmail.com", "amritha@gmail.com");
		sf.assertEquals("", "8938532742");
		sf.assertEquals("", "Tester");
		sf.assertAll();
	}
	
	@Test(priority=2)
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}
}
