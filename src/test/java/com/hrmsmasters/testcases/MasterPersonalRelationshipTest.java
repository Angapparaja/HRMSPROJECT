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
import com.hrms.masters.MasterGeoBarangay;
import com.hrms.masters.MasterGeoCity;
import com.hrms.masters.MasterGeoCountry;
import com.hrms.masters.MasterGeoProvince;
import com.hrms.masters.MasterGeoWorklocation;
import com.hrms.masters.MasterPersonalLanguage;
import com.hrms.masters.MasterPersonalNationality;
import com.hrms.masters.MasterPersonalRelationship;
import com.hrms.masters.MasterPersonalReligion;
import com.hrms.util.Constants;
import com.hrms.util.Errors;
import com.hrms.util.TestUtil;

public class MasterPersonalRelationshipTest extends TestBase{
	
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
	SoftAssert softAssert = new SoftAssert();
	
	public MasterPersonalRelationshipTest() {
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
		homePage = loginPage.Login(prop.getProperty("clientname"), prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.WaitTill_PageLoads(5);
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
	public void verifyaddRelationship() throws InterruptedException {
		
	Assert.assertTrue(addRelationship.addrelationshipName(prop.getProperty("relationshipName")));	
					
	}
	
	@Test(priority=2, enabled = true)
	public void verifyaddRelationshipNegativeCheck() throws InterruptedException {
		
		String relationNegative =addRelationship.relationshipNameNegativeCheck(prop.getProperty("relationshipNameNegative"));
		System.out.println(relationNegative);
		Assert.assertEquals("Enter relationship Name", relationNegative);	
	}
	
	@Test(priority=3, enabled = true)
	public void verifyaddRelationshipMandatroyField() throws InterruptedException {
		
		String missingrelationmandatory =addRelationship.addrelationshipNameMandatoryFieldVaidation();
		System.out.println(missingrelationmandatory);
		Assert.assertEquals("Enter relationship Name", missingrelationmandatory);	
	}
	
		
	@Test(priority=4, enabled = true)
	public void verifyaddRelationshipDuplicateCheck() throws InterruptedException {
		
		String relations=addRelationship.addrelationshipADDDuplicateCheckValidation(prop.getProperty("relationshipNameDuplicateCheck"));
		System.out.println(relations);
		//Assert.assertEquals("Duplicate Data Please Check", relations);	
//		if(driver.getTitle().equalsIgnoreCase("Perks Admin"))  {
//			Assert.assertEquals("Duplicate Data Please Check", relations);
//			}
//			else {
//				Assert.assertEquals("Duplicate Data - please check", relations);
//			}
	}
	
	@Test(priority=5, enabled = true)
	public void verifyRelationshipNameReset() throws InterruptedException {
		
		Assert.assertTrue(addRelationship.addrelationshipNameResetButton(prop.getProperty("relationshipName")));
		
			
	}
	
//	@Test(priority=6, enabled = true)
//	public void verifyPagination() throws InterruptedException {
//		
//		addRelationship.isnextbuttonPaginationVisible();
//			
//	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
