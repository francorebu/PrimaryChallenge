package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.google.common.io.Files;

public class GenericMethods {
	
	WebDriver driver;
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	public GenericMethods(WebDriver driver ) {
		this.driver=driver;
	}
	
	/**
	 * Waits for page to load = readyState 
	 * @return
	 */
	public boolean waitForPageLoad() {
		String pageLoadStatus;
		try {
			do {
				pageLoadStatus = (String) js.executeAsyncScript("return document.readyState");
			} while(!pageLoadStatus.equals("complete"));
			
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * It scrolls to any element to be visible
	 * @param driver
	 * @param locator
	 * @throws InterruptedException
	 */
	public void scrollToElement(WebDriver driver,By locator) throws InterruptedException {
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}
	
	/**
	 * It sets text to any inputbox field
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public void setText(WebDriver driver,By locator,String value) {
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(locator);
		js.executeScript("arguments[0].value='" + value + "';", Element);
	}
	
	/**
	 * it waits for an element to be visible, if not it fails
	 * @param driver
	 * @param timeout  
	 */
	public boolean waitforElementVisible (WebDriver driver, int timeout, By locator ) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Takes a screenshot to the current page and send it to Screenshots directory
	 * @param driver
	 * @throws Exception
	 */
	public void takeScreenshot(WebDriver driver) throws Exception {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
		screenShotName = new File(System.getProperty("user.dir") + "\\Screenshots\\" + timeStamp + ".png");
		Files.copy(scrFile, screenShotName);
		String filePath = screenShotName.toString();
		String path = "<br><img src='" +filePath +"'<br>";
		Reporter.log(path);
		 
	}
	
	

}
