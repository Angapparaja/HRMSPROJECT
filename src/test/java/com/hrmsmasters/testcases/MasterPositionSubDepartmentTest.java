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
import com.hrms.masters.MasterPositionDepartment;
import com.hrms.masters.MasterPositionJobLevel;
import com.hrms.masters.MasterPositionPositionTitle;
import com.hrms.masters.MasterPositionSubDepartment;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPositionSubDepartmentTest extends TestBase{
	
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
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPositionSubDepartmentTest() {
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
	public void verifyaddSubDepartment() throws InterruptedException {
		
	Assert.assertTrue(addSubDepartment.addSubDepartment(prop.getProperty("Department"),prop.getProperty("SubDepartment")));	
					
	}
	
//	@Test(priority=3)
//	public void verifyPositionTitleNegativeCheck() throws InterruptedException {
//	
//	String valuecheck=addSubDepartment.addSubDepartmentNegativeCheck(prop.getProperty("Department"),prop.getProperty("SubDepartmentNameNegativeCheck"));
//	System.out.println(valuecheck);
////	Assert.assertEquals("Duplicate Data Please Check", valuecheck);	
//	if(valuecheck.equals("Perks Admin")) {
//		Assert.assertEquals("Duplicate Data Please Check", valuecheck);
//		}
//		else {
//			Assert.assertEquals("Duplicate Data - please check", valuecheck);
//		}
//	}
	
	@Test(priority=2, enabled = true)
	public void verifyDepartmentNameMandatroyField() throws InterruptedException {
		
		String valuecheck=addSubDepartment.departmentNameMandatoryFieldVaidation(prop.getProperty("SubDepartment"));
		System.out.println(valuecheck);
		Assert.assertEquals("Select department Name", valuecheck);
	}
	
	@Test(priority=3, enabled = true)
	public void verifySubDepartmentNameMandatroyField() throws InterruptedException {
		
		String valuecheck=addSubDepartment.addSubDepartmentNameMandatoryFieldVaidation(prop.getProperty("Department"));
		System.out.println(valuecheck);
		Assert.assertEquals("Enter sub department Name", valuecheck);
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddSubDepartmentNameDuplicateCheck() throws InterruptedException {
		
		String valuecheck=addSubDepartment.addSubDepartmentDuplicateCheckValidation(prop.getProperty("SubDepartmentNameDuplicateCheck"),prop.getProperty("SubDepartmentDuplicateCheck"));
		System.out.println(valuecheck);
		//Assert.assertEquals("Duplicate Data Please Check", valuecheck);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")) {
//			Assert.assertEquals("Duplicate Data Please Check", valuecheck);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", valuecheck);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyPositionSubDepartmentNameResetButton() throws InterruptedException {
		
	Assert.assertTrue(addSubDepartment.verifyResetButton(prop.getProperty("Department"),prop.getProperty("SubDepartment")));	
		
			
	}
	
//	@Test(priority=6, enabled = true)
//	public void verifyPagination() throws InterruptedException {
//		
//		addSubDepartment.isnextbuttonPaginationVisible();
//					
//	}
	
	@Test(priority=7, enabled = true)
	public void VerifyEnterTheSearchPositionSubDepartmentPagination() throws InterruptedException {
		Assert.assertTrue(addSubDepartment.searchPositionSubDepartmentpagination(prop.getProperty("DepartmentNameSearchName")));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
