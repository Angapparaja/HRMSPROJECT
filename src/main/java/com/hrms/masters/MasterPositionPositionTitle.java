package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPositionPositionTitle extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//jobPosition
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement jobPosition;

	//Position Title
		@FindBy(xpath = "//span[@id='designation']")
		WebElement positionTitle;

		//JobLevelAdd
		@FindBy(xpath = "//*[@id='swap']")
		WebElement positionTitleAdd;
		
		//job level Id
		@FindBy(xpath = "//*[@id='levelId']")
		WebElement jobLevelId;
		
		
		//Position TitleName
		@FindBy(xpath = "//*[@id='designationName']")
		WebElement positionTitleName;
		
		
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
		
		//levelName
		@FindBy(xpath = "//*[text()='Enter Job Level name']")
		WebElement positionTitleMandatory;
				
				
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionPositionTitle() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean positionTitleAdd(String joblevel,String position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		positionTitleAdd.click();
		Thread.sleep(1000);
		Select level=new Select(jobLevelId);
		level.selectByVisibleText(joblevel);
		Thread.sleep(1000);
		positionTitleName.sendKeys(position);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		return true;
		
	}
	
//	public String positionTitleNegativeCheck(String joblevel,String position) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		positionTitle.click();
//		Thread.sleep(1000);
//		positionTitleAdd.click();
//		Thread.sleep(1000);
//		Select level=new Select(jobLevelId);
//		level.selectByVisibleText(joblevel);
//		Thread.sleep(1000);
//		positionTitleName.sendKeys(position);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String value=duplicateCheck.getText(); 
//		return value;
//		
//	}
	
	public String positionTitleAddMandatoryFieldVaidation(String joblevel) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		positionTitleAdd.click();
		Thread.sleep(1000);
		Select level=new Select(jobLevelId);
		level.selectByVisibleText(joblevel);
		Thread.sleep(1000);
		//positionTitleName.sendKeys("Automation Engineer");
		//Thread.sleep(2000);
		saveButton.click();
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	
	public String positionJoblevelAddMandatoryFieldVaidation(String position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		positionTitleAdd.click();
		Thread.sleep(1000);
//		Select level=new Select(jobLevelId);
//		level.selectByVisibleText(joblevel);

		positionTitleName.sendKeys(position);
		Thread.sleep(2000);
		saveButton.click();
		String value=duplicateCheck.getText(); 
		return value;
	}
	
	
	public String positionTitleAddDuplicateCheckValidation(String joblevel,String position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		positionTitleAdd.click();
		Thread.sleep(1000);
		Select level=new Select(jobLevelId);
		level.selectByVisibleText(joblevel);
		Thread.sleep(1000);
		positionTitleName.sendKeys(position);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
		/*
		 * String text=duplicateCheck.getText(); System.out.println(text);
		 * Assert.assertEquals("Duplicate Data-Please check", text);
		 */
		
		
	
	}
	
	public boolean verifyResetButton(String joblevel,String position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		positionTitleAdd.click();
		Thread.sleep(1000);
		Select level=new Select(jobLevelId);
		level.selectByVisibleText(joblevel);
		Thread.sleep(1000);
		positionTitleName.sendKeys(position);
		Thread.sleep(1000);
		resetButton.click();
		Thread.sleep(1000);
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
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
	
	public Boolean searchPositionTitleNamepagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		jobPosition.click();
		Thread.sleep(1000);
		positionTitle.click();
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
}
