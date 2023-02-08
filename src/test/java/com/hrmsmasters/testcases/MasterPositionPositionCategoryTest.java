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
import com.hrms.masters.MasterPositionPositionCategory;
import com.hrms.masters.MasterPositionPositionTitle;
import com.hrms.masters.MasterPositionSubDepartment;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPositionPositionCategoryTest extends TestBase{
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
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPositionPositionCategoryTest() {
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
	
		
	
	@Test(priority=1, enabled = true)
	public void verifyaddPositionCategoryWithTaxEligibleYes() throws InterruptedException {
		
	Assert.assertTrue(addPositionCategory.addPositionCategoryWithTaxEligibleYes(prop.getProperty("PositionCategory")));
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyPositionTitleNegativeCheck() throws InterruptedException {
	
	String valuecheck=addPositionCategory.addPositionCategoryWithTaxEligibleYesNegativeCheck(prop.getProperty("PositionCategoryNegativeCheck"));
	System.out.println(valuecheck);
	Assert.assertEquals("Enter Position Category Name", valuecheck);				
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddPositionCategoryWithTaxEligibleNo() throws InterruptedException {
		
		
		String Categoryname=addPositionCategory.addPositionCategoryWithTaxEligibleNo(prop.getProperty("PositionCategoryDuplicateCheck"));
		System.out.println(Categoryname);
		//Assert.assertEquals("Duplicate Data Please Check", Categoryname);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", Categoryname);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", Categoryname);
//			}
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddPositionCategoryMandatroyFieldValidation() throws InterruptedException {
		
		String CategoryMantoryField =addPositionCategory.addPositionCategoryMandatroyFieldValidation();
		System.out.println(CategoryMantoryField);
		Assert.assertEquals("Enter Position Category Name", CategoryMantoryField);	
	}
	
	@Test(priority=5, enabled = true)
	public void verifyaddPositionCategoryDuplicateCheck() throws InterruptedException {
	
		String categoryname=addPositionCategory.addPositionCategoryWithTaxEligibleYesDuplicateCheck(prop.getProperty("DuplicateCategoryName_Yes"));
		System.out.println(categoryname);
		//Assert.assertEquals("Duplicate Data Please Check", categoryname);
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", categoryname);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", categoryname);
//			}
	}
	
	@Test(priority=6, enabled = true)
	public void verifyPositionCategoryResetButton() throws InterruptedException {
		
	Assert.assertTrue(addPositionCategory.verifyResetButton(prop.getProperty("PositionCategory")));
		
			
	}
	
//	@Test(priority=7, enabled = true)
//	public void verifyPagination() throws InterruptedException {
//		
//		addPositionCategory.isnextbuttonPaginationVisible();
//		
//			
//	}

	@Test(priority=8, enabled = true)
	public void VerifyEnterTheSearchPositionCategoryPagination() throws InterruptedException {
		Assert.assertTrue(addPositionCategory.searchPositionPositionCategorypagination(prop.getProperty("PositionCategorySearchName")));
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
