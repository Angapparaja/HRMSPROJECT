package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterExitManagementInterviewQuestions extends TestBase{
	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// InterviewQuestionlink
	@FindBy(xpath="//span[@id='get_FBQ_data']")
	WebElement  InterviewQuestionlink;
	
	//ExitManagement
	@FindBy(xpath="//span[@id='fnfmst_font']")
	WebElement ExitManagement;
	
	//AddExitManagement
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDExitManagement;
		
		
		//feedback
		@FindBy(xpath="//textarea[@id='question']")
		WebElement feedback;
		
		//duplicate Check
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;
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
		
		public MasterExitManagementInterviewQuestions() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		
		
		public boolean addMasterExitManagementInterviewQuestions(String feedbacks) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
			 ADDExitManagement.click();
			Thread.sleep(1000);
			feedback.sendKeys(feedbacks);
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			return true;
			
		}
		
		public String MasterExitManagementInterviewQuestionsNegativeCheck(String feedbacks) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
			 ADDExitManagement.click();
			Thread.sleep(1000);
			feedback.sendKeys(feedbacks);
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String addMasterExitManagementInterviewQuestionsMandatoryFieldCheckValidation() throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
			 ADDExitManagement.click();
			Thread.sleep(1000);
//			feedback.sendKeys("whats about you?");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			
			String MasterExitManagementInterviewQuestionsCheckValidation = duplicateCheck.getText();
			Thread.sleep(1000);
			return MasterExitManagementInterviewQuestionsCheckValidation;
		
		}
		
		public boolean addMasterExitManagementInterviewQuestionsResetButton(String feedbacks) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
			 ADDExitManagement.click();
			Thread.sleep(1000);
			feedback.sendKeys(feedbacks);
			Thread.sleep(1000);
			resetButton.click();
			Thread.sleep(1000);
			return true;
		}
		
		public boolean isnextbuttonPaginationVisible() throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
			
			
			boolean flag = false;
	        try {
	            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
	            if (element.isDisplayed() || element.isEnabled())
//	                flag = false;
	                nextButton.click();
	            System.out.println("next button visible");
	        } catch (NoSuchElementException e) {
//	            flag = true;
	            System.out.println("next button not visible");
	        } 
	        return flag;
			
		}
		public Boolean searchInterviewQuestionNamepagination(String search) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			InterviewQuestionlink.click();
			 Thread.sleep(1000);
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
