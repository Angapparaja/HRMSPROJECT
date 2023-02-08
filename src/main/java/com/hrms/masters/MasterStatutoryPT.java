package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryPT extends TestBase{

	//MasterPage
			@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
			WebElement masterIcon;
			
			
			//StatutoryMenu
				@FindBy(xpath="//span[@id='stat_font']")
				WebElement StatutoryMenu;
				
				//StatutoryMenuPT
				@FindBy(xpath="//span[@id='professionalTax']")
				WebElement StatutoryMenuPT;
				
				
				//PTPOLICYNAME
				@FindBy(xpath="//input[@id='ptName']")
				WebElement PTPOLICYNAME;
				
				//PTCountry
				@FindBy(xpath="//select[@id='countryId']")
				WebElement PTCountry;
				
				//PTState
				@FindBy(xpath="//select[@id='stateId']")
				WebElement PTState;
				
				//PTCITY
				@FindBy(xpath="//select[@id='cityId']")
				WebElement PTCITY;
				
				//PTDeductionMonthJanuary
				@FindBy(xpath="(//span[@class='checkmark'])[1]")
				WebElement PTDeductionMonthJanuary;
				
				//PTDeductionMonthFebruary
				@FindBy(xpath="(//span[@class='checkmark'])[2]")
				WebElement PTDeductionMonthFebruary;
				
				
				//PTslabdetailsSlabTo
				@FindBy(xpath="//input[@id='to_slb_1']")
				WebElement slabdetailsTo;
				
				//PTslabdetailsContribute
				@FindBy(xpath="//input[@id='contrib_1']")
				WebElement slabContribute;
				
				//MonthlycompAmoutDeducCheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[13]")
				WebElement MonthlycompAmoutDeducCheckbox;
				
				//MonthlycompCarallowanceCheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[16]")
				WebElement MonthlycompCarallowanceCheckbox;
				
				//MonthlycompFinancecomponent1Checkbox
				@FindBy(xpath="(//span[@class='checkmark'])[18]")
				WebElement MonthlycompFinancecomponent1Checkbox;
				
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
					
					//resetbutton 
					@FindBy(xpath = "//button[text()='Reset']")
					WebElement ResetBtn;
					
					//next button
					@FindBy(xpath = "//*[text()='Next']")
					WebElement nextButton;
					
					//searchBox
					@FindBy(xpath="//input[@type='search']")
					WebElement searchBox;
					
					public MasterStatutoryPT() {
						PageFactory.initElements(driver, this);
					}
					public String addWorkLocatin() {
						return new String();
					}
					
					public boolean MasterStatutoryMenuPTAdd(String PTPOLICYNAMEs,String Country,String state,String city,String slabto,String contribute) throws InterruptedException {
try {
						masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
Select states=new Select(PTState);
states.selectByVisibleText(state);
Thread.sleep(1000);
Select cities=new Select(PTCITY);
cities.selectByVisibleText(city);
Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
	PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
	PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
	MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
	MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
return true;
}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return false;
}
					
					
					
public boolean MasterStatutoryMenuPTResetButton(String PTPOLICYNAMEs,String Country,String state,String city,String slabto,String contribute
    
		) throws InterruptedException {
	
	try {
masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
Select states=new Select(PTState);
states.selectByVisibleText(state);
Thread.sleep(1000);
Select cities=new Select(PTCITY);
cities.selectByVisibleText(city);
Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
	PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
	PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
	MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
	MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
	MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

ResetBtn.click();
Thread.sleep(1000);
return true;
	}
	catch(Exception e) {
		System.out.println("unable to get the flow");
	}
	return false;

}

public String MasterStatutoryMenuPTPolicyNameMandtoryFieldCheck(String Country,String state,String city,String slabto,String contribute) throws InterruptedException {
try {
	masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
//PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
//Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
Select states=new Select(PTState);
states.selectByVisibleText(state);
Thread.sleep(1000);
Select cities=new Select(PTCITY);
cities.selectByVisibleText(city);
Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;
}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return null;

}


public String MasterStatutoryMenuPTCountryMandtoryFieldCheck(String PTPOLICYNAMEs,String state,String city,String slabto,String contribute) throws InterruptedException {
try {
	masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
//Select countrys=new Select(PTCountry);
//countrys.selectByVisibleText(Country);
Thread.sleep(1000);
//Select states=new Select(PTState);
//states.selectByVisibleText(state);
//Thread.sleep(1000);
//Select cities=new Select(PTCITY);
//cities.selectByVisibleText(city);
//Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;
}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return null;

}


public String MasterStatutoryMenuPTStateMandtoryFieldCheck(String PTPOLICYNAMEs,String Country,String city,String slabto,String contribute) throws InterruptedException {
try {
	masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
//Select states=new Select(PTState);
//states.selectByVisibleText(state);
Thread.sleep(1000);
//Select cities=new Select(PTCITY);
//cities.selectByVisibleText(city);
//Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;

}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return null;

}

public String MasterStatutoryMenuPTCityMandtoryFieldCheck(String PTPOLICYNAMEs,String Country,String state,String slabto,String contribute) throws InterruptedException {
try {
	masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
Select states=new Select(PTState);
states.selectByVisibleText(state);
Thread.sleep(1000);
//Select cities=new Select(PTCITY);
//cities.selectByVisibleText(city);
//Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

slabdetailsTo.sendKeys(slabto);
Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;
}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return null;

}

public String MasterStatutoryMenuPTSlabMandtoryFieldCheck(String PTPOLICYNAMEs,String Country,String state,String city,String contribute) throws InterruptedException {
try {
	masterIcon.click();
Thread.sleep(1000);
StatutoryMenu.click();
Thread.sleep(1000);
StatutoryMenuPT.click();
Thread.sleep(1000);
add.click();
Thread.sleep(1000);
PTPOLICYNAME.sendKeys(PTPOLICYNAMEs);
Thread.sleep(1000);
Select countrys=new Select(PTCountry);
countrys.selectByVisibleText(Country);
Thread.sleep(1000);
Select states=new Select(PTState);
states.selectByVisibleText(state);
Thread.sleep(1000);
Select cities=new Select(PTCITY);
cities.selectByVisibleText(city);
Thread.sleep(1000);
boolean selectType1 = PTDeductionMonthJanuary.isSelected();
if(selectType1 == false) {
PTDeductionMonthJanuary.click();
}
Thread.sleep(1000);

boolean selectType2 = PTDeductionMonthFebruary.isSelected();
if(selectType2 == false) {
PTDeductionMonthFebruary.click();
}
Thread.sleep(1000);

//slabdetailsTo.sendKeys(slabto);
//Thread.sleep(1000);
slabContribute.sendKeys(contribute);
Thread.sleep(1000);


boolean selectType3 = MonthlycompAmoutDeducCheckbox.isSelected();
if(selectType3 == false) {
MonthlycompAmoutDeducCheckbox.click();
}
Thread.sleep(1000);

boolean selectType4 = MonthlycompCarallowanceCheckbox.isSelected();
if(selectType4 == false) {
MonthlycompCarallowanceCheckbox.click();
}
Thread.sleep(1000);


boolean selectType5 = MonthlycompFinancecomponent1Checkbox.isSelected();
if(selectType5 == false) {
MonthlycompFinancecomponent1Checkbox.click();
}
Thread.sleep(1000);

save.click();
Thread.sleep(1000);
String value=duplicateCheck.getText(); 
return value;
}
catch(Exception e) {
	System.out.println("unable to get the flow");
}
return null;

}

public boolean isnextbuttonStatutoryPTPaginationVisible() throws InterruptedException {
	masterIcon.click();
	Thread.sleep(1000);
	StatutoryMenu.click();
	Thread.sleep(1000);
	StatutoryMenuPT.click();
	Thread.sleep(1000);
	
	
	boolean flag = false;
    try {
        WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
        if (element.isDisplayed() || element.isEnabled())
//            flag = false;
            nextButton.click();
        System.out.println("next button visible");
    } catch (NoSuchElementException e) {
//        flag = true;
        System.out.println("next button not visible");
    } 
    return flag;
	
}

public Boolean searchStatutoryPTpagination(String search,String searchpointvalue) throws InterruptedException {
	try {
	masterIcon.click();
	Thread.sleep(1000);
	StatutoryMenu.click();
	Thread.sleep(1000);
	StatutoryMenuPT.click();
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
		
//		else {
//			System.out.println("value not correct");	
//			return false;
//		}
	}

	return true;
	}
	catch(Exception e) {
		System.out.println("unable to get the flow");
	}
	return false;
	
	
}

public String searchStatutoryPTEdit(String search,String editName) throws InterruptedException {
	try {
	masterIcon.click();
	Thread.sleep(1000);
	StatutoryMenu.click();
	Thread.sleep(1000);
	StatutoryMenuPT.click();
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
	PTPOLICYNAME.clear();
	PTPOLICYNAME.sendKeys(editName);
	Thread.sleep(1000);

	UpdateBtn.click();
	String value=duplicateCheck.getText(); 
	return value;
	}
	catch(Exception e) {
		System.out.println("unable to get the flow");
	}
	return null;
	
	
}

}
