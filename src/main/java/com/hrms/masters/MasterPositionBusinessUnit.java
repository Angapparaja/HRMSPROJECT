package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPositionBusinessUnit extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//jobPosition
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement jobPosition;

	//Business Unit
		@FindBy(xpath = "//*[text()='Business Unit']")
		WebElement businessUnit;

		//Add Business Unit
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addBusinessUnit;
		
		//business Unit Name
		@FindBy(xpath = "//*[@id='businessUnitName']")
		WebElement businessUnitName;
		
		
		//save button
		@FindBy(xpath = "//*[text()='Save']")
		WebElement saveButton;
		
		//reset button
		@FindBy(xpath = "//*[text()='Reset']")
		WebElement resetButton;
					
		//duplicate Check
				//	@FindBy(xpath = "//*[text()='toast-container']")
					@FindBy(xpath="//div[@class='toast-message']")
					WebElement duplicateCheck;
		
		//mandatory
		@FindBy(xpath = "//*[text()='Enter Business Unit Name']")
		WebElement mandatory;
				
				
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionBusinessUnit() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addBusinessUnit(String Business) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		addBusinessUnit.click();
		Thread.sleep(500);
		businessUnitName.sendKeys(Business);
		saveButton.click();
		
		return true;
		
	}
	
	public String BusinessUnitNegativeCheck(String Business) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		addBusinessUnit.click();
		Thread.sleep(500);
		businessUnitName.sendKeys(Business);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String addBusinessUnitMandatoryFieldVaidation() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		addBusinessUnit.click();
		Thread.sleep(500);
	//	businessUnitName.sendKeys("Business Unit One");
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	
	public String addBusinessUnitDuplicateCheckValidation(String Business) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		addBusinessUnit.click();
		Thread.sleep(500);
		businessUnitName.sendKeys(Business);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
		
	
	}
	
	public boolean verifyResetButton(String Business) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		addBusinessUnit.click();
		Thread.sleep(500);
		businessUnitName.sendKeys(Business);
		resetButton.click();
	
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchPositionBusinessUnitNamepagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		businessUnit.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			Thread.sleep(1000);
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
}
