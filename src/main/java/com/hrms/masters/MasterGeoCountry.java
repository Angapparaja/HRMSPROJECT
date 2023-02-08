package com.hrms.masters;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;
//import com.hrms.util.ElementUtil;

public class MasterGeoCountry extends TestBase {
		
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By countryAdd=By.xpath("//*[@id='swap']");
	
	By countryName=By.xpath("//*[@id='CountyName']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");


	public MasterGeoCountry() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addCountry(String CountryName) throws InterruptedException {
		try {
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(countryAdd, 10);
		ElementUtil.waitForElementPresense(countryName, 10);
		ElementUtil.doSendKeys(countryName, CountryName);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
		return true;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;
		
	}

	public String addCountryDuplicateCheck(String CountryName) throws InterruptedException {

		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(countryAdd, 10);
		ElementUtil.waitForElementPresense(countryName, 10);
		ElementUtil.doSendKeys(countryName, CountryName);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
		String countrynames=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return countrynames;	
	}
	
	public String addCountryNegativeCheck(String CountryName) throws InterruptedException {

		
		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(countryAdd, 10);
		ElementUtil.waitForElementPresense(countryName, 10);
		ElementUtil.doSendKeys(countryName, CountryName);
		ElementUtil.waitForElementPresenseClick(saveButton, 10);
		String countrynames=ElementUtil.waitForElementPresenseGetText(duplicateCheck, 10);
		return countrynames;

		
	}
	
	public boolean resetbuttonvalidation(String CountryName) throws InterruptedException {

		ElementUtil.doClick(masterIcon);
		ElementUtil.waitForElementPresenseClick(countryAdd, 10);
		ElementUtil.waitForElementPresense(countryName, 10);
		ElementUtil.doSendKeys(countryName, CountryName);
		ElementUtil.waitForElementPresenseClick(resetButton, 10);
		return true;
		
	}

	
	public boolean SelectCountryPagination(String CountryName) throws InterruptedException {

		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);	
		List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']//a"));
		
		int i=1;
		
		while(true) {
			
			if(driver.findElements(By.xpath("//tbody/tr/td[2][text()='"+CountryName+"']")).size()>0) {
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
	
	public boolean nextbuttonPagination() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		
		Thread.sleep(1000);	
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
                ElementUtil.waitForElementPresenseClick(nextButton, 10);
//            	ElementUtil.doClick(nextButton);

            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {

            System.out.println("Pagination button not visible");
        } 
        return flag;
		
	}

	public Boolean searchCountryNamepagination(String Country) throws InterruptedException {
		try {
		ElementUtil.doClick(masterIcon);

		ElementUtil.waitForElementPresense(searchBox, 10);
		ElementUtil.doSendKeys(searchBox, Country);
		
		List<WebElement> CountryName=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:CountryName) {
			String Countryname=e.getText();
			System.out.println(Countryname);
		}

		return true;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;
		
	}
	
}
