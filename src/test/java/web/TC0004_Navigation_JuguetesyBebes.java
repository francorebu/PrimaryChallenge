package web;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageCategories;
import pages.PageFiltersStack;
import pages.PageJuguetesyBebes;
import pages.PageMenuList;


public class TC0004_Navigation_JuguetesyBebes extends TC0000_TestBase {  
	
	
	@Test
	public void TC0004NavigationCuartosDelBebe() throws Exception {
	
		PageMenuList pml       = new PageMenuList(driver);
		pml.clickOnCategorias();
		PageCategories pc      = new PageCategories(driver);
		pc.clickOnJuguetesyBebes();
		PageJuguetesyBebes pjb = new PageJuguetesyBebes(driver);
		pjb.clickOnCuartoDelBebe();
		PageFiltersStack pfs   = new PageFiltersStack(driver);
		title                  = pfs.getTitle();
		results                = pfs.getResultsAppearance();
		Assert.assertEquals(title, "Cuarto del Bebé");
		Assert.assertEquals(results, true);
	
	}
	
	
	
}
