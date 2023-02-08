package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterRecruitmentEvaluationForm extends TestBase {

	@FindBy(xpath = "//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;

	//Recruitment
	@FindBy(xpath = "//*[text()='RECRUITMENT']")
	WebElement recruitment;

	//Evaluation Form
	@FindBy(xpath = "//*[text()='Evaluation Form']")
	WebElement evaluationForm;

	// ADD evaluationForm
	@FindBy(xpath = "//*[@id='swap']")
	WebElement addEvaluationForm;

	//Title Name
	@FindBy(xpath = "//*[@id='com_name']")
	WebElement titleName;

	// Question
	@FindBy(xpath = "//*[@id='txt_crit_1']")
	WebElement question;

	
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

	// Title Mandatory
	@FindBy(xpath = "//*[text()='Please Enter title']")
	WebElement titleMandatory;

	// Topic Mandatory
	@FindBy(xpath = "//*[text()='Please Enter Valid Topic / Questions']")
	WebElement topicMandatory;

	//searchBox
	@FindBy(xpath="//input[@type='search']")
	WebElement searchBox;
	
	public MasterRecruitmentEvaluationForm() {
		PageFactory.initElements(driver, this);
	}

	public String addWorkLocatin() {
		return new String();
	}

	public boolean addEvaluationForm(String Title,String Topic) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(500);
		addEvaluationForm.click();
		Thread.sleep(500);
		titleName.sendKeys(Title);
		Thread.sleep(500);
		question.sendKeys(Topic);
		
		saveButton.click();
		
		return true;

	}
	
	public String EvaluationFormNegativeCheck(String Title,String Topic) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(500);
		addEvaluationForm.click();
		Thread.sleep(500);
		titleName.sendKeys(Title);
		Thread.sleep(500);
		question.sendKeys(Topic);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}

	public String addEvaluationFormDuplicateCheck(String Title,String Topic) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(1000);
		addEvaluationForm.click();
		Thread.sleep(1000);
		titleName.sendKeys(Title);
		Thread.sleep(1000);
		question.sendKeys(Topic);
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;

	}
	
	public String addEvaluationTitleNameMandatory(String Topic) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(500);
		addEvaluationForm.click();
		Thread.sleep(500);
		question.sendKeys(Topic);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}
	
	public String addEvaluationQuestionMandatory(String Title) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(500);
		addEvaluationForm.click();
		Thread.sleep(500);
		titleName.sendKeys(Title);
		Thread.sleep(500);
	//	question.sendKeys("Describe about Black box testing");
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}

	public boolean verifyResetButton(String Title,String Topic) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(1000);
		addEvaluationForm.click();
		Thread.sleep(1000);
		titleName.sendKeys(Title);
		Thread.sleep(1000);
		question.sendKeys(Topic);
		Thread.sleep(1000);
		

		resetButton.click();
		Thread.sleep(1000);
		return true;

	}

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
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
	public Boolean searchRecruitmentEvalutionNamepagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		evaluationForm.click();
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}

		return true;
		
		
	}
}
