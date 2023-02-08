package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryLWF extends TestBase{

	
	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	
	//StatutoryMenu
		@FindBy(xpath="//span[@id='stat_font']")
		WebElement StatutoryMenu;
		
		//StatutoryMenuLWF
		@FindBy(xpath="//span[@id='labourWelfare']")
		WebElement StatutoryMenuLWF;
		
		//LWFCOUNTRY
		@FindBy(xpath="//select[@id='countryId']")
		WebElement LWFcountry;
		
		//LWFstate
				@FindBy(xpath="//select[@id='stateId']")
				WebElement LWFstate;
				
				
				//LWFMonthJanuary
				@FindBy(xpath="(//span[@class='checkmark'])[1]")
				WebElement LWFDeductionMonthJanuary;
				
				//LWFMonthFebruary
				@FindBy(xpath="(//span[@class='checkmark'])[2]")
				WebElement LWFDeductionMonthFebruary;
				
				//LWFEmployee
				@FindBy(xpath="//input[@id='lwfEmpContribute']")
				WebElement LWFEmployee;
				
				//LWFEmployer
				@FindBy(xpath="//input[@id='lwfEmprContribute']")
				WebElement LWFEmployer;
	
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
			
			
			public MasterStatutoryLWF() {
				PageFactory.initElements(driver, this);
			}
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean MasterStatutoryMenuLWFAdd(String Country,String state,String EMPLOYEE,String EMPLOYER) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				Select countrys=new Select(LWFcountry);
				countrys.selectByVisibleText(Country);
				Thread.sleep(1000);
				Select states=new Select(LWFstate);
				states.selectByVisibleText(state);
				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

				LWFEmployee.sendKeys(EMPLOYEE);
				Thread.sleep(1000);
				LWFEmployer.sendKeys(EMPLOYER);
				Thread.sleep(1000);

				save.click();
				Thread.sleep(1000);
				return true;

				}
			
			
			public boolean MasterStatutoryMenuLWFResetButton(String Country,String state,String EMPLOYEE,String EMPLOYER) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				Select countrys=new Select(LWFcountry);
				countrys.selectByVisibleText(Country);
				Thread.sleep(1000);
				Select states=new Select(LWFstate);
				states.selectByVisibleText(state);
				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

				LWFEmployee.sendKeys(EMPLOYEE);
				Thread.sleep(1000);
				LWFEmployer.sendKeys(EMPLOYER);
				Thread.sleep(1000);

				ResetBtn.click();
				Thread.sleep(1000);
				return true;

				}
			
			public String MasterStatutoryMenuLWFCountryMandatoryFieldCheck(String state,String EMPLOYEE,String EMPLOYER) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
//				Select countrys=new Select(LWFcountry);
//				countrys.selectByVisibleText(Country);
//				Thread.sleep(1000);
//				Select states=new Select(LWFstate);
//				states.selectByVisibleText(state);
//				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

				LWFEmployee.sendKeys(EMPLOYEE);
				Thread.sleep(1000);
				LWFEmployer.sendKeys(EMPLOYER);
				Thread.sleep(1000);

				save.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;

				}
			
			public String MasterStatutoryMenuLWFStateMandatoryFieldCheck(String Country,String EMPLOYEE,String EMPLOYER) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				Select countrys=new Select(LWFcountry);
				countrys.selectByVisibleText(Country);
				Thread.sleep(1000);
//				Select states=new Select(LWFstate);
//				states.selectByVisibleText(state);
//				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

				LWFEmployee.sendKeys(EMPLOYEE);
				Thread.sleep(1000);
				LWFEmployer.sendKeys(EMPLOYER);
				Thread.sleep(1000);

				save.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;

				}
			
			public String MasterStatutoryMenuLWFEmpolyeeMandatoryFieldCheck(String Country,String state,String EMPLOYER) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				Select countrys=new Select(LWFcountry);
				countrys.selectByVisibleText(Country);
				Thread.sleep(1000);
				Select states=new Select(LWFstate);
				states.selectByVisibleText(state);
				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

//				LWFEmployee.sendKeys(EMPLOYEE);
//				Thread.sleep(1000);
				LWFEmployer.sendKeys(EMPLOYER);
				Thread.sleep(1000);

				save.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;

				}
			
			public String MasterStatutoryMenuLWFEmpolyerMandatoryFieldCheck(String Country,String state,String EMPLOYEE) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				Select countrys=new Select(LWFcountry);
				countrys.selectByVisibleText(Country);
				Thread.sleep(1000);
				Select states=new Select(LWFstate);
				states.selectByVisibleText(state);
				Thread.sleep(1000);
	
				boolean selectType1 = LWFDeductionMonthJanuary.isSelected();
				if(selectType1 == false) {
					LWFDeductionMonthJanuary.click();
				}
				Thread.sleep(1000);

				boolean selectType2 = LWFDeductionMonthFebruary.isSelected();
				if(selectType2 == false) {
					LWFDeductionMonthFebruary.click();
				}
				Thread.sleep(1000);

				LWFEmployee.sendKeys(EMPLOYEE);
				Thread.sleep(1000);
//				LWFEmployer.sendKeys(EMPLOYER);
//				Thread.sleep(1000);

				save.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;

				}
			
			public boolean isnextbuttonStatutoryLWFPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
				Thread.sleep(1000);
				
				
				boolean flag = false;
			    try {
			        WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
			        if (element.isDisplayed() || element.isEnabled())
//			            flag = false;
			            nextButton.click();
			        System.out.println("next button visible");
			    } catch (NoSuchElementException e) {
//			        flag = true;
			        System.out.println("next button not visible");
			    } 
			    return flag;
				
			}

			public Boolean searchStatutoryLWFpagination(String search,String searchpointvalue) throws InterruptedException {
				
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
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
					
//					else {
//						System.out.println("value not correct");	
//						return false;
//					}
				}

				return true;
				
				
			}

			public String searchStatutoryLWFEdit(String search,String editName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				StatutoryMenu.click();
				Thread.sleep(1000);
				StatutoryMenuLWF.click();
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
				LWFEmployer.clear();
				LWFEmployer.sendKeys(editName);
				Thread.sleep(1000);

				UpdateBtn.click();
				String value=duplicateCheck.getText(); 
				return value;
				
				
			}
}
