package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterLetterTemplateLetterTemp extends TestBase{


	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// LetterTemplink
	@FindBy(xpath="//span[text()='LETTER TEMPLATE']")
	WebElement  LetterTemplink;
	
	//lettertemplates
	@FindBy(xpath="//span[@id='letterTemplate']")
	WebElement lettertemplates;
	
	//AddLetterTemplink
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDLetterTemplink;
		
		// DocumentMasterlink
		@FindBy(xpath="//span[@id='doc_font']")
		WebElement  DocumentMasterlink;
		
		//LetterTemplateName
		@FindBy(xpath="//input[@id='templateName']")
		WebElement TemplateName;
		
		//TemplateType
		@FindBy(xpath="//*[@id='templateType']")
		WebElement TemplateType;
		
		//TemplateField
		@FindBy(xpath="//*[@id='field_val']")
		WebElement InsertField;
		
		//save button
		@FindBy(xpath = "(//*[text()='Save'])[2]")
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
		
		public MasterLetterTemplateLetterTemp() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		
		
		public boolean addMasterLetterTemplate(String Tempname,String TempType,String InsertFields) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(3500);
			//lettertemplates.click();
			ADDLetterTemplink.click();
			Thread.sleep(2500);
			TemplateName.sendKeys(Tempname);
			Thread.sleep(1000);
			Select TemplateTypes=new Select(TemplateType);
			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
			Select TemplateField=new Select(InsertField);
			TemplateField.selectByVisibleText(InsertFields);
			Thread.sleep(1000);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,450)");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			return true;
			
		}
		
		
		public String MasterLetterTemplateNegativeCheck(String Tempname,String TempType,String InsertFields) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(1000);
		
			ADDLetterTemplink.click();
			Thread.sleep(1000);
			TemplateName.sendKeys(Tempname);
			Thread.sleep(1000);
			Select TemplateTypes=new Select(TemplateType);
			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
			Select TemplateField=new Select(InsertField);
			TemplateField.selectByVisibleText(InsertFields);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String addMasterLetterTemplateNameMantoryFieldValidation(String TempType,String InsertFields) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(1000);
		
			ADDLetterTemplink.click();
			Thread.sleep(1000);
//			TemplateName.sendKeys(Tempname);
//			Thread.sleep(1000);
			Select TemplateTypes=new Select(TemplateType);
			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
			Select TemplateField=new Select(InsertField);
			TemplateField.selectByVisibleText(InsertFields);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
		
		}
		
		public String addMasterLetterTemplateTypeMantoryFieldValidation(String Tempname,String InsertFields) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(1000);
		
			ADDLetterTemplink.click();
			Thread.sleep(1000);
			TemplateName.sendKeys(Tempname);
			Thread.sleep(1000);
//			Select TemplateTypes=new Select(TemplateType);
//			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
			Select TemplateField=new Select(InsertField);
			TemplateField.selectByVisibleText(InsertFields);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
		
		}
		
		
		public String addMasterLetterTemplateInsertFieldMantoryFieldValidation(String Tempname,String TempType) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(1000);
		
			ADDLetterTemplink.click();
			Thread.sleep(1000);
			TemplateName.sendKeys(Tempname);
			Thread.sleep(1000);
			Select TemplateTypes=new Select(TemplateType);
			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
//			Select TemplateField=new Select(InsertField);
//			TemplateField.selectByVisibleText(InsertFields);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			saveButton.click();
			Thread.sleep(1000);
			String value=duplicateCheck.getText(); 
			return value;
		
		}
		public boolean addLetterTemplateResetButton(String Tempname,String TempType,String InsertFields) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
			Thread.sleep(1000);
		
			ADDLetterTemplink.click();
			Thread.sleep(1000);
			TemplateName.sendKeys(Tempname);
			Thread.sleep(1000);
			Select TemplateTypes=new Select(TemplateType);
			TemplateTypes.selectByVisibleText(TempType);
			Thread.sleep(1000);
			Select TemplateField=new Select(InsertField);
			TemplateField.selectByVisibleText(InsertFields);
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,500)");
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
			LetterTemplink.click();
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
		
		public Boolean searchLetterTemplatePagination(String search) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			DocumentMasterlink.click();
			Thread.sleep(1000);
			LetterTemplink.click();
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
