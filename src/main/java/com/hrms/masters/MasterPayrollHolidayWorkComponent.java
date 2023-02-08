package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayrollHolidayWorkComponent extends TestBase{

	//MasterPage
			@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
			WebElement masterIcon;
			
			//PayRollMenu
			@FindBy(xpath="//span[@id='pay_font']")
			WebElement PayRoll;
			
			//holidayworkxomponent
			@FindBy(xpath="//span[@id='holidayWorkComponant']")
			WebElement holidayworkxomponent;
			
			//holidaytype
			@FindBy(xpath="//select[@id='holidayType']")
			WebElement holidayType;
			
			
			//wages
			@FindBy(xpath="(//span[@class='checkmark'])[1]")
			WebElement wagesDouble;
	
			//wages
			@FindBy(xpath="(//span[@class='checkmark'])[2]")
			WebElement wagesTriples;
			
			//monthly component Hra
			@FindBy(xpath="(//span[@class='checkmark'])[3]")
			WebElement componentHRA;
			
			//wages
			@FindBy(xpath="(//span[@class='checkmark'])[5]")
			WebElement componentBasic;
			
		
			
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
						
						
						public MasterPayrollHolidayWorkComponent() {
							PageFactory.initElements(driver, this);
						}
						
						public String addWorkLocatin() {
							return new String();
						}
						
						public boolean PayrollHolidayWorkComponentAdd(String holidayTypes) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							AddBtn.click();
							Thread.sleep(1000);
							Select level1=new Select(holidayType);
							level1.selectByVisibleText(holidayTypes);
							Thread.sleep(1000);
							boolean selectType = wagesTriples.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								wagesTriples.click();
							}
							Thread.sleep(1000);
							boolean selectType1 = componentHRA.isSelected();
							//performing click operation only if element is not selected
							if(selectType1 == false) {
								componentHRA.click();
							}
							Thread.sleep(1000);
							boolean selectType2 = componentBasic.isSelected();
							//performing click operation only if element is not selected
							if(selectType2 == false) {
								componentBasic.click();
							}
							Thread.sleep(1000);
							saveButton.click();
							Thread.sleep(1000);
							return true;
							
						}
						
						
						
						public String PayrollHolidayWorkComponentHolidayTypeMandatoryFieldVaidation() throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							AddBtn.click();
							Thread.sleep(1000);
//							Select level1=new Select(holidayType);
//							level1.selectByVisibleText(holidayTypes);
//							Thread.sleep(1000);
							boolean selectType = wagesDouble.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								wagesDouble.click();
							}
							Thread.sleep(1000);
							boolean selectType1 = componentHRA.isSelected();
							//performing click operation only if element is not selected
							if(selectType1 == false) {
								componentHRA.click();
							}
							Thread.sleep(1000);
							boolean selectType2 = componentBasic.isSelected();
							//performing click operation only if element is not selected
							if(selectType2 == false) {
								componentBasic.click();
							}
							Thread.sleep(1000);
							saveButton.click();
							Thread.sleep(1000);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						
						public String PayrollHolidayWorkWagesComponentMandatoryFieldVaidation(String holidayTypes) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							AddBtn.click();
							Thread.sleep(1000);
							Select level1=new Select(holidayType);
							level1.selectByVisibleText(holidayTypes);
							Thread.sleep(1000);
//							boolean selectType = wagesDouble.isSelected();
//							//performing click operation only if element is not selected
//							if(selectType == false) {
//								wagesDouble.click();
//							}
//							Thread.sleep(1000);
							boolean selectType1 = componentHRA.isSelected();
							//performing click operation only if element is not selected
							if(selectType1 == false) {
								componentHRA.click();
							}
							Thread.sleep(1000);
							boolean selectType2 = componentBasic.isSelected();
							//performing click operation only if element is not selected
							if(selectType2 == false) {
								componentBasic.click();
							}
							Thread.sleep(1000);
							saveButton.click();
							Thread.sleep(1000);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						
						public String PayrollHolidayWorkMonthlyComponentMandatoryFieldVaidation(String holidayTypes) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							AddBtn.click();
							Thread.sleep(1000);
							Select level1=new Select(holidayType);
							level1.selectByVisibleText(holidayTypes);
							Thread.sleep(1000);
							boolean selectType = wagesDouble.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								wagesDouble.click();
							}
							Thread.sleep(1000);
