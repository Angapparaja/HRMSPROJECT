package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPayRollBank extends TestBase{
	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//PayRollMenu
		@FindBy(xpath="//span[@id='pay_font']")
		WebElement PayRoll;
		
		//Bank Link
		@FindBy(xpath="//span[@id='bank']")
		WebElement Bank;
		
		//ADDBankDetails
		@FindBy(xpath = "//*[@id='swap']")
		WebElement AddBank;
		
		//BankCode
		@FindBy(xpath="//input[@id='bankCode']")
		WebElement BankCode;
		
		//BankAccountNo
		@FindBy(xpath="//input[@id='bankAccountNo']")
		WebElement bankaccno;
		
		//BankName
		@FindBy(xpath="//input[@id='bankName']")
		WebElement bankname;
		
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
		
		public MasterPayRollBank() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		public boolean addPayrollBank(String bankcodes,String bankaccnos,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(1000);
			AddBank.click();
			Thread.sleep(500);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
			bankaccno.sendKeys(bankaccnos);
			}else
			{
				System.out.println("bankaccno is not listed");
			}
			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			saveButton.click();
		
			return true;
			
		}
		
		public String PayrollBankNegativeCheck(String bankcodes,String bankaccnos,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(1000);
			AddBank.click();
			Thread.sleep(1000);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
				bankaccno.sendKeys(bankaccnos);
				}else
				{
					System.out.println("bankaccno is not listed");
				}
			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			saveButton.click();
			Thread.sleep(500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String PayrollBankCodeMandatoryFieldCheck(String bankaccnos,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(1000);
			AddBank.click();
			Thread.sleep(500);
//			BankCode.sendKeys(bankcodes);
//			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
				bankaccno.sendKeys(bankaccnos);
				}else
				{
					System.out.println("bankaccno is not listed");
				}
			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			saveButton.click();
			Thread.sleep(500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String PayrollBankaccnoMandatoryFieldCheck(String bankcodes,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(500);
			AddBank.click();
			Thread.sleep(1000);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
//			bankaccno.sendKeys(bankaccnos);
//			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			saveButton.click();
			Thread.sleep(500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String PayrollBankNameMandatoryFieldCheck(String bankcodes,String bankaccnos) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(1000);
			AddBank.click();
			Thread.sleep(1000);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
				bankaccno.sendKeys(bankaccnos);
				}else
				{
					System.out.println("bankaccno is not listed");
				}
			Thread.sleep(1000);
//			bankname.sendKeys(banknames);
			saveButton.click();
			Thread.sleep(500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String PayrollBankDuplicateCheck(String bankcodes,String bankaccnos,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(500);
			AddBank.click();
			Thread.sleep(1000);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
				bankaccno.sendKeys(bankaccnos);
				}else
				{
					System.out.println("bankaccno is not listed");
				}
			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			saveButton.click();
			Thread.sleep(500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public boolean ResetBtnPayrollBank(String bankcodes,String bankaccnos,String banknames) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
			Thread.sleep(1000);
			AddBank.click();
			Thread.sleep(1000);
			BankCode.sendKeys(bankcodes);
			Thread.sleep(1000);
			if(bankaccno.isDisplayed()) {
				bankaccno.sendKeys(bankaccnos);
				}else
				{
					System.out.println("bankaccno is not listed");
				}
			Thread.sleep(1000);
			bankname.sendKeys(banknames);
			Thread.sleep(500);
			resetButton.click();
			
			return true;
			
		}
		
		public boolean isnextbuttonPaginationVisible() throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
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
		
		public Boolean searchBankNamepagination(String search) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			PayRoll.click();
			Thread.sleep(1000);
			Bank.click();
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
