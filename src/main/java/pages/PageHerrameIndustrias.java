package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageHerrameIndustrias {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By industriaTextil      = By.xpath("//*[text()='Industria Textil']");

	
	public PageHerrameIndustrias(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), industriaTextil);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnindustriaTextil() {
		driver.findElement(industriaTextil).click();
	}
	

}

