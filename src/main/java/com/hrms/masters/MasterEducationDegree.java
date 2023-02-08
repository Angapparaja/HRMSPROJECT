package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class MasterEducationDegree extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//education
//			@FindBy(xpath = "//*[@id='education']")
//			WebElement education;

	//Degree
//		@FindBy(xpath = "//*[text()='Degree']")
//		WebElement degree;

		//Degree Add
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement degreeAdd;
		
		//qualification
//		@FindBy(xpath = "//*[@id='quali']")
//		WebElement qualification;
		
		
		//degree Name
//		@FindBy(xpath = "//*[@id='degreeName']")
//		WebElement degreeName;
		
		
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
//		@FindBy(xpath = "//*[text()='Enter degree Name']")
//		WebElement idproofNameMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
		
		//searchBox
//		@FindBy(xpath="//input[@type='search']")
//		WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By education=By.xpath("//*[@id='education']");
	
	By degree=By.xpath("//*[text()='Degree']");
	
	By degreeAdd=By.xpath("//*[@id='swap']");
	
	By qualification=By.xpath("//*[@id='quali']");
	
	By degreeName=By.xpath("//*[@id='degreeName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By idproofNameMandatory=By.xpath("//*[text()='Enter degree Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");


		
	public MasterEducationDegree() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean degreeAdd(String Qulifi,String Degree) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		degreeAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(qualification);
//		quali.selectByVisibleText(Qulifi);
//		degreeName.sendKeys(Degree);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);

		ElementUtil.doClick(education);
		Thread.sleep(1000);

		ElementUtil.doClick(degree);
		Thread.sleep(500);

		ElementUtil.doClick(degreeAdd);
		Thread.sleep(500);

		ElementUtil.doSelectByVisibleText(qualification, Qulifi);
			

		ElementUtil.doSendKeys(degreeName, Degree);
		Thread.sleep(500);	

		ElementUtil.doClick(saveButton);
		

		return true;
		
	}
	
	
	public String degreeNegativeCheck(String Qulifi,String Degree) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		degreeAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(qualification);
//		quali.selectByVisibleText(Qulifi);
//		degreeName.sendKeys(Degree);
//		Thread.sleep(1000);
//		saveButton.click();
//		String Degreename=duplicateCheck.getText(); 
//		return Degreename;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
		Thread.sleep(500);
		ElementUtil.doClick(degreeAdd);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(qualification, Qulifi);
		Thread.sleep(500);
		ElementUtil.doSendKeys(degreeName, Degree);
		Thread.sleep(500);	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String Degreename=ElementUtil.doGetText(duplicateCheck);
		return Degreename;	
	}
	
	public String degreeAddMandatoryFieldVaidation(String Qulifi) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		degreeAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(qualification);
//		quali.selectByVisibleText(Qulifi);
		//degreeName.sendKeys("test");
//		Thread.sleep(1000);
//		saveButton.click();
//		String Degreename=duplicateCheck.getText(); 
//		return Degreename;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
		Thread.sleep(500);
		ElementUtil.doClick(degreeAdd);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(qualification, Qulifi);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String Degreename=ElementUtil.doGetText(duplicateCheck);
		return Degreename;	

	}
	
	
	public String addDegreeDuplicateCheckValidation(String Qulifi,String Degree) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		degreeAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(qualification);
//		quali.selectByVisibleText(Qulifi);
//		degreeName.sendKeys(Degree);
//		Thread.sleep(1000);
//		saveButton.click();
		/*
		 * String text=duplicateCheck.getText(); System.out.println(text);
		 * Assert.assertEquals("Duplicate Data-Please check", text);
		 */
//		String Degreename=duplicateCheck.getText(); 
//		return Degreename;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
		Thread.sleep(500);
		ElementUtil.doClick(degreeAdd);
		Thread.sleep(1000);

		ElementUtil.doSelectByVisibleText(qualification, Qulifi);
		Thread.sleep(500);

		ElementUtil.doSendKeys(degreeName, Degree);
			

		ElementUtil.doClick(saveButton);
		Thread.sleep(500);

		String Degreename=ElementUtil.doGetText(duplicateCheck);
		return Degreename;

		
	
	}
	
	public Boolean verifyResetButton(String Qulifi,String Degree) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		degreeAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(qualification);
//		quali.selectByVisibleText(Qulifi);
//		degreeName.sendKeys(Degree);
//		Thread.sleep(1000);
//		resetButton.click();
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
		Thread.sleep(500);
		ElementUtil.doClick(degreeAdd);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(qualification, Qulifi);
		Thread.sleep(500);
		ElementUtil.doSendKeys(degreeName, Degree);
		
		ElementUtil.doClick(resetButton);
		Thread.sleep(500);
		return true;
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
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
	
	public Boolean searchDegreeNamepagination(String Qualificat) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		degree.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(Qualificat);
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(degree);
		Thread.sleep(500);

		ElementUtil.doSendKeys(searchBox,Qualificat);
		Thread.sleep(500);

		List<WebElement> DegreeName=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:DegreeName) {
			String DegreeNames=e.getText();
			System.out.println(DegreeNames);
		}

		return true;
	}
	
	
}
