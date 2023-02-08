package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryPF extends TestBase{

	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	
	//StatutoryMenu
		@FindBy(xpath="//span[@id='stat_font']")
		WebElement StatutoryMenu;
		
		//StatutoryMenuPF
				@FindBy(xpath="//span[@id='providentFund']")
				WebElement StatutoryMenuPF;
				
				//PFRuleName
				@FindBy(xpath="//input[@id='pfName']")
				WebElement PFRuleName;
				
				//PFCeilingAmount
				@FindBy(xpath="//input[@id='pfceilingLimit']")
				WebElement PFCeilingAmount;
				
				//PFEmployerRestrictedTo
				@FindBy(xpath="//input[@id='pfRestAmountEmployeer']")
				WebElement PFEmployerRestrictedTo;
				
				
				//PFIncludeAdminChargesYes
				@FindBy(xpath="(//span[@class='checkmark'])[1]")
				WebElement PFIncludeAdminChargesYes;
				
				//PFIncludeAdminChargesNo
				@FindBy(xpath="(//span[@class='checkmark'])[2]")
				WebElement PFIncludeAdminChargesNo;
				
				//PfClickeffectivedate
				@FindBy(xpath="//input[@id='effective_Date']")
				WebElement PfClickeffectivedate;
				
				//PfClickeffectivedateMonth
				@FindBy(xpath="//select[@class='ui-datepicker-month']")
				WebElement PfClickeffectivedateMonth;
				
				//PfClickeffectivedateYear
				@FindBy(xpath="//select[@class='ui-datepicker-year']")
				WebElement PfClickeffectivedateYear;
				
				
				//PfClickeffectivedateYear
				@FindBy(xpath="//input[@id='pfRestAmountEmployee']")
				WebElement PfEmployeeRestrictedTo;
				
				
				//PfAgeLessThan
				@FindBy(xpath="//input[@id='ageName']")
				WebElement PfAgeLessThan;
				
				
				//PfAgeLessThan
				@FindBy(xpath="//input[@id='ageName1']")
				WebElement PfAgeGreaterthanEqualTo;
				
				//PfEmployeeContributionageless
				@FindBy(xpath="//input[@id='ec1']")
				WebElement PfEmployeeContributionageless;
				
				//PfEmployeeContributionagegreaterequal
				@FindBy(xpath="//input[@id='ec2']")
				WebElement PfEmployeeContributionagegreaterequal;
				
				
				//PfEmployeeContributionnewjoinee
				@FindBy(xpath="//input[@id='ec3']")
				WebElement PfEmployeeContributionnewjoinee;
				
				
				//PfEmployerContributionEPFAGELESS
				@FindBy(xpath="//input[@id='emprEpf1']")
				WebElement PfEmployerContributionEPFAGELESS;
				
				//PfEmployerContributionEPFAGEGreater
				@FindBy(xpath="//input[@id='emprEpf2']")
				WebElement PfEmployerContributionEPFAGEGreater;
				
				
				//PfEmployerContributionEPFnewJoinee
				@FindBy(xpath="//input[@id='emprEpf3']")
				WebElement PfEmployerContributionEPFnewJoinee;
				
				
				//PfEmployerContributionEPSAgeless
				@FindBy(xpath="//input[@id='emprEps1']")
				WebElement PfEmployerContributionEPSAgeless;
				
				
				//PfEmployerContributionEPSAgeGreaterThan
				@FindBy(xpath="//input[@id='emprEps2']")
				WebElement PfEmployerContributionEPSAgeGreaterThan;
				
				//PfEmployerContributionEPSNewJoinee
				@FindBy(xpath="//input[@id='emprEps3']")
				WebElement PfEmployerContributionEPSNewjoinee;
				
				//PfEmployerContributionEDLIageLess
				@FindBy(xpath="//input[@id='emprEdli1']")
				WebElement PfEmployerContributionEDLIageLess;
				
				//PfEmployerContributionEDLIageGreaterthan
				@FindBy(xpath="//input[@id='emprEdli2']")
				WebElement PfEmployerContributionEDLIageGreaterthan;
				
				//PfEmployerContributionEDLInewjoinee
				@FindBy(xpath="//input[@id='emprEdli3']")
				WebElement PfEmployerContributionEDLInewjoinee;
				
				//PfEmployerContributionEPFageless
				@FindBy(xpath="//input[@id='emprAdminEps1']")
				WebElement PfEmployerContributionADMINEPFageless;
				
				//PfEmployerContributionEPFAgeGreaterthan
				@FindBy(xpath="//input[@id='emprAdminEps2']")
				WebElement PfEmployerContributionADMINEPFAgeGreaterthan;
				
				
				//PfEmployerContributionEPFNewJoinee
				@FindBy(xpath="//input[@id='emprAdminEps3']")
				WebElement PfEmployerContributionADMINEPFNewJoinee;
				
				
				//PfEmployerContributionEDLIageless
				@FindBy(xpath="//input[@id='emprAdminEdli1']")
				WebElement PfEmployerContributionADMINEDLIageless;
				
				
				//PfEmployerContributionEDLIageless
				@FindBy(xpath="//input[@id='emprAdminEdli2']")
				WebElement PfEmployerContributionADMINEDLIageGreaterTHAN;
				
				//PfEmployerContributionEDLINewJoinee
				@FindBy(xpath="//input[@id='emprAdminEdli3']")
				WebElement PfEmployerContributionADMINEDLINewJoinee;
				
				//MonthlycompAmoutDeducCheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[3]")
				WebElement MonthlycompAmoutDeducCheckbox;
				
				//MonthlycompAmoutDeducCheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[4]")
				WebElement MonthlycompBasicCheckbox;
				
				//MonthlycompAmoutDeducCheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[6]")
				WebElement MonthlycompCarAllowanceCheckbox;
				
				// ADD 
				@FindBy(xpath = "//*[@id='swap']")
				WebElement add;
				
				
				//saveBtn
				@FindBy(xpath = "//button[text()='Save']")
				WebElement save;
				
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
					
					public MasterStatutoryPF() {
						PageFactory.initElements(driver, this);
					}
					public String addWorkLocatin() {
						return new String();
					}
					
					
					public boolean MasterStatutoryMenuPFAdd(String Rulename,String CeilingAmount,String employerRestrictedTo,String Effectivedatemonth,String effectiveyear,String effectivedate,
							                                 String EMPRestrictedTO,String ageless,String empContriageless,String empContriageGreater,String newJoinee,
							                                 String empContriEPFageless,String empContriEPFageGreater,String EPFnewJoinee, 
							                                 String empContriEPSageless,String empContriEPSageGreater,String EPSnewJoinee,
							                                 String empContriEDLIageless,String empContriEDLIageGreater,String EDLInewJoinee,
							                                 String empContriADMINEPFageless,String empContriADMINEPFageGreater,String ADMINEPFnewJoinee,
							                                 String empContriADMINEDLIageless,String empContriADMINEDLIageGreater,String ADMINEDLInewJoinee) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						StatutoryMenu.click();
						Thread.sleep(1000);
						StatutoryMenuPF.click();
						Thread.sleep(1000);
						add.click();
						Thread.sleep(1000);
						PFRuleName.sendKeys(Rulename);
						Thread.sleep(1000);
						PFCeilingAmount.sendKeys(CeilingAmount);
						Thread.sleep(1000);
						PFEmployerRestrictedTo.sendKeys(employerRestrictedTo);
						Thread.sleep(1000);
					       boolean selectType5 = PFIncludeAdminChargesYes.isSelected();
							if(selectType5 == false) {
								PFIncludeAdminChargesYes.click();
							}
						
						PfClickeffectivedate.click();
						Thread.sleep(1000);
						Select month=new Select(PfClickeffectivedateMonth);
						month.selectByVisibleText(Effectivedatemonth);
						Thread.sleep(1000);
						Select year=new Select(PfClickeffectivedateYear);
						year.selectByVisibleText(effectiveyear);
						Thread.sleep(1000);
						
						 WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedate+"']"));
							date.click();
							Thread.sleep(1000);
							PfEmployeeRestrictedTo.sendKeys(EMPRestrictedTO);
							Thread.sleep(1000);
							PfAgeLessThan.sendKeys(ageless);
							Thread.sleep(1000);
