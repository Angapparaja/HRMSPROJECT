package com.hrms.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterAttendanceODReason extends TestBase{
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	  //ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;
	
	  //ODreson
	@FindBy(xpath = "//a/span[text()='OD Reason']")
	WebElement ODreson;
	
	  //ODresonText
		@FindBy(xpath = "//input[@id='odname']")
		WebElement ODresonText;
		//Add
		@FindBy(xpath = "//*[@id='swap']")
		WebElement AddBtn;
		
		//save button
		@FindBy(xpath = "//*[text()='Save']")
		WebElement saveButton;
		
		//reset button
		@FindBy(xpath = "//*[text()='Reset']")
		WebElement resetButton;
					
		//duplicate Check
		//	@FindBy(xpath = "//*[text()='toast-container']")
			@FindBy(xpath="//div[@class='toast-message']")
			WebElement duplicateCheck;
			
			 //edit button
			@FindBy(xpath = "//a[@class='fa fa-edit']")
			WebElement EditBtn;
			
			//update button
			@FindBy(xpath = "//button[text()='Update']")
			WebElement UpdateBtn;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
			
			
			public MasterAttendanceODReason() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean AttendanceODReasonAdd(String ODresonTextmethod) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(500);
				ODreson.click();
				Thread.sleep(500);
				AddBtn.click();
				Thread.sleep(500);
				ODresonText.sendKeys(ODresonTextmethod);
				Thread.sleep(500);
				saveButton.click();
				
				return true;
				
			}
			
			public boolean verifyAttendanceODReasonResetButton(String ODresonTextmethod) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				ODreson.click();
				Thread.sleep(500);
				AddBtn.click();
				Thread.sleep(500);
				ODresonText.sendKeys(ODresonTextmethod);
				Thread.sleep(500);
				resetButton.click();
				
				return true;
				
			}
			
			public String AttendanceODReasonNameMandatoryFieldVaidation() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				ODreson.click();
				Thread.sleep(500);
				AddBtn.click();
				Thread.sleep(500);
//				OTname.sendKeys(OTmethod);
//				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
			}
	

}
