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
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPersonalReligionTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	MasterGeoBarangay addBarangay;
	MasterGeoWorklocation addWorkLocation;
	MasterPersonalReligion addReligion;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPersonalReligionTest() {
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
		addReligion=new MasterPersonalReligion();
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
	
		
	
	@Test(priority=2)
	public void verifyaddPersonalReligion() throws InterruptedException {
		Assert.assertTrue(addReligion.addReligion()); 	
	}
	
	@Test(priority=3)
	public void verifyaddPersonalReligionMandatroyField() throws InterruptedException {
		
		String religionNameMandatory = addReligion.addreligionNameMandatoryFieldVaidation();
		System.out.println(religionNameMandatory);
		Assert.assertEquals("Enter religion Name",religionNameMandatory);		
	}
	
		
	@Test(priority=4)
	public void verifyaddPersonalReligionDuplicateCheck() throws InterruptedException {
		
		String religionDuplicate = addReligion.addreligionADDDuplicateCheckValidation();
		System.out.println(religionDuplicate);
//		Assert.assertEquals("Duplicate Data Please Check",religionDuplicate);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin"))  {
//			Assert.assertEquals("Duplicate Data Please Check", religionDuplicate);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", religionDuplicate);
//			}
	}
	
	@Test(priority=5)
	public void verifyPersonalReligionreset() throws InterruptedException {
		
		Assert.assertTrue(addReligion.addreligionADDResetButton()); 
			
	}
	
	@Test(priority=6)
	public void verifyPagination() throws InterruptedException {
		
		addReligion.isnextbuttonPaginationVisible();	
	}

	
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
