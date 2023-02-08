package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterExitManagementGratuity extends TestBase{

	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//ExitManagement
		@FindBy(xpath="//span[@id='fnfmst_font']")
		WebElement ExitManagement;
		
		//Gratuity
				@FindBy(xpath="//span[@id='Gratuity_2table']")
				WebElement ExitManagementGratuity;
				
				//GratuityNOofDaysNumberator
				@FindBy(xpath="//input[@id='noofDays2']")
				WebElement GratuityNOofDaysNumberator;
				
				//GratuityNOofDaysDenominator
				@FindBy(xpath="//input[@id='Gratuity_yrs2']")
				WebElement GratuityNOofDaysDenominator;
				
				//GratuityLimitYes
				@FindBy(xpath="(//span[@class='checkmark'])[1]")
				WebElement GratuityLimitYes;
				
				//GratuityExemption
				@FindBy(xpath="//input[@id='Gratuity_amount2']")
				WebElement GratuityExemption;
		
				//GratuityapplicableyearsYes
				@FindBy(xpath="(//span[@class='checkmark'])[3]")
				WebElement GratuityapplicableyearsYes;
				
				//GratuityDescritptionHRAcheckbox
				@FindBy(xpath="(//span[@class='checkmark'])[5]")
				WebElement GratuityDescritptionHRAcheckbox;
				
				//GratuityDescriptionTravelAllowance
				@FindBy(xpath="(//span[@class='checkmark'])[6]")
				WebElement GratuityDescriptionTravelAllowance;
				
				//GratuityRule
				@FindBy(xpath="//textarea[@id='GratuityRule2']")
				WebElement GratuityRule;
				
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
					
					public MasterExitManagementGratuity() {
						PageFactory.initElements(driver, this);
					}
					public String addWorkLocatin() {
						return new String();
					}
					
					public boolean MasterExitManagementGratuityAdd(String numerator,String Denominator,String Exemptions,String Rules) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						GratuityNOofDaysNumberator.clear();
						GratuityNOofDaysNumberator.sendKeys(numerator);
						Thread.sleep(1000);
						GratuityNOofDaysDenominator.clear();
						GratuityNOofDaysDenominator.sendKeys(Denominator);
						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						
						GratuityExemption.sendKeys(Exemptions);
						Thread.sleep(1000);
						
						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
						if(selectType2 == false) {
							GratuityapplicableyearsYes.click();
						}
						Thread.sleep(1000);
						
						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
						if(selectType3 == false) {
							GratuityDescritptionHRAcheckbox.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
						if(selectType4 == false) {
							GratuityDescriptionTravelAllowance.click();
						}
						Thread.sleep(1000);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,250)", "");
						GratuityRule.clear();
						GratuityRule.sendKeys(Rules);
						Thread.sleep(1000);

						UpdateBtn.click();
						Thread.sleep(1000);
						return true;

						}
					
					public boolean MasterExitManagementGratuityResetButton(String numerator,String Denominator,String Exemptions,String Rules) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);

						GratuityNOofDaysNumberator.sendKeys(numerator);
						Thread.sleep(1000);
						
						GratuityNOofDaysDenominator.sendKeys(Denominator);
						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						
						GratuityExemption.sendKeys(Exemptions);
						Thread.sleep(1000);
						
						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
						if(selectType2 == false) {
							GratuityapplicableyearsYes.click();
						}
						Thread.sleep(1000);
						
						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
						if(selectType3 == false) {
							GratuityDescritptionHRAcheckbox.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
						if(selectType4 == false) {
							GratuityDescriptionTravelAllowance.click();
						}
						Thread.sleep(1000);
						
						GratuityRule.sendKeys(Rules);
						Thread.sleep(1000);

						ResetBtn.click();
						Thread.sleep(1000);
						return true;

						}
					
					public String MasterExitManagementGratuityNumeratorMandatoryFieldCheck(String Denominator,String Exemptions,String Rules) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						GratuityNOofDaysNumberator.clear();
