package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceOTReason extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	  //ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;
	
	  //OTreason
	@FindBy(xpath = "//span[@id='otMethod']")
	WebElement OTReason;
	
	//OTReasonName
	@FindBy(xpath = "//input[@id='otname']")
	WebElement OTname;
	
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
				
				public MasterAttendanceOTReason() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean AttendanceOTReasonAdd(String OTmethod) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(500);
					OTReason.click();
					Thread.sleep(500);
					AddBtn.click();
					Thread.sleep(500);
					OTname.sendKeys(OTmethod);
					Thread.sleep(500);
					saveButton.click();
					
					return true;
					
				}
				
				public String AttendanceOTReasonNameNegativeCheck(String OTmethod) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(500);
					AddBtn.click();
					Thread.sleep(500);
					OTname.sendKeys(OTmethod);
					Thread.sleep(500);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String AttendanceOTReasonNameMandatoryFieldVaidation() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(500);
					AddBtn.click();
					Thread.sleep(500);
//					OTname.sendKeys(OTmethod);
//					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
				}
				
				
	
				
			
				
				public boolean verifyAttendanceOTReasonResetButton(String OTmethod) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(500);
					AddBtn.click();
					Thread.sleep(500);
					OTname.sendKeys(OTmethod);
					Thread.sleep(500);
					resetButton.click();
					
					return true;
					
				}
				
				public boolean isnextbuttonAttendanceOtReasonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(1000);
				
					boolean flag = false;
			        try {
			            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
			            if (element.isDisplayed() || element.isEnabled())
//			                flag = false;
			                nextButton.click();
			            System.out.println("next button visible");
			        } catch (NoSuchElementException e) {
//			            flag = true;
			            System.out.println("next button not visible");
			        } 
			        return flag;
					
				}
				
				public Boolean searchAttendanceOTreasonpagination(String search,String searchpointvalue) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(500);
					searchBox.sendKeys(search);
					Thread.sleep(1000);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
					for(WebElement e:searchvalue) {
						String searchvalues=e.getText();
						System.out.println(searchvalues);
						Thread.sleep(1000);
						
						if(searchvalues.equals(searchpointvalue)) {
							//System.out.println(searchvalues);
							System.out.println("sucessfully searched : "+searchvalues);
							return true;
						}
						
						else {
							System.out.println("value not correct");	
							return false;
						}
					}

					return true;
					
					
				}
				
				public String searchAttendanceOTReasonEdit(String search,String editOtmethod) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					attendance.click();
					Thread.sleep(1000);
					OTReason.click();
					Thread.sleep(1000);
					searchBox.sendKeys(search);
					Thread.sleep(1000);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
					for(WebElement e:searchvalue) {
						String searchvalues=e.getText();
						System.out.println(searchvalues);
					}
					EditBtn.click();
					Thread.sleep(1000);
					OTname.clear();
					OTname.sendKeys(editOtmethod);
					Thread.sleep(1000);
					UpdateBtn.click();
					String value=duplicateCheck.getText(); 
					return value;
					
					
				}
}
