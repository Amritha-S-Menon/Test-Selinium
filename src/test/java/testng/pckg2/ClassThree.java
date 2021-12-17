package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassThree {
	@Test
	  public void test1() {
		  System.out.println("Class4_test1");
	  }
	  @Test
	  public void test2() {
		  System.out.println("Class4_test2");
	  }
	  @Test
	  public void test3() {
		  System.out.println("Class3_test3");
	  }
	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }
}
