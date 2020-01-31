package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageTecnologia {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By celuySmartphones      = By.xpath("//*[text()='Celulares y Smartphones']");

	
	public PageTecnologia(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), celuySmartphones);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnCeluysmarthphones() {
		driver.findElement(celuySmartphones).click();
	}
	

}

