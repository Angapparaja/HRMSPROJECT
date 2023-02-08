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

public class MasterPositionJobLevel extends TestBase {
	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	
	//jobPosition
//			@FindBy(xpath = "//*[@id='job_position']")
//			WebElement jobPosition;

	//Job Level
//		@FindBy(xpath = "//*[text()='Job Level']")
//		WebElement jobLevel;

		//JobLevelAdd
//		@FindBy(xpath = "//*[@id='swap']")
//		WebElement jobLevelAdd;
		
		//Job Level
//		@FindBy(xpath = "//*[@id='levelName']")
//		WebElement jobLevelName;
		
		
		//Hierarchy
//		@FindBy(xpath = "//*[@id='weightage']")
//		WebElement hierarchy;
		
		
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
		
		//levelName
//		@FindBy(xpath = "//*[text()='Enter Job Level name']")
//		WebElement jobLevelMandatory;
				
				
		//next button
//		@FindBy(xpath = "//*[text()='Next']")
//		WebElement nextButton;
		
		//searchBox
//		@FindBy(xpath="//input[@type='search']")
//		WebElement searchBox;
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By jobPosition=By.xpath("//*[@id='job_position']");
	
	By jobLevel=By.xpath("//*[text()='Job Level']");

	By jobLevelAdd=By.xpath("//*[@id='swap']");
	
	By jobLevelName=By.xpath("//*[@id='levelName']"); 
	
	By hierarchy=By.xpath("//*[@id='weightage']"); 
	
	By saveButton=By.xpath("//*[text()='Save']"); 
	
	By resetButton=By.xpath("//*[text()='Reset']"); 
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']"); 
	
	By jobLevelMandatory=By.xpath("//*[text()='Enter Job Level name']"); 
	
	By nextButton=By.xpath("//*[text()='Next']"); 
	
	By searchBox=By.xpath("//input[@type='search']");
	

		
	public MasterPositionJobLevel() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean jobLevelAdd(String joblevel,String Hierarchy) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		jobLevelName.sendKeys(joblevel);
//		Thread.sleep(1000);
//		Select hiera=new Select(hierarchy);
//		hiera.selectByVisibleText(Hierarchy);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(jobLevelName, joblevel);
		Thread.sleep(500);	
		ElementUtil.doSelectByVisibleText(hierarchy, Hierarchy);
		Thread.sleep(500);	
		ElementUtil.doClick(saveButton);
	
		return true;
		
	}
	
	public String jobLevelNegativeCheck(String joblevel,String Hierarchy) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		jobLevelName.sendKeys(joblevel);
//		Thread.sleep(1000);
//		Select hiera=new Select(hierarchy);
//		hiera.selectByVisibleText(Hierarchy);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String negative=duplicateCheck.getText(); 
//		return negative;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(jobLevelName, joblevel);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(hierarchy, Hierarchy);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
		
	}
	
	public String jobLevelAddMandatoryFieldVaidation(String Hierarchy) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		//jobLevelName.sendKeys("Level");
//		Thread.sleep(1000);
////		Select hiera=new Select(hierarchy);
////		hiera.selectByVisibleText("3");
////		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String joblevel=duplicateCheck.getText(); 
//		return joblevel;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		Thread.sleep(500);
	
		ElementUtil.doSelectByVisibleText(hierarchy, "3");
		Thread.sleep(500);	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);

		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	

	}
	
	
	public String HierarchyAddMandatoryFieldVaidation(String joblevel) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		jobLevelName.sendKeys(joblevel);
//		Thread.sleep(1000);
////		Select hiera=new Select(hierarchy);
////		hiera.selectByVisibleText("3");
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String hier=duplicateCheck.getText(); 
//		return hier;
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		
		ElementUtil.doSendKeys(jobLevelName, joblevel);
		
	
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
	}
	
	public String jobLevelAddDuplicateCheckValidation(String joblevel,String Hierarchy) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		jobLevelName.sendKeys(joblevel);
//		Thread.sleep(1000);
//		Select hiera=new Select(hierarchy);
//		hiera.selectByVisibleText(Hierarchy);
//		Thread.sleep(1000);
//		saveButton.click();
//		Thread.sleep(1000);
//		String hier=duplicateCheck.getText(); 
//		return hier;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(jobLevelName, joblevel);
		Thread.sleep(500);	
		ElementUtil.doSelectByVisibleText(hierarchy, Hierarchy);
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String toastname=ElementUtil.doGetText(duplicateCheck);
		return toastname;	
		
	}
	
	public boolean verifyResetButton(String joblevel,String Hierarchy) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		jobLevelAdd.click();
//		Thread.sleep(1000);
//		jobLevelName.sendKeys(joblevel);
//		Thread.sleep(1000);
//		Select hiera=new Select(hierarchy);
//		hiera.selectByVisibleText(Hierarchy);
//		Thread.sleep(1000);
//		resetButton.click();
//		Thread.sleep(1000);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		ElementUtil.doClick(jobLevelAdd);
		Thread.sleep(500);
		ElementUtil.doSendKeys(jobLevelName, joblevel);
		Thread.sleep(500);	
		ElementUtil.doSelectByVisibleText(hierarchy, Hierarchy);
		Thread.sleep(500);	
		ElementUtil.doClick(resetButton);
		
		return true;
		
	}
	
	
	
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);
		
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
//                nextButton.click();
        	ElementUtil.doClick(nextButton);
            Thread.sleep(500);
            System.out.println("pagination button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("pagination button not visible");
        } 
        return flag;
		
	}
	
	public Boolean searchJoblevelNamepagination(String Qualificat) throws InterruptedException {
//		masterIcon.click();
//		Thread.sleep(1000);
//		jobPosition.click();
//		Thread.sleep(1000);
//		jobLevel.click();
//		Thread.sleep(1000);
//		searchBox.sendKeys(Qualificat);
//		Thread.sleep(1000);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(jobPosition);
		Thread.sleep(1000);
		ElementUtil.doClick(jobLevel);
		Thread.sleep(500);

		ElementUtil.doSendKeys(searchBox, Qualificat);
		Thread.sleep(500);	

		List<WebElement> Listss=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:Listss) {
			String Value=e.getText();
			System.out.println(Value);
		}

		return true;
		
		
	}
	
}
