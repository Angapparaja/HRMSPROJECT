package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPositionSubDepartment extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Position
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement position;

	//Sub Department
		@FindBy(xpath = "//*[text()='Sub Department']")
		WebElement subDepartment;

		//Add Sub Department
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addSubDepartment;
		
		//Department Name
		@FindBy(xpath = "//*[@id='departId']")
		WebElement departmentName;
		
		//Sub Department 
		@FindBy(xpath = "//*[@id='divisionName']")
		WebElement subDepartName;
				
		
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
		WebElement subDepartmentMandatory;
		
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionSubDepartment() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addSubDepartment(String department,String Subdepartment) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
		Select deptName=new Select(departmentName);
		deptName.selectByVisibleText(department);
		Thread.sleep(500);
		subDepartName.sendKeys(Subdepartment);
		
		saveButton.click();
		
		return true;
		
	}
	
	
	public String addSubDepartmentNegativeCheck(String department,String Subdepartment) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
		Select deptName=new Select(departmentName);
		deptName.selectByVisibleText(department);
		Thread.sleep(500);
		subDepartName.sendKeys(Subdepartment);
		
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String departmentNameMandatoryFieldVaidation(String Subdepartment) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
	//	Select deptName=new Select(departmentName);
		//deptName.selectByIndex(0);
		//Thread.sleep(2000);
		subDepartName.sendKeys(Subdepartment);
		
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	public String addSubDepartmentNameMandatoryFieldVaidation(String department) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
		Select deptName=new Select(departmentName);
		deptName.selectByVisibleText(department);
		Thread.sleep(500);
		//subDepartName.sendKeys("Quality");
		
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	public String addSubDepartmentDuplicateCheckValidation(String department,String Subdepartment) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
		Select deptName=new Select(departmentName);
		deptName.selectByVisibleText(department);
		Thread.sleep(500);
		subDepartName.sendKeys(Subdepartment);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	
	}
	
	public boolean verifyResetButton(String department,String Subdepartment) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		addSubDepartment.click();
		Thread.sleep(500);
		Select deptName=new Select(departmentName);
		deptName.selectByVisibleText(department);
		Thread.sleep(500);
		subDepartName.sendKeys(Subdepartment);
		Thread.sleep(500);
		
		
		resetButton.click();
		Thread.sleep(1000);
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
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
	
	
	public Boolean searchPositionSubDepartmentpagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		subDepartment.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
}
