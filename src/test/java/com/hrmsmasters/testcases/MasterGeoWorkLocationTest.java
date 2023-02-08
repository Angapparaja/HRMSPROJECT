package com.hrmsmasters.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.base.TestBase;
import com.hrms.masters.HrmsHomePage;
import com.hrms.masters.LoginPage;
import com.hrms.masters.MasterGeoBarangay;
import com.hrms.masters.MasterGeoCity;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.masters.MasterGeoProvince;
import com.hrms.masters.MasterGeoWorklocation;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterGeoWorkLocationTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	MasterGeoBarangay addBarangay;
	MasterGeoWorklocation addWorkLocation;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterGeoWorkLocationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		softAssert = new SoftAssert();
		loginPage = new LoginPage();
		homePage = new HrmsHomePage();
		addCountry=new MasterGeoCountry();
		addState=new MasterGeoProvince();
		addCity=new MasterGeoCity();
		addBarangay=new MasterGeoBarangay();
		addWorkLocation=new MasterGeoWorklocation();
				
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
//			softAssert.assertEquals(pagetitle,Constants.PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//			softAssert.assertAll();
//			}
//			else {
//				softAssert.assertEquals(pagetitle,Constants.THINKSYNQ_PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//				softAssert.assertAll();
//			}
//	}
	
		
	
	@Test(priority=1, enabled = true)
	public void verifyGeoaddworkLocation() throws InterruptedException {
		
		addWorkLocation.addworkLocation();		
	}
	
	@Test(priority=2, enabled = true)
	public void verifyGeoworkLocationCountryMandatroyField() throws InterruptedException {
		
		String workLocationCodeManFieldVaid =addWorkLocation.addworkLocationCountryMandatoryFieldVaidation();
		System.out.println(workLocationCodeManFieldVaid);
		Assert.assertEquals("Please select country", workLocationCodeManFieldVaid);	
	}
	
	@Test(priority=3, enabled = true)
	public void verifyGeoworkLocationStateNameMandatroyField() throws InterruptedException {
		String workLocationNameManFieldVaid =addWorkLocation.addworkLocationStateNameMandatoryFieldVaidation();	
		System.out.println(workLocationNameManFieldVaid);
		Assert.assertEquals("Please select state", workLocationNameManFieldVaid);	
	}
	
	@Test(priority=4, enabled = true)
	public void verifyGeoworkLocationDuplicateCheck() throws InterruptedException {
		
		String workLocationDuplicateCheck= addWorkLocation.addworkLocationDuplicateCheckValidation();
		System.out.println(workLocationDuplicateCheck);
//		Assert.assertEquals("Duplicate Data Please Check", workLocationDuplicateCheck);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin"))  {
//			Assert.assertEquals("Duplicate Data Please Check", workLocationDuplicateCheck);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", workLocationDuplicateCheck);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyGeoWorkLocationreset() throws InterruptedException {
		
	Assert.assertTrue(addWorkLocation.addworkLocationResetButton());
		
			
	}
	
	@Test(priority=6, enabled = true)
	public void verifyPagination() throws InterruptedException {
		
		Assert.assertTrue(addWorkLocation.isnextbuttonPaginationVisible());
		
			
	}

	
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
