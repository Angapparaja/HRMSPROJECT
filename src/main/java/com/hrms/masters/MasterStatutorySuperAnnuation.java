package com.hrms.masters;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterStatutorySuperAnnuation extends TestBase{

	//MasterPage
		@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
		WebElement masterIcon;
		
		
		//StatutoryMenu
			@FindBy(xpath="//span[@id='stat_font']")
			WebElement StatutoryMenu;
			
			//StatutorySuperannuation
			@FindBy(xpath="//span[@id='lifeInsurance']")
			WebElement StatutorySuperannuation;
			
			//SuperannuationEarningcomponent
			@FindBy(xpath="//select[@multiple='multiple']")
			WebElement SuperannuationEarningcomp;
			
			//SuperannuationMonth
			@FindBy(xpath="//select[@id='licpsMonthDeduct']")
			WebElement SuperannuationMonth;
			
			//duplicate Check
			//	@FindBy(xpath = "//*[text()='toast-container']")
				@FindBy(xpath="//div[@class='toast-message']")
				WebElement duplicateCheck;
				
				
				//edit button
				@FindBy(xpath = "//a[@class='fa fa-edit']")
				WebElement EditBtn;
				
				//update button
				@FindBy(xpath = "//button[text()='Update']")
				WebElement UpdateBtn;
				
				//resetbutton 
				@FindBy(xpath = "//button[text()='Reset']")
				WebElement ResetBtn;
				
				//next button
				@FindBy(xpath = "//*[text()='Next']")
				WebElement nextButton;
				
				//searchBox
				@FindBy(xpath="//input[@type='search']")
				WebElement searchBox;
				
				public MasterStatutorySuperAnnuation() {
					PageFactory.initElements(driver, this);
				}
				public String addWorkLocatin() {
					return new String();
				}
				
				public boolean MasterStatutoryMenuSUPERANNUATIONAdd(String earningcom,String month) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					StatutoryMenu.click();
					Thread.sleep(1000);
					StatutorySuperannuation.click();
					Thread.sleep(1000);
				
					Select SuperannuationEarningcomps=new Select(SuperannuationEarningcomp);
					SuperannuationEarningcomps.selectByVisibleText(earningcom);
					Thread.sleep(1000);
					
					Select SuperannuationMonths=new Select(SuperannuationMonth);
					SuperannuationMonths.selectByVisibleText(month);
					Thread.sleep(1000);

					UpdateBtn.click();
					Thread.sleep(1000);
					return true;

					
					
					}
				
				public boolean MasterStatutoryMenuSUPERANNUATIONResetButton(String earningcom,String month) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					StatutoryMenu.click();
					Thread.sleep(1000);
					StatutorySuperannuation.click();
					Thread.sleep(1000);
				
					Select SuperannuationEarningcomps=new Select(SuperannuationEarningcomp);
					SuperannuationEarningcomps.selectByVisibleText(earningcom);
					Thread.sleep(1000);
					
					Select SuperannuationMonths=new Select(SuperannuationMonth);
					SuperannuationMonths.selectByVisibleText(month);
					Thread.sleep(1000);

					ResetBtn.click();
					Thread.sleep(1000);
					return true;

					}
				
				public String MasterStatutorySUPERANNUATIONMonthMandatoryFieldCheck(String earningcom,String month) throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					StatutoryMenu.click();
					Thread.sleep(1000);
					StatutorySuperannuation.click();
					Thread.sleep(1000);
				
					Select SuperannuationEarningcomps=new Select(SuperannuationEarningcomp);
					SuperannuationEarningcomps.selectByVisibleText(earningcom);
					Thread.sleep(1000);
					
//					Select SuperannuationMonths=new Select(SuperannuationMonth);
//					SuperannuationMonths.selectByVisibleText(month);
//					Thread.sleep(1000);

					UpdateBtn.click();
					Thread.sleep(1000);
					String value=duplicateCheck.getText(); 
					return value;

					}
				
				
				public boolean isnextbuttonStatutorySUPERANNUATIONPaginationVisible() throws InterruptedException {
					masterIcon.click();
					Thread.sleep(1000);
					StatutoryMenu.click();
					Thread.sleep(1000);
					StatutorySuperannuation.click();
					Thread.sleep(1000);
					
					
					boolean flag = false;
				    try {
				        WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
				        if (element.isDisplayed() || element.isEnabled())
//				            flag = false;
				            nextButton.click();
				        System.out.println("next button visible");
				    } catch (NoSuchElementException e) {
//				        flag = true;
				        System.out.println("next button not visible");
				    } 
				    return flag;
					
				}
	
	
}
