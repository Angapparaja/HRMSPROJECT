package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.base.TestBase;

public class MasterPayRollPayrollGrouping extends TestBase{
	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//PayRollMenu
	@FindBy(xpath="//span[@id='pay_font']")
	WebElement PayRoll;
	
	//PayRollGrouping
	@FindBy(xpath="//span[@id='printCategory']")
	WebElement PayRollGrouping;
	
	
//duplicate Check
//	@FindBy(xpath = "//*[text()='toast-container']")
@FindBy(xpath="//div[@class='toast-message']")
WebElement duplicateCheck;
	//ADDRollGrouping
	@FindBy(xpath = "//*[@id='swap']")
	WebElement AddRollGrouping;
	
	//PayRollGroupingTexBox
	@FindBy(xpath ="//input[@id='printCatName']")
	WebElement PayRollGroupingTexBox;
	
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
	
	public MasterPayRollPayrollGrouping() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	public boolean addPayrollGrouping(String PayrollGrouping) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
		Thread.sleep(1000);
		AddRollGrouping.click();
		Thread.sleep(500);
		PayRollGroupingTexBox.sendKeys(PayrollGrouping);
		Thread.sleep(500);
		saveButton.click();
	
		return true;
		
	}
	
	
	public String PayrollGroupingMandatoryFieldCheck() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
		Thread.sleep(1000);
		AddRollGrouping.click();
		Thread.sleep(500);
//		PayRollGroupingTexBox.sendKeys(PayrollGrouping);
//		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	
	public String PayrollGroupingDuplicateCheck(String PayrollGrouping) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
		Thread.sleep(500);
		AddRollGrouping.click();
		Thread.sleep(500);
		PayRollGroupingTexBox.sendKeys(PayrollGrouping);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public boolean ResetBtnPayrollGrouping(String PayrollGrouping) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
		Thread.sleep(500);
		AddRollGrouping.click();
		Thread.sleep(500);
		PayRollGroupingTexBox.sendKeys(PayrollGrouping);
		Thread.sleep(1000);
		resetButton.click();
		
		return true;
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
		Thread.sleep(1000);
		
		
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
	
	public Boolean searchPayrollGroupingNamepagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		PayRollGrouping.click();
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
