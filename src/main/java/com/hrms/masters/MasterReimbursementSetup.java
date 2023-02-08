package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterReimbursementSetup extends TestBase{

	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Reimbursement
	@FindBy(xpath="//span[@id='reim_font']")
	WebElement Reimbursement;
	
	//ReimbursementSetup
	@FindBy(xpath="//span[@id='reimbusproperty']")
	WebElement ReimbursementSetup;
	
	//Reimbursementcomponent
		@FindBy(xpath="//select[@id='reimbusid']")
		WebElement Reimbursementcomponent;
		
		//EntitlementComputationCuculative
		@FindBy(xpath="(//span[@class='checkmark'])[1]")
		WebElement EntitlementCucumulative;
	
		//EntitlementComputationMonthly
		@FindBy(xpath="(//span[@class='checkmark'])[2]")
		WebElement EntitlementMonthly;
		
		//ProcessingMethodMonthly
				@FindBy(xpath="(//span[@class='checkmark'])[3]")
				WebElement ProcessingmethodPayINPeriod;
				
				//ProcessingMethodMonthlyadvance
				@FindBy(xpath="(//span[@class='checkmark'])[5]")
				WebElement ProcessingmethodPayINAdvance;
				
				//AttendanceLOPrequire
				@FindBy(xpath="(//span[@class='checkmark'])[7]")
				WebElement AttendancerequireLop;
				
				//AttendanceNotconsider
				@FindBy(xpath="(//span[@class='checkmark'])[8]")
				WebElement AttendanceNotconsider;
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
							
							public MasterReimbursementSetup() {
								PageFactory.initElements(driver, this);
							}
							
							public String addWorkLocatin() {
								return new String();
							}
							
							public boolean ReimbursementSetupCumulativeRadioBtnAdd(String Reimbursementbtn) throws InterruptedException {
								try {
								masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
//								AddBtn.click();
//								Thread.sleep(1000);
								Select level1=new Select(Reimbursementcomponent);
								level1.selectByVisibleText(Reimbursementbtn);
								Thread.sleep(1000);
								//cucumulaative button
								boolean selectType = EntitlementCucumulative.isSelected();
								
								if(selectType == false) {
									EntitlementCucumulative.click();
								}
								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINPeriod.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINPeriod.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								saveButton.click();
								Thread.sleep(1000);
								return true;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return false;
								
							}
							
							public boolean ReimbursementSetupMonthlyradioBtnAdd(String Reimbursementbtn) throws InterruptedException {
								try {
								masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
//								AddBtn.click();
//								Thread.sleep(1000);
								Select level1=new Select(Reimbursementcomponent);
								level1.selectByVisibleText(Reimbursementbtn);
								Thread.sleep(1000);
								//cucumulaative button
								boolean selectType = EntitlementMonthly.isSelected();
								
								if(selectType == false) {
									EntitlementMonthly.click();
								}
								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINAdvance.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINAdvance.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								saveButton.click();
								
								return true;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return false;
								
							}
							
							public String ReimbursementSetupReimbursementMandatoryFieldVaidation() throws InterruptedException {
								try {
								masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
							
//								Select level1=new Select(Reimbursementcomponent);
//								level1.selectByVisibleText(Reimbursementbtn);
//								Thread.sleep(1000);
	                            boolean selectType = EntitlementCucumulative.isSelected();
								
								if(selectType == false) {
									EntitlementCucumulative.click();
								}
								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINPeriod.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINPeriod.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								saveButton.click();
								Thread.sleep(1000);
								String value=duplicateCheck.getText(); 
								return value;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return null;
							}
							
	                        public String ReimbursementSetupEntitleComputationmethodMandatoryFieldVaidation(String Reimbursementbtn) throws InterruptedException {
								try {
								masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
							
								Select level1=new Select(Reimbursementcomponent);
								level1.selectByVisibleText(Reimbursementbtn);
								Thread.sleep(1000);
//	                            boolean selectType = EntitlementCucumulative.isSelected();
//								
//								if(selectType == false) {
//									EntitlementCucumulative.click();
//								}
//								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINPeriod.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINPeriod.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								saveButton.click();
								Thread.sleep(1000);
								String value=duplicateCheck.getText(); 
								return value;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return null;
							}
	                        
	                        public boolean ReimbursementSetupCumulativeRadioBtnResetBtn(String Reimbursementbtn) throws InterruptedException {
								try {
	                        	masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
//								AddBtn.click();
//								Thread.sleep(1000);
								Select level1=new Select(Reimbursementcomponent);
								level1.selectByVisibleText(Reimbursementbtn);
								Thread.sleep(1000);
								//cucumulaative button
								boolean selectType = EntitlementCucumulative.isSelected();
								
								if(selectType == false) {
									EntitlementCucumulative.click();
								}
								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINPeriod.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINPeriod.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								resetButton.click();
								Thread.sleep(1000);
								return true;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return false;
								
							}
	                        
	                        public boolean ReimbursementSetupMonthlyradioBtnResetBtn(String Reimbursementbtn) throws InterruptedException {
								try {
	                        	masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
								Thread.sleep(1000);
//								AddBtn.click();
//								Thread.sleep(1000);
								Select level1=new Select(Reimbursementcomponent);
								level1.selectByVisibleText(Reimbursementbtn);
								Thread.sleep(1000);
								//cucumulaative button
								boolean selectType = EntitlementMonthly.isSelected();
								
								if(selectType == false) {
									EntitlementMonthly.click();
								}
								Thread.sleep(1000);
								boolean selectType1 = ProcessingmethodPayINAdvance.isSelected();
							
								if(selectType1 == false) {
									ProcessingmethodPayINAdvance.click();
								}
								Thread.sleep(1000);
								boolean selectType2 = AttendancerequireLop.isSelected();
								
								if(selectType2 == false) {
									AttendancerequireLop.click();
								}
								Thread.sleep(1000);
								resetButton.click();
								Thread.sleep(1000);
								return true;
								}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return false;
								
							}
	                        
	                        public boolean isnextbuttonReimbursementSetupVisible() throws InterruptedException {
	                        	try {
	                        	masterIcon.click();
								Thread.sleep(1000);
								Reimbursement.click();
								Thread.sleep(1000);
								ReimbursementSetup.click();
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
	                        	}catch(Exception e) {
									System.out.println("unable to get the flow");
								}
								return false;
								
							}
	                        
//	                        public String searchReimbursementSetupEdit(String search) throws InterruptedException {
//	                        	masterIcon.click();
//								Thread.sleep(1000);
//								Reimbursement.click();
//								Thread.sleep(1000);
//								ReimbursementSetup.click();
//								Thread.sleep(1000);
//								searchBox.sendKeys(search);
//								Thread.sleep(1000);
//								List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
//								for(WebElement e:searchvalue) {
//									String searchvalues=e.getText();
//									System.out.println(searchvalues);
//								}
//								EditBtn.click();
//								Thread.sleep(1000);
//                                boolean selectType2 = AttendancerequireLop.isSelected();
//								
//								if(selectType2 == false) {
//									AttendancerequireLop.click();
//								}
//								Thread.sleep(1000);
//						
//								UpdateBtn.click();
//								String value=duplicateCheck.getText(); 
//								return value;
//								
//								
//							}
							
		
}
