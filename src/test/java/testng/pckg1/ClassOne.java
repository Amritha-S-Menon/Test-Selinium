package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassOne {
  @Test (priority =3)
  public void test1() {
	  System.out.println("Class1_test1");
  }
  @Test(priority =2)
  public void test2() {
	  System.out.println("Class1_test2");
  }
  @Test(priority =1)
  public void test3() {
	  System.out.println("Class1_test3");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
