package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterRecruitmentCompetencies extends TestBase {

	@FindBy(xpath = "//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;

	//Recruitment
	@FindBy(xpath = "//*[text()='RECRUITMENT']")
	WebElement recruitment;

	//Competencies
	@FindBy(xpath = "//*[text()='COMPETENCIES']")
	WebElement competencies;

	// ADD competencies
	@FindBy(xpath = "//*[@id='swap']")
	WebElement addCompetencies;

	//Compentencies Name
	@FindBy(xpath = "//*[@id='compName']")
	WebElement compName;

	// Compentencies Group
	@FindBy(xpath = "//*[@id='compGroup']")
	WebElement compGroup;

	//Compentencies Description
	@FindBy(xpath = "//*[@id='compDescription']")
	WebElement compDescription;

	// Type Behavioural
	@FindBy(xpath = "(//span[@class='checkmark'])[1]")
	WebElement behavioural;

	// Type functional
	@FindBy(xpath = "(//*[@class='checkmark'])[2]")
	WebElement functional;

	// positiveIndicator
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement positiveIndicator;

	// negativeIndicator
	@FindBy(xpath = "//*[@id='negativeIndicator']")
	WebElement negativeIndicator;

	// Intervention Yes
	@FindBy(xpath = "//*[@id='Yes']")
	WebElement interventionYes;

	// Intervention No
	@FindBy(xpath = "(//*[@class='checkmark'])[4]")
	WebElement interventionNo;

	// mode
	@FindBy(xpath = "//*[text()='MODE']")
	WebElement mode;

	//status
	@FindBy(xpath="//*[@id='compStatus']")
	WebElement staus;
	
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
	@FindBy(xpath = "//*[text()='Please Enter Name']")
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

	public MasterRecruitmentCompetencies() {
		PageFactory.initElements(driver, this);
	}

	public String addWorkLocatin() {
		return new String();
	}

	public boolean addCompetenciesBehavioural(String compname,String Groupname,String Description) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);	
		recruitment.click();
		Thread.sleep(1000);
		competencies.click();
		Thread.sleep(500);
		addCompetencies.click();
		Thread.sleep(500);
		compName.sendKeys(compname);
	
		compGroup.sendKeys(Groupname);
		
		compDescription.sendKeys(Description);
		Thread.sleep(500);
		boolean selectType = behavioural.isSelected();
		
		//performing click operation only if element is not selected
		if(selectType == false) {
			behavioural.click();
		}
		Thread.sleep(500);
		
boolean selectType1 = interventionNo.isSelected();
		
		//performing click operation only if element is not selected
		if(selectType1 == false) {
			interventionNo.click();
		}
		
		Thread.sleep(500);
		Select stausdetails=new Select(staus);
		stausdetails.selectByVisibleText("Active");
		Thread.sleep(500);
		saveButton.click();
		
		return true;

	}

	public boolean addCompetenciesFunctional(String compname,String Groupname,String Description) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);	
		recruitment.click();
		Thread.sleep(1000);
		competencies.click();
		Thread.sleep(500);
		addCompetencies.click();
		Thread.sleep(500);
		compName.sendKeys(compname);
		
		compGroup.sendKeys(Groupname);
		
		compDescription.sendKeys(Description);
		
		boolean selectType = behavioural.isSelected();
		
		//performing click operation only if element is not selected
		if(selectType == false) {
			functional.click();
		}
		Thread.sleep(1000);
		
boolean selectType1 = interventionNo.isSelected();
		
		//performing click operation only if element is not selected
		if(selectType1 == false) {
			interventionNo.click();
		}
		
		Thread.sleep(500);
		Select stausdetails=new Select(staus);
		stausdetails.selectByVisibleText("Active");
		Thread.sleep(500);
		saveButton.click();
		
		return true;

	}

	public boolean addCompetenciesFunctionalPostiveIndi(String positiveIndicators) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);	
		recruitment.click();
		Thread.sleep(1000);	
		competencies.click();
		Thread.sleep(500);
		addCompetencies.click();
		Thread.sleep(500);
		compName.sendKeys("num Consultancy");
		
		compGroup.sendKeys("num Admin");
		
		compDescription.sendKeys("TESTnum");
		Thread.sleep(500);
		boolean selectType = functional.isSelected();
		if(selectType == false) {
			functional.click();
		}
		Thread.sleep(500);
	
		positiveIndicator.sendKeys(positiveIndicators);
		Thread.sleep(500);
        boolean selectType1 = interventionNo.isSelected();
		
		//performing click operation only if element is not selected
		if(selectType1 == false) {
			interventionNo.click();
		}
		
		Thread.sleep(500);
		Select stausdetails=new Select(staus);
		stausdetails.selectByVisibleText("Active");
		Thread.sleep(500);
		saveButton.click();
		
		return true;

	}
	
	public String addCompetenciesFunctionalNegativeIndi(String negativeCompName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);	
		recruitment.click();
		Thread.sleep(1000);	
		competencies.click();
		Thread.sleep(500);
		addCompetencies.click();
		Thread.sleep(500);
		compName.sendKeys(negativeCompName);
		
		compGroup.sendKeys("ABCD Admin");
		
		compDescription.sendKeys("TEST");
		Thread.sleep(500);
		boolean selectType = functional.isSelected();
		if(selectType == false) {
			functional.click();
		}
		Thread.sleep(1000);

//		negativeIndicator.sendKeys("test");
		
		saveButton.click();
		Thread.sleep(500);	
		String CompetenciesName=duplicateCheck.getText(); 
		return CompetenciesName;

	}
	public boolean verifyRecruitmentCompetenciesResetButton(String compname,String Groupname,String Description) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		competencies.click();
		Thread.sleep(500);
		addCompetencies.click();
		Thread.sleep(500);
		compName.sendKeys(compname);
		
		compGroup.sendKeys(Groupname);
	
		compDescription.sendKeys(Description);
		Thread.sleep(500);
		boolean selectType = functional.isSelected();
		if(selectType == false) {
			functional.click();
		}
		Thread.sleep(500);
	
		//negativeIndicator.sendKeys("test");
		//Thread.sleep(1000);

		resetButton.click();
	
		return true;

	}

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		competencies.click();
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
	public Boolean searchRecruitmentCompetenciespagination(String search) throws InterruptedException {
		try {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		competencies.click();
		Thread.sleep(500);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		}catch(Exception e) {
			System.out.println("unable to get the flow");
		}
		return false;
		
		
	}
}
