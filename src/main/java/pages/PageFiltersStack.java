package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageFiltersStack {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By title      = By.xpath("//*[@class='breadcrumb__title']");
	By results    = By.xpath("//*[@class='quantity-results']");

	
	public PageFiltersStack(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), title);
		gm.takeScreenshot(driver);
	}
	
	public  String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public  boolean getResultsAppearance() {
		if( driver.findElement(results).isDisplayed()){
			return true;
		}else{
			return false;
		}
	}
	

}


