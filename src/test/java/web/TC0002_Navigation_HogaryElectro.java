package web;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageCategories;
import pages.PageFiltersStack;
import pages.PageHogarYelectro;
import pages.PageMenuList;


public class TC0002_Navigation_HogaryElectro extends TC0000_TestBase {  
	
	
	@Test
	public void TC0002NavigationHogaryElectro() throws Exception {
	
		PageMenuList pml     = new PageMenuList(driver); 
		pml.clickOnCategorias();
		PageCategories pc    = new PageCategories(driver);
		pc.clickOnHogaryElectro();
		PageHogarYelectro phe= new PageHogarYelectro(driver);
		phe.clickOnClimatizacion();
		PageFiltersStack pfs = new PageFiltersStack(driver);
		title                = pfs.getTitle();
		results              = pfs.getResultsAppearance();
		Assert.assertEquals(title, "Climatización");
		Assert.assertEquals(results, true);
	
	}
	
	
	
}
