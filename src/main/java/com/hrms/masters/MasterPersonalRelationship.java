package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterPersonalRelationship extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//PERSONAL
//			@FindBy(xpath = "//*[@id='otherdetail']")
//			WebElement personal;

	//relationship 
//		@FindBy(xpath = "//*[@id='relationship']")
//		WebElement relationship;

		//relationship ADD
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement relationshipADD;
		
		//relationshipName
//		@FindBy(xpath = "//*[@id='relationshipName']")
//		WebElement relationshipName;
		
		
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
//		@FindBy(xpath = "//*[text()='Enter relationship Name']")
//		WebElement relationNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By personal=By.xpath("//*[@id='otherdetail']");
	
	By relationship=By.xpath("//span[@id='relationship']");
	
	By relationshipADD=By.xpath("//*[@id='swap']");
	
	By relationshipName=By.xpath("//*[@id='relationshipName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By relationNameMandatory=By.xpath("//*[text()='Enter relationship Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");


		
	public MasterPersonalRelationship() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addrelationshipName(String relationsship) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
//		relationshipADD.click();
//		Thread.sleep(1000);
//		relationshipName.sendKeys(relationsship);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
		ElementUtil.doClick(relationshipADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(relationshipName, relationsship);
		
		ElementUtil.doClick(saveButton);
		
		return true;
		
	}
	
	public String relationshipNameNegativeCheck(String relationsship) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
//		relationshipADD.click();
//		Thread.sleep(1000);
//		relationshipName.sendKeys(relationsship);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);	
//		String relationname=duplicateCheck.getText();
//		return relationname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
		ElementUtil.doClick(relationshipADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(relationshipName, relationsship);
	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);	
		String relationname=ElementUtil.doGetText(duplicateCheck);
		return relationname;
		
	}
	
	public String addrelationshipNameMandatoryFieldVaidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
//		relationshipADD.click();
//		Thread.sleep(1000);
		//relationshipName.sendKeys("test");
//		saveButton.click();
//		Thread.sleep(1000);
//		String relationname=duplicateCheck.getText();
//		return relationname;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
		ElementUtil.doClick(relationshipADD);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);	

		String relationname=ElementUtil.doGetText(duplicateCheck);
		return relationname;
	
		
	}
	
	
	public String addrelationshipADDDuplicateCheckValidation(String relationName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
//		relationshipADD.click();
//		Thread.sleep(1000);
//		relationshipName.sendKeys(relationName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String relationduplicate=duplicateCheck.getText();
//		return relationduplicate;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
		ElementUtil.doClick(relationshipADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(relationshipName, relationName);
//		Thread.sleep(1000);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String relationname=ElementUtil.doGetText(duplicateCheck);
		return relationname;
	
	}
	
	public boolean addrelationshipNameResetButton(String relationName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
//		relationshipADD.click();
//		Thread.sleep(1000);
//		relationshipName.sendKeys(relationName);
//		Thread.sleep(1000);			
//		resetButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
		ElementUtil.doClick(relationshipADD);
		Thread.sleep(500);
		ElementUtil.doSendKeys(relationshipName, relationName);
		
		ElementUtil.doClick(resetButton);
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(personal);
		Thread.sleep(1000);	
		ElementUtil.doClick(relationship);
		Thread.sleep(500);
//		masterIcon.click();
//		Thread.sleep(1000);
//		personal.click();
//		Thread.sleep(1000);
//		relationship.click();
//		Thread.sleep(1000);
		
		
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
	
	
}
