
package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;


public class MasterStatutoryESI extends TestBase{

	
	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		
		//StatutoryMenu
			@FindBy(xpath="//span[@id='stat_font']")
			WebElement StatutoryMenu;
			
			//StatutoryMenuESI
			@FindBy(xpath="//span[@id='esi']")
			WebElement StatutoryMenuESI;
			
			//CEILING AMOUNT LESS THAN 
			@FindBy(xpath="//input[@id='esiCeilingValue']")
			WebElement CEILINGAMOUNTLESS;
			
			
			//Cont.Period1 starting month
			@FindBy(xpath="//select[@id='esiCntPeriod1']")
			WebElement Contperiod1Month;
			
			//Cont.Period2 starting month
			@FindBy(xpath="//select[@id='esiCntPeriod2']")
			WebElement Contperiod2Month;
			
			//employeecontribution
			@FindBy(xpath="//input[@id='esiEmpContribute']")
			WebElement EmployeeContribution;
			
			//employercontribution
			@FindBy(xpath="//input[@id='esiEmprContribute']")
			WebElement EmployerContribution;
			
			//ESIClickeffectivedate
			@FindBy(xpath="//input[@id='esiEffectiveDate']")
			WebElement ESIClickeffectivedate;
			
			//ESIClickeffectivedateMonth
			@FindBy(xpath="//select[@class='ui-datepicker-month']")
			WebElement ESIClickeffectivedateMonth;
			
			//PfClickeffectivedateYear
			@FindBy(xpath="//select[@class='ui-datepicker-year']")
			WebElement ESIClickeffectivedateYear;
			
			//MonthlycompAmoutDeducCheckbox
			@FindBy(xpath="(//span[@class='checkmark'])[1]")
			WebElement MonthlycompAmoutDeducCheckbox;
			
			//MonthlycompCarallowanceCheckbox
			@FindBy(xpath="(//span[@class='checkmark'])[4]")
			WebElement MonthlycompCarallowanceCheckbox;
			
			//MonthlycompFinancecomponent1Checkbox
			@FindBy(xpath="(//span[@class='checkmark'])[6]")
			WebElement MonthlycompFinancecomponent1Checkbox;
			
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
				
				//deletebutton
				@FindBy(xpath="//button[text()='Delete']")
				WebElement deletebtn;
				
				public MasterStatutoryESI() {
					PageFactory.initElements(driver, this);
				}
				public String addWorkLocatin() {
					return new String();
				}
				
				
				public boolean MasterStatutoryMenuESIAdd(String Ceilinglessamount,String period1month,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
						                                 String effectiveyear,String effectivedates) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					StatutoryMenu.click();
					Thread.sleep(1000);
					StatutoryMenuESI.click();
					Thread.sleep(1000);
					CEILINGAMOUNTLESS.clear();
					CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
					Thread.sleep(1000);
					Contperiod1Month.clear();
					Contperiod1Month.sendKeys(period1month);
					Thread.sleep(1000);
					Contperiod2Month.sendKeys(period2month);
					Thread.sleep(1000);
					EmployeeContribution.sendKeys(Employeecontribution);
					Thread.sleep(1000);
					EmployerContribution.sendKeys(Employercontribution);
					Thread.sleep(1000);
					ESIClickeffectivedate.click();
					Thread.sleep(1000);
					Select month=new Select(ESIClickeffectivedateMonth);
					month.selectByVisibleText(effectivemonth);
					Thread.sleep(1000);
					Select year=new Select(ESIClickeffectivedateYear);
					year.selectByVisibleText(effectiveyear);
					Thread.sleep(1000);
					 WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
						date.click();
						Thread.sleep(1000);
					
				       
					       boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
							if(selectType1 == false) {
								MonthlycompAmoutDeducCheckbox.click();
							}
							Thread.sleep(1000);
						      boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
								if(selectType2 == false) {
									MonthlycompCarallowanceCheckbox.click();
								}
								Thread.sleep(1000);
								
