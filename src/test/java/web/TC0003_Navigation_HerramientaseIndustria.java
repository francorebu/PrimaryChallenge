package web;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageCategories;
import pages.PageFiltersStack;
import pages.PageHerrameIndustrias;
import pages.PageMenuList;


public class TC0003_Navigation_HerramientaseIndustria extends TC0000_TestBase {  
	
	
	@Test
	public void TC0003NavigationHerramientaseIndustria() throws Exception {
	
		PageMenuList pml     = new PageMenuList(driver);
		pml.clickOnCategorias();
		PageCategories pc    = new PageCategories(driver);
		pc.clickOnherreIndustrias();
		PageHerrameIndustrias phi= new PageHerrameIndustrias(driver);
		phi.clickOnindustriaTextil();
		PageFiltersStack pfs = new PageFiltersStack(driver);
		title                = pfs.getTitle();
		results              = pfs.getResultsAppearance();
		Assert.assertEquals(title, "Industria Textil");
		Assert.assertEquals(results, true);
	
	}
	
	
	
}
