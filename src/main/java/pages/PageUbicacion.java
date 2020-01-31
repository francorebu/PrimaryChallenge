package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageUbicacion {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By capitalFed      = By.xpath("//*[text()='Capital Federal']");

	
	public PageUbicacion(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), capitalFed);
		gm.scrollToElement(driver, capitalFed);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnCapFed() {
		driver.findElement(capitalFed).click();
	}
	

}
