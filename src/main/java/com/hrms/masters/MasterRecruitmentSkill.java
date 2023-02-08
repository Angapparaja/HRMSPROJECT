package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterRecruitmentSkill extends TestBase {

	@FindBy(xpath = "//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;

	//Recruitment
	@FindBy(xpath = "//*[text()='RECRUITMENT']")
	WebElement recruitment;

	//Skill
	@FindBy(xpath = "//*[text()='Skill']")
	WebElement skill;

	// ADD Skill
	@FindBy(xpath = "//*[@id='swap']")
	WebElement addSkill;

	//SkillName 
	@FindBy(xpath = "//*[@id='SkillName']")
	WebElement skillName;

	
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

	// SkillName Mandatory
	@FindBy(xpath = "//*[text()='Please Enter skill Name']")
	WebElement titleMandatory;
	//searchBox
	@FindBy(xpath="//input[@type='search']")
	WebElement searchBox;
	
	public MasterRecruitmentSkill() {
		PageFactory.initElements(driver, this);
	}

	public String addWorkLocatin() {
		return new String();
	}

	public boolean addSkill(String SkillName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
		Thread.sleep(500);
		addSkill.click();
		Thread.sleep(500);
		skillName.sendKeys(SkillName);
		
		saveButton.click();
		
		return true;

	}
	
	public String addSkillNegativeCheck(String SkillName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(500);
		skill.click();
		Thread.sleep(500);
		addSkill.click();
		Thread.sleep(1000);
		skillName.sendKeys(SkillName);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}

	public String addSkillDuplicateCheck(String SkillName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
		Thread.sleep(500);
		addSkill.click();
		Thread.sleep(500);
		skillName.sendKeys(SkillName);
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}
	
	public String skillNameMandatoryFieldCheck() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
		Thread.sleep(500);
		addSkill.click();
		Thread.sleep(500);
//		skillName.sendKeys("Artificial Intelligence");
		Thread.sleep(500);
		saveButton.click();
		Thread.sleep(500);
		String value=duplicateCheck.getText(); 
		return value;

	}

	public boolean verifyResetButton(String SkillName) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
		Thread.sleep(500);
		addSkill.click();
		Thread.sleep(500);
		skillName.sendKeys(SkillName);
		
	
		resetButton.click();
	
		return true;

	}

	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
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
	public Boolean searchRecruitmentSkillpagination(String search) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		recruitment.click();
		Thread.sleep(1000);
		skill.click();
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
