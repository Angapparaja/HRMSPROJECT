package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPositionCostCenter extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Position
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement position;

	//Cost Center 
		@FindBy(xpath = "//*[text()='Cost Center ']")
		WebElement costCenter ;

		//Add Department
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addCostCenter;
		
		//Cost Center Name
		@FindBy(xpath = "//*[@id='CostCenterName']")
		WebElement costCenterName;
		
			
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
		
		//Cost Center Name Name Mandatory
		@FindBy(xpath = "//*[text()='Enter Cost Center Name']")
		WebElement costCenterNameMandatory;
	
		
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionCostCenter() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addCostCenter(String Costcenter) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		addCostCenter.click();
		Thread.sleep(500);
		costCenterName.sendKeys(Costcenter);
		
		saveButton.click();
		
		return true;
		
	}
	
	
	public String CostCenterNegativeCheck(String Costcenter) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		addCostCenter.click();
		Thread.sleep(500);
		costCenterName.sendKeys(Costcenter);
	
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String addCostCenterMandatoryFieldVaidation() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		addCostCenter.click();
		Thread.sleep(500);
		//costCenterName.sendKeys("Chemical Engineering");
		
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	
	public String addCostCenterDuplicateCheckValidation(String Costcenter) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		addCostCenter.click();
		Thread.sleep(500);
		costCenterName.sendKeys(Costcenter);
		
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	public boolean verifyResetButton(String Costcenter) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		addCostCenter.click();
		Thread.sleep(500);
		costCenterName.sendKeys(Costcenter);
		
			
		resetButton.click();
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
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
	public Boolean searchPositionCostCenterpagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		costCenter.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
}
