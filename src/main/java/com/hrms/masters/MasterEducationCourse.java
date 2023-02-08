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

public class MasterEducationCourse extends TestBase {

//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//education
//	@FindBy(xpath = "//*[@id='education']")
//	WebElement education;

//Course
//@FindBy(xpath = "//*[text()='Course']")
//WebElement course;

//course Add
//@FindBy(xpath = "//*[@id='swap']")
//WebElement courseAdd;

//degree Id
//@FindBy(xpath = "//*[@id='degreeId']")
//WebElement degreeId;


//course Name
//@FindBy(xpath = "//*[@id='courseName']")
//WebElement courseName;


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
//@FindBy(xpath = "//*[text()='Enter course Name']")
//WebElement idproofNameMandatory;
		
		
//next button
//@FindBy(xpath = "//*[text()='Next']")
//WebElement nextButton;

//searchBox
//@FindBy(xpath="//input[@type='search']")
//WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By education=By.xpath("//*[@id='education']");
	
	By course=By.xpath("//*[text()='Course']");
	
	By courseAdd=By.xpath("//*[@id='swap']");
	
	By degreeId=By.xpath("//*[@id='degreeId']");
	
	By courseName=By.xpath("//*[@id='courseName']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By idproofNameMandatory=By.xpath("//*[text()='Enter course Name']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");
	
		
	public MasterEducationCourse() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean courseAdd(String Degree,String CourseName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		courseAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(degreeId);
//		quali.selectByVisibleText(Degree);	
//		courseName.sendKeys(CourseName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doClick(courseAdd);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(degreeId, Degree);
		Thread.sleep(500);	
		ElementUtil.doSendKeys(courseName, CourseName);
		Thread.sleep(500);	
		ElementUtil.doClick(saveButton);
//		Thread.sleep(1000);

		return true;
		
	}
	
	
	public String courseNegativeCheck(String Degree,String CourseName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		courseAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(degreeId);
//		quali.selectByVisibleText(Degree);
//		courseName.sendKeys(CourseName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doClick(courseAdd);
		Thread.sleep(500);

		ElementUtil.doSelectByVisibleText(degreeId, Degree);
		Thread.sleep(500);	
		ElementUtil.doSendKeys(courseName, CourseName);
			
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);

		
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
		
	}
	
	public String courseAddAddMandatoryFieldVaidation(String Degree) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		courseAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(degreeId);
//		quali.selectByVisibleText(Degree);
//		//courseName.sendKeys("test");
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doClick(courseAdd);
		Thread.sleep(500);

		ElementUtil.doSelectByVisibleText(degreeId, Degree);
		Thread.sleep(500);	

		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
		
	}
	
	
	public String courseAddDuplicateCheckValidation(String Degree,String CourseName) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		courseAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(degreeId);
//		quali.selectByVisibleText(Degree);
//		courseName.sendKeys(CourseName);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String Qualificationname=duplicateCheck.getText(); 
//		return Qualificationname;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doClick(courseAdd);
		Thread.sleep(500);
		
		ElementUtil.doSelectByVisibleText(degreeId, Degree);
		Thread.sleep(500);	

		ElementUtil.doSendKeys(courseName, CourseName);
//		Thread.sleep(1000);	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);

		
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
		

		
	
	}
	
	public boolean verifyResetButton(String Degree,String CourseName) throws InterruptedException {
		
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		courseAdd.click();
//		Thread.sleep(1000);
//		Select quali=new Select(degreeId);
//		quali.selectByVisibleText(Degree);
//		courseName.sendKeys(CourseName);
//		Thread.sleep(1000);
//		resetButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doClick(courseAdd);
		Thread.sleep(500);
		
		ElementUtil.doSelectByVisibleText(degreeId, Degree);
		Thread.sleep(500);	

		ElementUtil.doSendKeys(courseName, CourseName);
//		Thread.sleep(1000);	
		ElementUtil.doClick(resetButton);
		
		return true;
		
	}
	

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
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
	
	public Boolean searchCourseNamepagination(String Qualificat) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		education.click();
//		Thread.sleep(1000);
//		course.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(Qualificat);
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(education);
		Thread.sleep(1000);
		ElementUtil.doClick(course);
		Thread.sleep(500);
		ElementUtil.doSendKeys(searchBox, Qualificat);
		Thread.sleep(500);	

		List<WebElement>Course=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
		for(WebElement e:Course) {
			String Courses=e.getText();
			System.out.println(Courses);
		}

		return true;
		
		
	}
	
	
	
}
