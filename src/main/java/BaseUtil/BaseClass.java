package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;
	
	//Before start a test

	@BeforeMethod
	
	public void setUp() {
		
		//First job is to recognize the location of a driver
  System.setProperty("webdriver.chrome.driver", "/Users/prantahasan/Downloads/chromedriver_mac64 (1)/chromedriver");
  
  ChromeOptions options = new ChromeOptions();
  
  options.addArguments("--remote-allow-origins=*");
     
        // Then we need to instantiated the driver
     driver = new ChromeDriver(options);
	
	    // Maximize method, Maximize the window
     driver.manage().window().maximize();
	
	   //Delete all cookies
	 driver.manage().deleteAllCookies();
	     
	    // get method get the targeted URL
	 driver.get("https://www.walgreens.com");
	   
	    //Time to load the page 
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	     //Time to wait for the web elements
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
     homePage = new HomePage(driver);
	}
	
	//After a test is done, what we need to do
	
	@AfterMethod
	public void tearUp() {
		
		driver.quit();
		
		
		
	}
}