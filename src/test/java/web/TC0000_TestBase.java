package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod; 

import org.testng.annotations.Parameters;
import utils.GenericMethods;

public class TC0000_TestBase {  
	String title;
	boolean results;
	
	public WebDriver driver;
	GenericMethods gm = new GenericMethods(driver);
	
	
	@BeforeMethod
	@Parameters({"url","browser"}) 
	public void setUp(String url,String browser) {
		
		System.out.println("directory: " + System.getProperty("user.dir"));
		if (browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		} else if (browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

