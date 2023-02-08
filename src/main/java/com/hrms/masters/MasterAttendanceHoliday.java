package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceHoliday extends TestBase{

	
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
	        //Holiday
			@FindBy(xpath ="//span[@id='holidaydetails']")
			WebElement holiday;
			
			//HoliDayADD
			@FindBy(xpath = "//*[@id='swap']")
			WebElement AddHoliDay;	
			
			//HolidayName
			@FindBy(xpath ="//input[@id='holidayName']")
			WebElement HolidayName;
			
			//DayDescription
			@FindBy(xpath="//*[@id='datDesId']")
			WebElement DayDescription;
			
		    //Recurring
			@FindBy(xpath="(//span[@class='checkmark'])[1]")
			WebElement Recurring;
			
			//selectMonth
			@FindBy(xpath="//*[@id='month']")
			WebElement SelectMonth;
			
			//HoliDayDateCalender
			@FindBy(xpath="//input[@id='holidayDate']")
			WebElement HoliDayDatecalender;
			
			//HolidayMonth
			@FindBy(xpath="//*[@data-handler='selectMonth']")
			WebElement HolidayMonth;
			
			//HolidayDate
			@FindBy(xpath="//*[@id='day']")
			WebElement selectDate;
			
			//HolidayDate
			@FindBy(xpath="(//a[text()='25'])[2]")
			WebElement HolidayDate;
			
			//HolidayTypeRadioBtn1
			@FindBy(xpath="(//span[@class='checkmark'])[2]")
			WebElement HolidayTypebtn1;
			
			//HolidayTypeRadioBtn2
			@FindBy(xpath="(//span[@class='checkmark'])[3]")
			WebElement HolidayTypebtn2;
			
			//WORKLOCATION
			@FindBy(xpath="//*[@id='campusId']")
			WebElement Worklocation;
			
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
			
			public MasterAttendanceHoliday() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addHolidayTypeAll(String Holiday,String Daydescription,String selectmonth,String selectdate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
				AddHoliDay.click();
				Thread.sleep(500);
				HolidayName.sendKeys(Holiday);
				Thread.sleep(500);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(1000);
				boolean isSelected = Recurring.isSelected();
				if(isSelected == false) {
					Recurring.click();
				}
				Thread.sleep(500);
				
				Select Selectmonth=new Select(SelectMonth);
				Selectmonth.selectByVisibleText(selectmonth);
				
				Select Selectdate=new Select(selectDate);
				Selectdate.selectByVisibleText(selectdate);
				
//				HoliDayDatecalender.click();
//				Select HolidayMonths=new Select(HolidayMonth);
//				HolidayMonths.selectByVisibleText("Sep");
//				Thread.sleep(1000);
	//			HolidayDate.click();
				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn1.click();
				}
				Thread.sleep(500);
				saveButton.click();
			
				return true;
				
			}
			
			public boolean addHolidayTypeRegional(String Holiday,String Daydescription,String monthvalue,String datevalue,String worklocation) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
				AddHoliDay.click();
				Thread.sleep(500);
				HolidayName.sendKeys(Holiday);
				Thread.sleep(500);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(1000);
				
				
				
				boolean isSelected = Recurring.isSelected();
				if(isSelected == false) {
					Recurring.click();
				}
				Thread.sleep(1000);
				
				Select Selectmonth=new Select(SelectMonth);
				Selectmonth.selectByVisibleText("8");
				
				Select Selectdate=new Select(selectDate);
				Selectdate.selectByVisibleText("16");
				
