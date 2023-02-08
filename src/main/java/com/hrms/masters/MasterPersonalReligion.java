package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalReligion extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//	@FindBy(xpath = "//*[@id='otherdetail']")
//	WebElement personal;
			

	//workLocation 
	//	@FindBy(xpath = "//*[@id='workLocation']")
//		WebElement workLocation;

		//Religion ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement religionADD;
		
		//religionName
//		@FindBy(xpath = "//*[@id='religionName']")
//		WebElement religionName;
		
		
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
//		@FindBy(xpath = "//*[text()='Enter religion Name']")
//		WebElement religionNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By religionADD=By.xpath("//*[@id='swap']");
	
	By religionName=By.xpath("//*[@id='religionName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By religionNameMandatory=By.xpath("//*[text()='Enter religion Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");


		
	public MasterPersonalReligion() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addReligion() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		religionADD.click();
//		Thread.sleep(1000);
//		religionName.sendKeys("Buddah");
//		Thread.sleep(1000);
//		saveButton.click();
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(religionADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(religionName, "Buddah");
		ElementUtil.doClick(saveButton);
		
		return true;	
	}
	
	public String addreligionNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		religionADD.click();
//		Thread.sleep(1000);
		//religionName.sendKeys("Witnesses");
//		saveButton.click();
//		String religionNameMandatoryFieldVaidation = duplicateCheck.getText();
//		return religionNameMandatoryFieldVaidation;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(religionADD);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(1000);
		String religionNameMandatoryFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return religionNameMandatoryFieldVaidation;
	
		
	}
	
	
	public String addreligionADDDuplicateCheckValidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		religionADD.click();
//		Thread.sleep(1000);
//		religionName.sendKeys("Hindu");
//		Thread.sleep(1000);
//		saveButton.click();
		/*
		 * String text=duplicateCheck.getText(); System.out.println(text);
		 * Assert.assertEquals("Duplicate Data-Please check", text);
		 */
		//Thread.sleep(1000);
//		 String religionDuplicateFieldVaidation = duplicateCheck.getText();
//		return religionDuplicateFieldVaidation;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(religionADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(religionName, "Hindu");
	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String religionDuplicateFieldVaidation=ElementUtil.doGetText(duplicateCheck);
		return religionDuplicateFieldVaidation;
		
	}
	
	public boolean addreligionADDResetButton() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		religionADD.click();
//		Thread.sleep(1000);
//		religionName.sendKeys("Witnesses");
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(religionADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(religionName, "Hindu");
		
		ElementUtil.doClick(resetButton);
		
//		resetButton.click();
//		Thread.sleep(1000);
		return true;
	}

	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		religionADD.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);
		ElementUtil.doClick(religionADD);
		Thread.sleep(500);
		
		
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
