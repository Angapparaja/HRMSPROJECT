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
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterEducationDegreeTest extends TestBase{
	
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
	SoftAssert softAssert = new SoftAssert();
	
	public MasterEducationDegreeTest() {
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
	public void verifyaddEducationDegree() throws InterruptedException {
		
	Assert.assertTrue(addDegree.degreeAdd(prop.getProperty("QualificationName"),prop.getProperty("DEGREEName")));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyEducationDegreeNegativeCheck() throws InterruptedException {
	
	String Qualificationname=addDegree.degreeNegativeCheck(prop.getProperty("QualificationNameDuplicateCheck"),prop.getProperty("DEGREENameNegativeCheck"));
	System.out.println(Qualificationname);
	Assert.assertEquals("Enter degree Name", Qualificationname);				
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddDegreeMandatroyField() throws InterruptedException {
		
		String Degreename=addDegree.degreeAddMandatoryFieldVaidation(prop.getProperty("QualificationName"));
		System.out.println(Degreename);
		Assert.assertEquals("Enter degree Name", Degreename);		
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddDegreeDuplicateCheck() throws InterruptedException {
		
		String Degreename=addDegree.addDegreeDuplicateCheckValidation(prop.getProperty("QualificationNameDuplicateCheck"),prop.getProperty("DEGREENameDuplicateCheck"));
		System.out.println(Degreename);
		//Assert.assertEquals("Duplicate Data Please Check", Degreename);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin")){
//			Assert.assertEquals("Duplicate Data Please Check", Degreename);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", Degreename);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyEducationDegreeResetButton() throws InterruptedException {
		
		Assert.assertTrue(addDegree.verifyResetButton(prop.getProperty("QualificationName"),prop.getProperty("DEGREEName"))); 
		
			
	}
	
	@Test(priority=6, enabled = true)
	public void verifyEducationDegreePagination() throws InterruptedException {
		
		addDegree.isnextbuttonPaginationVisible();
			
	}

	
	@Test(priority=7, enabled = true)
	public void VerifyEnterTheSearchEducationDegreePagination() throws InterruptedException {
		Assert.assertTrue(addDegree.searchDegreeNamepagination(prop.getProperty("DEGREENameSearchName")));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
