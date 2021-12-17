package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ClassTwo {
  @Test
  public void test1() {
	  System.out.println("Class2_test1");
  }
  @Test
  public void test2() {
	  System.out.println("Class2_test2");
  }
  @Test
  public void test3() {
	  System.out.println("Class2_test3");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
