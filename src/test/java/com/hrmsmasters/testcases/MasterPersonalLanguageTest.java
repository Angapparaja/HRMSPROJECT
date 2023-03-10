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
import com.hrms.masters.MasterPersonalLanguage;
import com.hrms.masters.MasterPersonalNationality;
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPersonalLanguageTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
	MasterGeoCountry addCountry;
	MasterGeoProvince addState;
	MasterGeoCity addCity;
	MasterGeoBarangay addBarangay;
	MasterGeoWorklocation addWorkLocation;
	MasterPersonalReligion addReligion;
	MasterPersonalNationality addNationality;
	MasterPersonalLanguage addLanguage;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPersonalLanguageTest() {
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
		addLanguage=new MasterPersonalLanguage();
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
	
		
	
	@Test(priority=1, enabled=true)
	public void verifyaddLanguage() throws InterruptedException {
		
	Assert.assertTrue(addLanguage.addlanguageName(prop.getProperty("languageNAME")));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyLanguageNameNegativeCheck() throws InterruptedException {
		
		String LanguageNegativeCheck=addLanguage.languageNameNegativeCheck(prop.getProperty("LanguageNegative"));
		System.out.println(LanguageNegativeCheck);
		Assert.assertEquals("Enter language Name",LanguageNegativeCheck);
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddLanguageMandatroyField() throws InterruptedException {
		
		String LanguageMandatroyCheck=addLanguage.addlanguageNameMandatoryFieldVaidation();
		System.out.println(LanguageMandatroyCheck);
		Assert.assertEquals("Enter language Name",LanguageMandatroyCheck);
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddLanguageDuplicateCheck() throws InterruptedException {
		String LanguageDuplicateCheck=addLanguage.addLanguageADDDuplicateCheckValidation(prop.getProperty("languageDuplicateCheck"));
		System.out.println(LanguageDuplicateCheck);
//		Assert.assertEquals("Duplicate Data Please Check", LanguageDuplicateCheck);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", LanguageDuplicateCheck);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", LanguageDuplicateCheck);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyPersonalLanguageResetBtn() throws InterruptedException {
		
		Assert.assertTrue(addLanguage.addlanguageADDResetButton(prop.getProperty("languageNAME"))); 
		
			
	}
	
	@Test(priority=6, enabled = true)
	public void verifyPagination() throws InterruptedException {
		
		addLanguage.isnextbuttonPaginationVisible();	
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
