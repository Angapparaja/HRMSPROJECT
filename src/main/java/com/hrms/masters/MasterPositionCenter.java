package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPositionCenter extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//jobPosition
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement jobPosition;
			
			//PositionCenter
			@FindBy(xpath = "//span[@id='center']")
			WebElement Center;
			
			//Add
			@FindBy(xpath = "//*[@id='swap']")
			WebElement positionAdd;
			
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
				
				//Cost Center
				@FindBy(xpath = "//select[@id='costCenterId']")
				WebElement CostCenter;
				
				//Cost Center Name
				@FindBy(xpath = "//input[@id='CenterName']")
				WebElement CostCenterName;
				
                //edit button
				@FindBy(xpath = "//a[@class='fa fa-edit']")
				WebElement EditBtn;
				
				//update button
				@FindBy(xpath = "//button[text()='Update']")
				WebElement UpdateBtn;
				
				//next button
				@FindBy(xpath = "//*[text()='Next']")
				WebElement nextButton;
				
				//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;
				
				public MasterPositionCenter() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean positionCenterAdd(String CostCenters,String Centers) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
					Select level=new Select(CostCenter);
					level.selectByVisibleText(CostCenters);
					Thread.sleep(500);
					CostCenterName.sendKeys(Centers);
					
					saveButton.click();
				
					return true;
					
				}
				
				public String positionCenterNegativeCheck(String CostCenters,String Centers) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
					Select level=new Select(CostCenter);
					level.selectByVisibleText(CostCenters);
					Thread.sleep(500);
					CostCenterName.sendKeys(Centers);
					Thread.sleep(500);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String positionCenterCostCenterMandatoryFieldVaidation(String Centers) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
//					Select level=new Select(CostCenter);
//					level.selectByVisibleText(CostCenters);
//					Thread.sleep(1000);
					CostCenterName.sendKeys(Centers);
					Thread.sleep(500);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
				}
				
				
				public String positionCenterCenterNameMandatoryFieldVaidation(String CostCenters) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
					Select level=new Select(CostCenter);
					level.selectByVisibleText(CostCenters);
					Thread.sleep(500);
//					CostCenterName.sendKeys(Centers);
//					Thread.sleep(1000);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
				}
				
				
				public String positionCenterDuplicateCheck(String CostCenters,String Centers) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
					Select level=new Select(CostCenter);
					level.selectByVisibleText(CostCenters);
					Thread.sleep(500);
					CostCenterName.sendKeys(Centers);
					Thread.sleep(500);
					saveButton.click();
					Thread.sleep(500);
					String value=duplicateCheck.getText(); 
					return value;
				}
				
				public boolean verifyPositionCenterResetButton(String CostCenters,String Centers) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					positionAdd.click();
					Thread.sleep(500);
					Select level=new Select(CostCenter);
					level.selectByVisibleText(CostCenters);
					Thread.sleep(500);
					CostCenterName.sendKeys(Centers);
					
					resetButton.click();
				
					return true;
					
				}
				
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					
					
					boolean flag = false;
			        try {
			            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
			            if (element.isDisplayed() || element.isEnabled())
//			                flag = false;
			                nextButton.click();
			            System.out.println("pagination button visible");
			        } catch (NoSuchElementException e) {
//			            flag = true;
			            System.out.println("pagination button not visible");
			        } 
			        return flag;
					
				}
				
				public Boolean searchPositionCenterpagination(String search,String searchpointvalue) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					searchBox.sendKeys(search);
					Thread.sleep(500);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
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
				
				public String searchPositioncenterEdit(String search,String editCenters) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					jobPosition.click();
					Thread.sleep(1000);
					Center.click();
					Thread.sleep(500);
					searchBox.sendKeys(search);
					Thread.sleep(500);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
					for(WebElement e:searchvalue) {
						String searchvalues=e.getText();
						System.out.println(searchvalues);
					}
					EditBtn.click();
					Thread.sleep(500);
					CostCenterName.clear();
					CostCenterName.sendKeys(editCenters);
					Thread.sleep(500);
					UpdateBtn.click();
					String value=duplicateCheck.getText(); 
					return value;
					
					
				}
				
			
			
}
