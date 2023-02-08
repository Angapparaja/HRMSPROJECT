package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterExitManagementExitType extends TestBase{
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// ExitTypelink
	@FindBy(xpath="//span[@id='exitType']")
	WebElement  ExitTypelink;
	
	//ExitManagement
	@FindBy(xpath="//span[@id='fnfmst_font']")
	WebElement ExitManagement;
	
	//AddExitType
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDExitType;
		
		//ExittypeInput
		@FindBy(xpath="//input[@id='exitTypeName']")
		WebElement ExitTypeInput;
		
		//ReasonLeaving
		@FindBy(xpath="//input[@id='1']")
		WebElement ReasonLeaving;
		
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
		
		public MasterExitManagementExitType() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		
		
		public boolean addMasterExitManagementExitType(String exittype,String resonleave) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
			ExitTypeInput.sendKeys(exittype);
			Thread.sleep(1000);
			
			ReasonLeaving.sendKeys(resonleave);
			Thread.sleep(1000);
		
			saveButton.click();
			Thread.sleep(1000);
			return true;
			
		}
		
		public String MasterExitManagementExitTypeNegativeCheck(String exittype,String resonleave) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
			ExitTypeInput.sendKeys(exittype);
			Thread.sleep(1000);
			
			ReasonLeaving.sendKeys(resonleave);
			Thread.sleep(1000);
		
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String MasterExitManagementExitTypeMandatoryField(String resonleave) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
//			ExitTypeInput.sendKeys(exittype);
//			Thread.sleep(1000);
			
			ReasonLeaving.sendKeys(resonleave);
			Thread.sleep(1000);
		
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String MasterExitManagementreasonleavingMandatoryField(String exittype) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
			ExitTypeInput.sendKeys(exittype);
			Thread.sleep(1000);
			
//			ReasonLeaving.sendKeys(resonleave);
//			Thread.sleep(1000);
		
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String addMasterExitManagementExitTypeDuplicateCheckValidation(String exittype,String resonleave) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
			ExitTypeInput.sendKeys(exittype);
			Thread.sleep(1000);
			
			ReasonLeaving.sendKeys(resonleave);
			Thread.sleep(1000);
		
			saveButton.click();
			Thread.sleep(1000);
			
			String MasterExitManagementExitTypeCheckValidation = duplicateCheck.getText();
			Thread.sleep(1000);
			return MasterExitManagementExitTypeCheckValidation;
		
		}
		
		public boolean addMasterExitManagementExitTypeResetButton(String exittype,String resonleave) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
			 Thread.sleep(1000);
			 ADDExitType.click();
			Thread.sleep(1000);
			ExitTypeInput.sendKeys(exittype);
			Thread.sleep(1000);
			
			ReasonLeaving.sendKeys(resonleave);
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
			ExitTypelink.click();
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

		public Boolean searchExitManagementNamepagination(String search) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			ExitTypelink.click();
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
