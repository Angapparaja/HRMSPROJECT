package com.hrms.masters;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterGeoWorklocation extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//geography
//			@FindBy(xpath = "//*[@id='geography']")
//			WebElement geography;

	//workLocation 
//		@FindBy(xpath = "//*[@id='workLocation']")
//		WebElement workLocation;

		//workLocationADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement workLocationADD;
		
		//workLocation Code
//		@FindBy(xpath = "//*[@id='workLocationCode']")
//		WebElement workLocationCode;
		
		
		//workLocationName
//		@FindBy(xpath = "//*[@id='workLocationName']")
//		WebElement workLocationName;
				
		
		//save button
//		@FindBy(xpath = "//*[text()='Save']")
//		WebElement saveButton;
		
		//reset button
//		@FindBy(xpath = "//*[text()='Reset']")
//		WebElement resetButton;
					
		//duplicate Check
				//	@FindBy(xpath = "//*[text()='toast-container']")
//					@FindBy(xpath="//div[@class='toast-message']")
//					WebElement duplicateCheck;
		
		//workLocationCode Mandatory
//		@FindBy(xpath = "//*[text()='Enter work Location Code']")
//		WebElement workLocationCodeMandatory;
				
		
		//workLocationName Mandatory
//		@FindBy(xpath = "//*[text()='Enter Work Location Name']")
//		WebElement workLocationNameMandatory;
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By geography=By.xpath("//*[@id='geography']");
	
	By workLocation=By.xpath("//*[@id='workLocation']");
	
	By workLocationADD=By.xpath("//*[@id='swap']");
	
	By workLocationCode=By.xpath("//*[@id='workLocationCode']");
	
	By workLocationName=By.xpath("//*[@id='workLocationName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By workLocationCodeMandatory=By.xpath("//*[text()='Enter work Location Code']");
	
	By workLocationNameMandatory=By.xpath("//*[text()='Enter Work Location Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	  By countrySelect=By.xpath("//*[@id='countryId']");

		By cityName=By.xpath("//*[@id='cityId']");
		
		By stateSelect=By.xpath("//*[@id='stateId']");
		By AreaName=By.xpath("//*[@id='barengay']");

		
	public MasterGeoWorklocation() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public void addworkLocation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
//		workLocationADD.click();
//		Thread.sleep(1500);
//		workLocationCode.sendKeys("Location1");
//		workLocationName.sendKeys("FIRST LOCATION");
//		saveButton.click();
		try {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(workLocation);
		Thread.sleep(500);
		ElementUtil.doClick(workLocationADD);
		Thread.sleep(500);
		
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Kerala");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(cityName, "Coimbatore");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(AreaName, "Tondaiyarpet");
		
		ElementUtil.doSendKeys(workLocationCode, "Location1");
	
		ElementUtil.doSendKeys(workLocationName, "FIRST LOCATION");
		
		ElementUtil.doClick(saveButton);
		
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		
	}
	
	public String addworkLocationCountryMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
//		workLocationADD.click();
		//workLocationCode.sendKeys("ABCED");
//		workLocationName.sendKeys("TEST2 LOCATION");
//		Thread.sleep(1500);
//		saveButton.click();
//		Thread.sleep(1500);
//		String workLocationCodeMandatoryFieldVaidation = duplicateCheck.getText();
//		return workLocationCodeMandatoryFieldVaidation;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(workLocation);
		Thread.sleep(500);
		ElementUtil.doClick(workLocationADD);
		Thread.sleep(500);
		
//		ElementUtil.doSelectByVisibleText(countrySelect,"India");
//		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(stateSelect,"Tamilnadu");
//		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(cityName,"Chennai");
//		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(AreaName,"Mylapore");
//		
//		ElementUtil.doSendKeys(workLocationName, "TEST2 LOCATION");
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String workLocationCodeMandatoryFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return workLocationCodeMandatoryFieldVaidation;

		
	}
	
	
	public String addworkLocationStateNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
//		workLocationADD.click();
//		Thread.sleep(1500);
//		workLocationCode.sendKeys("ABCED");
//		Thread.sleep(1500);
		//workLocationName.sendKeys("TEST LOCATION");
//		saveButton.click();
//		Thread.sleep(1500);
//		String workLocationNameMandatoryFieldVaidation = duplicateCheck.getText();
//		return workLocationNameMandatoryFieldVaidation;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(workLocation);
		Thread.sleep(500);
		ElementUtil.doClick(workLocationADD);
		Thread.sleep(500);
		
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(stateSelect,"Tamilnadu");
//		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(cityName,"Chennai");
//		Thread.sleep(500);
//		ElementUtil.doSelectByVisibleText(AreaName,"Mylapore");
//		
//		ElementUtil.doSendKeys(workLocationName, "TEST2 LOCATION");
//		ElementUtil.doSendKeys(workLocationCode, "ABCED");
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String workLocationNameMandatoryFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return workLocationNameMandatoryFieldVaidation;			
	}
	
	
	public String addworkLocationDuplicateCheckValidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
//		workLocationADD.click();
//		Thread.sleep(1500);
//		workLocationCode.sendKeys("ABCED");
//		Thread.sleep(1500);
//		workLocationName.sendKeys("TEST LOCATION");
//		Thread.sleep(1500);
//		saveButton.click();
//		Thread.sleep(1500);
//		String workLocationDuplicateCheckValidation = duplicateCheck.getText();
//		Thread.sleep(1500);
//		return workLocationDuplicateCheckValidation;
		try {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1500);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(workLocation);
		Thread.sleep(1000);
		ElementUtil.doClick(workLocationADD);
		Thread.sleep(1000);

		ElementUtil.doSelectByVisibleText(countrySelect, "India");
		Thread.sleep(1000);
		ElementUtil.doSelectByIndex(stateSelect, 3);
		Thread.sleep(500);
		ElementUtil.doSelectByIndex(cityName, 1);
		Thread.sleep(500);
		ElementUtil.doSelectByIndex(AreaName, 1);
		
		ElementUtil.doSendKeys(workLocationCode, "Location1");
	
		ElementUtil.doSendKeys(workLocationName, "FIRST LOCATION");
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(1000);

		String workLocationDuplicateCheckValidation=ElementUtil.doGetText(duplicateCheck);
		return workLocationDuplicateCheckValidation;	
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return null;
	}
	
	public boolean addworkLocationResetButton() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
//		workLocationADD.click();
//		Thread.sleep(1500);
//		workLocationCode.sendKeys("ABCED");
//		Thread.sleep(1500);
//		workLocationName.sendKeys("TEST LOCATION");
//		Thread.sleep(1500);
//		resetButton.click();
//		Thread.sleep(1500);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(workLocation);
		Thread.sleep(500);
		ElementUtil.doClick(workLocationADD);
		
		ElementUtil.doSendKeys(workLocationCode, "ABCED");
		
		ElementUtil.doSendKeys(workLocationName,"TEST LOCATION");
		
		ElementUtil.doClick(resetButton);
		Thread.sleep(500);

		return true;
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(workLocation);
		Thread.sleep(500);
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		workLocation.click();
//		Thread.sleep(1500);
		
		
		
        try {
            WebElement element = ElementUtil.getElement(nextButton);
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return true;
	
		
		
	}
	
	
}
