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
import com.hrms.masters.MasterPayRollBank;
import com.hrms.masters.MasterPayRollBankBranch;
import com.hrms.masters.MasterPayRollComponentGroup;
import com.hrms.masters.MasterPayRollComponentMaster;
import com.hrms.masters.MasterPayRollComponentMaster2;
import com.hrms.masters.MasterPayRollCurrency;
import com.hrms.masters.MasterPayRollJournalSetup;
import com.hrms.masters.MasterPayRollPayrollGrouping;
import com.hrms.masters.MasterPayRollReportSetup;
import com.hrms.masters.MasterPayrollHolidayWorkComponent;
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
import com.hrms.masters.MasterReimbursementBills;
import com.hrms.masters.MasterReimbursementEmployeeListView;
import com.hrms.masters.MasterReimbursementEndPeriodPayLists;
import com.hrms.masters.MasterReimbursementExcelReport;
import com.hrms.masters.MasterReimbursementMonthlyPayLists;
import com.hrms.masters.MasterReimbursementPayInPeriod;
import com.hrms.masters.MasterReimbursementProcess;
import com.hrms.masters.MasterReimbursementReimbursementWindow;
import com.hrms.masters.MasterReimbursementSetup;
import com.hrms.masters.MasterStatutoryESI;
import com.hrms.masters.MasterStatutoryPF;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterStatutoryESITest extends TestBase{

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
	MasterPayRollBank PayrollBank;
	MasterPayRollBankBranch maspayrollbankbranch;
	MasterPayRollCurrency MasterPayCurrenncy;
	MasterPayrollHolidayWorkComponent holidaywork;
	MasterReimbursementSetup Reimbursementsetup;
	MasterReimbursementReimbursementWindow reimbursementWindow;
	MasterReimbursementBills Bills;
	MasterReimbursementProcess processReimbursement;
	MasterReimbursementMonthlyPayLists MonthlyPayLists;
	MasterReimbursementEmployeeListView EmployeeListView;
	MasterReimbursementEndPeriodPayLists EndPeriodPayLists;
	MasterReimbursementPayInPeriod payinperoiod;
	MasterReimbursementExcelReport excelreport;
	
	MasterStatutoryPF StatutoryPf;
	MasterStatutoryESI StatutoryESI;
	SoftAssert softAssert = new SoftAssert();
	
	public MasterStatutoryESITest() {
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
		masterAttePolicy =new MasterAttendanceAttentPolicy();
		OtReason=new MasterAttendanceOTReason();
		weekOffpolicy = new MasterAttendanceWeekOffPolicy();
		FlexiHolidayPolicy =new MasterAttendanceFlexiHolidayPolicy();
		FlexiHolidayChange =new MasterAttendanceFlexiHolidayChange();
		MasterPayAccMaster =new MasterPayRollAccountMaster();
		MasterPayComponentGroup =new MasterPayRollComponentGroup();
		componMaster =new MasterPayRollComponentMaster2();
		MasterJournalSetup =new MasterPayRollJournalSetup();
		MasterPayrollGrouping =new MasterPayRollPayrollGrouping();
		paysliptit =new MasterPayrollPaySlipTitle();
		PayrollBank =new MasterPayRollBank();
		maspayrollbankbranch=new MasterPayRollBankBranch();
		MasterPayCurrenncy = new MasterPayRollCurrency();
		holidaywork=new MasterPayrollHolidayWorkComponent();
		Reimbursementsetup =new MasterReimbursementSetup();
		reimbursementWindow =new MasterReimbursementReimbursementWindow();
		Bills =new MasterReimbursementBills();
		processReimbursement = new MasterReimbursementProcess();
		MonthlyPayLists =new MasterReimbursementMonthlyPayLists();
		EmployeeListView =new MasterReimbursementEmployeeListView();
		EndPeriodPayLists =new MasterReimbursementEndPeriodPayLists();
		payinperoiod =new MasterReimbursementPayInPeriod();
		excelreport =new MasterReimbursementExcelReport();
		StatutoryPf =new MasterStatutoryPF();
		StatutoryESI =new MasterStatutoryESI();
		
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
	
//	@Test(priority=2)
//	public void verifyStatutoryMenuESIAddCheck() throws InterruptedException {
//		
//	Assert.assertTrue(StatutoryESI.MasterStatutoryMenuESIAdd(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period1month"),prop.getProperty("Period2month"),
//			                                               prop.getProperty("EmployeeContributionESI"),prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//			                                               prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate")));
//	}
	
	@Test(priority=3)
	public void verifyStatutoryMenuESIUPDATECheck() throws InterruptedException {
		
	String valuecheck=StatutoryESI.MasterStatutoryMenuESIUPDATE(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period1month"),prop.getProperty("Period2month"),
            prop.getProperty("EmployeeContributionESIUpdate"),prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
	System.out.println(valuecheck);
	Assert.assertEquals("Data updated successfully", valuecheck);	
	}
	
	
//	@Test(priority=4)
//	public void verifyStatutoryMenuESIDeleteCheck() throws InterruptedException {
//		
//	String valuecheck=StatutoryESI.MasterStatutoryMenuESIDelete(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period1month"),prop.getProperty("Period2month"),
//            prop.getProperty("EmployeeContributionESI"),prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Deleted Successfully", valuecheck);	
//	}
	
	
//	@Test(priority=5)
//	public void verifyStatutoryMenuESICeilingAmountlessMandatoryFieldCheck() throws InterruptedException {
//		
//	String valuecheck=StatutoryESI.MasterStatutoryMenuEsiCeilingAmountlessThanMandatoryFieldCheck(prop.getProperty("Period1month"),prop.getProperty("Period2month"),
//            prop.getProperty("EmployeeContributionESI"),prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Enter Ceiling Amount Less than", valuecheck);	
//	}
//	
//	
//	@Test(priority=6)
//	public void verifyStatutoryMenuESIContPeriod1MonthMandatoryFieldCheck() throws InterruptedException {
//		
//	String valuecheck=StatutoryESI.MasterStatutoryMenuEsiContPeriod1MonthMandatoryFieldCheck(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period2month"),
//            prop.getProperty("EmployeeContributionESI"),prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Select Contribution Period 1 Starting Month", valuecheck);	
//	}
//	
//	@Test(priority=7)
//	public void verifyStatutoryMenuESIEmployeeContributionMandatoryFieldCheck() throws InterruptedException {
//		
//	String valuecheck=StatutoryESI.MasterStatutoryMenuEsiEmployeeContributionMandatoryFieldCheck(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period1month"),prop.getProperty("Period2month"),
//           prop.getProperty("EmployerContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Enter Employee Contribution", valuecheck);	
//	}
	
//	@Test(priority=8)
//	public void verifyStatutoryMenuESIEmployerContributionMandatoryFieldCheck() throws InterruptedException {
//		
//	String valuecheck=StatutoryESI.MasterStatutoryMenuEsiEmployerContributionMandatoryFieldCheck(prop.getProperty("ceilingamountlessthan"),prop.getProperty("Period1month"),prop.getProperty("Period2month"),
//           prop.getProperty("EmployeeContributionESI"),prop.getProperty("ESIEffectivedatemonth"),
//            prop.getProperty("ESIeffectiveyear"),prop.getProperty("Esieffectivedate"));
//	System.out.println(valuecheck);
//	Assert.assertEquals("Enter Employer Contribution", valuecheck);	
//	}
	
//	
	@Test(priority=4)
	public void verifyMasterReimbursementExcelReportPagination() throws InterruptedException {
		
		StatutoryPf.isnextbuttonStatutoryPfPaginationVisible();
	
	}
//	
//	@Test(priority=5)
//	public void VerifyEnterTsearchStatutoryPfpagination() throws InterruptedException {
//		Assert.assertTrue(StatutoryPf.searchStatutoryPfpagination(prop.getProperty("SearchNameStatutoryPF"),prop.getProperty("SearchNameStatutoryPFcheck")));
//	}
//	
//	@Test(priority=6)
//	public void verifyMastersearchStatutoryPfEditValue() throws InterruptedException {
//		
//		String valuecheck=StatutoryPf.searchStatutoryPfEdit(prop.getProperty("SearchNameStatutoryPfvalue"),prop.getProperty("SearchBoxeditStatutoryPfvalue"));
//	//	System.out.println(valuecheck);
//		Assert.assertEquals("Data updated Successfully", valuecheck);	
//	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
