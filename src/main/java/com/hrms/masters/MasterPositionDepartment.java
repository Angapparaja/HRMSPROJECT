package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPositionDepartment extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Position
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement position;

	//Department
		@FindBy(xpath = "//*[text()='Department']")
		WebElement department;

		//Add Department
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addDepartment;
		
		//Department Name
		@FindBy(xpath = "//*[@id='departmentName']")
		WebElement departmentName;
		
		//Department Code
		@FindBy(xpath = "//*[@id='departmentCode']")
		WebElement departmentCode;
				
		
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
		
		//Department Name Mandatory
		@FindBy(xpath = "//*[text()='Enter Department Name']")
		WebElement departmentNameMandatory;
				
		//Department Code Mandatory
		@FindBy(xpath = "//*[text()='Enter Department Code']")
		WebElement departmentCodeMandatory;
		
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;
		
	public MasterPositionDepartment() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addDepartment(String Departname,String departCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		departmentName.sendKeys(Departname);
		
		departmentCode.sendKeys(departCode);
		saveButton.click();
		
		return true;
		
	}
	
	public String DepartmentNegativeCheck(String Departname,String departCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		departmentName.sendKeys(Departname);
		
		departmentCode.sendKeys(departCode);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String addDepartmentNameMandatoryFieldVaidation(String departCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		//departmentName.sendKeys("Chemical Engineering");
		
		departmentCode.sendKeys(departCode);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	public String addDepartmentCodeMandatoryFieldVaidation(String Departname) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		departmentName.sendKeys(Departname);
		Thread.sleep(500);
		//departmentCode.sendKeys("CHE ENGG");
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	public String addDepartmentDuplicateCheckValidation(String Departname,String departCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		departmentName.sendKeys(Departname);
		
		departmentCode.sendKeys(departCode);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;	
	
	}
	
	public boolean verifyResetButton(String Departname,String departCode) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		addDepartment.click();
		Thread.sleep(500);
		departmentName.sendKeys(Departname);
		
		departmentCode.sendKeys(departCode);
		
		
		resetButton.click();
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
		
	}
	public Boolean searchPositionDepartmentpagination(String search,String searchpointvalue) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		department.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
			Thread.sleep(500);
			
			if(searchvalues.equals(searchpointvalue)) {
				//System.out.println(searchvalues);
				System.out.println("sucessfully searched"+searchvalues);
				return true;
			}
			
			else {
				System.out.println("value not correct");	
				return false;
			}
			
		}
		
		return true;
	
		
		
	}
	
}
