package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterExitManagementNodues extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	// Nodueslink
	@FindBy(xpath="//span[@id='deptDuesMaster']")
	WebElement  NoDueslink;
	
	//ExitManagement
	@FindBy(xpath="//span[@id='fnfmst_font']")
	WebElement ExitManagement;
	//Addstatutory
		@FindBy(xpath = "//*[@id='swap']")
		WebElement ADDExitManagement;
		
		
		//select Department
				@FindBy(xpath = "//*[@id='deptId']")
				WebElement  Department;
				
				
		//enter category
				@FindBy(xpath="//input[@id='duesDetail']")
				WebElement category;
				
				//enter spoc
				@FindBy(xpath="//input[@id='empCode']")
				WebElement EmpCode;
				
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
				
				public MasterExitManagementNodues() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				
				public boolean addMasterExitManagementNodues(String Departments,String categorys,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					return true;
					
				}
				
				
				public String MasterExitManagementNoduesNegativeCheck(String Departments,String categorys,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String MasterExitManagementNoduesDepartmentMandatoryFieldCheck(String categorys,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
//					Select selectDepartment=new Select(Department);
//					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String MasterExitManagementNoduesCategoryNameMandatoryFieldCheck(String Departments,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
//					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String MasterExitManagementNoduesSPOCMandatoryFieldCheck(String Departments,String categorys) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
//					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String addMasterExitManagementNoduesDuplicateCheckValidation(String Departments,String categorys,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(1000);
					
					String MasterExitManagementNoduesDuplicateCheckValidation = duplicateCheck.getText();
					Thread.sleep(1000);
					return MasterExitManagementNoduesDuplicateCheckValidation;
				
				}
				
				public boolean addMasterExitManagementNoduesResetButton(String Departments,String categorys,String Spoc) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
					 Thread.sleep(1000);
					 ADDExitManagement.click();
					Thread.sleep(1000);
					Select selectDepartment=new Select(Department);
					selectDepartment.selectByVisibleText(Departments);
					Thread.sleep(1000);
					category.sendKeys(categorys);
					Thread.sleep(1000);
					EmpCode.sendKeys(Spoc);
					Thread.sleep(1000);
					resetButton.click();
					Thread.sleep(1000);
					return true;
				}
				
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
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
				public Boolean searchExitManagementNoduespagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					ExitManagement.click();
					Thread.sleep(1000);
					NoDueslink.click();
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
