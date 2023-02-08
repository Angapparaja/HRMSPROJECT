package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterRecruitmentConsultant extends TestBase {

	@FindBy(xpath = "//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;

	//recruitment
	@FindBy(xpath = "//*[text()='RECRUITMENT']")
	WebElement recruitment;

	// Consultant
	@FindBy(xpath = "//*[text()='Consultant']")
	WebElement consultant;

	// ADD Consultant
	@FindBy(xpath = "//*[@id='swap']")
	WebElement addconsultant;

	// Consultant Name
	@FindBy(xpath = "//*[@id='consultantName']")
	WebElement consultantName;

	// consultant Contact Person
	@FindBy(xpath = "//*[@id='consultantContactPerson']")
	WebElement consultantContactPerson;

	// consultantContactNo
	@FindBy(xpath = "//*[@id='consultantContactNo']")
	WebElement consultantContactNo;

	// consultantEmail
	@FindBy(xpath = "//*[@id='consultantEmail']")
	WebElement consultantEmail;

	// consultantAddress
	@FindBy(xpath = "//*[@id='consultantAddress']")
	WebElement consultantAddress;

	// countryName
	@FindBy(xpath = "//*[@id='countryName']")
	WebElement countryName;

	// stateName
	@FindBy(xpath = "//*[@id='stateName']")
	WebElement stateName;

	// city
	@FindBy(xpath = "//*[@id='city']")
	WebElement city;

	// location
	@FindBy(xpath = "//*[@id='location']")
	WebElement location;

	// userName
	@FindBy(xpath = "//*[@id='userName']")
	WebElement userName;

	// save button
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveButton;

	// reset button
	@FindBy(xpath = "//*[text()='Reset']")
	WebElement resetButton;

	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;

	// next button
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;

	// consultantName Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Consultancy Name']")
	WebElement consultantNameMandatory;

	// consultantContactPerson Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Contact Person']")
	WebElement consultantContactPersonMandatory;

	// consultantContactNo Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Consultancy Contact No']")
	WebElement consultantContactNoMandatory;

	// consultantEmailMandatory
	@FindBy(xpath = "//*[text()='Please Enter Consultancy Email']")
	WebElement consultantEmailMandatory;

	// consultantAddress Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Consultancy Address']")
	WebElement consultantAddressMandatory;

	// countryName Mandatory
	@FindBy(xpath = "//*[text()='Please Select Consultancy Country']")
	WebElement countryNameMandatory;

	// stateName Mandatory
	@FindBy(xpath = "//*[text()='Please Select Consultancy Province']")
	WebElement stateNameMandatory;

	// city Mandatory
	@FindBy(xpath = "//*[text()='Please Select Consultancy City']")
	WebElement cityMandatory;

	// location Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Consultancy Location']")
	WebElement locationMandatory;

	// userName Mandatory
	@FindBy(xpath = "//*[contains(text(),'Please Enter')]")
	WebElement userNameMandatory;
	
	//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;

	public MasterRecruitmentConsultant() {
		PageFactory.initElements(driver, this);
	}

	public String addWorkLocatin() {
		return new String();
	}

	public boolean addconsultant(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(500);
		addconsultant.click();
		Thread.sleep(500);
		consultantName.sendKeys(ConsultancyName);
		
		consultantContactPerson.sendKeys(ContactPerson);
		
		consultantContactNo.sendKeys(ContactNo);
		
		consultantEmail.sendKeys(Email);
	
		consultantAddress.sendKeys(Address);
	
		
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1500);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(500);
		location.sendKeys(locations);
		
		userName.sendKeys(username);
		
		saveButton.click();
		
		return true;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;

	}

	public String consultantNegativeCheck(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(500);
		addconsultant.click();
		Thread.sleep(500);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(500);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(500);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(500);
		consultantEmail.sendKeys(Email);
		Thread.sleep(500);
		consultantAddress.sendKeys(Address);
		Thread.sleep(500);
	
//		Select country = new Select(countryName);
//		country.selectByVisibleText(Country);
//		Thread.sleep(1000);
//		Select state = new Select(stateName);
//		state.selectByVisibleText(Province);
//		Thread.sleep(1000);
//		Select cityName = new Select(city);
//		cityName.selectByVisibleText(City);
//		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(500);
		userName.sendKeys(username);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return null;

	}
	
	public String consultantNameMandatory(String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(500);
//		consultantName.sendKeys(ConsultancyName);
//		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		
		consultantContactNo.sendKeys(ContactNo);
		
		consultantEmail.sendKeys(Email);
		
		consultantAddress.sendKeys(Address);
		
		consultantAddress.sendKeys(Address);
	
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1500);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(500);
		location.sendKeys(locations);
		
		userName.sendKeys(username);
		
		saveButton.click();
		
		String value=duplicateCheck.getText(); 
		return value;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return null;

	}

	public String consultantContactPersonMandatory(String ConsultancyName,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
//		consultantContactPerson.sendKeys(ContactPerson);
//		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
		consultantEmail.sendKeys(Email);
		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1000);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(1000);
		userName.sendKeys(username);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;


	}


	public String consultantEmailMandatory(String ConsultancyName,String ContactPerson,String ContactNo,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
//		consultantEmail.sendKeys(Email);
//		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1000);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(1000);
		userName.sendKeys(username);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;

	}

	public String consultantAddressMandatory(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
		consultantEmail.sendKeys(Email);
		Thread.sleep(1000);
//		consultantAddress.sendKeys(Address);
//		Thread.sleep(1000);
//		consultantAddress.sendKeys(Address);
//		Thread.sleep(1000);
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1000);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(1000);
		userName.sendKeys(username);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;

	}
	
	public String IsValidContactNOcheck(String ConsultancyName,String ContactPerson,String ContactNo) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	public String IsValidEmailcheck(String ConsultancyName,String ContactPerson,String ContactNo,String Email) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
		consultantEmail.sendKeys(Email);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
	}

