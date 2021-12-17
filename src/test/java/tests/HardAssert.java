package tests;
//package testng.tests.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test(priority=1)
	public void hardAssertTest() {
		Assert.assertEquals("Amritha", "Amritha");
		Assert.assertEquals("Menon", "Menon");
	
	}
	
	@Test(priority=2)
	public void hardAssertTest2() {
		Assert.assertEquals("amritha@gmail.com", "amritha@gmail.com");
		Assert.assertEquals("8938532742","8938532742");
	}
}
