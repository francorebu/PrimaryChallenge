package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageProductDetailContainer {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By title = By.xpath("//*[contains(@class,'mr-32')]//*[@class='ui-pdp-title']");
	By price = By.xpath("//*[@class='ui-pdp-container__col col-2 mr-32']//*[@class='price-tag ui-pdp-price__part']//*[@class='price-tag-fraction']");

	
	public PageProductDetailContainer(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), title);
		gm.takeScreenshot(driver);
	}
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public String getPrice() {
		return driver.findElement(price).getText();
	}
	

}
