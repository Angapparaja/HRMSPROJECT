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
import com.hrms.masters.MasterAttendanceAttentPolicy;
import com.hrms.masters.MasterAttendanceCalendar;
import com.hrms.masters.MasterAttendanceDailyRateComponent;
import com.hrms.masters.MasterAttendanceDaydescription;
import com.hrms.masters.MasterAttendanceHoliday;
import com.hrms.masters.MasterAttendanceRateMaster;
import com.hrms.masters.MasterAttendanceShift;
import com.hrms.masters.MasterAttendanceWorkingTime;
import com.hrms.masters.MasterEducationCourse;
import com.hrms.masters.MasterEducationDegree;
import com.hrms.masters.MasterEducationQualification;
import com.hrms.masters.MasterGeoBarangay;
import com.hrms.masters.MasterGeoCity;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.masters.MasterGeoProvince;
import com.hrms.masters.MasterGeoWorklocation;
import com.hrms.masters.MasterPayRollAccountMaster;
import com.hrms.masters.MasterPayRollComponentGroup;
import com.hrms.masters.MasterPayRollComponentMaster;
import com.hrms.masters.MasterPersonalBloodGroup;
import com.hrms.masters.MasterPersonalIdentificationProof;
import com.hrms.masters.MasterPersonalLanguage;
import com.hrms.masters.MasterPersonalNationality;
import com.hrms.masters.MasterPersonalRelationship;
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.masters.MasterPositionBusinessUnit;
import com.hrms.masters.MasterPositionCostCenter;
import com.hrms.masters.MasterPositionDepartment;
import com.hrms.masters.MasterPositionJobLevel;
import com.hrms.masters.MasterPositionMarketDesignation;
import com.hrms.masters.MasterPositionPositionCategory;
import com.hrms.masters.MasterPositionPositionTitle;
import com.hrms.masters.MasterPositionSubDepartment;
import com.hrms.masters.MasterRecruitmentCompetencies;
import com.hrms.masters.MasterRecruitmentConsultant;
import com.hrms.masters.MasterRecruitmentEvaluationForm;
import com.hrms.masters.MasterRecruitmentSkill;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPayRollComponentMasterTest extends TestBase{

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
		MasterPositionPositionCategory addPositionCategory;
		MasterPositionMarketDesignation addMarketDesignation;

	    MasterRecruitmentConsultant addConsultant;
		MasterRecruitmentCompetencies addCompetencies;
	MasterRecruitmentEvaluationForm addEvaluationForm;
	MasterRecruitmentSkill addSkill;

		MasterAttendanceShift AttendanceShift;
		MasterAttendanceDaydescription masterdaydesc;
		MasterAttendanceHoliday masterHoliday;
		MasterAttendanceWorkingTime MasterWorkingTime;
		MasterAttendanceCalendar masterCalendar;
		MasterAttendanceRateMaster masterRateMaster;
		MasterAttendanceDailyRateComponent masterDailyRateComponents;
		MasterAttendanceAttentPolicy masterAttePolicy;
	MasterPayRollAccountMaster MasterPayAccMaster;
	MasterPayRollComponentGroup MasterPayComponentGroup;
	MasterPayRollComponentMaster masCompMaster;
	
	
SoftAssert softAssert = new SoftAssert();
	
	public MasterPayRollComponentMasterTest() {
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
		addPositionCategory=new MasterPositionPositionCategory();
		addMarketDesignation=new MasterPositionMarketDesignation(); 
		addConsultant=new MasterRecruitmentConsultant(); 
		addCompetencies=new MasterRecruitmentCompetencies();
		addEvaluationForm=new MasterRecruitmentEvaluationForm();
		addSkill=new MasterRecruitmentSkill();
		AttendanceShift =new MasterAttendanceShift();
		masterdaydesc =new MasterAttendanceDaydescription();
		masterHoliday =new MasterAttendanceHoliday();
		MasterWorkingTime =new MasterAttendanceWorkingTime();
		masterCalendar =new MasterAttendanceCalendar();
		masterRateMaster =new 	MasterAttendanceRateMaster();
		masterDailyRateComponents =new MasterAttendanceDailyRateComponent();
		masterAttePolicy =new MasterAttendanceAttentPolicy();
		MasterPayAccMaster =new MasterPayRollAccountMaster();
		MasterPayComponentGroup =new MasterPayRollComponentGroup();
		masCompMaster =new MasterPayRollComponentMaster();
		
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(10);
		
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest() {
		String pagetitle=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(pagetitle);
		System.out.println(url);
		
		softAssert.assertEquals(pagetitle,Constants.PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
		softAssert.assertAll();
		  
		//Assert.assertTrue(condition, message);
		//Assert.assertEquals(mastersPage.verifyPageTitle(), "MASTERS");	
	}
	
//	@Test(priority=2)
//	public void verifyAddComponentMaster() throws InterruptedException {
//		Assert.assertTrue(masCompMaster.addPayRollComponentMaster(prop.getProperty("ComponentCode"),prop.getProperty("ComponentName"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
//		
//	}
	
	@Test(priority=3)
	public void verifyComponentMasterNegativeCheck() throws InterruptedException {
	
	String valuecheck=(masCompMaster.PayRollComponentMasterNegativeCheck(prop.getProperty("ComponentAccountCodeNegativeCheck"),prop.getProperty("ComponentName"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
	System.out.println(valuecheck);
	Assert.assertEquals("Please Enter Component Code", valuecheck);				
	}
	
	@Test(priority=4)
	public void verifyComponentMasterComponentcodemandatoryFieldCheck() throws InterruptedException {
	
	String valuecheck=(masCompMaster.PayRollComponentMasterComponentCodeMandatoryCheck(prop.getProperty("ComponentName"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
	System.out.println(valuecheck);
	Assert.assertEquals("Please Enter Component Code", valuecheck);				
	}
	
	@Test(priority=5)
	public void verifyComponentMasterComponentNAMEmandatoryFieldCheck() throws InterruptedException {
	
	String valuecheck=(masCompMaster.PayRollComponentMasterComponentNameMandatoryCheck(prop.getProperty("ComponentCode"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
	System.out.println(valuecheck);
	Assert.assertEquals("Please Enter Component name", valuecheck);				
	}
	
	@Test(priority=6)
	public void verifyComponentMasterComponentCompensationmandatoryFieldCheck() throws InterruptedException {
	
	String valuecheck=(masCompMaster.PayRollComponentMasterCompensationMandatoryFieldCheck(prop.getProperty("ComponentCode"),prop.getProperty("ComponentName"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
	System.out.println(valuecheck);
	Assert.assertEquals("Please Enter Compensation Definition", valuecheck);				
	}
	
	@Test(priority=7)
	public void verifyComponentMasterComponentduplicateCheck() throws InterruptedException {
	
	String valuecheck=(masCompMaster.PayRollComponentMasteduplicatecheckvalidation(prop.getProperty("DuplicateCode"),prop.getProperty("ComponentName"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
	System.out.println(valuecheck);
	Assert.assertEquals("Duplicate Data Please Check", valuecheck);				
	}
	
//	@Test(priority=3)
//	public void verifyAddHolidayDuplicateCheck() throws InterruptedException {
//		
//		masterHoliday.addHolidayDuplicateCheck();
//			
//	}
//	
	@Test(priority=8)
	public void verifyComponentMasterResetBtn() throws InterruptedException {
		
		Assert.assertTrue(masCompMaster.resetbuttonvalidation(prop.getProperty("DuplicateCode"),prop.getProperty("ComponentName"),prop.getProperty("CompensationdDef"),prop.getProperty("ComputationMethod"),prop.getProperty("PaymentFrequency")));
			
	}
	
	@Test(priority=9)
	public void verifyPagination() throws InterruptedException {
		
		masCompMaster.isnextbuttonPaginationVisible();
		
			
	}
	
	@Test(priority=10)
	public void VerifyEnterTheSearchComponentMasterPagination() throws InterruptedException {
		Assert.assertTrue(masCompMaster.searchComponentMasterpagination(prop.getProperty("SearchComponentName")));
	}
	
@AfterMethod
public void tearDown() {
	driver.close();
	driver.quit();
}

}
