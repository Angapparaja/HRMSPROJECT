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
import com.hrms.masters.MasterAssetsAssetItems;
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
import com.hrms.masters.MasterExitManagementExitType;
import com.hrms.masters.MasterExitManagementGratuity;
import com.hrms.masters.MasterExitManagementInterviewQuestions;
import com.hrms.masters.MasterExitManagementNodues;
import com.hrms.masters.MasterExitManagementSetup;
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
import com.hrms.masters.MasterStatutoryLWF;
import com.hrms.masters.MasterStatutoryPF;
import com.hrms.masters.MasterStatutoryPT;
import com.hrms.masters.MasterStatutoryPagIbIg;
import com.hrms.masters.MasterStatutoryPhilHealth;
import com.hrms.masters.MasterStatutorySocialSecuritySystem;
import com.hrms.masters.MasterStatutorySuperAnnuation;
import com.hrms.masters.MasterStatutoryWithHoldingTax;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterExitManagementGratuityTest extends TestBase{

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
	MasterStatutoryPT StatutoryPT;
	MasterStatutoryLWF StatutoryLWF;
	MasterStatutorySuperAnnuation StatutorySuperAnu;
	MasterAssetsAssetItems masterAssetsItems;
		MasterStatutoryPhilHealth masterStatory;
		MasterStatutorySocialSecuritySystem mastersocialsecurity;
		MasterStatutoryPagIbIg masterPagIbIg;
		MasterStatutoryWithHoldingTax masterHodingTax;

	MasterExitManagementSetup masterMangementSetup;
	

	MasterExitManagementExitType masterExitType;
	MasterExitManagementNodues masterNodues;
	MasterExitManagementInterviewQuestions masterInterview;
	MasterExitManagementGratuity ExitGratuity;
	
	
SoftAssert softAssert = new SoftAssert();

public MasterExitManagementGratuityTest() {
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
	StatutoryPT =new MasterStatutoryPT();
	StatutoryLWF =new MasterStatutoryLWF();
	StatutorySuperAnu =new MasterStatutorySuperAnnuation();
	masterAssetsItems=new MasterAssetsAssetItems();
	masterStatory=new MasterStatutoryPhilHealth();
	mastersocialsecurity =new MasterStatutorySocialSecuritySystem();
	masterPagIbIg = new MasterStatutoryPagIbIg();
	masterHodingTax =new MasterStatutoryWithHoldingTax();
	
	masterMangementSetup =new MasterExitManagementSetup();
	masterExitType =new MasterExitManagementExitType();
	masterNodues =new MasterExitManagementNodues();
	masterInterview =new MasterExitManagementInterviewQuestions();
	ExitGratuity =new MasterExitManagementGratuity();
	
	homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
	TestUtil.WaitTill_PageLoads(10);

}

//@Test(priority=1)
//public void verifyPageTitleTest() {
//	String pagetitle=driver.getTitle();
//	String url=driver.getCurrentUrl();
//	System.out.println(pagetitle);
//	System.out.println(url);
//	
//	if(pagetitle.equals("Perks Admin")) {
//		softAssert.assertEquals(pagetitle,Constants.PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//		softAssert.assertAll();
//		}
//		else {
//			softAssert.assertEquals(pagetitle,Constants.THINKSYNQ_PAGE_TITLE,Errors.TITLE_ERROR_MESSAGE);
//			softAssert.assertAll();
//		}
//}

@Test(priority=2)
public void verifyExitManagementGratuityAddCheck() throws InterruptedException {
	
Assert.assertTrue(ExitGratuity.MasterExitManagementGratuityAdd(prop.getProperty("NoOfNumerator"),prop.getProperty("NoOfDenominator"),prop.getProperty("Exemption"),
		                                               prop.getProperty("exitRules")));
}

@Test(priority=3)
public void verifyExitManagementGratuityResetButtonCheck() throws InterruptedException {
	
	Assert.assertTrue(ExitGratuity.MasterExitManagementGratuityResetButton(prop.getProperty("NoOfNumerator"),prop.getProperty("NoOfDenominator"),prop.getProperty("Exemption"),
            prop.getProperty("exitRules")));

}



@Test(priority=4)
public void verifyExitManagementGratuityNumeratorMandatoryFieldCheck() throws InterruptedException {
	
String valuecheck=ExitGratuity.MasterExitManagementGratuityNumeratorMandatoryFieldCheck(
		prop.getProperty("NoOfDenominator"),prop.getProperty("Exemption"),
        prop.getProperty("exitRules"));
System.out.println(valuecheck);
Assert.assertEquals("Enter No of Days in Numerator", valuecheck);	
}


@Test(priority=5)
public void verifyExitManagementGratuityDenominatorMandatoryFieldCheck() throws InterruptedException {
	
String valuecheck=ExitGratuity.MasterExitManagementGratuityDonomiatorMandatoryFieldCheck(
		prop.getProperty("NoOfNumerator"),prop.getProperty("Exemption"),
        prop.getProperty("exitRules"));
System.out.println(valuecheck);
Assert.assertEquals("Enter No of Days in Denominator", valuecheck);	
}

//@Test(priority=6)
//public void verifyExitManagementGratuityExemptionMandatoryFieldCheck() throws InterruptedException {
//	
//String valuecheck=ExitGratuity.MasterExitManagementGratuityExemptionsMandatoryFieldCheck(
//		prop.getProperty("NoOfNumerator"),prop.getProperty("NoOfDenominator"),
//        prop.getProperty("exitRules"));
//System.out.println(valuecheck);
//Assert.assertEquals("Enter Exemption", valuecheck);	
//}

@Test(priority=7)
public void verifyExitManagementGratuityRuleMandatoryFieldCheck() throws InterruptedException {
	
String valuecheck=ExitGratuity.MasterExitManagementGratuityRulesMandatoryFieldCheck(
		prop.getProperty("NoOfNumerator"),prop.getProperty("NoOfDenominator"),prop.getProperty("Exemption"));
System.out.println(valuecheck);
Assert.assertEquals("Enter Rule", valuecheck);	
}


//@Test(priority=8)
//public void verifyMasterStatutoryMenuLWFPagination() throws InterruptedException {
//	
//	ExitGratuity.isnextbuttonStatutoryExitManagementGratuityPaginationVisible();
//
//}


@AfterMethod
public void tearDown() {
	driver.close();
	driver.quit();
}
	
}
