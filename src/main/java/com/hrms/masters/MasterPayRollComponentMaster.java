package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayRollComponentMaster extends TestBase{

	
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
			
			//ComponentTypeAllowence
			@FindBy(xpath="//*[@id='categoryOfCTCgroup']")
			WebElement ComponentTypeAllow;
			
			//BasisComputation SSSActual
			@FindBy(xpath="(//span[@class='checkmark'])[9]")
			WebElement BasisCompSSSactual;
			
			//BasisComputation PagiBig
			@FindBy(xpath="(//span[@class='checkmark'])[14]")
			WebElement BasisPagibig;
			
	
			//OtherDeductionYes
			@FindBy(xpath="(//span[@class='checkmark'])[17]")
			WebElement DeductionYes;
			
			//TaxApplicability
			@FindBy(xpath="//select[@id='tax']")
			WebElement Taxapplicat;
			
			//LevelCheckBox;
			@FindBy(xpath="(//span[@class='checkmark'])[23]")
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
				
			
			public MasterPayRollComponentMaster() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			public boolean addPayRollComponentMaster(String ComponentCodes,String ComponentNames,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				//boolean flag = false;
		 
		        
		        
		        try {
		            WebElement element = driver.findElement(By.xpath("//select[@id='tax']"));
		            if (element.isDisplayed() || element.isEnabled()) {
	                Select Taxapplicability=new Select(Taxapplicat);
	                Taxapplicability.selectByVisibleText("Taxable");
		            	
		        } 
		        }catch (NoSuchElementException e) {
//		            flag = true;
		            System.out.println("select Tax button not visible");
		        } 
				
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				 try {
			            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
			            if (element.isDisplayed() || element.isEnabled()) {
//			                flag = false;
			            	boolean selectType1 = BasisCompSSSactual.isSelected();
							if(selectType1 == false) {
								BasisCompSSSactual.click();
							}
							
							boolean selectType2 = BasisPagibig.isSelected();
							if(selectType2 == false) {
								BasisPagibig.click();
							}
			        } 
			        }catch (NoSuchElementException e) {
//			            flag = true;
			            System.out.println("Basic Computation For button not visible");
			        } 
				
				
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			public String PayRollComponentMasterNegativeCheck(String ComponentCodes,String ComponentNames,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String PayRollComponentMasterComponentCodeMandatoryCheck(String ComponentNames,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
//				ComponentCode.sendKeys(ComponentCodes);
//				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			
			public String PayRollComponentMasterComponentNameMandatoryCheck(String ComponentCodes,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
//				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String PayRollComponentMasterCompensationMandatoryFieldCheck(String ComponentCodes,String ComponentNames,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
//				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public boolean resetbuttonvalidation(String ComponentCodes,String ComponentNames,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				resetButton.click();
				Thread.sleep(1500);
				return true;
				
			}
			
			
			public String PayRollComponentMasteduplicatecheckvalidation(String ComponentCodes,String ComponentNames,String Compensation,String computation,String paymentFrequency) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				AddComponentMaster.click();
				Thread.sleep(1500);
				ComponentCode.sendKeys(ComponentCodes);
				Thread.sleep(1500);
				ComponentName.sendKeys(ComponentNames);
				Thread.sleep(1500);
				CompensationDef.sendKeys(Compensation);
				
				Select ComputationMethods=new Select(ComputationMethod);
				ComputationMethods.selectByVisibleText(computation);
				
				Select PaymentFrequens=new Select(PaymentFrequen);
				PaymentFrequens.selectByVisibleText(paymentFrequency);
				
				
				boolean selectType = ComponentTypeAllow.isSelected();
				if(selectType == false) {
					ComponentTypeAllow.click();
				}
				
				boolean selectType1 = BasisCompSSSactual.isSelected();
				if(selectType1 == false) {
					BasisCompSSSactual.click();
				}
				
				boolean selectType2 = BasisPagibig.isSelected();
				if(selectType2 == false) {
					BasisPagibig.click();
				}
				
				boolean selectType3 = DeductionYes.isSelected();
				if(selectType3 == false) {
					DeductionYes.click();
				}
				
				boolean selectType4 = LevelCheckBox.isSelected();
				if(selectType4 == false) {
					LevelCheckBox.click();
				}
				
				saveButton.click();
				Thread.sleep(1500);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				
				
				boolean flag = false;
		        try {
		            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
		            if (element.isDisplayed() || element.isEnabled())
//		                flag = false;
		                nextButton.click();
		            System.out.println("next button visible");
		        } catch (NoSuchElementException e) {
//		            flag = true;
		            System.out.println("next button not visible");
		        } 
		        return flag;
				
			}
			
			public Boolean searchComponentMasterpagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1500);
				PayRoll.click();
				Thread.sleep(1500);
				ComponentMaster.click();
				Thread.sleep(1500);
				searchBox.sendKeys(search);
				Thread.sleep(1500);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}
}
