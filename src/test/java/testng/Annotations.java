package testng;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;

	public class Annotations {
		  @Test
		  public void testOne() {
			  System.out.println("Annotations1_testOne");
		  }
		  @Test
		  public void testTwo() {
			  System.out.println("Annotations1_testTwo");
		  }
		  @Test
		  public void testThree() {
			  System.out.println("Annotations1_testThree");
		  }
		  
		  @BeforeMethod
		  public void beforeMethod() {
			  System.out.println("beforeMethod");
		  }

		  @AfterMethod
		  public void afterMethod() {
			  System.out.println("afterMethod");
		  }

		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("beforeClass");
		  }

		  @AfterClass
		  public void afterClass() {
			  System.out.println("afterClass");
		  }

		 

		  

		}
