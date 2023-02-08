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
import com.hrms.masters.MasterPositionBusinessUnit;
import com.hrms.masters.MasterPositionCenter;
import com.hrms.masters.MasterPositionCostCenter;
import com.hrms.masters.MasterPositionDepartment;
import com.hrms.masters.MasterPositionJobLevel;
import com.hrms.masters.MasterPositionMarketDesignation;
import com.hrms.masters.MasterPositionPositionCategory;
import com.hrms.masters.MasterPositionPositionTitle;
import com.hrms.masters.MasterPositionSubDepartment;
import com.hrms.masters.MasterRecruitmentConsultant;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterRecruitmentConsultantTest extends TestBase{
	
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
	MasterPositionBusinessUnit addBusinessUnit;
	MasterPositionDepartment addDepartment;
	MasterPositionSubDepartment addSubDepartment;
	MasterPositionCostCenter addCostCenter;
	MasterPositionCenter Center;
	MasterPositionPositionCategory addPositionCategory;
	MasterPositionMarketDesignation addMarketDesignation;

	MasterRecruitmentConsultant addConsultant;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterRecruitmentConsultantTest() {
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
		addBusinessUnit=new MasterPositionBusinessUnit();
		addDepartment=new MasterPositionDepartment(); 
		addSubDepartment=new MasterPositionSubDepartment();
		addCostCenter=new MasterPositionCostCenter();
		Center=new MasterPositionCenter();
		addPositionCategory=new MasterPositionPositionCategory();
		addMarketDesignation=new MasterPositionMarketDesignation(); 
		addConsultant=new MasterRecruitmentConsultant(); 
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
	public void verifyaddRecruitmentconsultant() throws InterruptedException {
		
	addConsultant.addconsultant(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
			prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyRecruitmentconsultantNegativeCheck() throws InterruptedException {
		
		String valuecheck=(addConsultant.consultantNegativeCheck(prop.getProperty("CONSULTANCYNAMENegativeCheck"),prop.getProperty("CONTACTPERSON"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
			prop.getProperty("LOCATION"),prop.getProperty("USERNAME"),prop.getProperty("PositionTilte")));	
		System.out.println(valuecheck);
		Assert.assertEquals("Please Enter Consultancy Name", valuecheck);		
	}
	
	@Test(priority=3, enabled = true)
	public void verifyRecruitmentconsultantNameMandatory() throws InterruptedException {
		
		String valuecheck=addConsultant.consultantNameMandatory(prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
				prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));
		System.out.println(valuecheck);
		Assert.assertEquals("Please Enter Consultancy Name", valuecheck);	
	}
	
//	@Test(priority=4, enabled = true)
//	public void verifyRecruitmentconsultantContactPersonMandatory() throws InterruptedException {
//		
//		String valuecheck=addConsultant.consultantContactPersonMandatory(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
//				prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Please Enter Contact Person", valuecheck);
//	}
//	
//		
//	@Test(priority=5, enabled = true)
//	public void verifyRecruitmentconsultantEmailMandatory() throws InterruptedException {
//		
//		String valuecheck=addConsultant.consultantEmailMandatory(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
//				prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Please Enter Consultancy Email", valuecheck);
//	}
//	
//	@Test(priority=6, enabled = true)
//	public void verifyRecruitmentconsultantAddressMandatory() throws InterruptedException {
//		
//		String valuecheck=addConsultant.consultantAddressMandatory(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
//				prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Please Enter Consultancy Address", valuecheck);	
//	}
//	
//	@Test(priority=7, enabled = true)
//	public void verifyRecruitmentConsultantIsValidContactNoCheck() throws InterruptedException {
//		
//		String valuecheck=addConsultant.IsValidContactNOcheck(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("NotvalidCONTACTNO"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Please Enter Valid Consultancy Contact No", valuecheck);	
//	}
//	
//	
//	@Test(priority=8, enabled = true)
//	public void verifyRecruitmentConsultantIsValidEmailCheck() throws InterruptedException {
//		
//		String valuecheck=addConsultant.IsValidEmailcheck(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("NotvalidEmail"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Please Enter Valid Consultancy Email", valuecheck);	
//	}
//
//
	@Test(priority=9, enabled = true)
	public void verifyRecruitmentConsultantuserNameMandatory() throws InterruptedException {
		
		String valuecheck=addConsultant.userNameMandatory(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
				prop.getProperty("LOCATION"));
		
		
		System.out.println(valuecheck);
		Assert.assertEquals("Please Enter User Name", valuecheck);
	}
//@Test(priority=10, enabled = true)
//public void verifyaddConsultantDuplicateCheck() throws InterruptedException {
//	
//	String valuecheck=addConsultant.addConsultantDuplicateCheck(prop.getProperty("DuplicateCONSULTANCYNAME"),prop.getProperty("DuplicateCONTACTPERSON"),prop.getProperty("DuplicateCONTACTNO"),prop.getProperty("DuplicateEMAIL"),prop.getProperty("DuplicateADDRESS"),prop.getProperty("DuplicateCOUNTRY"),prop.getProperty("DuplicatePROVINCE"),prop.getProperty("DuplicateCITY"),
//			prop.getProperty("DuplicateLOCATION"),prop.getProperty("DuplicateUSERNAME"));
//	System.out.println(valuecheck);
//	//Assert.assertEquals("Duplicate Data - Please check", valuecheck);	
////	if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
////		Assert.assertEquals("Duplicate Data - Please check", valuecheck);
////		}
////		else {
////			Assert.assertEquals("Duplicate Data - Please check", valuecheck);
////		}
//}
	
	@Test(priority=11, enabled = true)
	public void verifyRecruitmentConsultantreset() throws InterruptedException {
		
	addConsultant.verifyResetButton(prop.getProperty("CONSULTANCYNAME"),prop.getProperty("CONTACTPERSON"),prop.getProperty("CONTACTNO"),prop.getProperty("EMAIL"),prop.getProperty("ADDRESS"),prop.getProperty("COUNTRY"),prop.getProperty("PROVINCE"),prop.getProperty("CITY"),
				prop.getProperty("LOCATION"),prop.getProperty("USERNAME"));
		
			
	}
	
//	@Test(priority=12, enabled = true)
//	public void verifyRecruitmentConsultantPagination() throws InterruptedException {
//		
//		addConsultant.isnextbuttonPaginationVisible();
//					
//	}
	
	@Test(priority=13)
	public void VerifyEnterTheSearchRecruitmentConsultantPagination() throws InterruptedException {
		addConsultant.searchRecruitmentConsulnatNamepagination(prop.getProperty("CONSULTANCYNAMESearch"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
