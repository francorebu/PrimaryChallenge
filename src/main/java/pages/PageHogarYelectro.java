package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageHogarYelectro {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By climatizacion      = By.xpath("//*[text()='Climatización']");

	
	public PageHogarYelectro(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), climatizacion);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnClimatizacion() {
		driver.findElement(climatizacion).click();
	}
	

}
