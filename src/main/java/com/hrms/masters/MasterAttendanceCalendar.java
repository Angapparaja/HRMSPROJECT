package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceCalendar extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
			//CalendarElement
			@FindBy(xpath="//span[@id='calenderElement']")
			WebElement CalendarElement;
			
			//CalendarADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement AddCalendarElement;	
			
			//CalendarDayDescription
			@FindBy(xpath="//*[@id='dayDescriptionId']")
			WebElement SelectDayDescription;
			
			//Calendar TimeElement
			@FindBy(xpath="//*[@id='worktimeElementId']")
			WebElement SelectTimeElement;
			
			//Calender Description
			@FindBy(xpath="//*[@id='description']")
			WebElement CalendarDescription;
			
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
			
			public MasterAttendanceCalendar() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addCalendarElement(String daydescription,String timeelement,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public String CalendarElementNegativeCheck(String daydescription,String timeelement,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String CalendarElementDaydescriptionMandatoryFieldCheck(String timeelement,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
//				Select DayDescriptions=new Select(SelectDayDescription);
//				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String CalendarElementTimeElementMandatoryFieldCheck(String daydescription,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
//				Select SelectTime=new Select(SelectTimeElement);
//				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			public String CalendarElementCalendarMandatoryFieldCheck(String daydescription,String timeelement) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
//				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String addCalenderDuplicateCheck(String daydescription,String timeelement,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
			}
			
			public boolean resetbuttonvalidation(String daydescription,String timeelement,String calendar) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				AddCalendarElement.click();
				Thread.sleep(1500);
				Select DayDescriptions=new Select(SelectDayDescription);
				DayDescriptions.selectByVisibleText(daydescription);
				Thread.sleep(1500);
				
				Select SelectTime=new Select(SelectTimeElement);
				SelectTime.selectByVisibleText(timeelement);
				Thread.sleep(1500);
				CalendarDescription.sendKeys(calendar);

				resetButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				
				
				boolean flag = false;
		        try {
		            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
		            if (element.isDisplayed() || element.isEnabled())
//		                flag = false;
		                nextButton.click();
		            System.out.println("next button visible");
		        } catch (NoSuchElementException e) {
//		            flag = true;
		            System.out.println("next button not visible");
		        } 
		        return flag;
				
			}
			
			public Boolean searchCalenderNamepagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				CalendarElement.click();
				Thread.sleep(1500);
				searchBox.sendKeys(search);
				Thread.sleep(1500);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}
}
