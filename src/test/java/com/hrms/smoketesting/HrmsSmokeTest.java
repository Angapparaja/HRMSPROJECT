package com.hrms.smoketesting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.base.TestBase;

public class HrmsSmokeTest extends TestBase {
	WebDriverWait wait;
	SoftAssert softAssert;

	@BeforeMethod
	public void setUp() {
		initialization();

		// driver.findElement(By.name("clientname")).sendKeys(prop.getProperty("client"));
		// driver.findElement(By.id("u_name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("u_name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("u_pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='login']")).click();

		/*
		 * wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//a[contains(text(),'ThinkNumbers')]")));
		 */
		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'ThinkNumbers')]")).click();
		 * 
		 * TestUtil.SwitchToChildWindow();
		 * 
		 * TestUtil.WaitTill_PageLoads(10);
		 * 
		 * driver.findElement(By.xpath("//img[@title='Masters']")).click();
		 * 
		 * TestUtil.WaitTill_PageLoads(10);
		 */
//		softAssert = new SoftAssert();

	}

	@Test(priority = 1)
	public void goDashboard() throws InterruptedException {
		System.out.println("Dashboard Menu Navigated");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-1.png']")).click();
		System.out.println("after clicking dashboard menu");
		  String title_page=driver.getTitle();
		  String title_url=driver.getCurrentUrl();
		  System.out.println("Current URL:"+title_url);
		  System.out.println(title_page);
		  System.out.println("Title page");
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to Dashboard Menu");
		 
	}

	@Test(priority = 2)
	public void goStructure() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-2.png']")).click();
		
		String title_page=driver.getTitle();
		  System.out.println(title_page);
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to Structure Menu");
		 

	}

	@Test(priority = 3)
	public void goCoreHrms() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-3.png']")).click();
		String title_page=driver.getTitle();
		  System.out.println(title_page);
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to CORE HRMS");
		

	}

	@Test(priority = 4)
	public void goReports() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-4.png']")).click();
		String title_page=driver.getTitle();
		  System.out.println(title_page);
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to CORE HRMS");
		
		
	}

	@Test(priority = 5)
	public void goMasters() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-5.png']")).click();
		String title_page=driver.getTitle();
		  System.out.println(title_page);
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to CORE HRMS");
		
	}

	@Test(priority = 6)
	public void goSettings() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='resources/images/menu-icon-6.png']")).click();
		String title_page=driver.getTitle();
		  System.out.println(title_page);
		  Assert.assertTrue("Perks Admin".equals(title_page),"Successfully Navigated to CORE HRMS");
		
	}

	
	@AfterMethod
	public void logOutWindow() {
		// driver.findElement(By.xpath("//img[@title='Logout']")).click();
		driver.close();
		// TestUtil.SwitchToMainWindow();
		driver.quit();
	}

}
