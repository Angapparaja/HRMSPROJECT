package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterAttendanceDailyRateComponent extends TestBase {

	

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	        //ATTENDANCE
			@FindBy(xpath = "//*[text()='ATTENDANCE']")
			WebElement attendance;
			
			//DailyRateComponent
			@FindBy(xpath="//span[@id='dailyRateComponant']")
			WebElement dailyRateComponent;
			
			//MonthlyComponentcheckbox2
			@FindBy(xpath="(//span[@class='checkmark'])[2]")
			WebElement MonthlyComponent2;
			
			//clickUpdate
			@FindBy(xpath="//button[text()='Update']")
			WebElement Update;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			public MasterAttendanceDailyRateComponent() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean UpdateRateComponent() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				dailyRateComponent.click();
				Thread.sleep(1500);
              boolean selectType = MonthlyComponent2.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					MonthlyComponent2.click();
				}
				Thread.sleep(3000);
				Update.click();
				return false;
				
			}
			
			public boolean resetbuttonvalidation() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				dailyRateComponent.click();
				Thread.sleep(1500);
              boolean selectType = MonthlyComponent2.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					MonthlyComponent2.click();
				}
				Thread.sleep(1500);
				resetButton.click();
				Thread.sleep(1500);
				return false;
				
			}
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				attendance.click();
				Thread.sleep(1500);
				dailyRateComponent.click();
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
}

