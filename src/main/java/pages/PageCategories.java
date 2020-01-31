package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.GenericConstants;
import utils.GenericMethods;

public class PageCategories {
	WebDriver driver;
	GenericMethods gm= new GenericMethods(driver);
	
	By tecnologia      = By.xpath("//a[contains(text(),'Tecnolog')]");
	By hogaryElectro   = By.xpath("//a[text()='Hogar y Electrodomésticos']");
	By juguetesyBebes  = By.xpath("//a[text()='Juguetes y Bebés']");
	By hereIndustrias  = By.xpath("//a[text()='Herramientas e Industrias']");
	By bellezayCuidado = By.xpath("//a[text()='Belleza y Cuidado Personal']");
	
	public PageCategories(WebDriver driver) throws Exception{
		this.driver= driver;
		gm.waitforElementVisible(driver, GenericConstants.getMiddlewait(), tecnologia);
		gm.takeScreenshot(driver);
	}
	
	public void clickOnTecnología() {
		driver.findElement(tecnologia).click();
	}
	
	public void clickOnHogaryElectro() {
		driver.findElement(hogaryElectro).click();
	}
	
	public void clickOnJuguetesyBebes() {
		driver.findElement(juguetesyBebes).click();
	}
	
	public void clickOnherreIndustrias() {
		driver.findElement(hereIndustrias).click();
	}
	
	public void clickOnBellezayCuidado() {
		driver.findElement(bellezayCuidado).click();
	}

}
