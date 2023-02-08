package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceWeekOffPolicy extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	  //ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;
	
	//WeekOffPolicy
	@FindBy(xpath = "//span[@id='weekOffPolicy']")
	WebElement weekoffpolicy;
	
	//policyName
	@FindBy(xpath="//input[@name='policyName']")
	WebElement policyName;
	//week1
	@FindBy(xpath = "//select[@id='week1r1']")
	WebElement week1;
	
	//week2
	@FindBy(xpath = "//select[@id='week2r1']")
	WebElement week2;
	
	//halfday checkbox 1
	@FindBy(xpath = "(//span[@class='checkmark'])[1]")
	WebElement Halfdaycheckbox1;
	
	//halfday checkbox 2
		@FindBy(xpath = "(//span[@class='checkmark'])[2]")
		WebElement Halfdaycheckbox2;
		
		//Policy status
		@FindBy(xpath = "//select[@id='policyStatus']")
		WebElement Policystatus;
		
		//Add
		@FindBy(xpath = "//*[@id='swap']")
		WebElement AddBtn;
		
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
					
					
					//edit button
					@FindBy(xpath = "//a[@class='fa fa-edit']")
					WebElement EditBtn;
					
					//update button
					@FindBy(xpath = "//button[text()='update']")
					WebElement UpdateBtn;
					
					//next button
					@FindBy(xpath = "//*[text()='Next']")
					WebElement nextButton;
					
					//searchBox
					@FindBy(xpath="//input[@type='search']")
					WebElement searchBox;
	
					public MasterAttendanceWeekOffPolicy() {
						PageFactory.initElements(driver, this);
					}
					
					public String addWorkLocatin() {
						return new String();
					}
					
					public boolean AttendanceWeekoffpolicyAdd(String PolicyName,String week1s,String week2s,String policystatu) throws InterruptedException {
						try {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
						policyName.sendKeys(PolicyName);
						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
						Select level2=new Select(Policystatus);
						level2.selectByVisibleText(policystatu);
						Thread.sleep(1000);
						saveButton.click();
						Thread.sleep(1000);
						return true;
						}catch(Exception e) {
							System.out.println("Unable to get the flow");
						}
						return false;
						
					}
					
					public String AttendanceWeekoffpolicyNegativeCheck(String PolicyName,String week1s,String week2s,String policystatu) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
						policyName.sendKeys(PolicyName);
						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
						Select level2=new Select(Policystatus);
						level2.selectByVisibleText(policystatu);
						Thread.sleep(1000);
						saveButton.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;
						
					}
					
					public String AttendanceWeekoffpolicyMandatoryFieldVaidation(String week1s,String week2s,String policystatu) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
//						policyName.sendKeys(PolicyName);
//						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
						Select level2=new Select(Policystatus);
						level2.selectByVisibleText(policystatu);
						Thread.sleep(1000);
						saveButton.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;
					}
					
					
					public String AttendanceWeekoffpolicyStatusMandatoryFieldVaidation(String PolicyName,String week1s,String week2s) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
						policyName.sendKeys(PolicyName);
						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
//						Select level2=new Select(Policystatus);
//						level2.selectByVisibleText(policystatu);
//						Thread.sleep(1000);
						saveButton.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;
					}
					
					
					public String positionCenterDuplicateCheck(String PolicyName,String week1s,String week2s,String policystatu) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
						policyName.sendKeys(PolicyName);
						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
						Select level2=new Select(Policystatus);
						level2.selectByVisibleText(policystatu);
						Thread.sleep(1000);
						saveButton.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;
					}
					
					public boolean verifyPositionCenterResetButton(String PolicyName,String week1s,String week2s,String policystatu) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						AddBtn.click();
						Thread.sleep(1000);
						policyName.sendKeys(PolicyName);
						Thread.sleep(1000);
						Select level=new Select(week1);
						level.selectByVisibleText(week1s);
						Thread.sleep(1000);
						Select level1=new Select(week2);
						level1.selectByVisibleText(week2s);
						Thread.sleep(1000);
						boolean selectType = Halfdaycheckbox1.isSelected();
						
						//performing click operation only if element is not selected
						if(selectType == false) {
							Halfdaycheckbox1.click();
						}
						Thread.sleep(1000);
						
	                   boolean selectType1 = Halfdaycheckbox2.isSelected();
						//performing click operation only if element is not selected
						if(selectType1 == false) {
							Halfdaycheckbox2.click();
						}
						Thread.sleep(1000);
						Select level2=new Select(Policystatus);
						level2.selectByVisibleText(policystatu);
						Thread.sleep(1000);
						resetButton.click();
						Thread.sleep(1000);
						return true;
						
					}
					
					public boolean isnextbuttonPaginationVisible() throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						
						
						boolean flag = false;
				        try {
				            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
				            if (element.isDisplayed() || element.isEnabled())
//				                flag = false;
				                nextButton.click();
				            System.out.println("next button visible");
				        } catch (NoSuchElementException e) {
//				            flag = true;
				            System.out.println("next button not visible");
				        } 
				        return flag;
						
					}
					
					public Boolean searchAttendanceWeekoffPolicypagination(String search,String searchpointvalue) throws InterruptedException {
						try {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						searchBox.sendKeys(search);
						Thread.sleep(1000);
						List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
						for(WebElement e:searchvalue) {
							String searchvalues=e.getText();
							System.out.println(searchvalues);
							Thread.sleep(1000);
							
							if(searchvalues.equals(searchpointvalue)) {
								//System.out.println(searchvalues);
								System.out.println("sucessfully searched : "+searchvalues);
								return true;
							}
							
							else {
								System.out.println("value not correct");	
								return false;
							}
						}

						return true;
						}catch(Exception e) {
							System.out.println("Unable to get the flow");
						}
						return false;
						
						
					}
					
					public String searchAttendanceWeekOFFPolicyEdit(String search,String editName) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						attendance.click();
						Thread.sleep(1000);
						weekoffpolicy.click();
						Thread.sleep(1000);
						searchBox.sendKeys(search);
						Thread.sleep(1000);
						List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
						for(WebElement e:searchvalue) {
							String searchvalues=e.getText();
							System.out.println(searchvalues);
						}
						EditBtn.click();
						Thread.sleep(1000);
						policyName.clear();
						policyName.sendKeys(editName);
						Thread.sleep(1000);
						UpdateBtn.click();
						String value=duplicateCheck.getText(); 
						return value;
						
						
					}
					
	
}
