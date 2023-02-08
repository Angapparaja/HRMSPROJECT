package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.hrms.base.TestBase;
import com.hrms.util.AppReusableComponents;
import com.hrms.util.ElementUtil;

public class MasterGeoCity extends TestBase {

	
//	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
//	WebElement masterIcon;
	//	By geography=By.xpath("//*[@id='geography']");
    //  By city=By.xpath("//span[@id='city']");    
    //			
    //	private By cityADD =By.id("//*[@id='swap']");
    //	city 
	//Country select
//	@FindBy(xpath = "//*[@id='countryId']")
//	WebElement countrySelect;
//	private By countrySelect =By.xpath("//*[@id='countryId']");
//	//city Name
//	@FindBy(xpath = "//*[@id='cityName']")
//	WebElement cityName;
	
	
	//geography
//	@FindBy(xpath = "//*[@id='geography']")
//	WebElement geography;
	
//
//@FindBy(xpath ="//span[@id='city']")
//WebElement city;
//
////select location
//@FindBy(xpath="(//span[@class='checkmark'])[1]")
//WebElement Locationetro;
//
////population select
//@FindBy(xpath="//select[@id='population']")
//WebElement population;
//
//
////City ADD
//@FindBy(xpath = "//*[@id='swap']")
//WebElement cityADD;
	
	//CountryList
//	@FindBy(xpath="//tbody/tr/td[2][text()]")
//	WebElement CountryList;
	
	//State select
//	@FindBy(xpath = "//*[@id='stateId']")
//	WebElement stateSelect;
	
	//save button
//	@FindBy(xpath = "//*[text()='Save']")
//	WebElement saveButton;
	
	//reset button
//	@FindBy(xpath = "//*[text()='Reset']")
//	WebElement resetButton;
	
	//duplicate Check
//	@FindBy(xpath = "//*[text()='toast-container']")
//	@FindBy(xpath="//div[@class='toast-message']")
//	WebElement duplicateCheck;
	
	//state Mandatory
//	@FindBy(xpath = "//*[text()='Please select province']")
//	WebElement stateMandatory;
	
	//city Mandatory
//	@FindBy(xpath = "//*[text()='Please enter city']")
//	WebElement cityMandatory;
	
	//State Mandatory
//	@FindBy(xpath = "//*[text()='Please select country']")
//	WebElement countryMandatory;
	
	//next button
//	@FindBy(xpath = "//*[text()='Next']")
//	WebElement nextButton;
	
	//searchBox
//	@FindBy(xpath="//input[@type='search']")
//	WebElement searchBox;
	
	
	By masterIcon=By.xpath("//img[@src='resources/images/menu-icon-5.png']");
	
	By geography=By.xpath("//*[@id='geography']");
	
	By city=By.xpath("//span[@id='city']");
	
	By Locationetro=By.xpath("(//span[@class='checkmark'])[1]");
	
	By population=By.xpath("//select[@id='population']");
	
	By cityADD=By.xpath("//*[@id='swap']");

    By countrySelect=By.xpath("//*[@id='countryId']");

	By cityName=By.xpath("//*[@id='cityName']");
	
	By CountryList=By.xpath("//tbody/tr/td[2][text()]");
	
	By stateSelect=By.xpath("//*[@id='stateId']");
	
	By saveButton=By.xpath("//*[text()='Save']");
	
	By resetButton=By.xpath("//*[text()='Reset']");
	
	By duplicateCheck=By.xpath("//div[@class='toast-message']");
	
	By stateMandatory=By.xpath("//*[text()='Please select province']");
	
	By cityMandatory=By.xpath("//*[text()='Please enter city']");
	
	By countryMandatory=By.xpath("//*[text()='Please select country']");
	
	By nextButton=By.xpath("//*[text()='Next']");
	
	By searchBox=By.xpath("//input[@type='search']");

	public MasterGeoCity() {
		PageFactory.initElements(driver, this);
	
	}
	
	public String addWorkLocatin() {
		return new String();
	}
	
