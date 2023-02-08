package com.hrms.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterExitManagementSetup extends TestBase{

	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// Setuplink
	@FindBy(xpath="//span[@id='FandFRequirements']")
	WebElement  Setuplink;
	
	//ExitManagement
	@FindBy(xpath="//span[@id='fnfmst_font']")
	WebElement ExitManagement;
	//Addstatutory
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDExitManagement;
		
		//AddTextBOX
		@FindBy(xpath="//input[@id='baseDay']")
		WebElement baseday;
		
		//component checkbox
		@FindBy(xpath="(//span[@class='checkmark'])[2]")
		WebElement componentCheckbox;
		
		//Update Button
		@FindBy(xpath="//button[text()='Update']")
		WebElement UpdateButton;
		
		// save button
		@FindBy(xpath = "//button[text()='Save']")
		WebElement saveButton;
		
		public MasterExitManagementSetup() {
			PageFactory.initElements(driver, this);
		}
		
		public String addWorkLocatin() {
			return new String();
		}
		
		public boolean UpdateExitmanagementCheckBox(String basedays) throws InterruptedException {
			masterIcon.click();
			Thread.sleep(1000);
			ExitManagement.click();
			Thread.sleep(1000);
			Setuplink.click();
			 Thread.sleep(1000);
			 baseday.clear();
			 baseday.sendKeys(basedays);
			 Thread.sleep(1000);
	boolean selectType = componentCheckbox.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					componentCheckbox.click();
				}
				Thread.sleep(1000);
//				if(saveButton.isDisplayed()) {
//					saveButton.click();
//				}
//				else {
					UpdateButton.click();
//				}
				
			
			Thread.sleep(1000);
			return true;
			
		}
		
}
