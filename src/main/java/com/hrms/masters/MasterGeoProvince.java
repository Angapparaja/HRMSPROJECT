package com.hrms.masters;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterGeoProvince extends TestBase {
	
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	By geography=By.xpath("//*[@id='geography']");
	By province=By.xpath("//span[@id='state']");
	By stateADD=By.xpath("//*[@id='swap']");
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	By countrySelect=By.xpath("//*[@id='countryId']");
	By stateName=By.xpath("//*[@id='StateName']");
	By saveButton=By.xpath("//*[text()='Save']");
	By resetButton=By.xpath("//*[text()='Reset']");
	By stateMandatory=By.xpath("//*[text()='Please enter Province']");
	By countryMandatory=By.xpath("//*[text()='Please select country']");
	By nextButton=By.xpath("//*[text()='Next']");
	By searchBox=By.xpath("//input[@type='search']");

		

		
	public MasterGeoProvince() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addSate(String CountryName,String stateNames) throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(1000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresense(countrySelect, 10);
		ElementUtil.doSelectByVisibleText(countrySelect, CountryName);
		ElementUtil.waitForElementPresense(stateName, 10);
		ElementUtil.doSendKeys(stateName, stateNames);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
		return true;	
	}
	
	public String addSateNegativeValueCheck(String Country,String state) throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(1000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresense(countrySelect, 10);
		ElementUtil.doSelectByVisibleText(countrySelect, Country);
		ElementUtil.waitForElementPresense(stateName, 10);
		ElementUtil.doSendKeys(stateName, state);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
		String duplicatenames=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return duplicatenames;
		
	}
	
	public String addCountryMandatoryFieldVaidation() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(1000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
//		String CountryName=ElementUtil.doGetText(countryMandatory);
//		return CountryName;
		String duplicatenames=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return duplicatenames;
		
	}
	
	
	public String addSateMandatoryFieldVaidation(String Country) throws InterruptedException {
	
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(2000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresense(countrySelect, 10);
		ElementUtil.doSelectByVisibleText(countrySelect,Country);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
//		String mandatorystateField=ElementUtil.doGetText(duplicateCheck);
//		return mandatorystateField;
		
		String Toastmsg=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return Toastmsg;
	}
	
	
	
	public String addSateDuplicateCheckValidation(String CountryName,String stateNames) throws InterruptedException {		
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(2000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresense(countrySelect, 10);
		ElementUtil.doSelectByVisibleText(countrySelect, CountryName);
		ElementUtil.waitForElementPresense(stateName, 10);
		ElementUtil.getElement(stateName).clear();
		Thread.sleep(2000);
		ElementUtil.doSendKeys(stateName, stateNames);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
//		String DuplicatestateField=ElementUtil.doGetText(duplicateCheck);
//		return DuplicatestateField;
		
		String Toastmsg=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return Toastmsg;
	}
	
	public boolean addSateResetButton(String CountryName,String stateNames) throws InterruptedException {
		
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		Thread.sleep(2000);
		ElementUtil.waitForElementPresenseClick(stateADD, 10);
		ElementUtil.waitForElementPresense(countrySelect, 10);
		ElementUtil.doSelectByVisibleText(countrySelect, CountryName);
		ElementUtil.waitForElementPresense(stateName, 10);
		ElementUtil.doSendKeys(stateName, stateNames);
		ElementUtil.waitForElementPresenseClick(resetButton, 10);
		return true;
		
	}
	
	
	public boolean SelectCountryPagination() throws InterruptedException {
		
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']//a"));
		
		int i=1;
		
		while(true) {
			if(driver.findElements(By.xpath("//tbody/tr/td[2][text()='India']")).size()>0) {
				List<WebElement> Country=driver.findElements(By.xpath("//tbody/tr/td[2][text()='India']"));
				for(WebElement e:Country) {
					String Countryname=e.getText();
					System.out.println(Countryname);
				}
				break;
			}else {
				try {
					pages.get(i).click();
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("pagination is overand we didnt find any contact...");
					break;
				}
				pages=driver.findElements(By.xpath("//ul[@class='pagination']//a"));
			}
			i++;
		}
 		

		Thread.sleep(500);
		return true;
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {

		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.waitForElementPresenseClick(province, 10);
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
            	ElementUtil.waitForElementPresenseClick(nextButton, 10);
          System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return flag;
	
		
		
	}

	public Boolean searchboxCountryNamepagination(String searchname) throws InterruptedException {
		
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(province, 10);
		ElementUtil.waitForElementPresense(searchBox, 10);
		Thread.sleep(1500);
		ElementUtil.doSendKeys(searchBox, searchname);
		Thread.sleep(1500);
		List<WebElement> ProvinceName=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:ProvinceName) {
			String Provincename=e.getText();
			System.out.println(Provincename);
		}

		return true;
		
		
	}
	
	
}
