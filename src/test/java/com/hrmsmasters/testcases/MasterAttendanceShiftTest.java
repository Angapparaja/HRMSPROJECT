package com.hrmsmasters.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.base.TestBase;
import com.hrms.masters.HrmsHomePage;
import com.hrms.masters.LoginPage;
import com.hrms.masters.MasterAttendanceShift;
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
import com.hrms.masters.MasterRecruitmentCompetencies;
import com.hrms.masters.MasterRecruitmentConsultant;
import com.hrms.masters.MasterRecruitmentEvaluationForm;
import com.hrms.masters.MasterRecruitmentSkill;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.ExcelUtil;
import com.hrms.util.TestUtil;


public class MasterAttendanceShiftTest extends TestBase {
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
	MasterRecruitmentCompetencies addCompetencies;
	MasterRecruitmentEvaluationForm addEvaluationForm;
	MasterRecruitmentSkill addSkill;

	MasterAttendanceShift AttendanceShift;
	SoftAssert softAssert = new SoftAssert();

	public MasterAttendanceShiftTest() {
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
		addCompetencies=new MasterRecruitmentCompetencies();
		addEvaluationForm=new MasterRecruitmentEvaluationForm();
		addSkill=new MasterRecruitmentSkill();
		AttendanceShift =new MasterAttendanceShift();
		
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(60);
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
	
//	@DataProvider
//	public Object[][] getMasterTestData() throws InvalidFormatException{
//		return ExcelUtil.getTestData(Constants.MASTER_ATTENDANCE_SHIFT_SHEETNAME);
//	}
	
	@Test(priority=2)
	public void verifyAddShift() throws InterruptedException {
		
		Assert.assertTrue(AttendanceShift.addAttendanceShift(prop.getProperty("code"),prop.getProperty("Description"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
			prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
			prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin")));
		
			
	}
	
	
//	@Test(priority=3)
//	public void verifyAttendanceShiftCodeNegativeCheck() throws InterruptedException {
//		
//	String AttendanceShifts=AttendanceShift.AttendanceShiftCodeNegativeCheck(prop.getProperty("NegativeCode"),prop.getProperty("Description"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
//			prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
//			prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin"));
//		
//		System.out.println(AttendanceShifts);
//		Assert.assertEquals("Enter the shift code", AttendanceShifts);
//	}
	
	@Test(priority=3)
	public void verifyAttendanceShiftCodeMandatoryFieldCheck() throws InterruptedException {
		
	String AttendanceShifts=AttendanceShift.AttendanceShiftCodeMandatoryFieldCheck(prop.getProperty("Description"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
			prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
			prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin"));
		
		System.out.println(AttendanceShifts);
		Assert.assertEquals("Enter the shift code", AttendanceShifts);
	}
	
	
	@Test(priority=4)
	public void verifyAttendanceShiftDescriptionMandatoryFieldCheck() throws InterruptedException {
		
	String AttendanceShifts=AttendanceShift.AttendanceShiftDescriptionMandatoryFieldCheck(prop.getProperty("code"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
			prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
			prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin"));
		
		System.out.println(AttendanceShifts);
		Assert.assertEquals("Enter the shift description", AttendanceShifts);
	}
	
	
	@Test(priority=5)
	public void verifyAttendanceShiftFromTimeMandatoryFieldCheck() throws InterruptedException {
		
	String AttendanceShifts=AttendanceShift.AttendanceShiftFromTimeMandatoryFieldCheck(prop.getProperty("code"),prop.getProperty("Description"),
			prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
			prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin"));
		
		System.out.println(AttendanceShifts);
		Assert.assertEquals("Select from time", AttendanceShifts);
	}
	
//	@Test(priority=6)
//	public void verifyAttendanceShiftDuplicateCheck() throws InterruptedException {
//		
//	String AttendanceShifts=AttendanceShift.addAttendanceShiftCodeDuplicateCheck(prop.getProperty("DuplicateCode"),prop.getProperty("DuplicateDescription"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
//				prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
//				prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin"));
//		
//		System.out.println(AttendanceShifts);
//		Assert.assertEquals("Duplicate Data - Please check", AttendanceShifts);
//	}
	
	@Test(priority=7)
	public void verifyAttendanceShiftResetButton() throws InterruptedException {
		
		Assert.assertTrue(AttendanceShift.verifyAttendanceShiftResetButton(prop.getProperty("code"),prop.getProperty("Description"),prop.getProperty("FromHour"), prop.getProperty("FromMintue"),
				prop.getProperty("ToTimeHour"),prop.getProperty("ToTimeMin"),prop.getProperty("BufferInHour"),prop.getProperty("BufferInMin"),prop.getProperty("BufferOutHour"),
				prop.getProperty("BufferOutMin"),prop.getProperty("Break1TimeFromHour"),prop.getProperty("Break1TimeFromMin"),prop.getProperty("Break1TimeToHour"),prop.getProperty("Break1TimeToMin")));
		
			
	}
	
//	@Test(priority=8)
//	public void verifyAttendanceShiftPagination() throws InterruptedException {
//		
//		AttendanceShift.isnextbuttonPaginationVisible();
//		
//			
//	}
	
	
	@Test(priority=9)
	public void VerifyEnterTheSearchAttendanceShiftPagination() throws InterruptedException {
		Assert.assertTrue(AttendanceShift.searchAttendanceShiftpagination(prop.getProperty("SearchSHIFTCODE")));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
