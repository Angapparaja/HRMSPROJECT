package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterReimbursementReimbursementWindow extends TestBase{

	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//Reimbursement
		@FindBy(xpath="//span[@id='reim_font']")
		WebElement Reimbursement;
		
		//ReimbursementWindowmenu
		@FindBy(xpath="//span[@id='reimbuswindow']")
		WebElement ReimbursementWindow;
		
		//Reimbursementfromdateinput
		@FindBy(xpath="//input[@id='fromDate']")
		WebElement Reimbursementfromdateinput;
		
		//ReimbursementWindow
				@FindBy(xpath="//select[@class='ui-datepicker-month']")
				WebElement Fromdatemonth;
		
				
				//ReimbursementWindow
				@FindBy(xpath="//select[@class='ui-datepicker-year']")
				WebElement FromdateYear;
	

				
				//ReimbursementTodateinput
				@FindBy(xpath="//input[@id='toDate']")
				WebElement ReimbursementTodateinput;
				
				//ReimbursementWindowTomonth
				@FindBy(xpath="//select[@class='ui-datepicker-month']")
				WebElement Todatemonth;
				
				//ReimbursementWindowTodate
				@FindBy(xpath="//select[@class='ui-datepicker-year']")
				WebElement TodateYear;
				
				//ReimbursementUpdateBtn
				@FindBy(xpath="//button[text()='Update']")
				WebElement UpdateBtn;
				
				//reset button
				@FindBy(xpath = "//*[text()='Reset']")
				WebElement resetButton;
				
				public MasterReimbursementReimbursementWindow() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean ReimbursementWindowUpdate(String FromMonth,String Fromyear,String Fromdatevalue,String ToMonth,String ToYear,String TodateValue) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					Reimbursement.click();
					Thread.sleep(1000);
					ReimbursementWindow.click();
					Thread.sleep(1000);
					Reimbursementfromdateinput.click();
					Thread.sleep(1000);
					Select level1=new Select(Fromdatemonth);
					level1.selectByVisibleText(FromMonth);
					Thread.sleep(1000);
					
					Select level2=new Select(FromdateYear);
					level2.selectByVisibleText(Fromyear);
					Thread.sleep(1000);
					
					WebElement date=driver.findElement(By.xpath("(//a[text()='"+Fromdatevalue+"'])[1]"));
					date.click();
					
					
					Thread.sleep(1000);
					ReimbursementTodateinput.click();
					Thread.sleep(1000);
					Select level3=new Select(Fromdatemonth);
					level3.selectByVisibleText(ToMonth);
					Thread.sleep(1000);
					
					Select level4=new Select(FromdateYear);
					level4.selectByVisibleText(ToYear);
					Thread.sleep(1000);
					
					WebElement date2=driver.findElement(By.xpath("(//a[text()='"+TodateValue+"'])[1]"));
					date2.click();
					
					
					Thread.sleep(1000);
					
					UpdateBtn.click();
					return true;
					
				}
				
				public boolean ReimbursementWindowReset(String FromMonth,String Fromyear,String Fromdatevalue,String ToMonth,String ToYear,String TodateValue) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					Reimbursement.click();
					Thread.sleep(1000);
					ReimbursementWindow.click();
					Thread.sleep(1000);
					Reimbursementfromdateinput.click();
					Thread.sleep(1000);
					Select level1=new Select(Fromdatemonth);
					level1.selectByVisibleText(FromMonth);
					Thread.sleep(1000);
					
					Select level2=new Select(FromdateYear);
					level2.selectByVisibleText(Fromyear);
					Thread.sleep(1000);
					
					WebElement date=driver.findElement(By.xpath("(//a[text()='"+Fromdatevalue+"'])[1]"));
					date.click();
					
					
					Thread.sleep(1000);
					ReimbursementTodateinput.click();
					Thread.sleep(1000);
					Select level3=new Select(Fromdatemonth);
					level3.selectByVisibleText(ToMonth);
					Thread.sleep(1000);
					
					Select level4=new Select(FromdateYear);
					level4.selectByVisibleText(ToYear);
					Thread.sleep(1000);
					
					WebElement date2=driver.findElement(By.xpath("(//a[text()='"+TodateValue+"'])[1]"));
					date2.click();
					
					
					Thread.sleep(1000);
					
					resetButton.click();
					return true;
					
				}
				
				 public boolean isUpdatebuttonReimbursementVisible() throws InterruptedException {
                 	masterIcon.click();
						Thread.sleep(1000);
						Reimbursement.click();
						Thread.sleep(1000);
						ReimbursementWindow.click();
						Thread.sleep(1000);

						boolean flag = false;
				        try {
				            WebElement element = driver.findElement(By.xpath("//button[text()='Update']"));
				            if (element.isDisplayed() || element.isEnabled())
//				                flag = false;
				            	UpdateBtn.click();
				            System.out.println("update button visible");
				        } catch (NoSuchElementException e) {
//				            flag = true;
				            System.out.println("update button not visible");
				        } 
				        return flag;
						
					}
				
				
}
