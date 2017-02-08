package Insurance.Insuron;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class InsuronTest {
	@Test
	public static void testFreeQuotes() throws InterruptedException
	{
		HomePage homePage = new HomePage();
		QuoteInsureon quoteInsureon = new QuoteInsureon();
		homePage.navigateToSmallBusiness();
		Thread.sleep(5000);
		String title = homePage.getTittle();
		
	    Assert.assertEquals("Small Business Insurance | Insureon", title);
	                        
	    homePage.selectIndustry("Restaurants and Bars");
	    homePage.selectService("Auto Body Shop");
	    homePage.clickGetFreeQuotesButton();
	    quoteInsureon.verifyTitle();
	    quoteInsureon.setZipCode("60018");
	    quoteInsureon.setCompanyName("Burak INC");
	    quoteInsureon.clickNext();
	    quoteInsureon.selectCompanyType("General Liability and Business Property");
	    quoteInsureon.setStartDate("12/01/2016");
	    quoteInsureon.setEmployeeCount("10");
	    quoteInsureon.setSubContracting("No");
	    quoteInsureon.setOwnerCount("1");
	    quoteInsureon.setPayroll("5000");
	    quoteInsureon.setOwnerPayroll("1000");
	    quoteInsureon.clickNext();
	    quoteInsureon.setFirstName("Shah");
	    quoteInsureon.setLastName("Aktan");
	    quoteInsureon.setContactPhoneNumber("312-090-0909");
	    quoteInsureon.setEmail("jone@gmail.com");
	    quoteInsureon.setInsuranceStartDate("2/25/2017");
	    quoteInsureon.clickNext();
	    
	    
	    Assert.assertTrue(quoteInsureon.isQuoteLinkPresent());
	    
	}
	

}
