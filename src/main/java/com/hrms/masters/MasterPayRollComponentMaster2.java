package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayRollComponentMaster2 extends TestBase{

	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//PayRollMenu
	@FindBy(xpath="//span[@id='pay_font']")
	WebElement PayRoll;
	
	//ComponentMaster
	@FindBy(xpath="//span[@id='earnings']")
	WebElement ComponentMaster;
	
	//ADDComponentMaster
	@FindBy(xpath = "//*[@id='swap']")
	WebElement AddComponentMaster;
	
	
	
	//ComponentCode
	@FindBy(xpath="//input[@id='incomeCode']")
	WebElement ComponentCode;
	
	//ComponentName
	@FindBy(xpath="//input[@id='name']")
	WebElement ComponentName;
	
	//CompensationDefinitions
	@FindBy(xpath="//textarea[@name='compensationDef']")
	WebElement CompensationDef;
	
	//COMPUTATION METHOD
	@FindBy(xpath="//*[@id='salCompType']")
	WebElement ComputationMethod;
	
	//PaymentFrequency
	@FindBy(xpath="//*[@id='categoryOfCTCgroup']")
	WebElement PaymentFrequen;
	
//componentType
	@FindBy(xpath="(//span[@class='checkmark'])[3]")
	WebElement ComponentTypeEarings;
	
	
	
	
	//CTC Upload Component
	@FindBy(xpath="(//span[@class='checkmark'])[1]")
	WebElement CtcUpload;
	
//	//OtherDeductionYes
//	@FindBy(xpath="(//span[@class='checkmark'])[17]")
//	WebElement DeductionYes;
	
	//payslipComponent
	@FindBy(xpath="(//span[@class='checkmark'])[9]")
	WebElement paySlip;
	
	//TaxApplicability
	@FindBy(xpath="//select[@id='tax']")
	WebElement Taxapplicat;
	
	//CtcComponent
	@FindBy(xpath="(//span[@class='checkmark'])[11]")
	WebElement CTCCOMPONENT;
	
	//LevelCheckBox;
	@FindBy(xpath="(//span[@class='checkmark'])[15]")
	WebElement LevelCheckBox;
	
	//save button
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveButton;
	
	//reset button
	@FindBy(xpath = "//*[text()='Reset']")
	WebElement resetButton;
	
	//next button
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	
	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;
		
		//searchBox
		@FindBy(xpath="//input[@type='search']")
		WebElement searchBox;
		
		 //edit button
		@FindBy(xpath = "//a[@class='fa fa-edit']")
		WebElement EditBtn;
		
		//update button
		@FindBy(xpath = "//button[text()='Update']")
		WebElement UpdateBtn;
		

		
	
	public MasterPayRollComponentMaster2() {
		PageFactory.initElements(driver, this);
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public boolean addPayRollComponentMaster(String ComponentCodes,String ComponentNames,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
		Thread.sleep(1000);
		ComponentName.sendKeys(ComponentNames);
		Thread.sleep(1000);
		CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		return true;
		
	}
	
	public String PayRollComponentMasterNegativeCheck(String ComponentCodes,String ComponentNames,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
		Thread.sleep(1000);
		ComponentName.sendKeys(ComponentNames);
		Thread.sleep(1000);
		CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	
	public String PayRollComponentMasterComponentCodeMandatoryCheck(String ComponentNames,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
//		ComponentCode.sendKeys(ComponentCodes);
//		Thread.sleep(1000);
		ComponentName.sendKeys(ComponentNames);
		Thread.sleep(1000);
		CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	
	public String PayRollComponentMasterComponentNameMandatoryCheck(String ComponentCodes,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
		Thread.sleep(1000);
//		ComponentName.sendKeys(ComponentNames);
//		Thread.sleep(1000);
		CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public String PayRollComponentMasterCompensationMandatoryFieldCheck(String ComponentCodes,String ComponentNames,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
		Thread.sleep(1000);
		ComponentName.sendKeys(ComponentNames);
		Thread.sleep(1000);
//		CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	
	public boolean resetComponentMasterbuttonvalidation(String ComponentCodes,String ComponentNames,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
		
		ComponentName.sendKeys(ComponentNames);
		
    	CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		resetButton.click();
	
		return true;
		
	}
	
	
	public String PayRollComponentMasteduplicatecheckvalidation(String ComponentCodes,String ComponentNames,String Compensation,String computation,String Tax,String paymentFrequency) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		AddComponentMaster.click();
		Thread.sleep(1000);
		ComponentCode.sendKeys(ComponentCodes);
	
		ComponentName.sendKeys(ComponentNames);
		
    	CompensationDef.sendKeys(Compensation);
		
		Select ComputationMethods=new Select(ComputationMethod);
		ComputationMethods.selectByVisibleText(computation);
		

            boolean selectType5 = CtcUpload.isSelected();
			if(selectType5 == false) {
				CtcUpload.click();
			}
 

        Select Taxapplicability=new Select(Taxapplicat);
        Taxapplicability.selectByVisibleText(Tax);
     
		Select PaymentFrequens=new Select(PaymentFrequen);
		PaymentFrequens.selectByVisibleText(paymentFrequency);
		
		
		boolean selectTypedd = ComponentTypeEarings.isSelected();
		if(selectTypedd == false) {
			ComponentTypeEarings.click();
		}

		
		boolean selectType3 = paySlip.isSelected();
		if(selectType3 == false) {
			paySlip.click();
		}
		
		boolean selectTypeCTC = CTCCOMPONENT.isSelected();
		if(selectTypeCTC == false) {
			CTCCOMPONENT.click();
		}
		
		boolean selectType4 = LevelCheckBox.isSelected();
		if(selectType4 == false) {
			LevelCheckBox.click();
		}
		
		saveButton.click();
		Thread.sleep(1000);
		String value=duplicateCheck.getText(); 
		return value;
		
	}
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(500);
		
		
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
	
	public Boolean searchPayRollComponentMasterpagination(String search,String searchpointvalue) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
			Thread.sleep(1000);
			
			if(searchvalues.equals(searchpointvalue)) {
				System.out.println(searchvalues);
				System.out.println("sucessfully searched : "+searchvalues);
				return true;
			}
			
//			else {
//				System.out.println("value not correct");	
//				return false;
//			}
		}

		return true;		
	}
	
	public String searchPayrollComponentMasterEdit(String search,String editvalue) throws InterruptedException {
		masterIcon.click();
		Thread.sleep(1000);
		PayRoll.click();
		Thread.sleep(1000);
		ComponentMaster.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		searchBox.sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:searchvalue) {
			String searchvalues=e.getText();
			System.out.println(searchvalues);
		}
		EditBtn.click();
		Thread.sleep(1000);
		ComponentName.clear();
		ComponentName.sendKeys(editvalue);
		Thread.sleep(1000);
		UpdateBtn.click();
		String value=duplicateCheck.getText(); 
		return value;
		
		
	}
	
}