	public static WebElement waitForElementPresense(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void doSelectByVisibleText(By countrySelect2, String text) {
		Select select = new Select(getElement(countrySelect2));
		select.selectByVisibleText(text);
	}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);	
		return element;
	}

	public boolean addCity() throws InterruptedException {
//		ElementUtil.waitForElementPresense(geography,10);		
//		geography.click();
//		WebDriverWait wait=new WebDriverWait(driver,10 ,2000);
//		wait.until(ExpectedConditions.presenceOfElementLocated( city)).click();	
//		city.click();
//		WebElement dynamicElement = (new WebDriverWait(driver, 10))
//		        .until(ExpectedConditions.presenceOfElementLocated(city));
//		dynamicElement.click();
//		AppReusableComponents.doSendKeys(, MainWindow);
//		waitForElementPresense(city,30).click();		
//		cityADD.click();
//		ElementUtil.waitForElementPresenseSelectVisible(countrySelect,"India",20);
		//doSelectByVisibleText(countrySelect,"India");
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Karnataka");
		//Thread.sleep(1500);
		//cityName.sendKeys("Bangalore");3
//		ElementUtil.doSendKeys(cityName, "Bangalore");
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(city);
		Thread.sleep(500);
		ElementUtil.doClick(cityADD);
		
		ElementUtil.doSelectByVisibleText(countrySelect, "India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Karnataka");
		Thread.sleep(500);
		ElementUtil.doSendKeys(cityName, "Bangalore");
	
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(Locationetro);
//            	Locationetro.click();
			Thread.sleep(500);
//			Select populations=new Select(population);
//			populations.selectByVisibleText("CAT - A (>25LAKHS)");
           // System.out.println("next button visible");
			ElementUtil.doSelectByVisibleText(population, "CAT - A (>25LAKHS)");

        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("location not visible");
        } 
		
        
	     ElementUtil.doClick(saveButton);
//		saveButton.click();
		Thread.sleep(500);
		
		return true;
		
	}
	

	public String addCityNegativeCheck() throws InterruptedException {
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Tamilnadu");
		//cityName.sendKeys("*#$$5");
//		saveButton.click();
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(city);
		Thread.sleep(500);
		ElementUtil.doClick(cityADD);
		
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Karnataka");
		

		ElementUtil.doSendKeys(cityName, "*#$$5");
		Thread.sleep(500);
		ElementUtil.doClick(saveButton);

		Thread.sleep(500);
		String duplicatenames=ElementUtil.doGetText(duplicateCheck);
		return duplicatenames;
		 
	}
	
	public String addGeoCountryMandatoryFieldVaidation() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
//		cityADD.click();
//		Thread.sleep(1500);
		//Select country=new Select(countrySelect);
		//country.deselectByIndex(0);
		//stateName.sendKeys("Kyiv");
//		saveButton.click();
//		String countryMandatory=duplicateCheck.getText();
//		Thread.sleep(1500);
//		Assert.assertEquals("Please select country", text);
//		Thread.sleep(3000);
//		return countryMandatory;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(city);
		Thread.sleep(500);
		ElementUtil.doClick(cityADD);
		Thread.sleep(1000);
		ElementUtil.doClick(saveButton);
		Thread.sleep(1000);
		String duplicatenames=ElementUtil.doGetText(duplicateCheck);
		return duplicatenames;	
	}
	
	
	public String addSateMandatoryFieldVaidation() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
//		cityADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
		//stateName.sendKeys("Kyiv");
//		saveButton.click();
//		String stateMandatory=duplicateCheck.getText();
//		Thread.sleep(1500);
//		return stateMandatory;
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1500);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(city);
		Thread.sleep(1000);
		ElementUtil.doClick(cityADD);
		Thread.sleep(1000);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(1500);
		ElementUtil.doClick(saveButton);
		Thread.sleep(1000);
		String duplicatenames=ElementUtil.doGetText(duplicateCheck);
		return duplicatenames;		
	}
	
	
	
	public String addGeoCityDuplicateCheckValidation() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
//		cityADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Karnataka");
//		Thread.sleep(1500);
	//	cityName.sendKeys("Bangalore");
