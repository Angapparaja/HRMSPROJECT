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
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterGeoBarangayTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	MasterGeoBarangay addBarangay;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterGeoBarangayTest() {
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
//	}
	
		
	
	@Test(priority=1, enabled = true)
	public void verifyGeoAddBarangay() throws InterruptedException {
		
	Assert.assertTrue(addBarangay.addBrangay());			
	}
	
	@Test(priority=2, enabled = true)
	public void verifyGeoBarangayCountryMandatroyField() throws InterruptedException {	
	String CountryMandatory=addBarangay.addCountryMandatoryFieldVaidation();
	System.out.println(CountryMandatory);
	Assert.assertEquals("Please select country", CountryMandatory);	
	}
	
	
//	@Test(priority=4)
//	public void verifyGeoBarangayStateMandatroyField() throws InterruptedException {
//		
//		String statemandatory=addBarangay.addSateMandatoryFieldVaidation();
//		System.out.println(statemandatory);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin"))  {
//			Assert.assertEquals("Please select Province", statemandatory);
//			}else
//			{
//				Assert.assertEquals("Please select state", statemandatory);
//			}
//			
//	}
	
	@Test(priority=3, enabled = true)
	public void verifyGeoAddBarangayDuplicateCheck() throws InterruptedException {
		
	String BarangayDuplicateCheckValidation =addBarangay.addBarangayDuplicateCheckValidation();
	System.out.println(BarangayDuplicateCheckValidation);
//	if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//		Assert.assertEquals("Duplicate Data Please Check", BarangayDuplicateCheckValidation);
//		}else
//		{
//			Assert.assertEquals("Duplicate Data - please check", BarangayDuplicateCheckValidation);
//		}
//	Assert.assertEquals("Duplicate Data Please Check", BarangayDuplicateCheckValidation);	
			
	}
	
	@Test(priority=4, enabled = true)
	public void verifyGeoBanarangayresetBtn() throws InterruptedException {
		
	addBarangay.addBarangayResetButton();
		
			
	}
	
	@Test(priority=5, enabled = true)
	public void verifyPagination() throws InterruptedException {
		
	addBarangay.isnextbuttonPaginationVisible(); 
		
			
	}

		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
