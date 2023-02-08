package com.hrmsmasters.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.hrms.base.TestBase;
import com.hrms.masters.HrmsHomePage;
import com.hrms.masters.LoginPage;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterGeoCountryTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterGeoCountryTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		softAssert = new SoftAssert();
		loginPage = new LoginPage();
		homePage = new HrmsHomePage();
		addCountry=new MasterGeoCountry();
		
				
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(10);
//		mastersPage = homePage.goToMasters();
	}
	
//	@Test(priority=1)
//	public void verifyPageTitleTest() {
//		String pagetitle=driver.getTitle();
//		String url=driver.getCurrentUrl();
//		System.out.println(pagetitle);
//		System.out.println(url);
//		if(pagetitle.equals("Perks Admin")) {
//		softAssert.assertEquals(pagetitle,Constants.PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//		softAssert.assertAll();
//		}
//		else {
//			softAssert.assertEquals(pagetitle,Constants.THINKSYNQ_PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//			softAssert.assertAll();
//		}
		//softAssert.assertTrue("Perks Admin".equals(pagetitle),"Masters Geography Page");
		//Assert.assertTrue(condition, message);
		//Assert.assertEquals(mastersPage.verifyPageTitle(), "MASTERS");	
			
//	}
	
	@Test(priority=1, enabled = true)
	public void verifyAddCountry() throws InterruptedException {
		
	Assert.assertTrue(addCountry.addCountry(prop.getProperty("GeographyCountryName")));	
	}

	@Test(priority=2, enabled = true)
	public void verifyResetButton() throws InterruptedException {
		
		Assert.assertTrue(addCountry.resetbuttonvalidation(prop.getProperty("GeographyCountryName")));
			
	}


	@Test(priority=3, enabled = true)
	public void verifyAddCountryDuplicateCheck() throws InterruptedException {
		
		String Countryname=addCountry.addCountryDuplicateCheck(prop.getProperty("GeographyCountryDuplicateName"));
		System.out.println(Countryname);
		
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", Countryname);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", Countryname);
//			}
	//	Assert.assertEquals("Duplicate Data Please Check", Countryname);
			
	}
	
	@Test(priority=4, enabled = true)
	public void verifyAddCountryNegativeCheck() throws InterruptedException {
		
		String Countryname=addCountry.addCountryNegativeCheck(prop.getProperty("GeographyCountryNegativeCheck"));
		System.out.println(Countryname);
		Assert.assertEquals("Please enter Country Name", Countryname);
			
	}
	
	@Test(priority=5,enabled = true )
	public void verifyNextbuttonPagination() throws InterruptedException {
		
		addCountry.nextbuttonPagination();
			
	}

	@Test(priority=6, enabled = true)
	public void VerifyEnterTheSearchBoxCountryPagination() throws InterruptedException {
		Assert.assertTrue(addCountry.searchCountryNamepagination(prop.getProperty("SearchpaginationGeographyCountryName")));
	}

		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
