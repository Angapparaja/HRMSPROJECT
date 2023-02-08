package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryPhilHealth extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Statutory philhealth
	@FindBy(xpath="//span[@id='philhealth']")
	WebElement philhealth;
	
	//StatutoryLink
	@FindBy(xpath="//span[@id='stat_font']")
	WebElement Statutory;
	
	//Addstatutory
	@FindBy(xpath = "//*[@id='swap']")
	WebElement ADDStutatory;
	
	//Effective Date
	@FindBy(xpath="//input[@id='effectivedate']")
	WebElement  effectivedate;
	
	//Effective Date selectMonth
	@FindBy(xpath="//*[@data-handler='selectMonth']")
	WebElement selectMonth;
	
	//Effective Date selectdate
	@FindBy(xpath="//a[text()='31']")
	WebElement selectDate;
	
	//slab Torange
	@FindBy(xpath="//input[@id='to_slb_1']")
	WebElement slabRange;
	
	//Philhealth typeFixed
	@FindBy(xpath="(//span[@class='checkmark'])[3]")
	WebElement PhilhealthtypeFixed;
	
	//Employee
	@FindBy(xpath="//input[@id='contrib_1']")
	WebElement Employeetxt;
	
	//Employer
	@FindBy(xpath="//input[@id='econtrib_1']")
	WebElement Employertxt;
	
	//duplicate Check
			@FindBy(xpath="//div[@class='toast-message']")
			WebElement duplicateCheck;
			//save button
			@FindBy(xpath = "//*[text()='Save']")
			WebElement saveButton;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
	
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
	
			public MasterStatutoryPhilHealth() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			
			public boolean addPhilhealth(String EffectiveMonth,String EffectiveDate,String range,String Employee,String Employer) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				 ADDStutatory.click();
				Thread.sleep(1500);
				effectivedate.click();
				Thread.sleep(1500);
				Select selectMonths=new Select(selectMonth);
				selectMonths.selectByVisibleText(EffectiveMonth);
				Thread.sleep(1500);
//				String dates="23";
				
				WebElement date=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
				date.click();		
			
				Thread.sleep(1500);
				slabRange.sendKeys(range);
				Thread.sleep(1500);
				boolean selectType = PhilhealthtypeFixed.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					PhilhealthtypeFixed.click();
				}
				Thread.sleep(1500);
				
				Employeetxt.sendKeys(Employee);
				Thread.sleep(1500);
				Employertxt.sendKeys(Employer);
				Thread.sleep(1500);
				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public String addPhilhealthsEffectiveDateMandatoryFieldValidation(String range,String Employee,String Employer) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				 ADDStutatory.click();
				Thread.sleep(1500);
//				effectivedate.click();
//				Thread.sleep(1500);
//				Select selectMonths=new Select(selectMonth);
//				selectMonths.selectByVisibleText(EffectiveMonth);
//				Thread.sleep(1500);
////				String dates="23";
//				
//				WebElement date=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
//				date.click();		
			
				Thread.sleep(1500);
				slabRange.sendKeys(range);
				Thread.sleep(1500);
				boolean selectType = PhilhealthtypeFixed.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					PhilhealthtypeFixed.click();
				}
				Thread.sleep(1500);
				
				Employeetxt.sendKeys(Employee);
				Thread.sleep(1500);
				Employertxt.sendKeys(Employer);
				Thread.sleep(1500);
				saveButton.click();
			
				
				String PhilhealthsDuplicateCheckValidation = duplicateCheck.getText();
				Thread.sleep(1500);
				return PhilhealthsDuplicateCheckValidation;
			
			}
			
			public String addPhilhealthsDuplicateCheckValidation(String EffectiveMonth,String EffectiveDate,String range,String Employee,String Employer) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				 ADDStutatory.click();
				Thread.sleep(1500);
				effectivedate.click();
				Thread.sleep(1500);
				Select selectMonths=new Select(selectMonth);
				selectMonths.selectByVisibleText(EffectiveMonth);
				Thread.sleep(1500);
//				String dates="23";
				
				WebElement date=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
				date.click();		
//				selectDate.click();
				Thread.sleep(1500);
				slabRange.sendKeys(range);
				Thread.sleep(1500);
				boolean selectType = PhilhealthtypeFixed.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					PhilhealthtypeFixed.click();
				}
				Thread.sleep(1500);
				
				Employeetxt.sendKeys(Employee);
				Thread.sleep(1500);
				Employertxt.sendKeys(Employer);
				Thread.sleep(1500);
				saveButton.click();
			
				
				String PhilhealthsDuplicateCheckValidation = duplicateCheck.getText();
				Thread.sleep(1500);
				return PhilhealthsDuplicateCheckValidation;
			
			}
			
			public boolean addPhilhealthResetButton(String EffectiveMonth,String EffectiveDate,String range,String Employee,String Employer) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				 ADDStutatory.click();
				Thread.sleep(1500);
				effectivedate.click();
				Thread.sleep(1500);
				Select selectMonths=new Select(selectMonth);
				selectMonths.selectByVisibleText(EffectiveMonth);
				Thread.sleep(1500);
//				String dates="23";
				
				WebElement date=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
				date.click();		
			
				Thread.sleep(1500);
				slabRange.sendKeys(range);
				Thread.sleep(1500);
				boolean selectType = PhilhealthtypeFixed.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					PhilhealthtypeFixed.click();
				}
				Thread.sleep(1500);
				
				Employeetxt.sendKeys(Employee);
				Thread.sleep(1500);
				Employertxt.sendKeys(Employer);
				Thread.sleep(1500);
				resetButton.click();
				Thread.sleep(1500);
				return true;
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				
				
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
			
			public Boolean searchPhilhealthNamepagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				Statutory.click();
				Thread.sleep(1500);
				 philhealth.click();
				 Thread.sleep(1500);
				searchBox.sendKeys(search);
				Thread.sleep(1500);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}
}
