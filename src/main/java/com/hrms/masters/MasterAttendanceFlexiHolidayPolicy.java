package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceFlexiHolidayPolicy extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	  //ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;
	
	  //FLEXIHOLIDAYPOLICY
	@FindBy(xpath = "//span[@id='flexiHolidayPolicy']")
	WebElement FlexiHolidayPolicy;
	
	//year
	@FindBy(xpath = "//input[@name='year']")   //2022
	WebElement year;
	
	//Worklocation
		@FindBy(xpath = "//select[@id='workLocationId']")  //Alwarpt
		WebElement Worklocation;
		
		
		
		//week offpolicy
		@FindBy(xpath = "//select[@id='policyId']")  //test
		WebElement weekoffpolicy;
		
		
		//maximumNoOfHolidays
				@FindBy(xpath = "//input[@name='maximumHoliday']")  //20
				WebElement maximumNoOfHolidays;
				
				//StandardHolidays
				@FindBy(xpath = "//input[@name='standardHoliday']") //2
				WebElement standardHolidays;
				
				//Lock
				@FindBy(xpath = "(//span[@class='checkmark'])[1]")
				WebElement Lock;
				
				//publish
				@FindBy(xpath = "(//span[@class='checkmark'])[3]")
				WebElement publish;
				
				//holidayliststandard1
				@FindBy(xpath = "(//span[@class='checkmark'])[5]")
				WebElement holidayliststatndard1;
				
				//holidaylistflexi1
				@FindBy(xpath = "(//span[@class='checkmark'])[6]")
				WebElement holidaylistFlexi1;
				
				
	
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
						
						public MasterAttendanceFlexiHolidayPolicy () {
							PageFactory.initElements(driver, this);
						}
						
						public String addWorkLocatin() {
							return new String();
						}
						
						public boolean AttendanceFlexiHolidayPolicyAdd(String Year,String Worklocations,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								//performing click operation only if element is not selected
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
								 boolean selectType2 = holidayliststatndard1.isSelected();
									//performing click operation only if element is not selected
									if(selectType2 == false) {
										holidayliststatndard1.click();
									}
									Thread.sleep(1500);
									
									 boolean selectType3 = holidaylistFlexi1.isSelected();
										//performing click operation only if element is not selected
										if(selectType3 == false) {
											holidaylistFlexi1.click();
										}
										Thread.sleep(1500);
						
							saveButton.click();
							Thread.sleep(1500);
							return true;
							
						}
						
						public String AttendanceFlexiHolidayPolicyYearNegativeCheck(String Year,String Worklocations,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							//performing click operation only if element is not selected
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								//performing click operation only if element is not selected
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
//								 boolean selectType2 = holidayliststatndard1.isSelected();
//									//performing click operation only if element is not selected
//									if(selectType2 == false) {
//										holidayliststatndard1.click();
//									}
//									Thread.sleep(1500);
//									
//									 boolean selectType3 = holidaylistFlexi1.isSelected();
//										//performing click operation only if element is not selected
//										if(selectType3 == false) {
//											holidaylistFlexi1.click();
//										}
//										Thread.sleep(1500);
						
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
							
						}
						
						public String AttendanceFlexiHolidayPolicyYearMandatoryFieldVaidation(String Worklocations,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
//							year.sendKeys(Year);
//							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
//								 boolean selectType2 = holidayliststatndard1.isSelected();
//									
//									if(selectType2 == false) {
//										holidayliststatndard1.click();
//									}
//									Thread.sleep(1500);
//									
//									 boolean selectType3 = holidaylistFlexi1.isSelected();
//									
//										if(selectType3 == false) {
//											holidaylistFlexi1.click();
//										}
//										Thread.sleep(1500);
						
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						
						public String AttendanceFlexiHolidayPolicyWorkLocationMandatoryFieldVaidation(String Year,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
//							Select level=new Select(Worklocation);
//							level.selectByVisibleText(Worklocations);
//							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
//								 boolean selectType2 = holidayliststatndard1.isSelected();
//									
//									if(selectType2 == false) {
//										holidayliststatndard1.click();
//									}
//									Thread.sleep(1500);
//									
//									 boolean selectType3 = holidaylistFlexi1.isSelected();
//									
//										if(selectType3 == false) {
//											holidaylistFlexi1.click();
//										}
//										Thread.sleep(1500);
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						public String AttendanceFlexiHolidayPolicyWeekOfPolicyMandatoryFieldVaidation(String Year,String Worklocations,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
//							Select level1=new Select(weekoffpolicy);
//							level1.selectByVisibleText(WeekOffPolicy);
//							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
								 boolean selectType2 = holidayliststatndard1.isSelected();
									
									if(selectType2 == false) {
										holidayliststatndard1.click();
									}
									Thread.sleep(1500);
									
									 boolean selectType3 = holidaylistFlexi1.isSelected();
									
										if(selectType3 == false) {
											holidaylistFlexi1.click();
										}
										Thread.sleep(1500);
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						public String AttendanceFlexiHolidayPolicyMaximumNoOfHolidayMandatoryFieldVaidation(String Year,String Worklocations,String WeekOffPolicy,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
//							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
//							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
								 boolean selectType2 = holidayliststatndard1.isSelected();
									
									if(selectType2 == false) {
										holidayliststatndard1.click();
									}
									Thread.sleep(1500);
									
									 boolean selectType3 = holidaylistFlexi1.isSelected();
									
										if(selectType3 == false) {
											holidaylistFlexi1.click();
										}
										Thread.sleep(1500);
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						public String AttendanceFlexiHolidayPolicyDuplicateCheck(String Year,String Worklocations,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
								 boolean selectType2 = holidayliststatndard1.isSelected();
									
									if(selectType2 == false) {
										holidayliststatndard1.click();
									}
									Thread.sleep(1500);
									
									 boolean selectType3 = holidaylistFlexi1.isSelected();
									
										if(selectType3 == false) {
											holidaylistFlexi1.click();
										}
										Thread.sleep(1500);
							saveButton.click();
							Thread.sleep(1500);
							String value=duplicateCheck.getText(); 
							return value;
						}
						
						public boolean verifyAttendanceFlexiHolidayPolicyResetButton(String Year,String Worklocations,String WeekOffPolicy,String MaximumNoHoliday,String StandardHolidays) throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							AddBtn.click();
							Thread.sleep(1500);
							year.sendKeys(Year);
							Thread.sleep(1500);
							Select level=new Select(Worklocation);
							level.selectByVisibleText(Worklocations);
							Thread.sleep(1500);
							Select level1=new Select(weekoffpolicy);
							level1.selectByVisibleText(WeekOffPolicy);
							Thread.sleep(1500);
							maximumNoOfHolidays.sendKeys(MaximumNoHoliday);
							Thread.sleep(1500);
							
							standardHolidays.sendKeys(StandardHolidays);
							Thread.sleep(1500);
							
                            boolean selectType = Lock.isSelected();
							
							if(selectType == false) {
								Lock.click();
							}
							Thread.sleep(1500);
							
						     boolean selectType1 = publish.isSelected();
								
								if(selectType1 == false) {
									publish.click();
								}
								Thread.sleep(1500);
								
								 boolean selectType2 = holidayliststatndard1.isSelected();
									
									if(selectType2 == false) {
										holidayliststatndard1.click();
									}
									Thread.sleep(1500);
									
									 boolean selectType3 = holidaylistFlexi1.isSelected();
									
										if(selectType3 == false) {
											holidaylistFlexi1.click();
										}
										Thread.sleep(1500);
							resetButton.click();
							Thread.sleep(1500);
							return true;
							
						}
						
						public boolean isnextbuttonPaginationVisible() throws InterruptedException {
							masterIcon.click();
							Thread.sleep(1500);
							attendance.click();
							Thread.sleep(1500);
							FlexiHolidayPolicy.click();
							Thread.sleep(1500);
							
							
							boolean flag = false;
					        try {
					            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
					            if (element.isDisplayed() || element.isEnabled())
//					                flag = false;
					                nextButton.click();
					            System.out.println("next button visible");
					        } catch (NoSuchElementException e) {
//					            flag = true;
					            System.out.println("next button not visible");
					        } 
					        return flag;
							
						}
						
//						public Boolean searchAttendanceFlexiHolidayPolicypagination(String search,String searchpointvalue) throws InterruptedException {
//							masterIcon.click();
//							Thread.sleep(1500);
//							attendance.click();
//							Thread.sleep(1500);
//							weekoffpolicy.click();
//							Thread.sleep(1500);
//							searchBox.sendKeys(search);
//							Thread.sleep(1500);
//							List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
//							for(WebElement e:searchvalue) {
//								String searchvalues=e.getText();
//								System.out.println(searchvalues);
//								Thread.sleep(1500);
//								
//								if(searchvalues.equals(searchpointvalue)) {
//									//System.out.println(searchvalues);
//									System.out.println("sucessfully searched : "+searchvalues);
//									return true;
//								}
//								
//								else {
//									System.out.println("value not correct");	
//									return false;
//								}
//							}
//
//							return true;
//							
//							
//						}
//						
//						public String searchAttendanceFlexiHolidayPolicyEdit(String search,String editName) throws InterruptedException {
//							masterIcon.click();
//							Thread.sleep(1500);
//							attendance.click();
//							Thread.sleep(1500);
//							weekoffpolicy.click();
//							Thread.sleep(1500);
//							searchBox.sendKeys(search);
//							Thread.sleep(1500);
//							List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
//							for(WebElement e:searchvalue) {
//								String searchvalues=e.getText();
//								System.out.println(searchvalues);
//							}
//							EditBtn.click();
//							Thread.sleep(1500);
//							policyName.clear();
//							policyName.sendKeys(editName);
//							Thread.sleep(1500);
//							UpdateBtn.click();
//							String value=duplicateCheck.getText(); 
//							return value;
//							
//							
//						}
						
	
}