//							boolean selectType1 = componentHRA.isSelected();
//						
//							if(selectType1 == false) {
//								componentHRA.click();
//							}
//							Thread.sleep(1000);
//							boolean selectType2 = componentBasic.isSelected();
//						
//							if(selectType2 == false) {
//								componentBasic.click();
//							}
							Thread.sleep(1000);
							saveButton.click();
							Thread.sleep(1000);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						
//						public String PayrollHolidayWorkComponentDuplicateCheck(String businessunits,String payslip,String address) throws InterruptedException {
//							masterIcon.click();
//							Thread.sleep(1000);
//							PayRoll.click();
//							Thread.sleep(1000);
//							PaySlipTitle.click();
//							Thread.sleep(1000);
//							AddBtn.click();
//							Thread.sleep(1000);
//							Select level1=new Select(BusinessUnit);
//							level1.selectByVisibleText(businessunits);
//							Thread.sleep(1000);
//							PayslipTitle.sendKeys(payslip);
//							Thread.sleep(1000);
//							PayslipAddress.sendKeys(address);
//							Thread.sleep(1000);
//							Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
//							Thread.sleep(1000);
//							saveButton.click();
//							String value=duplicateCheck.getText(); 
//							return value;
//						}
						
						public boolean verifyPayrollHolidayWorkComponentResetButton(String holidayTypes) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							AddBtn.click();
							Thread.sleep(1000);
							Select level1=new Select(holidayType);
							level1.selectByVisibleText(holidayTypes);
							Thread.sleep(1000);
							boolean selectType = wagesDouble.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								wagesDouble.click();
							}
							Thread.sleep(1000);
							boolean selectType1 = componentHRA.isSelected();
						
							if(selectType1 == false) {
								componentHRA.click();
							}
							Thread.sleep(1000);
							boolean selectType2 = componentBasic.isSelected();
						
							if(selectType2 == false) {
								componentBasic.click();
							}
							Thread.sleep(1000);
							resetButton.click();
							Thread.sleep(1000);
							return true;
							
						}
						
						public boolean isnextbuttonPayrollHolidayWorkComponentVisible() throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);

							boolean flag = false;
					        try {
					            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
					            if (element.isDisplayed() || element.isEnabled())
//					                flag = false;
					                nextButton.click();
					            System.out.println("next button visible");
					        } catch (NoSuchElementException e) {
//					            flag = true;
					            System.out.println("next button not visible");
					        } 
					        return flag;
							
						}
						
						public Boolean searchPayrollHolidayWorkComponentpagination(String search,String searchpointvalue) throws InterruptedException {
							
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							searchBox.sendKeys(search);
							Thread.sleep(1000);
							List<WebElement> searchvalue=driver.findElements(By.xpath("(//tbody/tr/td[2][text()])[3]"));
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
						
						public String searchPayrollHolidayWorkComponentEdit(String search) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1000);
							PayRoll.click();
							Thread.sleep(1000);
							holidayworkxomponent.click();
							Thread.sleep(1000);
							searchBox.sendKeys(search);
							Thread.sleep(1000);
							List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
							for(WebElement e:searchvalue) {
								String searchvalues=e.getText();
								System.out.println(searchvalues);
							}
							EditBtn.click();
							Thread.sleep(1000);
							boolean selectType = wagesTriples.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								wagesTriples.click();
							}
							Thread.sleep(1000);
					
							UpdateBtn.click();
							String value=duplicateCheck.getText(); 
							return value;
							
							
						}
}
