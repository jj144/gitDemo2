package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DummyTestSample {
    private WebDriver driver;		
	@Test				
	public void dummyTest1() {	
		System.out.println(" methodname " + getClass().getEnclosingMethod().getName());
		System.out.println("blah blah");
	
	}	
	@BeforeSuite
	public void beforeSuit() {
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\softwares installers\\chromedriver_win32_ver102\\chromedriver.exe");

		//Creating an object of ChromeDriver
		 driver = new ChromeDriver();
		//driver.manage().window().maximize();
		System.out.println("here in beforeSuit");
		

		//Deleting all the cookies
		//driver.manage().deleteAllCookies();

		//Specifiying pageLoadTimeout and Implicit wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void afterSuit() {
		  driver.quit();  
	}
	@BeforeTest
	public void beforeTest() {	
	
	  //  driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
	//	driver.quit();			
	}		
}
