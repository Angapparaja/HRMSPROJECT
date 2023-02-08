package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.base.TestBase;

public class MasterPayRollCurrency extends TestBase{
	//MasterPage
	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//PayRollMenu
	@FindBy(xpath="//span[@id='pay_font']")
	WebElement PayRoll;
	
	//CurrencyADD
	@FindBy(xpath = "//*[@id='swap']")
	WebElement CurrencyADD;
	
	//Payroll Currency
	@FindBy(xpath="//span[@id='currencyMaster']")
	WebElement Currency;
	
	//SelectCountryName
	@FindBy(xpath="//*[@id='countryName']")
	WebElement CountryName;
	
	//SelectCurrencyName
		@FindBy(xpath="//input[@id='currencyname']")
		WebElement CurrencyName;
	//CurrencySymbol
		@FindBy(xpath="//input[@id='currencycode']")
		WebElement CurrencySymbol;
		
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
				
					@FindBy(xpath="//div[@class='toast-message']")
					WebElement duplicateCheck;
					
					//searchBox
					@FindBy(xpath="//input[@type='search']")
					WebElement searchBox;
					
					public MasterPayRollCurrency() {
						PageFactory.initElements(driver, this);
					}
					
					public String addWorkLocatin() {
						return new String();
					}
					
					
					public boolean addPayRollCurrency(String Country,String CurrencyNames,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						saveButton.click();
						Thread.sleep(1000);
						return true;
						
					}
					
					
					public String addPayRollCurrencyNameNegativecheck(String Country,String CurrencyNames,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						saveButton.click();
						Thread.sleep(1000);
						String value=duplicateCheck.getText(); 
						return value;
						
					}
					
					public String addCurrencyCountryNameMandatoryFieldVaidation(String CurrencyNames,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
//						Select CountryNames=new Select(CountryName);
//						CountryNames.selectByVisibleText("Togo");
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						saveButton.click();
						Thread.sleep(1000);
						
						String CurrencyCountryNameMandatoryFieldVaidation = duplicateCheck.getText();
						return CurrencyCountryNameMandatoryFieldVaidation;
						
					}
					
					
					public String addCurrencyNameMandatoryFieldVaidation(String Country,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
//						CurrencyName.sendKeys("doller");
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						saveButton.click();
						Thread.sleep(1000);
						
						String CurrencyNameMandatoryFieldVaidation = duplicateCheck.getText();
						return CurrencyNameMandatoryFieldVaidation;
							
					}
					
					public String addCurrencySymbolMandatoryFieldVaidation(String Country,String CurrencyNames) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
//						CurrencySymbol.sendKeys("doller");
						saveButton.click();
						Thread.sleep(1000);
						
						String CurrencySymbolMandatoryFieldVaidation = duplicateCheck.getText();
						return CurrencySymbolMandatoryFieldVaidation;
							
					}
					
					
					public String addPayRollCurrencyDuplicateCheckValidation(String Country,String CurrencyNames,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						saveButton.click();
						Thread.sleep(1000);
						
						String PayRollCurrencyDuplicateCheckValidation = duplicateCheck.getText();
						Thread.sleep(1000);
						return PayRollCurrencyDuplicateCheckValidation;
					
					}
				
					
					public boolean addCurrencyResetButton(String Country,String CurrencyNames,String CurrencySymbols) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						CurrencyADD.click();
						Thread.sleep(1000);
						Select CountryNames=new Select(CountryName);
						CountryNames.selectByVisibleText(Country);
						CurrencyName.sendKeys(CurrencyNames);
						Thread.sleep(1000);
						CurrencySymbol.sendKeys(CurrencySymbols);
						resetButton.click();
						Thread.sleep(1000);
						return true;
					}
					
					
					
					
					public boolean isnextbuttonPaginationVisible() throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
						Thread.sleep(1000);
						
						
						boolean flag = false;
				        try {
				            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
				            if (element.isDisplayed() || element.isEnabled())
//				                flag = false;
				                nextButton.click();
				            System.out.println("next button visible");
				        } catch (NoSuchElementException e) {
//				            flag = true;
				            System.out.println("next button not visible");
				        } 
				        return flag;
						
					}
					
					public Boolean searchPositionTitleNamepagination(String search) throws InterruptedException {
						masterIcon.click();
						Thread.sleep(1000);
						PayRoll.click();
						Thread.sleep(1000);
						Currency.click();
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