//		  String text=duplicateCheck.getText(); 
//		  System.out.println(text);
//		  Assert.assertEquals("Duplicate Data-Please check", text);
//		  Thread.sleep(1500);
//		return text;

		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(city);
		Thread.sleep(500);
		ElementUtil.doClick(cityADD);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Karnataka");
	
		ElementUtil.doSendKeys(cityName, "Bangalore");
	
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("(//span[@class='checkmark'])[1]"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(Locationetro);
//            	Locationetro.click();
//			Select populations=new Select(population);
//			populations.selectByVisibleText("CAT - A (>25LAKHS)");
           // System.out.println("next button visible");
//    		saveButton.click();
//    		Thread.sleep(1500);
			Thread.sleep(500);
			ElementUtil.doSelectByVisibleText(population, "CAT - A (>25LAKHS)");
			

        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("location not visible");
        } 
        ElementUtil.doClick(saveButton);
		Thread.sleep(500);
		String duplicatenames=ElementUtil.doGetText(duplicateCheck);
		return duplicatenames;			
	}
	
	public boolean addCityResetButton() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
//		cityADD.click();
//		Thread.sleep(1500);
//		Select country=new Select(countrySelect);
//		country.selectByVisibleText("India");
//		Select state=new Select(stateSelect);
//		state.selectByVisibleText("Tamilnadu");
//		Thread.sleep(1500);
//		cityName.sendKeys("South Carolina New"); 
//		resetButton.click();
//		Thread.sleep(1500);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doClick(geography);
		Thread.sleep(500);
		ElementUtil.doClick(city);
		Thread.sleep(500);
		ElementUtil.doClick(cityADD);
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(countrySelect,"India");
		Thread.sleep(500);
		ElementUtil.doSelectByVisibleText(stateSelect, "Karnataka");
		
		ElementUtil.doSendKeys(cityName, "South Carolina New");
		Thread.sleep(500);
		ElementUtil.doClick(resetButton);
		return true;
		
	}
	
	
	
	
	
	public boolean selectCountryPagination() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
		
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1500);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(city);
		Thread.sleep(1000);
		List<WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']//a"));
		
		int i=1;
		
		while(true) {
			if(driver.findElements(By.xpath("//tbody/tr/td[2][text()='India']")).size()>0) {
				List<WebElement> Country=driver.findElements(By.xpath("//tbody/tr/td[2][text()='India']"));
				for(WebElement e:Country) {
					String Countryname=e.getText();
					System.out.println(Countryname);
				}
				break;
			}else {
				try {
					pages.get(i).click();
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("pagination is overand we didnt find any contact...");
					break;
				}
				pages=driver.findElements(By.xpath("//ul[@class='pagination']//a"));
			}
			i++;
		}
 		
//		String CountryLists=CountryList.getText();
//		String Countryname="Uganda";
//		if(CountryLists.equals(Countryname)) {
//			
//		}
			
		
	//	nextButton.click();
		Thread.sleep(500);
		return true;
		
	}
	
	public boolean isnextbuttonPaginationVisible() throws InterruptedException {
//		geography.click();
//		Thread.sleep(1500);
//		city.click();
//		Thread.sleep(1500);
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1500);
		ElementUtil.doClick(geography);
		Thread.sleep(1000);
		ElementUtil.doClick(city);
		Thread.sleep(1000);
		boolean flag = false;
        try {
            WebElement element = driver.findElement(By.xpath("//*[text()='Next']"));
            if (element.isDisplayed() || element.isEnabled())
//                flag = false;
            	ElementUtil.doClick(nextButton);
//                nextButton.click();
            System.out.println("next button visible");
        } catch (NoSuchElementException e) {
//            flag = true;
            System.out.println("next button not visible");
        } 
        return flag;
	
		
		
	}
	
	public Boolean searchboxCountryNamepagination() throws InterruptedException {
		ElementUtil.doClick(masterIcon);
		Thread.sleep(1000);
		ElementUtil.doSendKeys(searchBox, "India");
//		searchBox.sendKeys("India");
//		Thread.sleep(1000);
		List<WebElement> CountryName=driver.findElements(By.xpath("//tbody/tr/td[2][text()]"));
		for(WebElement e:CountryName) {
			String CountryNames=e.getText();
			System.out.println(CountryNames);
		}

		return true;
		
		
	}
}