//							PfAgeGreaterthanEqualTo.sendKeys(ageGreaterthan);
//							Thread.sleep(1000);
							PfEmployeeContributionageless.sendKeys(empContriageless);
							Thread.sleep(1000);
							PfEmployeeContributionagegreaterequal.sendKeys(empContriageGreater);
							Thread.sleep(1000);
							PfEmployeeContributionnewjoinee.sendKeys(newJoinee);
							Thread.sleep(1000);
							PfEmployerContributionEPFAGELESS.sendKeys(empContriEPFageless);
							Thread.sleep(1000);
							PfEmployerContributionEPFAGEGreater.sendKeys(empContriEPFageGreater);
							Thread.sleep(1000);
							PfEmployerContributionEPFnewJoinee.sendKeys(EPFnewJoinee);
							Thread.sleep(1000);
							PfEmployerContributionEPSAgeless.sendKeys(empContriEPSageless);
							Thread.sleep(1000);
							PfEmployerContributionEPSAgeGreaterThan.sendKeys(empContriEPSageGreater);
							Thread.sleep(1000);
							PfEmployerContributionEPSNewjoinee.sendKeys(EPSnewJoinee);
							Thread.sleep(1000);
							PfEmployerContributionEDLIageLess.sendKeys(empContriEDLIageless);
							Thread.sleep(1000);
							PfEmployerContributionEDLIageGreaterthan.sendKeys(empContriEDLIageGreater);
							Thread.sleep(1000);
							PfEmployerContributionEDLInewjoinee.sendKeys(EDLInewJoinee);
							Thread.sleep(1000);
							PfEmployerContributionADMINEPFageless.sendKeys(empContriADMINEPFageless);
							Thread.sleep(1000);
							PfEmployerContributionADMINEPFAgeGreaterthan.sendKeys(empContriADMINEPFageGreater);
							Thread.sleep(1000);
							PfEmployerContributionADMINEPFNewJoinee.sendKeys(ADMINEPFnewJoinee);
							Thread.sleep(1000);
							PfEmployerContributionADMINEDLIageless.sendKeys(empContriADMINEDLIageless);
							Thread.sleep(1000);
							PfEmployerContributionADMINEDLIageGreaterTHAN.sendKeys(empContriADMINEDLIageGreater);
							Thread.sleep(1000);
							PfEmployerContributionADMINEDLINewJoinee.sendKeys(ADMINEDLInewJoinee);
							Thread.sleep(1000);
						       boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
								if(selectType1 == false) {
									MonthlycompAmoutDeducCheckbox.click();
								}
								Thread.sleep(1000);
							      boolean selectType2 = MonthlycompBasicCheckbox.isSelected();
									if(selectType2 == false) {
										MonthlycompBasicCheckbox.click();
									}
									Thread.sleep(1000);
									
