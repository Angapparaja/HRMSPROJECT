package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterPayRollJournalSetup extends TestBase{

	//MasterPage
			@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
			WebElement masterIcon;
			
			//PayRollMenu
			@FindBy(xpath="//span[@id='pay_font']")
			WebElement PayRoll;
			
			//journalSetup Link
			@FindBy(xpath="//span[@id='journalSetup']")
			WebElement JournalSetup;
			
			//SalaryComponentCheckBox2
			@FindBy(xpath="(//span[@class='checkmark'])[2]")
			WebElement SalaryCompCheckbox2;
			
			//SalaryComponentCheckBox3
			@FindBy(xpath="(//span[@class='checkmark'])[3]")
			WebElement SalaryCompCheckbox3;
			
			//AttendanceComponentCheckBox 5
			@FindBy(xpath="(//span[@class='checkmark'])[9]")
			WebElement AttCompCheckBox5;
			
			//AttendanceComponentCheckBox 6
			@FindBy(xpath="(//span[@class='checkmark'])[10]")
			WebElement AttCompCheckBox6;
			
            //LeaveComponentCheckBox1
			@FindBy(xpath="(//span[@class='checkmark'])[13]")
			WebElement LeaveCompCheckBox1;
			
			//StatutoryEmployeeCheckBox5
			@FindBy(xpath="(//span[@class='checkmark'])[16]")
			WebElement StaEmpCheckBox5;
			
//			//Statutory Employer3
//			@FindBy(xpath="(//span[@class='checkmark'])[22]")
//			WebElement StaEmpolyerCheckBox3;
//			
//			//SalaryTotalCheckBox3
//			@FindBy(xpath="(//span[@class='checkmark'])[26]")
//			WebElement SalaryTotalCheckBox3;
			
			//UpdateButton
			@FindBy(xpath="(//button[@type='submit'])[1]")
			WebElement UpdateBtn;
			
			//reset button
			@FindBy(xpath = "(//button[@type='submit'])[2]")
			WebElement resetButton;
			
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			
			//SAVE BUTTON
			@FindBy(xpath = "//button[text()='Save']")
			WebElement save;
			public MasterPayRollJournalSetup() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			public boolean UpdatePayRollJournalSetup() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				JournalSetup.click();
				Thread.sleep(1000);
				
				boolean selectType = SalaryCompCheckbox2.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					SalaryCompCheckbox2.click();
				}
				Thread.sleep(1000);
				
                boolean selectType1 = SalaryCompCheckbox3.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType1 == false) {
					SalaryCompCheckbox3.click();
				}
				Thread.sleep(1000);
                boolean selectType2 = AttCompCheckBox5.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType2 == false) {
					AttCompCheckBox5.click();
				}
				
				Thread.sleep(1000);
                boolean selectType3 = AttCompCheckBox6.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType3 == false) {
					AttCompCheckBox6.click();
				}
				Thread.sleep(1000);
                boolean selectType4 = LeaveCompCheckBox1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType4 == false) {
					LeaveCompCheckBox1.click();
				}
				Thread.sleep(1000);
                boolean selectType5 = StaEmpCheckBox5.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType5 == false) {
					StaEmpCheckBox5.click();
				}
//				Thread.sleep(1000);
//                boolean selectType6 = StaEmpolyerCheckBox3.isSelected();
//				
//				//performing click operation only if element is not selected
//				if(selectType6 == false) {
//					StaEmpolyerCheckBox3.click();
//				}
//				
//				
//				Thread.sleep(1000);
//                boolean selectType7 = SalaryTotalCheckBox3.isSelected();
//				
//				//performing click operation only if element is not selected
//				if(selectType7 == false) {
//					SalaryTotalCheckBox3.click();
//				}
				
				Thread.sleep(1000);
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(1000);
				try {
					WebElement element = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
					if (element.isDisplayed() || element.isEnabled())

						UpdateBtn.click();
					System.out.println("update button visible");
					} catch (NoSuchElementException e) {

						save.click();
					System.out.println("save button  visible");
					} 
//				save.click();
				Thread.sleep(1000);
				return true;
			
			
}
			
			public boolean ResetButtonPayRollJournalSetup() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				JournalSetup.click();
				Thread.sleep(1000);
				
				boolean selectType = SalaryCompCheckbox2.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType == false) {
					SalaryCompCheckbox2.click();
				}
				Thread.sleep(1000);
				
                boolean selectType1 = SalaryCompCheckbox3.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType1 == false) {
					SalaryCompCheckbox3.click();
				}
				Thread.sleep(1000);
                boolean selectType2 = AttCompCheckBox5.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType2 == false) {
					AttCompCheckBox5.click();
				}
				
				Thread.sleep(1000);
                boolean selectType3 = AttCompCheckBox6.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType3 == false) {
					AttCompCheckBox6.click();
				}
				Thread.sleep(1000);
                boolean selectType4 = LeaveCompCheckBox1.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType4 == false) {
					LeaveCompCheckBox1.click();
				}
				Thread.sleep(1000);
                boolean selectType5 = StaEmpCheckBox5.isSelected();
				
				//performing click operation only if element is not selected
				if(selectType5 == false) {
					StaEmpCheckBox5.click();
				}
//				Thread.sleep(1000);
//                boolean selectType6 = StaEmpolyerCheckBox3.isSelected();
//				
//				//performing click operation only if element is not selected
//				if(selectType6 == false) {
//					StaEmpolyerCheckBox3.click();
//				}
//				
//				
//				Thread.sleep(1000);
//                boolean selectType7 = SalaryTotalCheckBox3.isSelected();
//				
//				//performing click operation only if element is not selected
//				if(selectType7 == false) {
//					SalaryTotalCheckBox3.click();
//				}
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				Thread.sleep(1000);
				resetButton.click();
				Thread.sleep(1000);
				return true;
			
			
}
			
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				PayRoll.click();
				Thread.sleep(1000);
				JournalSetup.click();
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
}
