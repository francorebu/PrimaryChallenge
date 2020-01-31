package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageJuguetesyBebes {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By cuartoDelBebe      = By.xpath("//*[text()='Cuarto del Bebé']");

	
	public PageJuguetesyBebes (WebDriver driver) throws Exception {
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), cuartoDelBebe);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnCuartoDelBebe() {
		driver.findElement(cuartoDelBebe).click();
	}
	

}

