package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPositionMarketDesignation extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Position
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement position;

	//Market Designation
		@FindBy(xpath = "//*[text()='Market Designation']")
		WebElement marketDesignation;

		//Add Market Designation 
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addmarketDesignation;
		
		//Market Designation Name
		@FindBy(xpath = "//*[@id='mktDesigName']")
		WebElement marketDesignationName;
				
				
		//save button
		@FindBy(xpath = "//*[text()='Save']")
		WebElement saveButton;
		
		//reset button
		@FindBy(xpath = "//*[text()='Reset']")
		WebElement resetButton;
					
		//duplicate Check
		//	@FindBy(xpath = "//*[text()='toast-container']")
			@FindBy(xpath="//div[@class='toast-message']")
			WebElement duplicateCheck;
		
		//Market Designation NameMandatory
		@FindBy(xpath = "//*[text()='Please enter Market Designation Name']")
		WebElement marketDesignationNameMandatory;
				

		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionMarketDesignation() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addmarketDesignation(String marketDesgination) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		addmarketDesignation.click();
		Thread.sleep(500);
		marketDesignationName.sendKeys(marketDesgination);
		
		saveButton.click();
		
		return true;
		
	}
	
	public String addmarketDesignationNegativeCheck(String marketDesgination) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		addmarketDesignation.click();
		Thread.sleep(500);
		marketDesignationName.sendKeys(marketDesgination);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	public String addmarketDesignationMandatoryValidation() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		addmarketDesignation.click();
		Thread.sleep(500);
		//marketDesignationName.sendKeys("Market Supervisor");
		//Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String addmarketDesignationDuplicateCheck(String marget) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		addmarketDesignation.click();
		Thread.sleep(500);
		marketDesignationName.sendKeys(marget);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public boolean verifyResetButton(String marget) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		addmarketDesignation.click();
		Thread.sleep(500);
		marketDesignationName.sendKeys(marget);
		Thread.sleep(500);
		
		resetButton.click();
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
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
	public Boolean searchPositionMarketDesigntionPagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		marketDesignation.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(500);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
	
}
