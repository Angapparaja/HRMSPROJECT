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
import com.hrms.masters.MasterPositionPositionTitle;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPositionPositionTitleTest extends TestBase{
	
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
	MasterPositionPositionTitle addPosition;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPositionPositionTitleTest() {
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
		addPosition=new MasterPositionPositionTitle();
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
	public void verifyaddPositionTitle() throws InterruptedException {
		
	Assert.assertTrue(addPosition.positionTitleAdd(prop.getProperty("JobLevel"),prop.getProperty("PositionTilte")));
					
	}
	
//	@Test(priority=3)
//	public void verifyPositionTitleNegativeCheck() throws InterruptedException {
//	
//	String valuecheck=addPosition.positionTitleNegativeCheck(prop.getProperty("JobLevel"),prop.getProperty("PositionTilteNegativeCheck"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Enter Position Title", valuecheck);				
//	}
	
	@Test(priority=3)
	public void verifyaddPositionTtileMandatroyField() throws InterruptedException {
		String valuecheck=addPosition.positionTitleAddMandatoryFieldVaidation(prop.getProperty("JobLevel"));
		System.out.println(valuecheck);
		//Assert.assertEquals("Enter Position Title", valuecheck);	
		if(driver.getTitle().equalsIgnoreCase("Perks Admin")){
			Assert.assertEquals("Enter Position Title", valuecheck);
			}
			else {
				Assert.assertEquals("Enter Designation", valuecheck);
			}
	}
	
	@Test(priority=4)
	public void verifyaddPositionJoblevelMandatroyField() throws InterruptedException {
		String valuecheck=addPosition.positionJoblevelAddMandatoryFieldVaidation(prop.getProperty("PositionTilte"));
		System.out.println(valuecheck);
		Assert.assertEquals("Select Job Level", valuecheck);		
	}	
	@Test(priority=5)
	public void verifyaddPositionTitleDuplicateCheck() throws InterruptedException {
		
		String valuecheck=addPosition.positionTitleAddDuplicateCheckValidation(prop.getProperty("JobLevelDuplicateCheck"),prop.getProperty("PositionTilteDuplicateCheck"));
		System.out.println(valuecheck);
		//Assert.assertEquals("Duplicate Data Please Check", valuecheck);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", valuecheck);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", valuecheck);
//			}
	}
	
	@Test(priority=6)
	public void verifyPositionTitleResetButton() throws InterruptedException {
		
	Assert.assertTrue(addPosition.verifyResetButton(prop.getProperty("JobLevel"),prop.getProperty("PositionTilte")));	
		
			
	}
	
	@Test(priority=7)
	public void verifyPositionTitlePagination() throws InterruptedException {
		
		addPosition.isnextbuttonPaginationVisible();
		
			
	}

	@Test(priority=8)
	public void VerifyEnterTheSearchPositionTitlePagination() throws InterruptedException {
		Assert.assertTrue(addPosition.searchPositionTitleNamepagination(prop.getProperty("PositionTilteSearchName")));
	}
	

	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
