package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageGridResults {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By firstProductImage = By.xpath("//*[@id='searchResults']/li[1]//*[@class='image-content']");
	By FirstProductTitle = By.xpath("//*[@id='searchResults']/li[1]//span[@class='main-title']");
	By FirstProductPrice = By.xpath("//*[@id='searchResults']/li[1]//span[@class='price__fraction']");

	
	public PageGridResults(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), firstProductImage);
		gm.takeScreenshot(driver);
	}
	
	public String getTitle() { 
		return driver.findElement(FirstProductTitle).getText();
	}
	
	public String getPrice() { 
		return driver.findElement(FirstProductPrice).getText();
	}
	
	public void clickOnFirstProduct() {
		driver.findElement(firstProductImage).click();
	}
	

}
