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
import com.hrms.masters.MasterAttendanceFlexiHolidayChange;
import com.hrms.masters.MasterAttendanceFlexiHolidayPolicy;
import com.hrms.masters.MasterAttendanceHoliday;
import com.hrms.masters.MasterAttendanceOTReason;
import com.hrms.masters.MasterAttendanceRateMaster;
import com.hrms.masters.MasterAttendanceShift;
import com.hrms.masters.MasterAttendanceWeekOffPolicy;
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
import com.hrms.masters.MasterPayRollComponentMaster2;
import com.hrms.masters.MasterPayRollJournalSetup;
import com.hrms.masters.MasterPayRollPayrollGrouping;
import com.hrms.masters.MasterPayRollReportSetup;
import com.hrms.masters.MasterPayrollPaySlipTitle;
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
import com.hrms.util.TestUtil;

public class MasterPayrollPaySlipTitleTest extends TestBase{

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
	MasterAttendanceDaydescription masterdaydesc;
	MasterAttendanceHoliday masterHoliday;
	MasterAttendanceWorkingTime MasterWorkingTime;
	MasterAttendanceCalendar masterCalendar;
	MasterAttendanceRateMaster masterRateMaster;
	MasterAttendanceDailyRateComponent masterDailyRateComponents;
	MasterAttendanceAttentPolicy masterAttePolicy;
	

	MasterAttendanceOTReason OtReason;
	MasterAttendanceWeekOffPolicy weekOffpolicy;
	
	MasterAttendanceFlexiHolidayPolicy FlexiHolidayPolicy;
	MasterAttendanceFlexiHolidayChange  FlexiHolidayChange;

	MasterPayRollAccountMaster MasterPayAccMaster;
	MasterPayRollComponentGroup MasterPayComponentGroup;
	MasterPayRollComponentMaster2 componMaster;
	MasterPayRollComponentMaster masCompMaster;
	MasterPayRollReportSetup MasterReportSetup;
	MasterPayRollJournalSetup MasterJournalSetup;
	MasterPayRollPayrollGrouping MasterPayrollGrouping;
	MasterPayrollPaySlipTitle paysliptit;
	
	public MasterPayrollPaySlipTitleTest() {
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
		masterdaydesc =new MasterAttendanceDaydescription();
		masterHoliday =new MasterAttendanceHoliday();
		MasterWorkingTime =new MasterAttendanceWorkingTime();
		masterCalendar =new MasterAttendanceCalendar();
		masterRateMaster =new 	MasterAttendanceRateMaster();
		masterDailyRateComponents =new MasterAttendanceDailyRateComponent();
		masterAttePolicy =new MasterAttendanceAttentPolicy();
		OtReason=new MasterAttendanceOTReason();
		weekOffpolicy = new MasterAttendanceWeekOffPolicy();
		FlexiHolidayPolicy =new MasterAttendanceFlexiHolidayPolicy();
		FlexiHolidayChange =new MasterAttendanceFlexiHolidayChange();
		MasterPayAccMaster =new MasterPayRollAccountMaster();
		MasterPayComponentGroup =new MasterPayRollComponentGroup();
		componMaster =new MasterPayRollComponentMaster2();
		MasterPayComponentGroup =new MasterPayRollComponentGroup();
		masCompMaster =new MasterPayRollComponentMaster();
		MasterReportSetup =new MasterPayRollReportSetup();
		MasterJournalSetup =new MasterPayRollJournalSetup();
		MasterPayrollGrouping =new MasterPayRollPayrollGrouping();
		paysliptit =new MasterPayrollPaySlipTitle();
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(10);
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
	public void verifyMasterPayrollPaySlipTitleadd() throws InterruptedException {
		
	Assert.assertTrue(paysliptit.PayrollPayslipTitleAdd(prop.getProperty("Businessunitpayslip"),prop.getProperty("PayslipTitle"),prop.getProperty("payslipaddress")));	
					
	}
	
//	@Test(priority=3)
//	public void verifyAttendanceWeekoffpolicystatusNegativeCheck() throws InterruptedException {
//	
//	String valuecheck=weekOffpolicy.AttendanceWeekoffpolicyNegativeCheck(prop.getProperty("POLICYName"),prop.getProperty("WEEK1"),prop.getProperty("WEEK2"),prop.getProperty("PolicystatusNegativeCheck"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Please Select Policy Status", valuecheck);				
//	}

	
	@Test(priority=4)
	public void verifyMasterPayrollPaySlipTitleBuniessMandatroyField() throws InterruptedException {
		
		String valuecheck=paysliptit.PayrollPayslipTitleBusinessUnitMandatoryFieldVaidation(prop.getProperty("PayslipTitle"),prop.getProperty("payslipaddress"));
		System.out.println(valuecheck);
		Assert.assertEquals("Please Select Business Unit", valuecheck);	
	}
	
	
	@Test(priority=5)
	public void verifyMasterPayrollPaySlipTitleMandatroyField() throws InterruptedException {
		
		String valuecheck=paysliptit.PayrollPayslipTitleMandatoryFieldVaidation(prop.getProperty("Businessunitpayslip"),prop.getProperty("payslipaddress"));
		System.out.println(valuecheck);
		Assert.assertEquals("Please Enter Pay Slip Title", valuecheck);	
	}
	
		
//	@Test(priority=6)
//	public void verifyMasterPayrollPaySlipTitleDuplicateCheck() throws InterruptedException {
//		
//		String valuecheck=paysliptit.PayrollPayslipTitleDuplicateCheck(prop.getProperty("DupliBusinessunitpayslip"),prop.getProperty("DupliPayslipTitle"),prop.getProperty("Duplipayslipaddress"));
//		System.out.println(valuecheck);
//		Assert.assertEquals("Duplicate Data - please check", valuecheck);	
//	}
	
	@Test(priority=7)
	public void verifyMasterPayrollPaySlipTitleResetButton() throws InterruptedException {
		
	 Assert.assertTrue(paysliptit.verifyPayrollPayslipTitleResetButton(prop.getProperty("Businessunitpayslip"),prop.getProperty("PayslipTitle"),prop.getProperty("payslipaddress")));	
	
	}
	
//	@Test(priority=8)
//	public void verifyMasterPayrollPaySlipTitlePagination() throws InterruptedException {
//		
//		paysliptit.isnextbuttonPaginationVisible();
//		
//			
//	}


	@Test(priority=9)
	public void VerifyEnterTheSearchMasterPayrollPaySlipTitlePagination() throws InterruptedException {
		paysliptit.searchPayrollPayslipTitlepagination(prop.getProperty("SearchNamePayslipTitle"),prop.getProperty("SearchNamecheckCondition"));
	}
	
//	@Test(priority=10)
//	public void verifyMasterPayrollPaySlipTitleEditValue() throws InterruptedException {
//		
//		String valuecheck=paysliptit.searchPayrollPayslipTitleEdit(prop.getProperty("SearchNamePayslipTitle"),prop.getProperty("SearchNamePayslipTitleedit"));
//	//	System.out.println(valuecheck);
//		Assert.assertEquals("Data updated successfully", valuecheck);	
//	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}	
	
}
