package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceRateMaster extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
			//RateMaster
			@FindBy(xpath="//span[@id='rateMaster']")
			WebElement RateMaster;
			
			//RateMasterADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement AddRateMaster;
			
			//Calendar Description
			@FindBy(xpath="//*[@id='calDescriptionId']")
			WebElement Calendardecrip;
			
			//Rate Type
			@FindBy(xpath="//*[@id='rateType']")
			WebElement rateType;
			
			//PayRoll RunBy1
			@FindBy(xpath="(//span[@class='checkmark'])[2]")
			WebElement PayrollRunBy1;
			
			//PayRoll RunBy2
			@FindBy(xpath="(//span[@class='checkmark'])[1]")
			WebElement PayrollRunBy2;
			
			//GovermentRate
			@FindBy(xpath="//input[@id='govtRate']")
			WebElement Governmentrate;
			
			//CompanyRate
			@FindBy(xpath="//input[@id='companyFlexirate']")
			WebElement CompanyRate;
			
			
			//save button
			@FindBy(xpath = "//*[text()='Save']")
			WebElement saveButton;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
			
			//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
			
			public MasterAttendanceRateMaster() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			public boolean addRateMasterwithCompanyRateCheckBox(String calendarDesc,String ratetype,String CompneyRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
				Select DayDescriptions=new Select(Calendardecrip);
				DayDescriptions.selectByVisibleText(calendarDesc);
				Thread.sleep(1500);
				
				Select RateType =new Select(rateType);
				RateType.selectByVisibleText(ratetype);
				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy1.isSelected();
				if(isSelected == false) {
					PayrollRunBy1.click();
				}
				Thread.sleep(1500);
			//	Governmentrate.sendKeys("10");
				CompanyRate.sendKeys(CompneyRate);
				
				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public boolean addRateMasterwithGovermentRateCheckBox(String calendarDesc,String ratetype,String GovernmentRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
				Select DayDescriptions=new Select(Calendardecrip);
				DayDescriptions.selectByVisibleText(calendarDesc);
				Thread.sleep(1500);
				
				Select RateType =new Select(rateType);
				RateType.selectByVisibleText(ratetype);
				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy2.isSelected();
				if(isSelected == false) {
					PayrollRunBy2.click();
				}
				Thread.sleep(1500);
				Governmentrate.sendKeys(GovernmentRate);
//				CompanyRate.sendKeys(CompneyRate);
				
				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public String addRateMasterCalendarMandatoryFieldCheck(String ratetype,String GovernmentRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
//				Select DayDescriptions=new Select(Calendardecrip);
//				DayDescriptions.selectByVisibleText(calendarDesc);
//				Thread.sleep(1500);
				
				Select RateType =new Select(rateType);
				RateType.selectByVisibleText(ratetype);
				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy2.isSelected();
				if(isSelected == false) {
					PayrollRunBy2.click();
				}
				Thread.sleep(1500);
				Governmentrate.sendKeys(GovernmentRate);
//				CompanyRate.sendKeys(CompneyRate);
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String addRateMasterRateTypeMandatoryFieldCheck(String calendarDesc,String CompneyRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
				Select DayDescriptions=new Select(Calendardecrip);
				DayDescriptions.selectByVisibleText(calendarDesc);
				Thread.sleep(1500);
				
//				Select RateType =new Select(rateType);
//				RateType.selectByVisibleText(ratetype);
//				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy1.isSelected();
				if(isSelected == false) {
					PayrollRunBy1.click();
				}
				Thread.sleep(1500);
			//	Governmentrate.sendKeys("10");
				CompanyRate.sendKeys(CompneyRate);
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String addRateMasterDuplicateCheck(String calendarDesc,String ratetype,String GovernmentRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
				Select DayDescriptions=new Select(Calendardecrip);
				DayDescriptions.selectByVisibleText(calendarDesc);
				Thread.sleep(1500);
				
				Select RateType =new Select(rateType);
				RateType.selectByVisibleText(ratetype);
				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy2.isSelected();
				if(isSelected == false) {
					PayrollRunBy2.click();
				}
				Thread.sleep(1500);
				Governmentrate.sendKeys(GovernmentRate);
//				CompanyRate.sendKeys(CompneyRate);
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public boolean resetbuttonvalidation(String calendarDesc,String ratetype,String GovernmentRate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				AddRateMaster.click();
				Thread.sleep(1500);
		
				Select DayDescriptions=new Select(Calendardecrip);
				DayDescriptions.selectByVisibleText(calendarDesc);
				Thread.sleep(1500);
				
				Select RateType =new Select(rateType);
				RateType.selectByVisibleText(ratetype);
				Thread.sleep(1500);
				
				boolean isSelected = PayrollRunBy2.isSelected();
				if(isSelected == false) {
					PayrollRunBy2.click();
				}
				Thread.sleep(1500);
				Governmentrate.sendKeys(GovernmentRate);
//				CompanyRate.sendKeys(CompneyRate);
				resetButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				
				
				boolean flag = false;
		        try {
		            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
		            if (element.isDisplayed() || element.isEnabled())
//		                flag = false;
		                nextButton.click();
		            System.out.println("next button visible");
		        } catch (NoSuchElementException e) {
//		            flag = true;
		            System.out.println("next button not visible");
		        } 
		        return flag;
				
			}
			
			public Boolean searchRateMasterCalenderdecsiptionpagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				RateMaster.click();
				Thread.sleep(1500);
				searchBox.sendKeys(search);
				Thread.sleep(1500);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}
			
}
