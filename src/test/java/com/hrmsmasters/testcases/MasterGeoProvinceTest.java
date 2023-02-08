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
import com.hrms.masters.MasterGeoProvince;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterGeoProvinceTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterGeoProvinceTest() {
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
				
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(20);
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
	public void verifyAddState() throws InterruptedException {
           Assert.assertTrue(addState.addSate(prop.getProperty("ProvinceCountryName"), prop.getProperty("ProvinceName")));  	
	}
	

	
	@Test(priority=2, enabled = true)
	public void verifyProvinceNegativeCheck() throws InterruptedException {
		
		String ProvinceName=addState.addSateNegativeValueCheck(prop.getProperty("ProvinceCountryName"), prop.getProperty("ProvinceNameNegativeCheck"));
		System.out.println(ProvinceName);
		if(ProvinceName.equals("Please enter Province")) {
		Assert.assertEquals("Please enter Province", ProvinceName);
		}else
		{
			Assert.assertEquals("Please enter state", ProvinceName);
		}
	}
	
	
	@Test(priority=3, enabled = true)
	public void verifyCountryMandatroyField() throws InterruptedException {
		
		String Countrymantory =addState.addCountryMandatoryFieldVaidation();
		System.out.println(Countrymantory);
		Assert.assertEquals("Please select country", Countrymantory);
	}
	
	
//	@Test(priority=5)
//	public void verifyStateMandatroyField() throws InterruptedException {
//		
//		String Statemantory =addState.addSateMandatoryFieldVaidation(prop.getProperty("ProvinceCountryName"));
//		System.out.println(Statemantory);
//		if(Statemantory.equals("Please enter Province")) {
//			Assert.assertEquals("Please enter Province", Statemantory);
//			}else
//			{
//				Assert.assertEquals("Please enter state", Statemantory);
//			}
//		
//	}
	
	
	@Test(priority=4, enabled = true)
	public void verifyAddStateDuplicateCheck() throws InterruptedException {
		
		String duplicatestatecheck =addState.addSateDuplicateCheckValidation(prop.getProperty("ProvinceCountryName"), prop.getProperty("ProvinceNameDuplicate"));
		System.out.println(duplicatestatecheck);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", duplicatestatecheck);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", duplicatestatecheck);
//			}
		
		//Assert.assertEquals("Duplicate Data Please Check", duplicatestatecheck);
			
	}
//	
//
//	
//	@Test(priority=6)
//	public void verifyprovinceResetBtn() throws InterruptedException {
//		
//		Assert.assertTrue( addState.addSateResetButton(prop.getProperty("ProvinceCountryName"), prop.getProperty("ProvinceName")));
//		
//			
//	}
//	

//	
//	@Test(priority=8)
//	public void verifyNextButtonPaginationVisible() throws InterruptedException {
//		
//		addState.isnextbuttonPaginationVisible(); 	
//	}
	
	
	@Test(priority=5, enabled = true)
	public void verifyGeoSearchboxCountryNamepagination() throws InterruptedException {
		Assert.assertTrue(addState.searchboxCountryNamepagination(prop.getProperty("ProvinceSearchname"))); 	
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
