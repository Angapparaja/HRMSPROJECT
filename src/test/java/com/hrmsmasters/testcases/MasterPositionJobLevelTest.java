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
import com.hrms.masters.MasterEducationCourse;
import com.hrms.masters.MasterEducationDegree;
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
import com.hrms.masters.MasterPositionJobLevel;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPositionJobLevelTest extends TestBase{
	
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
	MasterEducationDegree addDegree;
	MasterEducationCourse addCourse;
	MasterPositionJobLevel addJobLevel;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPositionJobLevelTest() {
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
		addDegree=new MasterEducationDegree();
		addCourse=new MasterEducationCourse();
		addJobLevel=new MasterPositionJobLevel();
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
	public void verifyaddPositionJobLevel() throws InterruptedException {
		
	Assert.assertTrue(addJobLevel.jobLevelAdd(prop.getProperty("JobLevel"),prop.getProperty("Hierarcy")));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyPositionJoblevelnameNegativeCheck() throws InterruptedException {
	
	String joblevelname=addJobLevel.jobLevelNegativeCheck(prop.getProperty("JobLevelNegativeCheck"),prop.getProperty("Hierarcy"));
	System.out.println(joblevelname);
	Assert.assertEquals("Enter Job level Name", joblevelname);				
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddJobLevelMandatroyField() throws InterruptedException {
		
		String joblevelname=addJobLevel.jobLevelAddMandatoryFieldVaidation(prop.getProperty("Hierarcy"));
		System.out.println(joblevelname);
		Assert.assertEquals("Enter Job level Name", joblevelname);		
	}
	
	@Test(priority=4, enabled = true)
	public void verifyaddHierarchyMandatroyField() throws InterruptedException {
		
		String hieraryname=addJobLevel.HierarchyAddMandatoryFieldVaidation(prop.getProperty("JobLevel"));
		System.out.println(hieraryname);
		Assert.assertEquals("Select Hierarchy", hieraryname);		
	}
		
	@Test(priority=5, enabled = true)
	public void verifyaddJobLevelDuplicateCheck() throws InterruptedException {
	
		String joblevelname=addJobLevel.jobLevelAddDuplicateCheckValidation(prop.getProperty("JobLevelDuplicateCheck"),prop.getProperty("HierarcyDuplicateCheck"));
		System.out.println(joblevelname);
		//Assert.assertEquals("Duplicate Data Please Check", joblevelname);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", joblevelname);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", joblevelname);
//			}
	}
	
	@Test(priority=6, enabled = true)
	public void verifyPositionJobLevelResetButton() throws InterruptedException {
		
		Assert.assertTrue(addJobLevel.verifyResetButton(prop.getProperty("JobLevel"),prop.getProperty("Hierarcy"))); 
				
	}
	
	@Test(priority=7, enabled = true)
	public void verifyPositionJobLevelPagination() throws InterruptedException {
		
		addJobLevel.isnextbuttonPaginationVisible();	
			
	}

	
	@Test(priority=8, enabled = true)
	public void VerifyEnterSearchPositionJobLevelPagination() throws InterruptedException {
		Assert.assertTrue(addJobLevel.searchJoblevelNamepagination(prop.getProperty("JobLevelSearchName")));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
