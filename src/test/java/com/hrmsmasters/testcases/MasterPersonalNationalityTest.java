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
import com.hrms.masters.MasterPersonalNationality;
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPersonalNationalityTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	MasterGeoBarangay addBarangay;
	MasterGeoWorklocation addWorkLocation;
	MasterPersonalReligion addReligion;
	MasterPersonalNationality addNationality;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPersonalNationalityTest() {
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
		addNationality=new MasterPersonalNationality();
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
	
		
	
	@Test(priority=2)
	public void verifyaddNationality() throws InterruptedException {
		
	Assert.assertTrue(addNationality.addNationality(prop.getProperty("Nationality")));	
					
	}
	
	@Test(priority=3)
	public void verifyNationalityNegativeCheck() throws InterruptedException {
		
		String Nationalname=addNationality.addNationalityNegativeCheck(prop.getProperty("NationalityNegative"));
		System.out.println(Nationalname);
		Assert.assertEquals("Enter nationality Name", Nationalname);
			
	}
	
	@Test(priority=4)
	public void verifyaddNationalityMandatroyField() throws InterruptedException {
		
		String Nationalname=addNationality.addnationalityNameMandatoryFieldVaidation();
		System.out.println(Nationalname);
		Assert.assertEquals("Enter nationality Name", Nationalname);
			
	}
	
		
	@Test(priority=5)
	public void verifyaddNationalityDuplicateCheck() throws InterruptedException {
		
		String natioan=  addNationality.addreligionADDDuplicateCheckValidation(prop.getProperty("NationalityDuplicateCheck"));
		System.out.println(natioan);
//		Assert.assertEquals("Duplicate Data Please Check", natioan);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", natioan);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", natioan);
//			}
	}
	
	@Test(priority=6)
	public void verifyAddNationalityResetBtn() throws InterruptedException {
		
	Assert.assertTrue(addNationality.addreligionADDResetButton(prop.getProperty("Nationality")));	
		
			
	}
	
	@Test(priority=7)
	public void verifyPagination() throws InterruptedException {
		
		addNationality.isnextbuttonPaginationVisible();
		
			
	}

	
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