//						GratuityNOofDaysNumberator.sendKeys(numerator);
//						Thread.sleep(1000);
						GratuityNOofDaysDenominator.clear();
						GratuityNOofDaysDenominator.sendKeys(Denominator);
						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						GratuityExemption.clear();
						GratuityExemption.sendKeys(Exemptions);
						Thread.sleep(1000);
						
						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
						if(selectType2 == false) {
							GratuityapplicableyearsYes.click();
						}
						Thread.sleep(1000);
						
						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
						if(selectType3 == false) {
							GratuityDescritptionHRAcheckbox.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
						if(selectType4 == false) {
							GratuityDescriptionTravelAllowance.click();
						}
						Thread.sleep(1000);
						GratuityRule.clear();
						GratuityRule.sendKeys(Rules);
						Thread.sleep(1000);

						UpdateBtn.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;

						}
					
					
					public String MasterExitManagementGratuityDonomiatorMandatoryFieldCheck(String numerator,String Exemptions,String Rules) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						GratuityNOofDaysNumberator.clear();
						GratuityNOofDaysNumberator.sendKeys(numerator);
						Thread.sleep(1000);
						GratuityNOofDaysDenominator.clear();
//						GratuityNOofDaysDenominator.sendKeys(Denominator);
//						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						
						GratuityExemption.sendKeys(Exemptions);
						Thread.sleep(1000);
						
						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
						if(selectType2 == false) {
							GratuityapplicableyearsYes.click();
						}
						Thread.sleep(1000);
						
						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
						if(selectType3 == false) {
							GratuityDescritptionHRAcheckbox.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
						if(selectType4 == false) {
							GratuityDescriptionTravelAllowance.click();
						}
						Thread.sleep(1000);
						GratuityRule.clear();
						GratuityRule.sendKeys(Rules);
						Thread.sleep(1000);

						UpdateBtn.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;

						}
					
					
					public String MasterExitManagementGratuityExemptionsMandatoryFieldCheck(String numerator,String Denominator,String Rules) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						GratuityNOofDaysNumberator.clear();
						GratuityNOofDaysNumberator.sendKeys(numerator);
						Thread.sleep(1000);
						GratuityNOofDaysDenominator.clear();
						GratuityNOofDaysDenominator.sendKeys(Denominator);
						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						GratuityExemption.clear();
//						GratuityExemption.sendKeys(Exemptions);
//						Thread.sleep(1000);
						
//						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
//						if(selectType2 == false) {
//							GratuityapplicableyearsYes.click();
//						}
//						Thread.sleep(1000);
//						
//						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
//						if(selectType3 == false) {
//							GratuityDescritptionHRAcheckbox.click();
//						}
//						Thread.sleep(1000);
//						
//						
//						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
//						if(selectType4 == false) {
//							GratuityDescriptionTravelAllowance.click();
//						}
//						Thread.sleep(1000);
//						
//						GratuityRule.sendKeys(Rules);
//						Thread.sleep(1000);

						UpdateBtn.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;

						}
					
					
					public String MasterExitManagementGratuityRulesMandatoryFieldCheck(String numerator,String Denominator,String Exemptions) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						GratuityNOofDaysNumberator.clear();
						GratuityNOofDaysNumberator.sendKeys(numerator);
						Thread.sleep(1000);
						GratuityNOofDaysDenominator.clear();
						GratuityNOofDaysDenominator.sendKeys(Denominator);
						Thread.sleep(1000);
						
						boolean selectType1 = GratuityLimitYes.isSelected();
						if(selectType1 == false) {
							GratuityLimitYes.click();
						}
						Thread.sleep(1000);
						GratuityExemption.clear();
						GratuityExemption.sendKeys(Exemptions);
						Thread.sleep(1000);
						
						boolean selectType2 = GratuityapplicableyearsYes.isSelected();
						if(selectType2 == false) {
							GratuityapplicableyearsYes.click();
						}
						Thread.sleep(1000);
						
						boolean selectType3 = GratuityDescritptionHRAcheckbox.isSelected();
						if(selectType3 == false) {
							GratuityDescritptionHRAcheckbox.click();
						}
						Thread.sleep(1000);
						
						
						boolean selectType4 = GratuityDescriptionTravelAllowance.isSelected();
						if(selectType4 == false) {
							GratuityDescriptionTravelAllowance.click();
						}
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,250)", "");
						Thread.sleep(1000);
						GratuityRule.clear();
//						GratuityRule.sendKeys(Rules);
//						Thread.sleep(1000);

						UpdateBtn.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;

						}
					
					public boolean isnextbuttonStatutoryExitManagementGratuityPaginationVisible() throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						ExitManagement.click();
						Thread.sleep(1000);
						ExitManagementGratuity.click();
						Thread.sleep(1000);
						
						
						boolean flag = false;
					    try {
					        WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
					        if (element.isDisplayed() || element.isEnabled())
//					            flag = false;
					            nextButton.click();
					        System.out.println("next button visible");
					    } catch (NoSuchElementException e) {
//					        flag = true;
					        System.out.println("next button not visible");
					    } 
					    return flag;
						
					}

}
