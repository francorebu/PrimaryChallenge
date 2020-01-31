package web;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageCategories;
import pages.PageFiltersStack;
import pages.PageMenuList;
import pages.PageTecnologia;

public class TC0001_Navigation_Tecnologia extends TC0000_TestBase {  
	
	
	@Test
	public void TC0001NavigationTecnologia() throws Exception {
	
		PageMenuList pml     = new PageMenuList(driver);
		pml.clickOnCategorias();
		PageCategories pc    = new PageCategories(driver);
		pc.clickOnTecnología();
		PageTecnologia pt    = new PageTecnologia(driver);
		pt.clickOnCeluysmarthphones();
		PageFiltersStack pfs = new PageFiltersStack(driver);
		title                = pfs.getTitle();
		results              = pfs.getResultsAppearance();
		Assert.assertEquals(title, "Celulares y Smartphones");
		Assert.assertEquals(results, true);
	
	}
	
	
	
}
