package com.hrms.masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;

public class MasterAssetsAssetItems extends TestBase{

	@FindBy(xpath="//img[@src='resources/images/menu-icon-5.png']")
	WebElement masterIcon;
	
	//click asset
	@FindBy(xpath="//span[@id='asset_font']")
	WebElement asset;
	

	//assetADD
	@FindBy(xpath = "//*[@id='swap']")
	WebElement AssetADD;
	
	//duplicate Check
	//	@FindBy(xpath = "//*[text()='toast-container']")
		@FindBy(xpath="//div[@class='toast-message']")
		WebElement duplicateCheck;
	
	//Itemcode
	@FindBy(xpath="//input[@id='AssetCode']")
	WebElement itemCode;
	
	//ItemName
	@FindBy(xpath="//input[@id='AssetName']")
	WebElement itemName;
	
	
	
	//save button
			@FindBy(xpath = "//*[text()='Save']")
			WebElement saveButton;
			
			//reset button
			@FindBy(xpath = "//*[text()='Reset']")
			WebElement resetButton;
	
			//next button
			@FindBy(xpath = "//*[text()='Next']")
			WebElement nextButton;
			

			//searchBox
			@FindBy(xpath="//input[@type='search']")
			WebElement searchBox;
	
			public MasterAssetsAssetItems() {
				PageFactory.initElements(driver, this);
			}
			
			public String addWorkLocatin() {
				return new String();
			}
			
			
			public boolean addAssets(String Itemcode,String ItemName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemCode.sendKeys(Itemcode);
				Thread.sleep(1000);
				itemName.sendKeys(ItemName);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				return true;
				
			}
			
			
			public String AssetsNegativeCheck(String Itemcode,String ItemName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemCode.sendKeys(Itemcode);
				Thread.sleep(1000);
				itemName.sendKeys(ItemName);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				String value=duplicateCheck.getText(); 
				return value;
				
			}
			
			public String addAssetsItemCodeMandatoryFieldVaidation(String ItemName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemName.sendKeys(ItemName);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				
				String AssetsItemCodeMandatoryFieldVaidation = duplicateCheck.getText();
				return AssetsItemCodeMandatoryFieldVaidation;
				
			}
			
			
			public String addAssetsItemNameMandatoryFieldVaidation(String Itemcode) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemCode.sendKeys(Itemcode);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				
				String workAssetsItemNameMandatoryFieldVaidation = duplicateCheck.getText();
				return workAssetsItemNameMandatoryFieldVaidation;
					
			}
			
			
			
			public String addAssetsDuplicateCheckValidation(String ItemCode,String ItemName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemCode.sendKeys(ItemCode);
				Thread.sleep(1000);
				itemName.sendKeys(ItemName);
				Thread.sleep(1000);
				saveButton.click();
				Thread.sleep(1000);
				
				String AssetsDuplicateCheckValidation = duplicateCheck.getText();
				Thread.sleep(1000);
				return AssetsDuplicateCheckValidation;
			
			}
			
			public boolean addAssetsResetButton(String ItemCode,String ItemName) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				AssetADD.click();
				Thread.sleep(1000);
				itemCode.sendKeys(ItemCode);
				Thread.sleep(1000);
				itemName.sendKeys(ItemName);
				Thread.sleep(1000);
				resetButton.click();
				Thread.sleep(1000);
				return true;
			}

			
			
			public boolean isnextbuttonPaginationVisible() throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				
				
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
			
			public Boolean searchAssetsItemspagination(String search) throws InterruptedException {
				masterIcon.click();
				Thread.sleep(1000);
				asset.click();
				Thread.sleep(1000);
				searchBox.sendKeys(search);
				Thread.sleep(1000);
				List<WebElement> searchvalue=driver.findElements(By.xpath("//tbody/tr/td[3][text()]"));
				for(WebElement e:searchvalue) {
					String searchvalues=e.getText();
					System.out.println(searchvalues);
				}

				return true;
				
				
			}	
			
			
}
