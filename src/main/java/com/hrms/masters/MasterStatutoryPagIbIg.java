package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryPagIbIg extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// StatutoryPagIbIg
	@FindBy(xpath="//span[@id='pagibig']")
	WebElement StatutoryPagIbIg;
	
	//StatutoryLink
	@FindBy(xpath="//span[@id='stat_font']")
	WebElement Statutory;
	//Addstatutory
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDStutatory;
		
		//Effective Date
		@FindBy(xpath="//input[@id='effect_date']")
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
		
		//StatutoryPagIbIg typeFixed
		@FindBy(xpath="(//span[@class='checkmark'])[3]")
		WebElement StatutoryPagIbIgFixed;
		
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

		public MasterStatutoryPagIbIg() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		
		
		public boolean addMasterStatutoryPagIbIg(String SelectMonth,String Selectdate,String slabRanges,String Employees,String Employers) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			 ADDStutatory.click();
			Thread.sleep(1500);
			effectivedate.click();
			Thread.sleep(1500);
			Select selectMonths=new Select(selectMonth);
			//selectMonths.selectByVisibleText(SelectMonth);
			selectMonths.selectByIndex(0);
			Thread.sleep(1500);
			WebElement dates=driver.findElement(By.xpath("//a[text()='"+Selectdate+"']"));
			dates.click();
//			selectDate.click();
			Thread.sleep(1500);
			slabRange.sendKeys(slabRanges);
			Thread.sleep(1500);
			boolean selectType = StatutoryPagIbIgFixed.isSelected();
			
			//performing click operation only if element is not selected
			if(selectType == false) {
				StatutoryPagIbIgFixed.click();
			}
			Thread.sleep(1500);
			
			Employeetxt.sendKeys(Employees);
			Thread.sleep(1500);
			Employertxt.sendKeys(Employers);
			Thread.sleep(1500);
			saveButton.click();
			Thread.sleep(1500);
			return true;
			
		}
		
		public String MasterStatutoryPagIbIgEffectiveDateMandatoryFieldCheck(String slabRanges,String Employees,String Employers) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			 ADDStutatory.click();
			Thread.sleep(1500);
//			effectivedate.click();
//			Thread.sleep(1500);
//			Select selectMonths=new Select(selectMonth);
//			selectMonths.selectByVisibleText(SelectMonth);
//			Thread.sleep(1500);
//			WebElement dates=driver.findElement(By.xpath("//a[text()='"+Selectdate+"']"));
//			dates.click();
////			selectDate.click();
//			Thread.sleep(1500);
			slabRange.sendKeys(slabRanges);
			Thread.sleep(1500);
			boolean selectType = StatutoryPagIbIgFixed.isSelected();
			
			//performing click operation only if element is not selected
			if(selectType == false) {
				StatutoryPagIbIgFixed.click();
			}
			Thread.sleep(1500);
			
			Employeetxt.sendKeys(Employees);
			Thread.sleep(1500);
			Employertxt.sendKeys(Employers);
			Thread.sleep(1500);
			saveButton.click();
			Thread.sleep(1500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		
		public String MasterStatutoryPagIbIgDetailsMandatoryFieldCheck(String SelectMonth,String Selectdate) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			 ADDStutatory.click();
			Thread.sleep(1500);
			effectivedate.click();
			Thread.sleep(1500);
			Select selectMonths=new Select(selectMonth);
			selectMonths.selectByVisibleText(SelectMonth);
			Thread.sleep(1500);
			WebElement dates=driver.findElement(By.xpath("//a[text()='"+Selectdate+"']"));
			dates.click();
//			selectDate.click();
			Thread.sleep(1500);
//			slabRange.sendKeys(slabRanges);
//			Thread.sleep(1500);
//			boolean selectType = StatutoryPagIbIgFixed.isSelected();
//			
//			//performing click operation only if element is not selected
//			if(selectType == false) {
//				StatutoryPagIbIgFixed.click();
//			}
//			Thread.sleep(1500);
//			
//			Employeetxt.sendKeys(Employees);
//			Thread.sleep(1500);
//			Employertxt.sendKeys(Employers);
//			Thread.sleep(1500);
			saveButton.click();
			Thread.sleep(1500);
			String value=duplicateCheck.getText(); 
			return value;
			
		}
		
		public String addMasterStatutoryPagIbIgDuplicateCheckValidation(String SelectMonth,String Selectdate,String slabRanges,String Employees,String Employers) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			 ADDStutatory.click();
			Thread.sleep(1500);
			effectivedate.click();
			Thread.sleep(1500);
			Select selectMonths=new Select(selectMonth);
			selectMonths.selectByVisibleText(SelectMonth);
			Thread.sleep(1500);
			WebElement dates=driver.findElement(By.xpath("//a[text()='"+Selectdate+"']"));
			dates.click();
//			selectDate.click();
			Thread.sleep(1500);
			slabRange.sendKeys(slabRanges);
			Thread.sleep(1500);
			boolean selectType = StatutoryPagIbIgFixed.isSelected();
			
			//performing click operation only if element is not selected
			if(selectType == false) {
				StatutoryPagIbIgFixed.click();
			}
			Thread.sleep(1500);
			
			Employeetxt.sendKeys(Employees);
			Thread.sleep(1500);
			Employertxt.sendKeys(Employers);
			Thread.sleep(1500);
			saveButton.click();
			Thread.sleep(1500);
			String StatutoryPagIbIgDuplicateCheckValidation = duplicateCheck.getText();
			Thread.sleep(1500);
			return StatutoryPagIbIgDuplicateCheckValidation;
		
		}
		
		public boolean addMasterStatutoryPagIbIgResetButton(String SelectMonth,String Selectdate,String slabRanges,String Employees,String Employers) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			 ADDStutatory.click();
			Thread.sleep(1500);
			effectivedate.click();
			Thread.sleep(1500);
			Select selectMonths=new Select(selectMonth);
			selectMonths.selectByVisibleText(SelectMonth);
			Thread.sleep(1500);
			WebElement dates=driver.findElement(By.xpath("//a[text()='"+Selectdate+"']"));
			dates.click();
//			selectDate.click();
			Thread.sleep(1500);
			slabRange.sendKeys(slabRanges);
			Thread.sleep(1500);
			boolean selectType = StatutoryPagIbIgFixed.isSelected();
			
			//performing click operation only if element is not selected
			if(selectType == false) {
				StatutoryPagIbIgFixed.click();
			}
			Thread.sleep(1500);
			
			Employeetxt.sendKeys(Employees);
			Thread.sleep(1500);
			Employertxt.sendKeys(Employers);
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
			StatutoryPagIbIg.click();
			 Thread.sleep(1500);
			
			
			boolean flag = false;
	        try {
	            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
	            if (element.isDisplayed() || element.isEnabled())
//	                flag = false;
	                nextButton.click();
	            System.out.println("next button visible");
	        } catch (NoSuchElementException e) {
//	            flag = true;
	            System.out.println("next button not visible");
	        } 
	        return flag;
			
		}
		
		public Boolean searchStatuoryPAGIBIGpagination(String search) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1500);
			Statutory.click();
			Thread.sleep(1500);
			StatutoryPagIbIg.click();
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
