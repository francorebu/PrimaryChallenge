package web;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageCategories;
import pages.PageGridResults;
import pages.PageMenuList;
import pages.PageProductDetailContainer;
import pages.PageTecnologia;
import pages.PageUbicacion;

public class TC0005_Navigation_TitleAndPriceComparison extends TC0000_TestBase {  
	
	
	@Test
	public void TC0001NavigationTecnologia() throws Exception {
	
		String expectedTitle, expectedPrice;
		String actualTitle, actualPrice;
		PageMenuList pml     = new PageMenuList(driver);
		pml.clickOnCategorias();
		PageCategories pc    = new PageCategories(driver);
		pc.clickOnTecnología();
		PageTecnologia pt    = new PageTecnologia(driver);
		pt.clickOnCeluysmarthphones();
		PageUbicacion pu     = new PageUbicacion(driver);
		pu.clickOnCapFed();
		PageGridResults pgr  = new PageGridResults(driver);
		expectedTitle = pgr.getTitle();
		expectedPrice = pgr.getPrice();
		pgr.clickOnFirstProduct();
		PageProductDetailContainer ppdc= new PageProductDetailContainer(driver);
		actualTitle = ppdc.getTitle();
		actualPrice = ppdc.getPrice();
		Assert.assertEquals(expectedTitle,actualTitle );
		Assert.assertEquals(expectedPrice,actualPrice );
	
	}
	
	
	
}
