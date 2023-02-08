package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterAttendanceFlexiHolidayChange extends TestBase{
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	  //ATTENDANCE
	@FindBy(xpath = "//*[text()='ATTENDANCE']")
	WebElement attendance;
	
	//FlexiHolidayChange
	@FindBy(xpath="//span[@id='flexiHoliday']")
	WebElement HolidayChange;
	
	//EmployeeCode/Name
	@FindBy(xpath="//input[@name='employeecode']")
	WebElement EmployeeCode;
	
	//year
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	//show
	@FindBy(xpath="//button[text()='Show']")
	WebElement show;
	
	//next button
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	
	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;
	
	//HolidayList
	@FindBy(xpath="(//div[@class='col-6'])[2]/div[text()]")
	WebElement HolidayList;
	
	public MasterAttendanceFlexiHolidayChange() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean AttendanceFlexiHolidayChangeAdd(String EmployeeCodes,String years) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1500);
		attendance.click();
		Thread.sleep(1500);
		HolidayChange.click();
		Thread.sleep(1500);
		EmployeeCode.sendKeys(EmployeeCodes);
		Thread.sleep(1500);
		year.sendKeys(years);
		Thread.sleep(1500);
		Select level=new Select(year);
		level.selectByVisibleText(years);
		Thread.sleep(1500);
		show.click();
		Thread.sleep(1500);
		return true;
		
	}
	
	public String AttendanceFlexiHolidayChangeCheckHolidays(String EmployeeCodes,String years) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1500);
		attendance.click();
		Thread.sleep(1500);
		HolidayChange.click();
		Thread.sleep(1500);
		EmployeeCode.sendKeys(EmployeeCodes);
		Thread.sleep(1500);
		year.sendKeys(years);
		Thread.sleep(1500);
		Select level=new Select(year);
		level.selectByVisibleText(years);
		Thread.sleep(1500);
		show.click();
		Thread.sleep(1500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("((//div[@class='col-6'])[2]/div[text()])[1]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
			return searchvalues;
		}
		//String value=duplicateCheck.getText(); 
		return null;
		
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1500);
		attendance.click();
		Thread.sleep(1500);
		HolidayChange.click();
		Thread.sleep(1500);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("next button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("next button not visible");
        } 
        return flag;
		
	}
}
