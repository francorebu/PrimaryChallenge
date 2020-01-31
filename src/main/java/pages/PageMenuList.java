package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageMenuList {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By categorias      = By.xpath("//a[contains(@class,'categories-link')]");

	
	public PageMenuList(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), categorias);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnCategorias() {
		driver.findElement(categorias).click();
	}
	

}
