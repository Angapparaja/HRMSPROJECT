package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalIdentificationProof extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//			@FindBy(xpath = "//*[@id='otherdetail']")
//			WebElement personal;

	//idproof 
//		@FindBy(xpath = "//*[@id='idproof']")
//		WebElement idproof;

		//idproof ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement idproofADD;
		
		//idproofName
//		@FindBy(xpath = "//*[@id='idproofName']")
//		WebElement idproofName;
		
		
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
//		@FindBy(xpath = "//*[text()='Enter idproof Name']")
//		WebElement idproofNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
		
		
		//searchBox
//		@FindBy(xpath="//input[@type='search']")
//		WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By idproof=By.xpath("//*[@id='idproof']");
	
	By idproofADD=By.xpath("//*[@id='swap']");
	
	By idproofName=By.xpath("//*[@id='idproofName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By idproofNameMandator=By.xpath("//*[text()='Enter idproof Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");


		
	public MasterPersonalIdentificationProof() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addidproofName(String idproofs) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		idproofADD.click();
//		Thread.sleep(1000);
//		idproofName.sendKeys(idproofs);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doClick(idproofADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(idproofName, idproofs);
		
		ElementUtil.doClick(saveButton);
		
		return true;
		
	}
	
	public String idproofNameNegativeCheck(String idproofs) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		idproofADD.click();
//		Thread.sleep(1000);
//		idproofName.sendKeys(idproofs);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String mandatoryname=duplicateCheck.getText(); 
//		return mandatoryname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doClick(idproofADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(idproofName, idproofs);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String mandatoryname=ElementUtil.doGetText(duplicateCheck);
		return mandatoryname;
	}
	
	public String addidproofMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		idproofADD.click();
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String mandatoryname=duplicateCheck.getText(); 
//		return mandatoryname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doClick(idproofADD);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);

		String mandatoryname=ElementUtil.doGetText(duplicateCheck);
		return mandatoryname;

	}
	
	
	public String addidproofDuplicateCheckValidation(String idproofs) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		idproofADD.click();
//		Thread.sleep(1000);
//		idproofName.sendKeys(idproofs);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String duplicatename=duplicateCheck.getText(); 
//		return duplicatename;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doClick(idproofADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(idproofName, idproofs);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String duplicatename=ElementUtil.doGetText(duplicateCheck);
		return duplicatename;
	}
	
	public boolean addidproofResetButton(String idproofs) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		idproofADD.click();
//		Thread.sleep(1000);
//		idproofName.sendKeys(idproofs);
//		Thread.sleep(1000);
//		resetButton.click();

		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doClick(idproofADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(idproofName, idproofs);
		

		ElementUtil.doClick(resetButton);
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
    		    Thread.sleep(500);
//                nextButton.click();
            System.out.println("pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchIdProofNamepagination(String IdProof) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		idproof.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(IdProof);
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(idproof);
		Thread.sleep(500);
		ElementUtil.doSendKeys(searchBox, IdProof);
		Thread.sleep(500);

		List<WebElement> IdProofe=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:IdProofe) {
			String IdProofname=e.getText();
			System.out.println(IdProofname);
		}

		return true;
		
		
	}
	
}