//									  boolean selectType3 = MonthlycompCarAllowanceCheckbox.isSelected();
//										if(selectType3 == false) {
//											MonthlycompCarAllowanceCheckbox.click();
//										}
										Thread.sleep(1000);
										JavascriptExecutor js = (JavascriptExecutor) driver;
										js.executeScript("window.scrollBy(0,550)", "");
						save.click();
						Thread.sleep(1000);
						return true;
						
					}
					
					
					
					
		public String MasterStatutoryMenuMonthlyComponentMandatoryFieldCheck(String Rulename,String CeilingAmount,String employerRestrictedTo,String Effectivedatemonth,String effectiveyear,String effectivedate,
                            String EMPRestrictedTO,String ageless,String empContriageless,String empContriageGreater,String newJoinee,
                            String empContriEPFageless,String empContriEPFageGreater,String EPFnewJoinee, 
                            String empContriEPSageless,String empContriEPSageGreater,String EPSnewJoinee,
                            String empContriEDLIageless,String empContriEDLIageGreater,String EDLInewJoinee,
                            String empContriADMINEPFageless,String empContriADMINEPFageGreater,String ADMINEPFnewJoinee,
                            String empContriADMINEDLIageless,String empContriADMINEDLIageGreater,String ADMINEDLInewJoinee) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPF.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PFRuleName.sendKeys(Rulename);
Thread.sleep(1000);
PFCeilingAmount.sendKeys(CeilingAmount);
Thread.sleep(1000);
PFEmployerRestrictedTo.sendKeys(employerRestrictedTo);
Thread.sleep(1000);
boolean selectType5 = PFIncludeAdminChargesYes.isSelected();
if(selectType5 == false) {
PFIncludeAdminChargesYes.click();
}

PfClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(PfClickeffectivedateMonth);
month.selectByVisibleText(Effectivedatemonth);
Thread.sleep(1000);
Select year=new Select(PfClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);

WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedate+"']"));
date.click();
Thread.sleep(1000);
PfEmployeeRestrictedTo.sendKeys(EMPRestrictedTO);
Thread.sleep(1000);
PfAgeLessThan.sendKeys(ageless);
Thread.sleep(1000);
//PfAgeGreaterthanEqualTo.sendKeys(ageGreaterthan);
//Thread.sleep(1000);
PfEmployeeContributionageless.sendKeys(empContriageless);
Thread.sleep(1000);
PfEmployeeContributionagegreaterequal.sendKeys(empContriageGreater);
Thread.sleep(1000);
PfEmployeeContributionnewjoinee.sendKeys(newJoinee);
Thread.sleep(1000);
PfEmployerContributionEPFAGELESS.sendKeys(empContriEPFageless);
Thread.sleep(1000);
PfEmployerContributionEPFAGEGreater.sendKeys(empContriEPFageGreater);
Thread.sleep(1000);
PfEmployerContributionEPFnewJoinee.sendKeys(EPFnewJoinee);
Thread.sleep(1000);
PfEmployerContributionEPSAgeless.sendKeys(empContriEPSageless);
Thread.sleep(1000);
PfEmployerContributionEPSAgeGreaterThan.sendKeys(empContriEPSageGreater);
Thread.sleep(1000);
PfEmployerContributionEPSNewjoinee.sendKeys(EPSnewJoinee);
Thread.sleep(1000);
PfEmployerContributionEDLIageLess.sendKeys(empContriEDLIageless);
Thread.sleep(1000);
PfEmployerContributionEDLIageGreaterthan.sendKeys(empContriEDLIageGreater);
Thread.sleep(1000);
PfEmployerContributionEDLInewjoinee.sendKeys(EDLInewJoinee);
Thread.sleep(1000);
PfEmployerContributionADMINEPFageless.sendKeys(empContriADMINEPFageless);
Thread.sleep(1000);
PfEmployerContributionADMINEPFAgeGreaterthan.sendKeys(empContriADMINEPFageGreater);
Thread.sleep(1000);
PfEmployerContributionADMINEPFNewJoinee.sendKeys(ADMINEPFnewJoinee);
Thread.sleep(1000);
PfEmployerContributionADMINEDLIageless.sendKeys(empContriADMINEDLIageless);
Thread.sleep(1000);
PfEmployerContributionADMINEDLIageGreaterTHAN.sendKeys(empContriADMINEDLIageGreater);
Thread.sleep(1000);
PfEmployerContributionADMINEDLINewJoinee.sendKeys(ADMINEDLInewJoinee);
Thread.sleep(1000);
//boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
//if(selectType1 == false) {
//	MonthlycompAmoutDeducCheckbox.click();
//}
//Thread.sleep(1000);
// boolean selectType2 = MonthlycompBasicCheckbox.isSelected();
//	if(selectType2 == false) {
//		MonthlycompBasicCheckbox.click();
//	}
//	Thread.sleep(1000);
//	
//	  boolean selectType3 = MonthlycompCarAllowanceCheckbox.isSelected();
//		if(selectType3 == false) {
//			MonthlycompCarAllowanceCheckbox.click();
//		}
//		Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,550)", "");
save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}
					
					
					
