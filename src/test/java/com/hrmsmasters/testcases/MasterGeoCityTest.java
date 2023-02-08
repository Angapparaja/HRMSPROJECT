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
import com.hrms.masters.MasterGeoCity;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.masters.MasterGeoProvince;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterGeoCityTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterGeoCityTest() {
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
//		
//		if(pagetitle.equals("Perks Admin")) {
//			softAssert.assertEquals(pagetitle,Constants.PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//			softAssert.assertAll();
//			}
//			else {
//				softAssert.assertEquals(pagetitle,Constants.THINKSYNQ_PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//				softAssert.assertAll();
//			}
//		  
//		//Assert.assertTrue(condition, message);
//		//Assert.assertEquals(mastersPage.verifyPageTitle(), "MASTERS");	
//		
//	
//	}
	
	@Test(priority=1, enabled = true)
	public void verifyAddGeoCity() throws InterruptedException {
		Assert.assertTrue(addCity.addCity()); 	
	}
	
	@Test(priority=2, enabled = true)
	public void verifyGeoCityCountryMandatroyField() throws InterruptedException {
		
		String countryMandatory= addCity.addGeoCountryMandatoryFieldVaidation();
		System.out.println(countryMandatory);
		Assert.assertEquals("Please select country", countryMandatory);
		
			
	}
	@Test(priority=3, enabled = true)
	public void verifyCityNegativeCheck() throws InterruptedException {
		
		String CityNegativeCheck=addCity.addCityNegativeCheck();
		System.out.println(CityNegativeCheck);
		Assert.assertEquals("Please enter city", CityNegativeCheck);
			
	}
	
//	@Test(priority=5)
//	public void verifyGeoCityStateMandatroyField() throws InterruptedException {
//		
//		String stateMandatory= addCity.addSateMandatoryFieldVaidation();
//		System.out.println(stateMandatory);
////		Assert.assertEquals("Please select province", stateMandatory);
//		if(stateMandatory.equals("Please select province")) {
//			Assert.assertEquals("Please select province", stateMandatory);
//			}else
//			{
//				Assert.assertEquals("Please select state", stateMandatory);
//			}
//		
//			
//	}
	
	@Test(priority=4, enabled = true)
	public void verifyAddGeoCityDuplicateCheck() throws InterruptedException {
		
         String Text= addCity.addGeoCityDuplicateCheckValidation();
         System.out.println(Text);
//         if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
// 			Assert.assertEquals("Duplicate Data Please Check", Text);
// 			}
// 			else {
// 				Assert.assertEquals("Duplicate Data - please check", Text);
// 			}
		// Assert.assertEquals("Duplicate Data Please Check", Text);
			
	}
	
	
	@Test(priority=5, enabled = true)
	public void verifyGeoCityreset() throws InterruptedException {	
	Assert.assertTrue(addCity.addCityResetButton());			
	}
//	
//	@Test(priority=6)
//	public void verifyGeoCityPagination() throws InterruptedException {	
//		Assert.assertTrue(addCity.nextbuttonPagination());			
//	}

//	@Test(priority=8)
//	public void verifyNextButtonPaginationVisible() throws InterruptedException {
//		
//		addCity.isnextbuttonPaginationVisible(); 	
//	}
//	@Test(priority=9)
//	public void verifyGeoSelectCountryNamepagination() throws InterruptedException {
//		Assert.assertTrue(addCity.selectCountryPagination()); 	
//	}
	
	@Test(priority=6, enabled = true)
	public void verifyGeoSearchboxCountryNamepagination() throws InterruptedException {
		Assert.assertTrue(addCity.searchboxCountryNamepagination()); 	
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