//	public boolean cityMandatory() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		recruitment.click();
//		Thread.sleep(1000);
//		consultant.click();
//		Thread.sleep(1000);
//		addconsultant.click();
//		Thread.sleep(1000);
//		consultantName.sendKeys("XYZ Consultancy");
//		Thread.sleep(1000);
//		consultantContactPerson.sendKeys("XYZ Admin");
//		Thread.sleep(1000);
//		consultantContactNo.sendKeys("9840642102");
//		Thread.sleep(1000);
//		consultantEmail.sendKeys("xyz@gmail.com");
//		Thread.sleep(1000);
//		consultantAddress.sendKeys("Adayar, Chennai");
//		Thread.sleep(1000);
//		consultantAddress.sendKeys("Adayar, Chennai");
//		Thread.sleep(1000);
//		Select country = new Select(countryName);
//		country.selectByVisibleText("Tonga");
//		Thread.sleep(1000);
//		Select state = new Select(stateName);
//		state.selectByVisibleText("Idaho");
//		Thread.sleep(1000);
////		Select cityName = new Select(city);
////		cityName.selectByVisibleText("Ressieberg");
//
//		Thread.sleep(1000);
//		location.sendKeys("Chennai");
//		Thread.sleep(1000);
//		userName.sendKeys("Admin");
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		return false;
//
//	}
//
//	public boolean locationMandatory() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		recruitment.click();
//		Thread.sleep(1000);
//		consultant.click();
//		Thread.sleep(1000);
//		addconsultant.click();
//		Thread.sleep(1000);
//		consultantName.sendKeys("XYZ Consultancy");
//		Thread.sleep(1000);
//		consultantContactPerson.sendKeys("XYZ Admin");
//		Thread.sleep(1000);
//		consultantContactNo.sendKeys("9840642102");
//		Thread.sleep(1000);
//		consultantEmail.sendKeys("xyz@gmail.com");
//		Thread.sleep(1000);
//		consultantAddress.sendKeys("Adayar, Chennai");
//		Thread.sleep(1000);
//		consultantAddress.sendKeys("Adayar, Chennai");
//		Thread.sleep(1000);
//		Select country = new Select(countryName);
//		country.selectByIndex(0);
//		Thread.sleep(1000);
//		Select state = new Select(stateName);
//		state.selectByIndex(0);
//		Thread.sleep(1000);
//		Select cityName = new Select(city);
//		cityName.selectByIndex(0);
//		Thread.sleep(1000);
//		//location.sendKeys("Chennai");
//		Thread.sleep(1000);
//		userName.sendKeys("Admin");
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		return false;
//
//	}
	
	public String userNameMandatory(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(500);
		consultantName.sendKeys(ConsultancyName);
		
		consultantContactPerson.sendKeys(ContactPerson);
	
		consultantContactNo.sendKeys(ContactNo);
		
		consultantEmail.sendKeys(Email);

		consultantAddress.sendKeys(Address);
		
		
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1500);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(500);
		location.sendKeys(locations);
		Thread.sleep(500);
//		userName.sendKeys(username);
//		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return null;

	}
	
	public String addConsultantDuplicateCheck(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		addconsultant.click();
		Thread.sleep(1000);
		consultantName.sendKeys(ConsultancyName);
		Thread.sleep(1000);
		consultantContactPerson.sendKeys(ContactPerson);
		Thread.sleep(1000);
		consultantContactNo.sendKeys(ContactNo);
		Thread.sleep(1000);
		consultantEmail.sendKeys(Email);
		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		consultantAddress.sendKeys(Address);
		Thread.sleep(1000);
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1000);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(1000);
		userName.sendKeys(username);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;

	}
	public boolean verifyResetButton(String ConsultancyName,String ContactPerson,String ContactNo,String Email,String Address,String Country,String Province,String City,String locations,String username) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(500);
		addconsultant.click();
		Thread.sleep(500);
		consultantName.sendKeys(ConsultancyName);
		
		consultantContactPerson.sendKeys(ContactPerson);
	
		consultantContactNo.sendKeys(ContactNo);
	
		consultantEmail.sendKeys(Email);
		
		consultantAddress.sendKeys(Address);
		
		Thread.sleep(500);
		
		Select country = new Select(countryName);
		country.selectByVisibleText(Country);
		Thread.sleep(1500);
		Select state = new Select(stateName);
		state.selectByVisibleText(Province);
		Thread.sleep(1000);
		Select cityName = new Select(city);
		cityName.selectByVisibleText(City);
		Thread.sleep(1000);
		location.sendKeys(locations);
		Thread.sleep(500);
		userName.sendKeys(username);
		

		resetButton.click();
		Thread.sleep(1000);	
		return true;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;

	}

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
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
	
	public Boolean searchRecruitmentConsulnatNamepagination(String search) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		consultant.click();
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		} catch (Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;
}
}
