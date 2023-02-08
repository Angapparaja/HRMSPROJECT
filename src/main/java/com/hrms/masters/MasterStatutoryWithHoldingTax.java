package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutoryWithHoldingTax extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// StatutoryWithHoldingTax
	@FindBy(xpath="//span[@id='withholdtax']")
	WebElement Statutorywithholdtax;
	
	//StatutoryLink
	@FindBy(xpath="//span[@id='stat_font']")
	WebElement Statutory;
	//Addstatutory
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDStutatory;
	
		//Startedate Date
				@FindBy(xpath="//input[@id='startdate']")
				WebElement  effectivedate;
				
				//Effective Date selectMonth
				@FindBy(xpath="//*[@data-handler='selectMonth']")
				WebElement selectMonth;
				
				//Effective Date selectdate
				@FindBy(xpath="//a[text()='31']")
				WebElement selectDate;
				
				//TaxType
				@FindBy(xpath="//*[@id='taxtype']")
				WebElement TaxType;
				
				//slab Torange
				@FindBy(xpath="//input[@id='to_slb_1']")
				WebElement slabRange;
				
				//TaxRate
				@FindBy(xpath="//input[@id='taxrate_1']")
				WebElement TaxRate;
				
				//minWht
				@FindBy(xpath="//input[@id='min_slb_1']")
				WebElement MinWHT;
				
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

				public MasterStatutoryWithHoldingTax() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				
				public boolean addMasterStatutoryWithHoldingTax(String selectmonths,String selectdates,String taxtype,String slabRanges,String taxrate,String minwht) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
					dates.click();
					Thread.sleep(1500);
					Select TaxTypes=new Select(TaxType);
					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
					Thread.sleep(1500);

					TaxRate.sendKeys(taxrate);
					Thread.sleep(1500);
					MinWHT.sendKeys(minwht);
					Thread.sleep(1500);
					saveButton.click();
					Thread.sleep(1500);
					return true;
					
				}
				
				public String MasterStatutoryWithHoldingTaxEffectiveFieldMandatoryCheck(String taxtype,String slabRanges,String taxrate,String minwht) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
//					effectivedate.click();
//					Thread.sleep(1500);
//					Select selectMonths=new Select(selectMonth);
//					selectMonths.selectByVisibleText(selectmonths);
//					Thread.sleep(1500);
//					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
//					dates.click();
					Thread.sleep(1500);
					Select TaxTypes=new Select(TaxType);
					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
					Thread.sleep(1500);
					
					
					TaxRate.sendKeys(taxrate);
					Thread.sleep(1500);
					MinWHT.sendKeys(minwht);
					Thread.sleep(1500);
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String MasterStatutoryWithHoldingTAXTypeMandatoryFieldCheck(String selectmonths,String selectdates,String slabRanges,String taxrate,String minwht) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(selectmonths);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
					dates.click();
			
//					Select TaxTypes=new Select(TaxType);
//					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
					Thread.sleep(1500);
					
					
					TaxRate.sendKeys(taxrate);
					Thread.sleep(1500);
					MinWHT.sendKeys(minwht);
					Thread.sleep(1500);
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String MasterStatutoryWithHoldingTaxDetailsMandatoryFieldCheck(String selectmonths,String selectdates,String taxtype) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(selectmonths);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
					dates.click();
					Thread.sleep(1500);
					Select TaxTypes=new Select(TaxType);
					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
//					slabRange.sendKeys(slabRanges);
//					Thread.sleep(1500);
//					
//					
//					TaxRate.sendKeys(taxrate);
//					Thread.sleep(1500);
//					MinWHT.sendKeys(minwht);
//					Thread.sleep(1500);
					saveButton.click();
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				
				
				public String addMasterStatutoryWithHoldingTaxDuplicateCheckValidation(String selectmonths,String selectdates,String taxtype,String slabRanges,String taxrate,String minwht) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(selectmonths);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
					dates.click();
					Thread.sleep(1500);
					Select TaxTypes=new Select(TaxType);
					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
					Thread.sleep(1500);
					
					
					TaxRate.sendKeys(taxrate);
					Thread.sleep(1500);
					MinWHT.sendKeys(minwht);
					Thread.sleep(1500);
					saveButton.click();
					Thread.sleep(1500);
					
					String StatutoryWithHoldingTaxDuplicateCheckValidation = duplicateCheck.getText();
					Thread.sleep(1500);
					return StatutoryWithHoldingTaxDuplicateCheckValidation;
				
				}
				
				public boolean addMasterStatutoryWithHoldingTaxResetButton(String selectmonths,String selectdates,String taxtype,String slabRanges,String taxrate,String minwht) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(selectmonths);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+selectdates+"']"));
					dates.click();
					Thread.sleep(1500);
					Select TaxTypes=new Select(TaxType);
					TaxTypes.selectByVisibleText(taxtype);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
					Thread.sleep(1500);
					
					
					TaxRate.sendKeys(taxrate);
					Thread.sleep(1500);
					MinWHT.sendKeys(minwht);
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
					Statutorywithholdtax.click();
					 Thread.sleep(1500);
					
					
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
				public Boolean searchStatuoryWithHoldingTaxpagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					Statutorywithholdtax.click();
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