								  boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
									if(selectType3 == false) {
										MonthlycompFinancecomponent1Checkbox.click();
									}
									Thread.sleep(1000);
						
					save.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				public String MasterStatutoryMenuESIUPDATE(String Ceilinglessamount,String period1month,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
//CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
//Thread.sleep(1000);
//Contperiod1Month.sendKeys(period1month);
//Thread.sleep(1000);
//Contperiod2Month.sendKeys(period2month);
//Thread.sleep(1000);
EmployeeContribution.clear();
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
//EmployerContribution.sendKeys(Employercontribution);
//Thread.sleep(1000);
//ESIClickeffectivedate.click();
//Thread.sleep(1000);
//Select month=new Select(ESIClickeffectivedateMonth);
//month.selectByVisibleText(effectivemonth);
//Thread.sleep(1000);
//Select year=new Select(ESIClickeffectivedateYear);
//year.selectByVisibleText(effectiveyear);
//Thread.sleep(1000);
//WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
//date.click();
//Thread.sleep(1000);
//
//
//boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
//if(selectType1 == false) {
//MonthlycompAmoutDeducCheckbox.click();
//}
//Thread.sleep(1000);
//boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
//if(selectType2 == false) {
//	MonthlycompCarallowanceCheckbox.click();
//}
//Thread.sleep(1000);
//
// boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
//	if(selectType3 == false) {
//		MonthlycompFinancecomponent1Checkbox.click();
//	}
//	Thread.sleep(1000);
//	save.click();
//	Thread.sleep(1000);

//EmployeeContribution.clear();
//EmployeeContribution.sendKeys(updateValue);
//Thread.sleep(1000);
UpdateBtn.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}
				
				
				public String MasterStatutoryMenuESIDelete(String Ceilinglessamount,String period1month,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
//CEILINGAMOUNTLESS.clear();
CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
Thread.sleep(1000);
//Contperiod1Month.clear();
//Contperiod1Month.sendKeys(period1month);
Select periood1=new Select(Contperiod1Month);
periood1.selectByVisibleText(period1month);
Thread.sleep(1000);
//Contperiod2Month.clear();
//Contperiod2Month.sendKeys(period2month);
Select periood2=new Select(Contperiod2Month);
periood2.selectByVisibleText(period2month);
Thread.sleep(1000);

//EmployeeContribution.clear();
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
EmployerContribution.clear();
EmployerContribution.sendKeys(Employercontribution);
Thread.sleep(1000);

ESIClickeffectivedate.click();
Thread.sleep(1000);
//ESIClickeffectivedateMonth.clear();
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
//ESIClickeffectivedateYear.clear();
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
//date.clear();
date.click();
Thread.sleep(1000);

//MonthlycompAmoutDeducCheckbox.clear();
//boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
//if(selectType1 == false) {
//MonthlycompAmoutDeducCheckbox.click();
//}
//Thread.sleep(1000);
//MonthlycompCarallowanceCheckbox.clear();
//boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
//if(selectType2 == false) {
//	MonthlycompCarallowanceCheckbox.click();
//}
//Thread.sleep(1000);
//
//MonthlycompFinancecomponent1Checkbox.clear();
// boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
//	if(selectType3 == false) {
//		MonthlycompFinancecomponent1Checkbox.click();
//	}
//	Thread.sleep(1000);
//	save.click();
//	Thread.sleep(1000);

	deletebtn.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}				
				
				
				public String MasterStatutoryMenuEsiMonthycomponentMandatoryFieldCheck(String Ceilinglessamount,String period1month,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
Thread.sleep(1000);
Contperiod1Month.sendKeys(period1month);
Thread.sleep(1000);
Contperiod2Month.sendKeys(period2month);
Thread.sleep(1000);
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
EmployerContribution.sendKeys(Employercontribution);
Thread.sleep(1000);
ESIClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
date.click();
Thread.sleep(1000);


//boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
//if(selectType1 == false) {
//MonthlycompAmoutDeducCheckbox.click();
//}
//Thread.sleep(1000);
//boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
//if(selectType2 == false) {
//	MonthlycompCarallowanceCheckbox.click();
//}
//Thread.sleep(1000);
//
// boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
//	if(selectType3 == false) {
//		MonthlycompFinancecomponent1Checkbox.click();
//	}
//	Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}				
				
				
				public String MasterStatutoryMenuEsiCeilingAmountlessThanMandatoryFieldCheck(String period1month,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
//CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
//Thread.sleep(1000);
Contperiod1Month.sendKeys(period1month);
Thread.sleep(1000);
Contperiod2Month.sendKeys(period2month);
Thread.sleep(1000);
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
EmployerContribution.sendKeys(Employercontribution);
Thread.sleep(1000);
ESIClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
date.click();
Thread.sleep(1000);


boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType1 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);
boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType2 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);

 boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
	if(selectType3 == false) {
		MonthlycompFinancecomponent1Checkbox.click();
	}
	Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}		
				
				
				
				public String MasterStatutoryMenuEsiContPeriod1MonthMandatoryFieldCheck(String Ceilinglessamount,String period2month,String Employeecontribution,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
Thread.sleep(1000);
//Contperiod1Month.sendKeys(period1month);
//Thread.sleep(1000);
Contperiod2Month.sendKeys(period2month);
Thread.sleep(1000);
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
EmployerContribution.sendKeys(Employercontribution);
Thread.sleep(1000);
ESIClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
date.click();
Thread.sleep(1000);


boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType1 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);
boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType2 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);

 boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
	if(selectType3 == false) {
		MonthlycompFinancecomponent1Checkbox.click();
	}
	Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}	
				
				
				
				public String MasterStatutoryMenuEsiEmployeeContributionMandatoryFieldCheck(String Ceilinglessamount,String period1month,String period2month,String Employercontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
Thread.sleep(1000);
Contperiod1Month.sendKeys(period1month);
Thread.sleep(1000);
Contperiod2Month.sendKeys(period2month);
Thread.sleep(1000);
//EmployeeContribution.sendKeys(Employeecontribution);
//Thread.sleep(1000);
EmployerContribution.sendKeys(Employercontribution);
Thread.sleep(1000);
ESIClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
date.click();
Thread.sleep(1000);


boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType1 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);
boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType2 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);

 boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
	if(selectType3 == false) {
		MonthlycompFinancecomponent1Checkbox.click();
	}
	Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}	
				
				public String MasterStatutoryMenuEsiEmployerContributionMandatoryFieldCheck(String Ceilinglessamount,String period1month,String period2month,String Employeecontribution,String effectivemonth,
                        String effectiveyear,String effectivedates) throws InterruptedException {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuESI.click();
Thread.sleep(1000);
CEILINGAMOUNTLESS.sendKeys(Ceilinglessamount);
Thread.sleep(1000);
Contperiod1Month.sendKeys(period1month);
Thread.sleep(1000);
Contperiod2Month.sendKeys(period2month);
Thread.sleep(1000);
EmployeeContribution.sendKeys(Employeecontribution);
Thread.sleep(1000);
//EmployerContribution.sendKeys(Employercontribution);
//Thread.sleep(1000);
ESIClickeffectivedate.click();
Thread.sleep(1000);
Select month=new Select(ESIClickeffectivedateMonth);
month.selectByVisibleText(effectivemonth);
Thread.sleep(1000);
Select year=new Select(ESIClickeffectivedateYear);
year.selectByVisibleText(effectiveyear);
Thread.sleep(1000);
WebElement date= driver.findElement(By.xpath("//a[text()='"+effectivedates+"']"));
date.click();
Thread.sleep(1000);


boolean selectType1 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType1 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);
boolean selectType2 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType2 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);

 boolean selectType3 = MonthlycompFinancecomponent1Checkbox.isSelected();
	if(selectType3 == false) {
		MonthlycompFinancecomponent1Checkbox.click();
	}
	Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}			
	
				
				
			
}
