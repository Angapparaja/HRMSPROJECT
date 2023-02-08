package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterReimbursementEndPeriodPayLists extends TestBase{

	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Reimbursement
	@FindBy(xpath="//span[@id='reim_font']")
	WebElement Reimbursement;
	
	//ReimbursementEndPeriodPayLists
	@FindBy(xpath="//span[@id='endperiodpay']")
	WebElement ReimbursementEndPeriodPayLists;
	
	//ReimbursementEndPeriodPayLists
	@FindBy(xpath="//h6[text()]")
	WebElement ReimbursementEndPeriodText;
	
			
			//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
				
				
				//edit button
				@FindBy(xpath = "//a[@class='fa fa-edit']")
				WebElement EditBtn;
				
				//update button
				@FindBy(xpath = "//button[text()='Update']")
				WebElement UpdateBtn;
				
				//next button
				@FindBy(xpath = "//*[text()='Next']")
				WebElement nextButton;
				
				//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;	
				
				public MasterReimbursementEndPeriodPayLists() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean ReimbursementEndPeriodPayLists() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					Reimbursement.click();
					Thread.sleep(1000);
					ReimbursementEndPeriodPayLists.click();
					Thread.sleep(1000);
				
					return true;
					
				}
				
				public String ReimbursementEndPeriodPayListsValue() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					Reimbursement.click();
					Thread.sleep(1000);
					ReimbursementEndPeriodPayLists.click();
					Thread.sleep(1000);

					String value=ReimbursementEndPeriodText.getText(); 
					return value;
					
				}
				
//				public String ReimbursementEmployeeListViewComponentMandatoryFieldCheck(String Empcode) throws InterruptedException {
//					masterIcon.click();
//					Thread.sleep(1000);
//					Reimbursement.click();
//					Thread.sleep(1000);
//					MasterReimbursementEmployeeListView.click();
//					Thread.sleep(1000);
//					ReimbursementEmpCode.sendKeys(Empcode);
////					Select level1=new Select(Reimbursementyearmonth);
////					level1.selectByVisibleText(Yearmonth);
////					Thread.sleep(1000);
//					ListBtn.click();
//					String value=duplicateCheck.getText(); 
//					return value;
//					
//				}
				
	            public boolean isnextbuttonReimbursementEndPeriodPayListsViewVisible() throws InterruptedException {
	            	masterIcon.click();
					Thread.sleep(1000);
					Reimbursement.click();
					Thread.sleep(1000);
					ReimbursementEndPeriodPayLists.click();
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
	            
//				public Boolean ReimbursementBillspagination(String search,String searchpointvalue) throws InterruptedException {
//	            masterIcon.click();
//				Thread.sleep(1000);
//				Reimbursement.click();
//				Thread.sleep(1000);
//				ReimbursementBills.click();
//				Thread.sleep(1000);
//				Thread.sleep(1000);
//				searchBox.sendKeys(search);
//				Thread.sleep(1000);
//				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
//				for(WebElement e:searchvalue) {
//					String searchvalues=e.getText();
//					System.out.println(searchvalues);
//					Thread.sleep(1000);
//					
//					if(searchvalues.equals(searchpointvalue)) {
//						//System.out.println(searchvalues);
//						System.out.println("sucessfully searched : "+searchvalues);
//						return true;
//					}
//					
//					else {
//						System.out.println("value not correct");	
//						return false;
//					}
//				}
	//
//				return true;
//				
//				
//			}
//			
//			public String ReimbursementBillsEdit(String search,String editName) throws InterruptedException {
//	            masterIcon.click();
//				Thread.sleep(1000);
//				Reimbursement.click();
//				Thread.sleep(1000);
//				ReimbursementBills.click();
//				Thread.sleep(1000);
//				searchBox.sendKeys(search);
//				Thread.sleep(1000);
//				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
//				for(WebElement e:searchvalue) {
//					String searchvalues=e.getText();
//					System.out.println(searchvalues);
//				}
//				EditBtn.click();
//				Thread.sleep(1000);
//				policyName.clear();
//				policyName.sendKeys(editName);
//				Thread.sleep(1000);
//				UpdateBtn.click();
//				String value=duplicateCheck.getText(); 
//				return value;
//				
//				
//			}
	
}
