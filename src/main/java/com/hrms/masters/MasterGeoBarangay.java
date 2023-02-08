package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterGeoBarangay extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//geography
//			@FindBy(xpath = "//*[@id='geography']")
//			WebElement geography;

	//barangay 
//		@FindBy(xpath = "//*[@id='barangay']")
//		WebElement barangay;

		//barangay ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement barangayADD;
		
		//Country select
//		@FindBy(xpath = "//*[@id='countryId']")
//		WebElement countrySelect;
		
		
		//State select
//		@FindBy(xpath = "//*[@id='stateId']")
//		WebElement stateSelect;
				
		//city select
//		@FindBy(xpath = "//*[@id='cityId']")
//		WebElement citySelect;
		
		//Barangay Name
//		@FindBy(xpath = "//*[@id='BarangayName']")
//		WebElement barangayName;
						
		//zip code 
//		@FindBy(xpath = "//*[@id='zipcode']")
//		WebElement zipCode;
				
		//save button
//		@FindBy(xpath = "//*[text()='Save']")
//		WebElement saveButton;
		
		//reset button
//		@FindBy(xpath = "//*[text()='Reset']")
//		WebElement resetButton;
					
		//duplicate Check
		//	@FindBy(xpath = "//*[text()='toast-container']")
//			@FindBy(xpath="//div[@class='toast-message']")
//			WebElement duplicateCheck;
		
		//state Mandatory
//		@FindBy(xpath = "//*[text()='Please select province']")
//		WebElement stateMandatory;
				
		
		//State Mandatory
//		@FindBy(xpath = "//*[text()='Please select country']")
//		WebElement countryMandatory;
				
		//city Mandatory
//		@FindBy(xpath = "//*[text()='Please select city']")
//		WebElement cityMandatory;
		
		//Barangay Mandatory
//		@FindBy(xpath = "//*[text()='Enter Barangay Name']")
//		WebElement barangayMandatory;
		
		//zip code Mandatory
//		@FindBy(xpath = "//*[text()='Enter ZipCode']")
//		WebElement zipcodeMandatory;
		
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By geography=By.xpath("//*[@id='geography']");
	
	By barangay=By.xpath("//*[@id='barangay']");
	
	By barangayADD=By.xpath("//*[@id='swap']");
	
	By countrySelect=By.xpath("//*[@id='countryId']");
	
	By stateSelect=By.xpath("//*[@id='stateId']");
	
	By citySelect=By.xpath("//*[@id='cityId']");
	
	By barangayName=By.xpath("//*[@id='BarangayName']");
	
	By zipCode=By.xpath("//*[@id='zipcode']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By stateMandatory=By.xpath("//*[text()='Please select province']");
	
	By countryMandatory=By.xpath("//*[text()='Please select country']");
	
	By cityMandatory=By.xpath("//*[text()='Please select city']");
	
	By barangayMandatory=By.xpath("//*[text()='Enter Barangay Name']");
	
	By zipcodeMandatory=By.xpath("//*[text()='Enter ZipCode']");
	
	By nextButton=By.xpath("//*[text()='Next']");


		
	public MasterGeoBarangay() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addBrangay() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
//		barangayADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Thread.sleep(1500);
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Karnataka");
//		Thread.sleep(1500);
//		Select city=new Select(citySelect);
//		city.selectByVisibleText("Bangalore");
//		Thread.sleep(1500);
//		barangayName.sendKeys("North Branch");
//		Thread.sleep(1500);
//		zipCode.sendKeys("123473");
//		Thread.sleep(1500);
//		saveButton.click();
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(barangay);
		Thread.sleep(500);
		ElementUtil.doClick(barangayADD);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(countrySelect, "India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Karnataka");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(citySelect, "Bangalore");
		
		ElementUtil.doSendKeys(barangayName, "North Branch");
	
		ElementUtil.doSendKeys(zipCode, "123473");
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		
		return true;
		
	}
	
	public String addCountryMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
//		barangayADD.click();
//		Thread.sleep(1500);
//		saveButton.click();
//		String CountryMandatoryFieldVaidation=duplicateCheck.getText();
//		Thread.sleep(1500);
//		return CountryMandatoryFieldVaidation;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(barangay);
		Thread.sleep(500);
		ElementUtil.doClick(barangayADD);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String CountryMandatoryFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return CountryMandatoryFieldVaidation;
		
	}
	
	
	public String addSateMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
//		barangayADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Thread.sleep(1500);
		//stateName.sendKeys("Kyiv");
//		saveButton.click();
//		Thread.sleep(1500);
//		String SateMandatoryFieldVaidation=duplicateCheck.getText();
//		Thread.sleep(1500);
//		return SateMandatoryFieldVaidation;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1500);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(barangay);
		Thread.sleep(1000);
		ElementUtil.doClick(barangayADD);
		Thread.sleep(1000);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(1000);
		ElementUtil.doClick(saveButton);
		Thread.sleep(1000);

		String SateMandatoryFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return SateMandatoryFieldVaidation;
	}
	
	
	
	public String addBarangayDuplicateCheckValidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
//		barangayADD.click();
//		Thread.sleep(1500);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(barangay);
		Thread.sleep(500);
		ElementUtil.doClick(barangayADD);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect,"Karnataka");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(citySelect,"Bangalore");
		
		ElementUtil.doSendKeys(barangayName, "North Branch");
		
		ElementUtil.doSendKeys(zipCode, "123473");
		
		ElementUtil.doClick(saveButton);
		
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Thread.sleep(1500);
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Karnataka");
//		Thread.sleep(1500);
//		Select city=new Select(citySelect);
//		city.selectByVisibleText("Bangalore");
//		Thread.sleep(1500);		
//		barangayName.sendKeys("North Branch");
//		Thread.sleep(1500);
//		zipCode.sendKeys("123473");
//		Thread.sleep(1500);
//		saveButton.click();
//		String BarangayDuplicateCheckValidation=duplicateCheck.getText();
//		/*
//		 * String text=duplicateCheck.getText(); Thread.sleep(2000);
//		 * System.out.println(text); Assert.assertEquals("Duplicate Data-Please check",
//		 * text);
//		 */
//		
//		return BarangayDuplicateCheckValidation;
		Thread.sleep(500);
		String BarangayDuplicateCheckValidation=ElementUtil.doGetText(duplicateCheck);
		return BarangayDuplicateCheckValidation;

		
	}
	
	public boolean addBarangayResetButton() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
//		barangayADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Thread.sleep(1500);
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Karnataka");
//		Thread.sleep(1500);
//		Select city=new Select(citySelect);
//		city.selectByVisibleText("Bangalore");
//		Thread.sleep(1500);		
//		barangayName.sendKeys("North Branch");
//		Thread.sleep(1500);
//		zipCode.sendKeys("123473");
//		Thread.sleep(1500);
//		resetButton.click();
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(barangay);
		Thread.sleep(500);
		ElementUtil.doClick(barangayADD);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect,"Karnataka");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(citySelect,"Bangalore");
		
		ElementUtil.doSendKeys(barangayName, "North Branch");
		
		ElementUtil.doSendKeys(zipCode, "123473");
		
		ElementUtil.doClick(resetButton);
		Thread.sleep(500);
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1500);
//		geography.click();
//		Thread.sleep(1500);
//		barangay.click();
//		Thread.sleep(1500);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(barangay);
		Thread.sleep(500);

	
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
	
		
		
	}
	
	
}
