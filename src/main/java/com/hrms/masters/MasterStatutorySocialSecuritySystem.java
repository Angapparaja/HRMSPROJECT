package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutorySocialSecuritySystem extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	//StatutoryLink
		@FindBy(xpath="//span[@id='stat_font']")
		WebElement Statutory;
	
	//Statutory SocialSecuritySystem
		@FindBy(xpath="//span[@id='sss']")
		WebElement SocialSecuritySystem;
		
		//Addstatutory
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDStutatory;
		
		//Effective Date
		@FindBy(xpath="//input[@id='EffectiveDate']")
		WebElement  effectivedate;
		
		//Effective Date selectMonth
		@FindBy(xpath="//*[@data-handler='selectMonth']")
		WebElement selectMonth;
		
		//Effective Date selectdate
		@FindBy(xpath="//a[text()='31']")
		WebElement selectDate;
		
		//Employer
		@FindBy(xpath="//input[@id='emp_contri']")
		WebElement Employer;
		
		//Employee
		@FindBy(xpath="//input[@id='emper_contri']")
		WebElement Employee;
		
		//slab Torange
		@FindBy(xpath="//input[@id='to_slb_1']")
		WebElement slabRange;
		
		//slab credit
		@FindBy(xpath="//input[@id='contrib_1']")
		WebElement slabCredit;
		
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
		
		//slab EcContribution
				@FindBy(xpath="//input[@id='eccontrib_1']")
				WebElement slabEcContribution;
				
				//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;
				
				
				public MasterStatutorySocialSecuritySystem() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				
				public boolean addStatutorySocialSecuritySystem(String EffectiveMonth,String EffectiveDate,String Employers,String Employees,String slabRanges,String Credits,String EcContributions ) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(EffectiveMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
					Employer.sendKeys(Employers);
					Thread.sleep(1500);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					slabEcContribution.sendKeys(EcContributions);
					
				
					saveButton.click();
					Thread.sleep(1500);
					return true;
					
				}
				
				public String StatutorySocialSecuritySystemEffectiveDateMandatoryFieldCheck(String Employers,String Employees,String slabRanges,String Credits,String EcContributions ) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
//					effectivedate.click();
//					Thread.sleep(1500);
//					Select selectMonths=new Select(selectMonth);
//					selectMonths.selectByVisibleText(EffectiveMonth);
//					Thread.sleep(1500);
//					WebElement dates=driver.findElement(By.xpath("selectDate"));
//					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
					Employer.sendKeys(Employers);
					Thread.sleep(1500);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					slabEcContribution.sendKeys(EcContributions);
					
				
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String StatutorySocialSecuritySystemEmployerMandatoryFieldCheck(String EffectiveMonth,String EffectiveDate,String Employees,String slabRanges,String Credits,String EcContributions ) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(EffectiveMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
//					Employer.sendKeys(Employers);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					Thread.sleep(1500);
					slabEcContribution.sendKeys(EcContributions);
					Thread.sleep(1500);
				
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String StatutorySocialSecuritySystemEmployerNegativeCheck(String EffectiveMonth,String EffectiveDate,String Employers,String Employees,String slabRanges,String Credits,String EcContributions ) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
				//	selectMonths.selectByVisibleText(EffectiveMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
					Employer.sendKeys(Employers);
					Thread.sleep(1500);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					Thread.sleep(1500);
					slabEcContribution.sendKeys(EcContributions);
					
				
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
			
				
				public String addStatutorySocialSecuritySystemDuplicateCheckValidation(String EffectiveMonth,String EffectiveDate,String Employers,String Employees,String slabRanges,String Credits,String EcContributions) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
				//	selectMonths.selectByVisibleText(EffectiveMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
					Employer.sendKeys(Employers);
					Thread.sleep(1500);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					Thread.sleep(1500);
					slabEcContribution.sendKeys(EcContributions);
					
				
					saveButton.click();
					
				
					
					String StatutorySocialSecuritySystemDuplicateCheckValidation = duplicateCheck.getText();
					Thread.sleep(1500);
					return StatutorySocialSecuritySystemDuplicateCheckValidation;
				
				}
				
				public boolean addStatutorySocialSecuritySystemResetButton(String EffectiveMonth,String EffectiveDate,String Employers,String Employees,String slabRanges,String Credits,String EcContributions) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
					 Thread.sleep(1500);
					 ADDStutatory.click();
					Thread.sleep(1500);
					effectivedate.click();
					Thread.sleep(1500);
					Select selectMonths=new Select(selectMonth);
					//selectMonths.selectByVisibleText(EffectiveMonth);
					selectMonths.selectByIndex(1);
					Thread.sleep(1500);
					WebElement dates=driver.findElement(By.xpath("//a[text()='"+EffectiveDate+"']"));
					dates.click();
//					selectDate.click();
					Thread.sleep(1500);
					Employer.sendKeys(Employers);
					Thread.sleep(1500);
					Employee.sendKeys(Employees);
					Thread.sleep(1500);
					slabRange.sendKeys(slabRanges);
				
					Thread.sleep(1500);
					slabCredit.sendKeys(Credits);
					slabEcContribution.sendKeys(EcContributions);
					
				
					resetButton.click();
					Thread.sleep(1500);
					return true;
				}
				
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
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
				
				public Boolean searchStatuorySocialSecuritySystempagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					Statutory.click();
					Thread.sleep(1500);
					SocialSecuritySystem.click();
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
