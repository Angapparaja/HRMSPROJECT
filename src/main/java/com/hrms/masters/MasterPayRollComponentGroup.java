package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPayRollComponentGroup extends TestBase{
	
	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//PayRollMenu
		@FindBy(xpath="//span[@id='pay_font']")
		WebElement PayRoll;
		
		//ComponentGroup
		@FindBy(xpath="//span[@id=\"componantegroup\"]")
		WebElement ComponentGroup;
		
		//ADDComponentGroup
		@FindBy(xpath = "//*[@id='swap']")
		WebElement AddComponentGroup;
		
		//ComponentName
		@FindBy(xpath="//input[@id='group_name']")
		WebElement ComponentName;
		
		//ComponentCode
				@FindBy(xpath="//input[@id='groupCode']")
				WebElement ComponentCode;
				
			//ComponentTypeIncome
				@FindBy(xpath="(//span[@class='checkmark'])[1]")
				WebElement ComponentTypeIncome;
				
			//ComponentTypedecuction
				@FindBy(xpath="(//span[@class='checkmark'])[2]")
				WebElement ComponentTypedecuction;
				
				//save button
				@FindBy(xpath = "//*[text()='Save']")
				WebElement saveButton;
				
				//reset button
				@FindBy(xpath = "//*[text()='Reset']")
				WebElement resetButton;
				
				//next button
				@FindBy(xpath = "//*[text()='Next']")
				WebElement nextButton;
				
				
	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;
	
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
				public MasterPayRollComponentGroup() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean addPayRollComponentGroupWithIncomeComponentType(String ComponentNames,String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypeIncome.isSelected();
					if(selectType == false) {
						ComponentTypeIncome.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				
				public boolean addPayRollComponentGroupWithDeductionComponentType(String ComponentNames,String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypedecuction.isSelected();
					if(selectType == false) {
						ComponentTypedecuction.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				public String addPayRollComponentGroupNegativeCheck(String ComponentNames,String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypedecuction.isSelected();
					if(selectType == false) {
						ComponentTypedecuction.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String addPayRollComponentNameMandatoryFieldCheck(String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
//					Thread.sleep(1000);
//					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypeIncome.isSelected();
					if(selectType == false) {
						ComponentTypeIncome.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
			
				public String addPayRollComponentCodeMandatoryFieldCheck(String ComponentNames) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
//					Thread.sleep(1000);
//					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypeIncome.isSelected();
					if(selectType == false) {
						ComponentTypeIncome.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String PayrollComponentGroupDuplicateCheckvalidation(String ComponentNames,String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypeIncome.isSelected();
					if(selectType == false) {
						ComponentTypeIncome.click();
					}
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public boolean resetbuttonvalidation(String ComponentNames,String ComponentCodes) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					AddComponentGroup.click();
					Thread.sleep(1000);
					ComponentName.sendKeys(ComponentNames);
					Thread.sleep(1000);
					ComponentCode.sendKeys(ComponentCodes);
					Thread.sleep(1000);
					boolean selectType = ComponentTypeIncome.isSelected();
					if(selectType == false) {
						ComponentTypeIncome.click();
					}
					resetButton.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					
					
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
				
				public Boolean searchPayrollComponentNamepagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					PayRoll.click();
					Thread.sleep(1000);
					ComponentGroup.click();
					Thread.sleep(1000);
					searchBox.sendKeys(search);
					Thread.sleep(1000);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
					for(WebElement e:searchvalue) {
						String searchvalues=e.getText();
						System.out.println(searchvalues);
					}

					return true;
					
					
				}
}
