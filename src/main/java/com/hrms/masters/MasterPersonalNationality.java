package com.hrms.masters;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalNationality extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//			@FindBy(xpath = "//*[@id='otherdetail']")
//			WebElement personal;

	//nationality 
//		@FindBy(xpath = "//*[@id='nationality']")
//		WebElement nationality;

		//Religion ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement nationalityADD;
		
		//nationalityName
//		@FindBy(xpath = "//*[@id='nationalityName']")
//		WebElement nationalityName;
		
		
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
//		@FindBy(xpath = "//*[text()='Enter nationality Name']")
//		WebElement nationalityNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
		
//		@FindBy(xpath="//*[@id='DataTables_Table_0_paginate']")
//		WebElement pagination;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By nationality=By.xpath("//*[@id='nationality']");
	
	By nationalityADD=By.xpath("//*[@id='swap']");
	
	By nationalityName=By.xpath("//*[@id='nationalityName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By nationalityNameMandatory=By.xpath("//*[text()='Enter nationality Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By pagination=By.xpath("//*[@id='DataTables_Table_0_paginate']");


	
	public MasterPersonalNationality() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addNationality(String nation) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
//		nationalityADD.click();
//		Thread.sleep(1000);
//		nationalityName.sendKeys(nation);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(600);
		ElementUtil.doClick(nationalityADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(nationalityName, nation);
		
		ElementUtil.doClick(saveButton);
		return true;
		
	}
	
	public String addNationalityNegativeCheck(String nation) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
//		nationalityADD.click();
//		Thread.sleep(1000);
//		nationalityName.sendKeys(nation);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String nationals=duplicateCheck.getText(); 
//		return nationals;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(500);
		ElementUtil.doClick(nationalityADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(nationalityName, nation);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String nationals=ElementUtil.doGetText(duplicateCheck);
		return nationals;
		
	}
	
	public String addnationalityNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
//		nationalityADD.click();
//		Thread.sleep(1000);
		//nationalityName.sendKeys("UKRENIAN");
//		saveButton.click();
//		Thread.sleep(1000);
//		String national=duplicateCheck.getText(); 
//		return national;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(500);
		ElementUtil.doClick(nationalityADD);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String national=ElementUtil.doGetText(duplicateCheck);
		return national;
		
	}
	
	
	public String addreligionADDDuplicateCheckValidation(String national) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
//		nationalityADD.click();
//		Thread.sleep(1000);
//		nationalityName.sendKeys(national);
//		Thread.sleep(1000);
//		saveButton.click();
//		String nationals=duplicateCheck.getText(); 
//		return nationals;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(500);
		ElementUtil.doClick(nationalityADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(nationalityName, national);
		

		ElementUtil.doClick(saveButton);
		

		String nationals=ElementUtil.doGetText(duplicateCheck);
		return nationals;

		
	
	}
	
	public boolean addreligionADDResetButton(String national) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
//		nationalityADD.click();
//		Thread.sleep(1000);
//		nationalityName.sendKeys(national);
//		Thread.sleep(1000);
//		resetButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(500);
		ElementUtil.doClick(nationalityADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(nationalityName, national);
		

		ElementUtil.doClick(resetButton);
		return true;
		
	}

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		nationality.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(nationality);
		Thread.sleep(500);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return flag;
	
		
		
	}
	
	
}
