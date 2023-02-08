package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayRollBankBranch extends TestBase{
	//MasterPage
			@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
			WebElement masterIcon;
			
			//PayRollMenu
			@FindBy(xpath="//span[@id='pay_font']")
			WebElement PayRoll;
			
			//ADDBankBranch
			@FindBy(xpath = "//*[@id='swap']")
			WebElement AddBankBranch;
			
			//BankBranch
			@FindBy(xpath="//span[@id=\"bankBranch\"]")
			WebElement BankBranch;
			
			//BankName
			@FindBy(xpath="//*[@id=\"bankName\"]")
			WebElement BankName;
			
			//Branch name
			@FindBy(xpath="//input[@id='branchName']")
			WebElement BranchName;
			
			//BranchCode
			@FindBy(xpath="//input[@id='ifscCode']")
			WebElement BranchCode;
			
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
			
			
			public  MasterPayRollBankBranch() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			public boolean addPayrollBankBranch(String bankName,String BranchNames,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				return true;
				
			}
			
			public String PayrollBankBranchNameNegativeCheck(String bankName,String BranchNames,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String PayrollBankBranchBankNameMandatoryFieldCheck(String BranchNames,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
//				Select Banknames=new Select(BankName);
//				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String PayrollBankBranchNameMandatoryFieldCheck(String bankName,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
//				BranchName.sendKeys(BranchNames);
//				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String PayrollBankBranchBrachCodeMandatoryFieldCheck(String bankName,String BranchNames) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
//				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String PayrollBankBranchDuplicateCheck(String bankName,String BranchNames,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public boolean ResetBtnPayrollBankBranch(String bankName,String BranchNames,String branchCode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
				Thread.sleep(1000);
				AddBankBranch.click();
				Thread.sleep(1000);
				Select Banknames=new Select(BankName);
				Banknames.selectByVisibleText(bankName);
				Thread.sleep(1000);
				BranchName.sendKeys(BranchNames);
				Thread.sleep(1000);
				BranchCode.sendKeys(branchCode);
				resetButton.click();
				Thread.sleep(1000);
				return true;
				
			}
			

			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
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
			
			public Boolean searchPayrollBankBranchpagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				BankBranch.click();
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
