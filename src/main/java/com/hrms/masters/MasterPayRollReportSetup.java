package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayRollReportSetup extends TestBase{
	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		//PayRollMenu
		@FindBy(xpath="//span[@id='pay_font']")
		WebElement PayRoll;
		
		//Report Setup Link 
		@FindBy(xpath="//span[@id='ReportSetup']")
		WebElement ReportSetup;
		
		//ADDReportMaster
		@FindBy(xpath = "//*[@id='swap']")
		WebElement AddReportsetup;	
		
		//SelectReportName
		@FindBy(xpath="//*[@id='report_name']")
		WebElement ReportName;
		
		
		//SelectColumnName
		@FindBy(xpath="//*[@id='column_name']")
		WebElement ColumnName;
		
		//MonthComponentCheckBox
		@FindBy(xpath="(//span[@class='checkmark'])[1]")
		WebElement MonthlyCompcheckbox1;
		
		//DefaultComponentcheckbox 1
		@FindBy(xpath="(//span[@class='checkmark'])[5]")
		WebElement DefaultCompcheckbox1;
		
		//DefaultComponentcheckbox 2
				@FindBy(xpath="(//span[@class='checkmark'])[6]")
				WebElement DefaultCompcheckbox2;
				
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
				
				//duplicate Check
				//	@FindBy(xpath = "//*[text()='toast-container']")
					@FindBy(xpath="//div[@class='toast-message']")
					WebElement duplicateCheck;
				
		
				public MasterPayRollReportSetup() {
					PageFactory.initElements(driver, this);
				}
				
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean addPayRollReportSetup(String reportnames,String ColumnNam) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					AddReportsetup.click();
					Thread.sleep(1500);
					Select ReportNames=new Select(ReportName);
					ReportNames.selectByVisibleText(reportnames);
					
					Select ColumnNames=new Select(ColumnName);
					ColumnNames.selectByVisibleText(ColumnNam);
					Thread.sleep(1500);
					boolean selectType = MonthlyCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType == false) {
						MonthlyCompcheckbox1.click();
					}
					Thread.sleep(1500);
	                boolean selectType1 = DefaultCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType1 == false) {
						DefaultCompcheckbox1.click();
					}
					Thread.sleep(1500);
                    boolean selectType2 = DefaultCompcheckbox2.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType2 == false) {
						DefaultCompcheckbox2.click();
					}
					
					
					saveButton.click();
					Thread.sleep(1500);
					return true;
					
				}
				
				
				
				
				public String addPayRollreportComponentMandatoryFieldCheck(String reportnames,String ColumnNam) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					AddReportsetup.click();
					Thread.sleep(1500);
					Select ReportNames=new Select(ReportName);
					ReportNames.selectByVisibleText(reportnames);
					
					Select ColumnNames=new Select(ColumnName);
					ColumnNames.selectByVisibleText(ColumnNam);
					Thread.sleep(1500);
//					boolean selectType = MonthlyCompcheckbox1.isSelected();
//					
//					//performing click operation only if element is not selected
//					if(selectType == false) {
//						MonthlyCompcheckbox1.click();
//					}
//					Thread.sleep(1500);
//	                boolean selectType1 = DefaultCompcheckbox1.isSelected();
//					
//					//performing click operation only if element is not selected
//					if(selectType1 == false) {
//						DefaultCompcheckbox1.click();
//					}
//					Thread.sleep(1500);
//                    boolean selectType2 = DefaultCompcheckbox2.isSelected();
//					
//					//performing click operation only if element is not selected
//					if(selectType2 == false) {
//						DefaultCompcheckbox2.click();
//					}
					
					
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				
				public String addPayRollReportSetupReportMandatoryFieldCheck(String ColumnNam) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					AddReportsetup.click();
					Thread.sleep(1500);
//					Select ReportNames=new Select(ReportName);
//					ReportNames.selectByVisibleText(reportnames);
					
					Select ColumnNames=new Select(ColumnName);
					ColumnNames.selectByVisibleText(ColumnNam);
					Thread.sleep(1500);
					boolean selectType = MonthlyCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType == false) {
						MonthlyCompcheckbox1.click();
					}
					Thread.sleep(1500);
	                boolean selectType1 = DefaultCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType1 == false) {
						DefaultCompcheckbox1.click();
					}
					Thread.sleep(1500);
                    boolean selectType2 = DefaultCompcheckbox2.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType2 == false) {
						DefaultCompcheckbox2.click();
					}
					
					
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				public String addPayRollReportSetupColumnNametMandatoryFieldCheck(String reportnames) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					AddReportsetup.click();
					Thread.sleep(1500);
					Select ReportNames=new Select(ReportName);
					ReportNames.selectByVisibleText(reportnames);
					
//					Select ColumnNames=new Select(ColumnName);
//					ColumnNames.selectByVisibleText(ColumnNam);
					Thread.sleep(1500);
					boolean selectType = MonthlyCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType == false) {
						MonthlyCompcheckbox1.click();
					}
					Thread.sleep(1500);
	                boolean selectType1 = DefaultCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType1 == false) {
						DefaultCompcheckbox1.click();
					}
					Thread.sleep(1500);
                    boolean selectType2 = DefaultCompcheckbox2.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType2 == false) {
						DefaultCompcheckbox2.click();
					}
					
					
					saveButton.click();
					Thread.sleep(1500);
					String value=duplicateCheck.getText(); 
					return value;
					
				}
				
				
				public boolean resetbuttonInMasterPayrollReportSetup(String reportnames,String ColumnNam) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					AddReportsetup.click();
					Thread.sleep(1500);
					Select ReportNames=new Select(ReportName);
					ReportNames.selectByVisibleText(reportnames);
					
					Select ColumnNames=new Select(ColumnName);
					ColumnNames.selectByVisibleText(ColumnNam);
					Thread.sleep(1500);
					boolean selectType = MonthlyCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType == false) {
						MonthlyCompcheckbox1.click();
					}
					Thread.sleep(1500);
	                boolean selectType1 = DefaultCompcheckbox1.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType1 == false) {
						DefaultCompcheckbox1.click();
					}
					Thread.sleep(1500);
                    boolean selectType2 = DefaultCompcheckbox2.isSelected();
					
					//performing click operation only if element is not selected
					if(selectType2 == false) {
						DefaultCompcheckbox2.click();
					}
					resetButton.click();
					Thread.sleep(1500);
					return true;
					
				}
				public boolean isnextbuttonPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					
					
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
				
				public Boolean searchPayrollReportNamepagination(String search) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1500);
					PayRoll.click();
					Thread.sleep(1500);
					ReportSetup.click();
					Thread.sleep(1500);
					searchBox.sendKeys(search);
					Thread.sleep(1500);
					List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
					for(WebElement e:searchvalue) {
						String searchvalues=e.getText();
						System.out.println(searchvalues);
					}

					return true;
					
					
				}
}
