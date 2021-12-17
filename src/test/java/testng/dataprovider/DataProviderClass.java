package testng.dataprovider;

//import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
  

  @DataProvider(name="data-provider")
  public Object[][] dpMethod() {
	    return new Object[][] {
	    	{"Vivek"},
	    	{"Mayur"},
	    	{"Shanmukha"},
	    	{"Darshan"}
	    };
	  }
  @DataProvider(name="data-provider")
  public static Object[][] dpMethod1() {
	    return new Object[][] {
	    	{1,2},
	    	{3,4},
	    	{5,6},
	    	{7,8}
	    };
	    }
}
