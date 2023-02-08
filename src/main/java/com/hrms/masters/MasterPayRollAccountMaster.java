package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterPayRollAccountMaster extends TestBase{

	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//PayRollMenu
	@FindBy(xpath="//span[@id='pay_font']")
	WebElement PayRoll;
	
	//AccountMasterLink
	@FindBy(xpath="//span[@id='accountmaster']")
	WebElement AccountMaster;
	
	//AccountMasterADD
	@FindBy(xpath = "//*[@id='swap']")
	WebElement AddAccMaster;	
	
	//AccountCode
	@FindBy(xpath=" //input[@id='accountcode']")
	WebElement Accountcode;
	
	//AccountName
	@FindBy(xpath=" //input[@id='accountname']")
	WebElement AccountName;
	
	//save button
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveButton;
	
	//reset button
	@FindBy(xpath = "//*[text()='Reset']")
	WebElement resetButton;
	
	//next button
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	
	//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
				
				//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;
	
	public MasterPayRollAccountMaster() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	public boolean addAccountMaster(String AccountCode,String AccountNames) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
		Accountcode.sendKeys(AccountCode);
		
		AccountName.sendKeys(AccountNames);
		Thread.sleep(1000);
		saveButton.click();
		
		return true;
		
	}
	
	public String addAccountMasterNegativeCheck(String AccountCode,String AccountNames) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
		Accountcode.sendKeys(AccountCode);
	
		AccountName.sendKeys(AccountNames);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String AccountMasterAcccountCodeMandatoryFieldCheck(String AccountNames) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
		AccountName.sendKeys(AccountNames);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String AccountMasterAcccountNamesMandatoryFieldCheck(String AccountCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
	
//		AccountName.sendKeys(AccountNames);
//		Thread.sleep(1000);
		Accountcode.sendKeys(AccountCode);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String AccountMasterDuplicateCheck(String AccountCode,String AccountNames) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
		Accountcode.sendKeys(AccountCode);
		Thread.sleep(1000);
		AccountName.sendKeys(AccountNames);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	public boolean resetbuttonvalidation(String AccountCode,String AccountNames) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		AddAccMaster.click();
		Thread.sleep(1000);
		Accountcode.sendKeys(AccountCode);
		
		AccountName.sendKeys(AccountNames);
		Thread.sleep(500);
		resetButton.click();
	
		return true;
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("next button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("next button not visible");
        } 
        return flag;
		
	}
	public Boolean searchAccountmasterNamepagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		AccountMaster.click();
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
	
}
