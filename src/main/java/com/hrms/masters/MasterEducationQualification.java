package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterEducationQualification extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	//education
//	@FindBy(xpath = "//*[@id='education']")
//	WebElement education;

//Qualification 
//@FindBy(xpath = "//*[text()='Qualification']")
//WebElement Qualification;

//qualification Add
//@FindBy(xpath = "//*[@id='swap']")
//WebElement qualificationAdd;

//qualificationName
//@FindBy(xpath = "//*[@id='qualificationName']")
//WebElement qualificationName;


//save button
//@FindBy(xpath = "//*[text()='Save']")
//WebElement saveButton;

//reset button
//@FindBy(xpath = "//*[text()='Reset']")
//WebElement resetButton;
			
//duplicate Check
//	@FindBy(xpath = "//*[text()='toast-container']")
//	@FindBy(xpath="//div[@class='toast-message']")
//	WebElement duplicateCheck;

//religionName Mandatory
//@FindBy(xpath = "//*[text()='Enter qualification Name']")
//WebElement idproofNameMandatory;
		
		
//next button
//@FindBy(xpath = "//*[text()='Next']")
//WebElement nextButton;
//searchBox
//@FindBy(xpath="//input[@type='search']")
//WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By education=By.xpath("//*[@id='education']");
	
	By Qualification=By.xpath("//*[text()='Qualification']");
	
	By qualificationAdd=By.xpath("//*[@id='swap']");
	
	By qualificationName=By.xpath("//*[@id='qualificationName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By idproofNameMandatory=By.xpath("//*[text()='Enter qualification Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");
	

		
	public MasterEducationQualification() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean qualificationAdd(String QualificationName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		Qualification.click();
//		Thread.sleep(1000);
//		qualificationAdd.click();
//		Thread.sleep(1000);
//		qualificationName.sendKeys(QualificationName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
		ElementUtil.doClick(qualificationAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(qualificationName, QualificationName);
			
		ElementUtil.doClick(saveButton);
		
		return true;
		
	}
	
	public String qualificationNegativeCheck(String QualificationName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		Qualification.click();
//		Thread.sleep(1000);
//		qualificationAdd.click();
//		Thread.sleep(1000);
//		qualificationName.sendKeys(QualificationName);
//		Thread.sleep(1000);
//		saveButton.click();
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
		ElementUtil.doClick(qualificationAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(qualificationName, QualificationName);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String Qualificationname=ElementUtil.doGetText(duplicateCheck);
		return Qualificationname;
	}
	
	public String qualificationAddMandatoryFieldVaidation() throws InterruptedException {
		
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		Qualification.click();
//		Thread.sleep(1000);
//		qualificationAdd.click();
		//Thread.sleep(2000);
		//qualificationName.sendKeys("test");
//		saveButton.click();
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
		ElementUtil.doClick(qualificationAdd);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String Qualificationname=ElementUtil.doGetText(duplicateCheck);
		return Qualificationname;

	}
	
	public String addQualificationDuplicateCheckValidation(String QualificationName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		Qualification.click();
//		Thread.sleep(1000);
//		qualificationAdd.click();
//		Thread.sleep(1000);
//		qualificationName.sendKeys(QualificationName);
//		Thread.sleep(1000);
//		saveButton.click();
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
		ElementUtil.doClick(qualificationAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(qualificationName, QualificationName);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String Qualificationname=ElementUtil.doGetText(duplicateCheck);
		return Qualificationname;
	
	}
	
	public boolean verifyResetButton(String QualificationName) throws InterruptedException {
//		masterIcon.click();
//		education.click();
//		Thread.sleep(1000);
//		Qualification.click();
//		Thread.sleep(1000);
//		qualificationAdd.click();
//		Thread.sleep(1000);
//		qualificationName.sendKeys(QualificationName);
//		Thread.sleep(1000);
//		resetButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
		ElementUtil.doClick(qualificationAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(qualificationName, QualificationName);
		
		ElementUtil.doClick(resetButton);

		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);	
//		Qualification.click();
//		Thread.sleep(1000);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchQualificationNamepagination(String Qualificat) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);	
//		Qualification.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(Qualificat);
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(Qualification);
		Thread.sleep(500);

		ElementUtil.doSendKeys(searchBox, Qualificat);
		Thread.sleep(500);	

		List<WebElement> Qualificatione=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:Qualificatione) {
			String Qualifications=e.getText();
			System.out.println(Qualifications);
		}

		return true;
		
		
	}
	
}
