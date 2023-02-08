package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterAttendanceDaydescription extends TestBase{
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//ATTENDANCE
		@FindBy(xpath = "//*[text()='ATTENDANCE']")
		WebElement attendance;
		
		//DayDescriptionLink
		@FindBy(xpath="//span[@id='attend_daydescription']")
		WebElement DayDescriptionLink;

	//DayDiscriptionADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement DayDiscriptionAdd;
			
	//DayDescriptionInput
			@FindBy(xpath="//input[@id='dayDescription']")
			WebElement DayDescriptionInput;
			
			//Day description short code
			@FindBy(xpath="//input[@id='dayCode']")
			WebElement DayDescShortcode;
			
			//save button
			@FindBy(xpath = "//*[text()='Save']")
			WebElement saveButton;
			//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
			
			public MasterAttendanceDaydescription() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addDayDescption(String DayDescription,String Shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				DayDiscriptionAdd.click();
				Thread.sleep(500);
				DayDescriptionInput.sendKeys(DayDescription);
			
				DayDescShortcode.sendKeys(Shortcode);
				Thread.sleep(500);
				saveButton.click();
				
				return true;
				
			}
			
			public String DayDescptionNegativeCheck(String DayDescription,String Shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				DayDiscriptionAdd.click();
				Thread.sleep(500);
				DayDescriptionInput.sendKeys(DayDescription);
				
				DayDescShortcode.sendKeys(Shortcode);
				Thread.sleep(500);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String DayDescptionDescriptionMandatoryFieldCheck(String Shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				DayDiscriptionAdd.click();
				Thread.sleep(500);
//				DayDescriptionInput.sendKeys(DayDescription);
//				Thread.sleep(1000);
     			DayDescShortcode.sendKeys(Shortcode);
     			Thread.sleep(500);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String DayDescptionShortcodeMandatoryFieldCheck(String DayDescription) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				DayDiscriptionAdd.click();
				Thread.sleep(500);
				DayDescriptionInput.sendKeys(DayDescription);
				Thread.sleep(500);
//				DayDescShortcode.sendKeys(Shortcode);
				Thread.sleep(500);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String DayDescptionDuplicateCheck(String DayDescription,String Shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(1000);
				DayDiscriptionAdd.click();
				Thread.sleep(1000);
				DayDescriptionInput.sendKeys(DayDescription);
				Thread.sleep(1000);
				DayDescShortcode.sendKeys(Shortcode);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public boolean resetbuttonvalidation(String DayDescription,String Shortcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				DayDiscriptionAdd.click();
				Thread.sleep(500);
				DayDescriptionInput.sendKeys(DayDescription);
				Thread.sleep(500);
				DayDescShortcode.sendKeys(Shortcode);
				Thread.sleep(500);
				resetButton.click();
				
				return true;
				
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(1000);
				
				
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
			
			public Boolean searchAttendenceDayDescriptionpagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				DayDescriptionLink.click();
				Thread.sleep(500);
				searchBox.sendKeys(search);
				Thread.sleep(1000);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}
}
