package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalBloodGroup extends TestBase {
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//			@FindBy(xpath = "//*[@id='otherdetail']")
//			WebElement personal;

	//bloodGroup 
//		@FindBy(xpath = "//*[@id='bloodGroup']")
//		WebElement bloodGroup;

		//bloodGroup ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement bloodGroupADD;
		
		//bloodgroupName
//		@FindBy(xpath = "//*[@id='bloodgroupName']")
//		WebElement bloodgroupName;
		
		
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
		
		//religionName Mandatory
//		@FindBy(xpath = "//*[text()='Enter bloodgroup Name']")
//		WebElement bloodgroupNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
		
		//searchBox
//		@FindBy(xpath="//input[@type='search']")
//		WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By bloodGroup=By.xpath("//*[@id='bloodGroup']");
	
	By bloodGroupADD=By.xpath("//*[@id='swap']");
	
	By bloodgroupName=By.xpath("//*[@id='bloodgroupName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By bloodgroupNameMandatory=By.xpath("//*[text()='Enter bloodgroup Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");


		
	public MasterPersonalBloodGroup() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addbloodGroupName(String blood) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		bloodGroupADD.click();
//		Thread.sleep(1000);
//		bloodgroupName.sendKeys(blood);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doClick(bloodGroupADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(bloodgroupName, blood);
	
		ElementUtil.doClick(saveButton);
		

		return true;
		
	}
	
	
	public String bloodGroupNameNegativeCheck(String blood) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		bloodGroupADD.click();
//		Thread.sleep(1000);
//		bloodgroupName.sendKeys(blood);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String bloodname=duplicateCheck.getText(); 
//		return bloodname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doClick(bloodGroupADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(bloodgroupName, blood);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String bloodname=ElementUtil.doGetText(duplicateCheck);
		return bloodname;

	}
	
	public String addbloodGroupNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		bloodGroupADD.click();
//		Thread.sleep(1000);
		//bloodgroupName.sendKeys("test");
//		saveButton.click();
//		Thread.sleep(1000);
//		String bloodname=duplicateCheck.getText(); 
//		return bloodname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doClick(bloodGroupADD);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String bloodname=ElementUtil.doGetText(duplicateCheck);
		return bloodname;
		
	}
	
	
	public String addbloodgroupADDDuplicateCheckValidation(String bloodName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		bloodGroupADD.click();
//		Thread.sleep(1000);
//		bloodgroupName.sendKeys(bloodName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String bloodname=duplicateCheck.getText(); 
//		return bloodname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doClick(bloodGroupADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(bloodgroupName, bloodName);
		
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String bloodname=ElementUtil.doGetText(duplicateCheck);
		return bloodname;

	}
	
	public boolean addbloodgroupNameResetButton(String BloodName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		bloodGroupADD.click();
//		Thread.sleep(1000);
//		bloodgroupName.sendKeys(BloodName);
//		Thread.sleep(1000);
//		resetButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doClick(bloodGroupADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(bloodgroupName,BloodName);
//		Thread.sleep(1000);
		ElementUtil.doClick(resetButton);
		
		return true;	
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            ElementUtil.doClick(nextButton);
    		Thread.sleep(500);
//                nextButton.click();
            System.out.println("Pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchBloodGroupNamepagination(String BlooodGroup) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		bloodGroup.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(BlooodGroup);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(bloodGroup);
		Thread.sleep(500);
		ElementUtil.doSendKeys(searchBox, BlooodGroup);
		List<WebElement> CountryName=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:CountryName) {
			String Countryname=e.getText();
			System.out.println(Countryname);
		}

		return true;
		
		
	}
}
