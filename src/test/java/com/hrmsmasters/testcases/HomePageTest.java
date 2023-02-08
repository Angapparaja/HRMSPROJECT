package com.hrmsmasters.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.hrms.base.TestBase;
import com.hrms.masters.HrmsHomePage;
import com.hrms.masters.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HrmsHomePage homePage;
		
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		softAssert = new SoftAssert();
		loginPage = new LoginPage();
		homePage = new HrmsHomePage();
		homePage = loginPage.Login(prop.getProperty("clientName"), prop.getProperty("username"), prop.getProperty("password"));
		//TestUtil.SwitchToChildWindow();
		//TestUtil.WaitTill_PageLoads(10);
	}
	
	
	public void verifyHomePageIconsTest() {
		
		String title=driver.getTitle();
		System.out.println(title);
		
		softAssert.assertEquals(homePage.verifyPageTitle(), "Perks Admin");

		softAssert.assertAll();
	}
	
	
	public void selectDashboard() {
		
		System.out.println("Dashboard");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
	

}
