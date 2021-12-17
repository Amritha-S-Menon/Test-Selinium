package assesments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class Assesment3 {
	WebDriver driver;
	WebDriverManager webDrvMgr;
	SoftAssert sf;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;
	
	
	@BeforeClass
	public void setUp() {
		webDrvMgr = new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("http://demo.seleniumeasy.com/");
	}
	
	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
		
	}
	

	@Test
	public void assaignmentTest() throws InterruptedException {
		WebElement checkBox=driver.findElement(By.xpath("//a[text()='Table']"));
		checkBox.click();
		WebElement oTypeBox = driver.findElement(By.xpath("//li[@style='display: list-item;']//a[@href='./table-pagination-demo.html']"));
		oTypeBox.click();
		try {
			driver.findElement(By.cssSelector("a.page_link"));
			System.out.println("Page links are available");
		}catch(Exception ex) {
			System.out.println("Page links are not available");
		}	

	}
	
	@Test
	public void assignment3Test2() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='2']")).click();
		try {
			driver.findElement(By.cssSelector("li.active"));
		}catch(Exception ex) {
			System.out.println("Page links are not working");
		}
		
		
		driver.findElement(By.xpath("//a[text()='3']")).click();
		try {
			driver.findElement(By.cssSelector("li.active"));
		}catch(Exception ex) {
			System.out.println("Page links are not working");
		}
		}
	@Test
	public void assignment3Test3() {
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("//a[text()='Input Form Submit']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ammu@1123.com");
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123648967");
		driver.findElement(By.xpath("//input[@name='address']")).clear();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Menon");
		driver.findElement(By.xpath("//input[@name='last_name']")).clear();
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Menon");
		
		
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