//				HoliDayDatecalender.click();
//				Select HolidayMonths=new Select(HolidayMonth);
//				HolidayMonths.selectByVisibleText(monthvalue);
//				Thread.sleep(1000);
//				WebElement date=driver.findElement(By.xpath("(//a[text()='"+datevalue+"'])[1]"));
//				date.click();
				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn2.click();
				}
				Thread.sleep(500);
				Select SelectWork=new Select(Worklocation);
				SelectWork.selectByVisibleText(worklocation);
				Thread.sleep(500);
				saveButton.click();
			
				return true;
				
			}
			
			
			public String HolidayTypeAllHolidayNameNegativeCheck(String Holiday,String Daydescription,String selectmonth,String selectdate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
				AddHoliDay.click();
				Thread.sleep(500);
				HolidayName.sendKeys(Holiday);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(500);
				boolean isSelected = Recurring.isSelected();
				if(isSelected == false) {
					Recurring.click();
				}
				Thread.sleep(500);
				
				Select Selectmonth=new Select(SelectMonth);
				Selectmonth.selectByVisibleText(selectmonth);
				Thread.sleep(500);
				Select Selectdate=new Select(selectDate);
				Selectdate.selectByVisibleText(selectdate);

				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn1.click();
				}
				Thread.sleep(500);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
			}
			
			public String addHolidayDuplicateCheck(String Holiday,String Daydescription,String monthvalue,String datevalue,String worklocation) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(1000);
				AddHoliDay.click();
				Thread.sleep(1000);
				HolidayName.sendKeys(Holiday);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(1000);

				
				HoliDayDatecalender.click();
				Select HolidayMonths=new Select(HolidayMonth);
				HolidayMonths.selectByVisibleText(monthvalue);
				Thread.sleep(1000);
				WebElement date=driver.findElement(By.xpath("(//a[text()='"+datevalue+"'])[1]"));
				date.click();
				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn2.click();
				}
				
				Select SelectWork=new Select(Worklocation);
				SelectWork.selectByVisibleText(worklocation);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
			}
			
			public String HolidayTypeAllHolidayFieldMandatoryCheck(String Daydescription,String selectmonth,String selectdate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
				AddHoliDay.click();
				Thread.sleep(500);
//				HolidayName.sendKeys(Holiday);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(500);
				boolean isSelected = Recurring.isSelected();
				if(isSelected == false) {
					Recurring.click();
				}
				Thread.sleep(500);
				
				Select Selectmonth=new Select(SelectMonth);
				Selectmonth.selectByVisibleText(selectmonth);
				
				Select Selectdate=new Select(selectDate);
				Selectdate.selectByVisibleText(selectdate);

				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn1.click();
				}
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
			}
			
			public String HolidayTypeRegionalDaydescriptionFieldMandatoryCheck(String Holiday,String monthvalue,String datevalue,String worklocation) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
				AddHoliDay.click();
				Thread.sleep(500);
				HolidayName.sendKeys(Holiday);
//				Select DayDescriptions=new Select(DayDescription);
//				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(1000);

				
//				HoliDayDatecalender.click();
//				Select HolidayMonths=new Select(HolidayMonth);
//				HolidayMonths.selectByVisibleText(monthvalue);
//				Thread.sleep(1000);
//				WebElement date=driver.findElement(By.xpath("(//a[text()='"+datevalue+"'])[1]"));
//				date.click();
				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn2.click();
				}
				
				Select SelectWork=new Select(Worklocation);
				SelectWork.selectByVisibleText(worklocation);
				saveButton.click();
				Thread.sleep(500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public boolean resetbuttonvalidation(String Holiday,String Daydescription,String selectmonth,String selectdate) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(1000);
				AddHoliDay.click();
				Thread.sleep(1000);
				HolidayName.sendKeys(Holiday);
				Select DayDescriptions=new Select(DayDescription);
				DayDescriptions.selectByVisibleText(Daydescription);
				Thread.sleep(1000);
				boolean isSelected = Recurring.isSelected();
				if(isSelected == false) {
					Recurring.click();
				}
				Thread.sleep(1000);
				
				Select Selectmonth=new Select(SelectMonth);
				Selectmonth.selectByVisibleText(selectmonth);
				
				Select Selectdate=new Select(selectDate);
				Selectdate.selectByVisibleText(selectdate);
				
//				HoliDayDatecalender.click();
//				Select HolidayMonths=new Select(HolidayMonth);
//				HolidayMonths.selectByVisibleText("Sep");
//				Thread.sleep(1000);
	//			HolidayDate.click();
				
				boolean selectType = HolidayTypebtn1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					HolidayTypebtn1.click();
				}
				resetButton.click();
				Thread.sleep(1000);
				return true;
				
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(1000);
				
				
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
			public Boolean searchAttendenceHolidayNamepagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				attendance.click();
				Thread.sleep(1000);
				holiday.click();
				Thread.sleep(500);
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
