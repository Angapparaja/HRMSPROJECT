package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterPositionPositionCategory extends TestBase {

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//Position
			@FindBy(xpath = "//*[@id='job_position']")
			WebElement position;

	//Position Category 
		@FindBy(xpath = "//*[text()='Position Category ']")
		WebElement positionCategory ;

		//Add Position Category 
		@FindBy(xpath = "//*[@id='swap']")
		WebElement addPositionCategory ;
		
		//Position Category Name
		@FindBy(xpath = "//*[@id='empCatName']")
		WebElement positionCategoryName;
		
		//TaxeligibleYes
		@FindBy(xpath = "(//span[@class='checkmark'])[1]")
		WebElement TaxeligibleYes;
				
		//TaxeligibleNo
		@FindBy(xpath = "(//span[@class='checkmark'])[2]")
		WebElement TaxeligibleNo;
						
				
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
		
		//Position Category NameMandatory
		@FindBy(xpath = "//*[text()='Enter Position Category Name']")
		WebElement positionCatNameMandatory;
				
		//Taxeligible Mandatory
		@FindBy(xpath = "//*[text()='Select Taxeligible']")
		WebElement taxeligibleMandatory;
		
		//next button
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
	public MasterPositionPositionCategory() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addPositionCategoryWithTaxEligibleYes(String Position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		positionCategoryName.sendKeys(Position);
		Thread.sleep(500);
		try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		Thread.sleep(500);
		saveButton.click();
		
		return true;
		
	}
	
	public String addPositionCategoryWithTaxEligibleYesNegativeCheck(String Position) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		positionCategoryName.sendKeys(Position);
		Thread.sleep(500);
		try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;
		
		
	}
	
	public String addPositionCategoryWithTaxEligibleNo(String CategoryName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		positionCategoryName.sendKeys(CategoryName);
		Thread.sleep(500);
		try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		Thread.sleep(500);
	
		
		saveButton.click();
		Thread.sleep(500);
		String CategoryNames=duplicateCheck.getText(); 
		return CategoryNames;
	
		
	}
	
	public String addPositionCategoryMandatroyFieldValidation() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		//positionCategoryName.sendKeys("Level Two");
		Thread.sleep(500);
		try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String CategoryNames=duplicateCheck.getText(); 
		return CategoryNames;
		
	}
	
//	public boolean taxEligibleMandatroyFieldValidation() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		position.click();
//		Thread.sleep(1000);
//		positionCategory.click();
//		Thread.sleep(1000);
//		addPositionCategory.click();
//		Thread.sleep(1000);
//		positionCategoryName.sendKeys("Level Two");
//		Thread.sleep(1000);
//		//TaxeligibleNo.click();
//		//Thread.sleep(2000);
//		saveButton.click();
//		Thread.sleep(1000);
//		return false;
//		
//	}
	
	public String addPositionCategoryWithTaxEligibleYesDuplicateCheck(String CategoryName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		positionCategoryName.sendKeys(CategoryName);
		Thread.sleep(500);
		
		
	//	boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		
		
        Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String Positioncatename=duplicateCheck.getText(); 
		return Positioncatename;
		
	}
	public boolean verifyResetButton(String CategoryName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		addPositionCategory.click();
		Thread.sleep(500);
		positionCategoryName.sendKeys(CategoryName);
		Thread.sleep(500);
		try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled()) {
//                flag = false;
            	boolean selectType = TaxeligibleYes.isSelected();
    		if(selectType == false) {
    			TaxeligibleYes.click();
    		}
        } 
        }catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("Checkbox  not visible");
        } 
		Thread.sleep(500);
		
		resetButton.click();
	
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
		Thread.sleep(500);
		
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
                nextButton.click();
            System.out.println("pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchPositionPositionCategorypagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		position.click();
		Thread.sleep(1000);
		positionCategory.click();
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
