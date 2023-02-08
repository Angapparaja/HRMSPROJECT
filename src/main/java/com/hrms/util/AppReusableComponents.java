package com.hrms.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.base.TestBase;

public class AppReusableComponents extends TestBase{
	
	
    /**
     * <p>
     * Allows to select option from drop down
     * for the Angular based pages
     * 
     * @param dnName 
     *      Enter the name of element
     *      
     * @param dnValue 
     *      Visible text displayed in drown down option
     */
	public static void angularDn(String dnName, String dnValue) {
		TestUtil.WaitTill_PageLoads(10);
		driver.findElement(By.name(dnName)).click();
		driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(), '" +dnValue +"')]")).click();
	}
	
    /**
     * <p>
     * Returns text of WebElement from Table when search string is passed
     * 
     * @param searchName 
     *      Enter the name of search string
     *      
     */
	public static String searchTable(String searchName) {
		return driver.findElement(By.xpath("//tbody//tr//td[contains(text(),'"+searchName+"')]")).getText();
	}
	
    /**
     * <p>
     * Clicks the record matching search String from Table
     * 
     * @param searchName 
     *      Enter the name of search string
     *      
     */
	public static void viewTable(String searchName) {
		driver.findElement(By.xpath("//tbody//tr//td[text()='"+searchName+"']//following-sibling::td//i[@title='View']")).click();
	}
	
	/**
     * <p>
     * Clicks on Edit record matching search String from Table
     * 
     * @param searchName 
     *      Enter the name of search string
     *      
     */
	public static void editTable(String searchName) {
		driver.findElement(By.xpath("//tbody//tr//td[contains(text(),'"+searchName+"')]//following-sibling::td//i[@title='Edit']")).click();
	}
	
	
	
//	public static WebElement getElement(By locator) {
//		WebElement element = driver.findElement(locator);
//		return element;
//	}
//
//
//
//	public static List<WebElement> getElements(By locator) {
//		return driver.findElements(locator);
//	}
//
//	public static void doSendKeys(By locator, String value) {
//		WebElement ele = getElement(locator);
//		ele.clear();
//		ele.sendKeys(value);
//	}
	
//	public static WebElement waitForElementPresense(By locator,int timeOut) {
//		WebDriverWait wait=new WebDriverWait(driver,timeOut);
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//	
//	public static WebElement waitForElementPresenseSelectByValue(int timeOut,By locator,String text) {
//		WebDriverWait wait=new WebDriverWait(driver,timeOut);
//		Select select = new Select(getElement(locator));
//		select.selectByValue(text);
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//	
//	
//	public static WebElement waitForElementPresenseSelectByIndex(By locator,int text,int timeOut) {
//		WebDriverWait wait=new WebDriverWait(driver,timeOut);
//		Select select = new Select(getElement(locator));
//		select.selectByIndex(text);
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//	}
//	
//	public static void isSelectedCheckBox(By locator) {
//		boolean selectedelement = getElement(locator).isSelected();
//		if(selectedelement == false) {
//			getElement(locator).click();
//		//	PersonDetailsSelectAlls.click();
//		//	ElementUtil.doClick(ProfileoverAll);
//		}
//		else if(selectedelement == true){
//			System.out.println("All checkbox are already checked");
//		}
//	}

}
