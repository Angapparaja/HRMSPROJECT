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
import com.hrms.masters.MasterEducationQualification;
import com.hrms.masters.MasterGeoBarangay;
import com.hrms.masters.MasterGeoCity;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.masters.MasterGeoProvince;
import com.hrms.masters.MasterGeoWorklocation;
import com.hrms.masters.MasterPersonalBloodGroup;
import com.hrms.masters.MasterPersonalIdentificationProof;
import com.hrms.masters.MasterPersonalLanguage;
import com.hrms.masters.MasterPersonalNationality;
import com.hrms.masters.MasterPersonalRelationship;
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterEducationQualificationTest extends TestBase{
	
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
	MasterPersonalRelationship addRelationship;
	MasterPersonalBloodGroup addBloodGroup;
	MasterPersonalIdentificationProof addIdProof;
	MasterEducationQualification addQualification;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterEducationQualificationTest() {
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
		addRelationship=new MasterPersonalRelationship();
		addBloodGroup=new MasterPersonalBloodGroup();
		addIdProof=new MasterPersonalIdentificationProof();
		addQualification=new MasterEducationQualification();
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
	public void verifyaddQualification() throws InterruptedException {
		
	Assert.assertTrue(addQualification.qualificationAdd(prop.getProperty("QualificationName")));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyEducationQualificationNegativeCheck() throws InterruptedException {
	
	String Qualificationname=addQualification.qualificationNegativeCheck(prop.getProperty("QualificationNameNegativeCheck"));
	System.out.println(Qualificationname);
	Assert.assertEquals("Enter qualification Name", Qualificationname);				
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddEducationQualificationMandatroyField() throws InterruptedException {

		String Qualificationname=addQualification.qualificationAddMandatoryFieldVaidation();
		System.out.println(Qualificationname);
		Assert.assertEquals("Enter qualification Name", Qualificationname);	
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddQualificationDuplicateCheck() throws InterruptedException {
		String Qualificationname=addQualification.addQualificationDuplicateCheckValidation(prop.getProperty("QualificationNameDuplicateCheck"));
		System.out.println(Qualificationname);
		//Assert.assertEquals("Duplicate Data Please Check", Qualificationname);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", Qualificationname);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", Qualificationname);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyEducationQuaificationResetBtn() throws InterruptedException {
		
	Assert.assertTrue(addQualification.verifyResetButton(prop.getProperty("QualificationName")));
		
			
	}
	
	@Test(priority=6, enabled = true)
	public void verifyEducationQuaificationPagination() throws InterruptedException {
		
		addQualification.isnextbuttonPaginationVisible();
		
			
	}

	@Test(priority=7, enabled = true)
	public void VerifyEnterTheSearchEducationQualificationPagination() throws InterruptedException {
		Assert.assertTrue(addQualification.searchQualificationNamepagination(prop.getProperty("QuaificationSearchName")));
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