//					public String PayrollPayslipTitleBusinessUnitMandatoryFieldVaidation(String payslip,String address) throws InterruptedException {
//						masterIcon.click();
//						Thread.sleep(1000);
//						PayRoll.click();
//						Thread.sleep(1000);
//						PaySlipTitle.click();
//						Thread.sleep(1000);
//						AddBtn.click();
//						Thread.sleep(1000);
////						Select level1=new Select(BusinessUnit);
////						level1.selectByVisibleText(businessunits);
//						Thread.sleep(1000);
//						PayslipTitle.sendKeys(payslip);
//						Thread.sleep(1000);
//						PayslipAddress.sendKeys(address);
//						Thread.sleep(1000);
//						Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
//						Thread.sleep(1000);
//						saveButton.click();
//						String value=duplicateCheck.getText(); 
//						return value;
//					}
//					
//					
//					public String PayrollPayslipTitleMandatoryFieldVaidation(String businessunits,String address) throws InterruptedException {
//						masterIcon.click();
//						Thread.sleep(1000);
//						PayRoll.click();
//						Thread.sleep(1000);
//						PaySlipTitle.click();
//						Thread.sleep(1000);
//						AddBtn.click();
//						Thread.sleep(1000);
//						Select level1=new Select(BusinessUnit);
//						level1.selectByVisibleText(businessunits);
//						Thread.sleep(1000);
////						PayslipTitle.sendKeys(payslip);
////						Thread.sleep(1000);
//						PayslipAddress.sendKeys(address);
//						Thread.sleep(1000);
//						Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
//						Thread.sleep(1000);
//						saveButton.click();
//						String value=duplicateCheck.getText(); 
//						return value;
//					}
//					
//					
//					public String PayrollPayslipTitleDuplicateCheck(String businessunits,String payslip,String address) throws InterruptedException {
//						masterIcon.click();
//						Thread.sleep(1000);
//						PayRoll.click();
//						Thread.sleep(1000);
//						PaySlipTitle.click();
//						Thread.sleep(1000);
//						AddBtn.click();
//						Thread.sleep(1000);
//						Select level1=new Select(BusinessUnit);
//						level1.selectByVisibleText(businessunits);
//						Thread.sleep(1000);
//						PayslipTitle.sendKeys(payslip);
//						Thread.sleep(1000);
//						PayslipAddress.sendKeys(address);
//						Thread.sleep(1000);
//						Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
//						Thread.sleep(1000);
//						saveButton.click();
//						String value=duplicateCheck.getText(); 
//						return value;
//					}
//					
//					public boolean verifyPayrollPayslipTitleResetButton(String businessunits,String payslip,String address) throws InterruptedException {
//						masterIcon.click();
//						Thread.sleep(1000);
//						PayRoll.click();
//						Thread.sleep(1000);
//						PaySlipTitle.click();
//						Thread.sleep(1000);
//						AddBtn.click();
//						Thread.sleep(1000);
//						Select level1=new Select(BusinessUnit);
//						level1.selectByVisibleText(businessunits);
//						Thread.sleep(1000);
//						PayslipTitle.sendKeys(payslip);
//						Thread.sleep(1000);
//						PayslipAddress.sendKeys(address);
//						Thread.sleep(1000);
//						Consultant_logo.sendKeys(System.getProperty("user.dir")+"/BrowserDriverFile/iconlist1.png");
//						Thread.sleep(1000);
//						resetButton.click();
//						Thread.sleep(1000);
//						return true;
//						
//					}
//					
					public boolean isnextbuttonStatutoryPfPaginationVisible() throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						StatutoryMenu.click();
						Thread.sleep(1000);
						StatutoryMenuPF.click();
						Thread.sleep(1000);
						
						
						boolean flag = false;
				        try {
				            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
				            if (element.isDisplayed() || element.isEnabled())
//				                flag = false;
				                nextButton.click();
				            System.out.println("next button visible");
				        } catch (NoSuchElementException e) {
//				            flag = true;
				            System.out.println("next button not visible");
				        } 
				        return flag;
						
					}
					
					public Boolean searchStatutoryPfpagination(String search,String searchpointvalue) throws InterruptedException {
						
						masterIcon.click();
						Thread.sleep(1000);
						StatutoryMenu.click();
						Thread.sleep(1000);
						StatutoryMenuPF.click();
						Thread.sleep(1000);
						searchBox.sendKeys(search);
						Thread.sleep(1000);
						List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
						for(WebElement e:searchvalue) {
							String searchvalues=e.getText();
							System.out.println(searchvalues);
							Thread.sleep(1000);
							
							if(searchvalues.equals(searchpointvalue)) {
								//System.out.println(searchvalues);
								System.out.println("sucessfully searched : "+searchvalues);
								return true;
							}
							
//							else {
//								System.out.println("value not correct");	
//								return false;
//							}
						}

						return true;
						
						
					}
					
					public String searchStatutoryPfEdit(String search,String editName) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						StatutoryMenu.click();
						Thread.sleep(1000);
						StatutoryMenuPF.click();
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
						PFCeilingAmount.clear();
						PFCeilingAmount.sendKeys(editName);
						Thread.sleep(1000);
				
				
						UpdateBtn.click();
						String value=duplicateCheck.getText(); 
						return value;
						
						
					}
	
}
