package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterDocumentMasterDocumentMaster extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// DocumentMasterlink
	@FindBy(xpath="//span[@id='doc_font']")
	WebElement  DocumentMasterlink;
	
	//AddDocumentMaster
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDDocumentMaster;
		
		//DocumentMaster
		@FindBy(xpath="//input[@id='documentName']")
		WebElement DocumentName;
		
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
				
				public MasterDocumentMasterDocumentMaster() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				
				public boolean addMasterDocumentMaster(String documentMaster) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
					Thread.sleep(1000);
					ADDDocumentMaster.click();
					Thread.sleep(1000);
					DocumentName.sendKeys(documentMaster);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				public String MasterDocumentMasterNegativeCheck(String documentMaster) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
					Thread.sleep(1000);
					ADDDocumentMaster.click();
					Thread.sleep(1000);
					DocumentName.sendKeys(documentMaster);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				
				public String MasterDocumentMasterMandatoryFieldCheck() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
					Thread.sleep(1000);
					ADDDocumentMaster.click();
					Thread.sleep(1000);
//					DocumentName.sendKeys(documentMaster);
//					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String addMasterDocumentMasterCheckDuplicateValidation(String documentMaster) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
					Thread.sleep(1000);
				
					ADDDocumentMaster.click();
					Thread.sleep(1000);
					DocumentName.sendKeys(documentMaster);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					
					String DocumentMasterCheckDuplicateValidation = duplicateCheck.getText();
					Thread.sleep(1000);
					return DocumentMasterCheckDuplicateValidation;
				
				}
				
				public boolean addMasterDocumentMasterResetButton(String documentMaster) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
					Thread.sleep(1000);
				
					ADDDocumentMaster.click();
					Thread.sleep(1000);
					DocumentName.sendKeys(documentMaster);
					Thread.sleep(1000);
					resetButton.click();
					Thread.sleep(1000);
					return true;
				}
				
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
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
				
				public Boolean searchDocumentMasterpagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					DocumentMasterlink.click();
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
