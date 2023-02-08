package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalLanguage extends TestBase {
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//			@FindBy(xpath = "//*[@id='otherdetail']")
//			WebElement personal;

	//language 
//		@FindBy(xpath = "//*[@id='language']")
//		WebElement language;

		//language ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement languageADD;
		
		//languageName
//		@FindBy(xpath = "//*[@id='languageName']")
//		WebElement languageName;
		
		
		//save button
//		@FindBy(xpath = "//*[text()='Save']")
//		WebElement saveButton;
		
		//reset button
//		@FindBy(xpath = "//*[text()='Reset']")
//		WebElement resetButton;
		
		//duplicate Check
		//	@FindBy(xpath = "//*[text()='toast-container']")
//			@FindBy(xpath="//div[@class='toast-message']")
//			WebElement duplicateCheck;
		
		//religionName Mandatory
//		@FindBy(xpath = "//*[text()='Enter language Name']")
//		WebElement languageNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By language=By.xpath("//*[@id='language']");
	
	By languageADD=By.xpath("//*[@id='swap']");
	
	By languageName=By.xpath("//*[@id='languageName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By languageNameMandatory=By.xpath("//*[text()='Enter language Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	


		
	public MasterPersonalLanguage() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addlanguageName(String languagename) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
//		languageADD.click();
//		Thread.sleep(1000);
//		languageName.sendKeys(languagename);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(2000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);

		ElementUtil.doClick(personal);
		Thread.sleep(1000);

		ElementUtil.doClick(language);
		Thread.sleep(500);

		ElementUtil.doClick(languageADD);
		Thread.sleep(500);

		ElementUtil.doSendKeys(languageName, languagename);
		
		ElementUtil.doClick(saveButton);
		return true;
		
	}
	public String languageNameNegativeCheck(String languages) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
//		languageADD.click();
//		Thread.sleep(1000);
//		languageName.sendKeys(languages);
//		String languagename=duplicateCheck.getText();
//		Thread.sleep(1000);
//		return languagename;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(language);
		Thread.sleep(500);
		ElementUtil.doClick(languageADD);
		Thread.sleep(500);
		
		ElementUtil.doSendKeys(languageName, languages);
		

		ElementUtil.doClick(saveButton);
	
		
		String languagename=ElementUtil.doGetText(duplicateCheck);
		return languagename;

		
	}
	
	public String addlanguageNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
//		languageADD.click();
//		Thread.sleep(1000);
		//languageName.sendKeys("test");
//		saveButton.click();
//		Thread.sleep(1000);
		//saveButton.click();
//		Thread.sleep(2000);
//		String languagename=duplicateCheck.getText();
//		Thread.sleep(1000);
//		return languagename;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(language);
		Thread.sleep(500);
		ElementUtil.doClick(languageADD);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		

		String languagename=ElementUtil.doGetText(duplicateCheck);
		return languagename;
		
		
	}
	
	
	public String addLanguageADDDuplicateCheckValidation(String languagename) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
//		languageADD.click();
//		Thread.sleep(1000);
//		languageName.sendKeys(languagename);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		/*
		 * String text=duplicateCheck.getText(); System.out.println(text);
		 * Assert.assertEquals("Enter language Name", text);
		 */
//		String language=duplicateCheck.getText();
//		Thread.sleep(1000);
//		return language;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(language);
		Thread.sleep(500);
		ElementUtil.doClick(languageADD);
		Thread.sleep(500);

		ElementUtil.doSendKeys(languageName, languagename);

		ElementUtil.doClick(saveButton);
		
		String language=ElementUtil.doGetText(duplicateCheck);
		return language;		
	
	}
	
	public boolean addlanguageADDResetButton(String languagename) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
//		languageADD.click();
//		Thread.sleep(1000);
//		languageName.sendKeys(languagename);
//		resetButton.click();
//		Thread.sleep(2000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(language);
		Thread.sleep(500);
		ElementUtil.doClick(languageADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(languageName, languagename);
		
		ElementUtil.doClick(resetButton);
		
		return true;
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		language.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(language);
		Thread.sleep(500);
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("Pagination  button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return flag;
		
	}
	
	
}
