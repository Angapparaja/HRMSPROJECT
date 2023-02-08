package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterAttendanceWorkingTime extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
			//WorkingTime
			@FindBy(xpath="//span[@id='workTimeElement']")
			WebElement WorkingTime;
			
			//WorkingTimeADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement WorkingTimeADD;	
			
			//WorkingTimeCode
			@FindBy(xpath="//input[@id='worktimeCode']")
			WebElement WorkingTimeCode;
			
			//WorkingTimedDescription
			@FindBy(xpath="//input[@id='worktimeName']")
			WebElement WorkingTimeDescription;
			
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
			
			public MasterAttendanceWorkingTime() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addWorkingTime(String shortcode,String Description) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
				WorkingTimeCode.sendKeys(shortcode);
				WorkingTimeDescription.sendKeys(Description);
				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public String addWorkingTimeCodeNegativeCheck(String shortcode,String Description) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
				WorkingTimeCode.sendKeys(shortcode);
				WorkingTimeDescription.sendKeys(Description);
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;	
				
			}
			
			
			public String addWorkingTimeCodeMandatoryFieldCheck(String Description) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
//				WorkingTimeCode.sendKeys(shortcode);
				WorkingTimeDescription.sendKeys(Description);
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;	
				
			}
			
			
			public String addWorkingTimeDescriptionFieldMandatoryFieldCheck(String shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
				WorkingTimeCode.sendKeys(shortcode);
//				WorkingTimeDescription.sendKeys(Description);
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String addWorkingTimeDuplicateCheck(String shortcode,String Description) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
				WorkingTimeCode.sendKeys(shortcode);
				WorkingTimeDescription.sendKeys(Description);
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;	
				
			}
			public boolean resetbuttonvalidation(String shortcode,String Description) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
				Thread.sleep(1500);
				WorkingTimeADD.click();
				Thread.sleep(1500);
				WorkingTimeCode.sendKeys(shortcode);
				WorkingTimeDescription.sendKeys(Description);
				resetButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
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
			public Boolean searchPositionTitleNamepagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				WorkingTime.click();
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
