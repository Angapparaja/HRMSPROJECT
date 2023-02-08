package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayrollPaySlipTitle extends TestBase{
	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//PayRollMenu
		@FindBy(xpath="//span[@id='pay_font']")
		WebElement PayRoll;
		
		//PaySlipTitle
		@FindBy(xpath="//span[@id='paySlipTitle']")
		WebElement PaySlipTitle;
		
		//BusinessUnit
		@FindBy(xpath="//select[@id='PrintCatId']")
		WebElement BusinessUnit;
		
		//PayslipTitle
		@FindBy(xpath="//textarea[@id='name']")
		WebElement PayslipTitle;
		
		//PayslipAddress
		@FindBy(xpath="//textarea[@id='address']")
		WebElement PayslipAddress;
		
		//Consultant logo
		@FindBy(xpath="//input[@name='ConsultantLogo']")
		WebElement Consultant_logo;
		
		//Add
				@FindBy(xpath = "//*[@id='swap']")
				WebElement AddBtn;
				
				//save button
						@FindBy(xpath = "//*[text()='Save']")
						WebElement saveButton;
						
						//reset button
						@FindBy(xpath = "//*[text()='Reset']")
						WebElement resetButton;
									
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
							
							
							public MasterPayrollPaySlipTitle() {
								PageFactory.initElements(driver, this);
							}
							
							public String addWorkLocatin() {
								return new String();
							}
							
							public boolean PayrollPayslipTitleAdd(String businessunits,String payslip,String address) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								AddBtn.click();
								Thread.sleep(500);
								Select level1=new Select(BusinessUnit);
								level1.selectByVisibleText(businessunits);
								Thread.sleep(1000);
								PayslipTitle.sendKeys(payslip);
								Thread.sleep(500);
								PayslipAddress.sendKeys(address);
								Thread.sleep(1000);
								Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
								Thread.sleep(1000);
								saveButton.click();
								
								return true;
								
							}
							
							
							
							public String PayrollPayslipTitleBusinessUnitMandatoryFieldVaidation(String payslip,String address) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(500);
								AddBtn.click();
								Thread.sleep(500);
//								Select level1=new Select(BusinessUnit);
//								level1.selectByVisibleText(businessunits);
								Thread.sleep(1000);
								PayslipTitle.sendKeys(payslip);
								Thread.sleep(500);
								PayslipAddress.sendKeys(address);
								Thread.sleep(1000);
								Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
								Thread.sleep(1000);
								saveButton.click();
								Thread.sleep(500);
								String value=duplicateCheck.getText(); 
								return value;
							}
							
							
							public String PayrollPayslipTitleMandatoryFieldVaidation(String businessunits,String address) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								AddBtn.click();
								Thread.sleep(1000);
								Select level1=new Select(BusinessUnit);
								level1.selectByVisibleText(businessunits);
								Thread.sleep(1000);
//								PayslipTitle.sendKeys(payslip);
//								Thread.sleep(1000);
								PayslipAddress.sendKeys(address);
								Thread.sleep(500);
								Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
								Thread.sleep(500);
								saveButton.click();
								Thread.sleep(500);
								String value=duplicateCheck.getText(); 
								return value;
							}
							
							
							public String PayrollPayslipTitleDuplicateCheck(String businessunits,String payslip,String address) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								AddBtn.click();
								Thread.sleep(1000);
								Select level1=new Select(BusinessUnit);
								level1.selectByVisibleText(businessunits);
								Thread.sleep(1000);
								PayslipTitle.sendKeys(payslip);
								
								PayslipAddress.sendKeys(address);
								Thread.sleep(1000);
								Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
								Thread.sleep(1000);
								saveButton.click();
								Thread.sleep(500);
								String value=duplicateCheck.getText(); 
								return value;
							}
							
							public boolean verifyPayrollPayslipTitleResetButton(String businessunits,String payslip,String address) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								AddBtn.click();
								Thread.sleep(1000);
								Select level1=new Select(BusinessUnit);
								level1.selectByVisibleText(businessunits);
								Thread.sleep(1000);
								PayslipTitle.sendKeys(payslip);
								Thread.sleep(1000);
								PayslipAddress.sendKeys(address);
								Thread.sleep(1000);
								Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
								Thread.sleep(1000);
								resetButton.click();
							
								return true;
								
							}
							
							public boolean isnextbuttonPaginationVisible() throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								
								
								boolean flag = false;
						        try {
						            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
						            if (element.isDisplayed() || element.isEnabled())
//						                flag = false;
						                nextButton.click();
						            System.out.println("next button visible");
						        } catch (NoSuchElementException e) {
//						            flag = true;
						            System.out.println("next button not visible");
						        } 
						        return flag;
								
							}
							
							public Boolean searchPayrollPayslipTitlepagination(String search,String searchpointvalue) throws InterruptedException {
								
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								searchBox.sendKeys(search);
								Thread.sleep(1000);
								List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
								for(WebElement e:searchvalue) {
									String searchvalues=e.getText();
									System.out.println(searchvalues);
									Thread.sleep(1000);
									
									if(searchvalues.equals(searchpointvalue)) {
										//System.out.println(searchvalues);
										System.out.println("sucessfully searched : "+searchvalues);
										return true;
									}
									
									else {
										System.out.println("value not correct");	
										return false;
									}
								}

								return true;
								
								
							}
							
							public String searchPayrollPayslipTitleEdit(String search,String editName) throws InterruptedException {
								masterIcon.click();
								Thread.sleep(1000);
								PayRoll.click();
								Thread.sleep(1000);
								PaySlipTitle.click();
								Thread.sleep(1000);
								searchBox.sendKeys(search);
								Thread.sleep(1000);
								List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
								for(WebElement e:searchvalue) {
									String searchvalues=e.getText();
									System.out.println(searchvalues);
								}
								EditBtn.click();
								Thread.sleep(1000);
								PayslipTitle.clear();
								PayslipTitle.sendKeys(editName);
								Thread.sleep(1000);
						
								UpdateBtn.click();
								String value=duplicateCheck.getText(); 
								return value;
								
								
							}
	
}
