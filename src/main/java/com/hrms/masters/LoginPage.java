package com.hrms.masters;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.base.TestBase;
import com.hrms.util.ElementUtil;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//*[@name='clientname']")
	WebElement clientName;
	
	@FindBy(xpath="//*[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	

	@FindBy(xpath="//button[text()='LOGIN ']")
	WebElement loginBtn;
	
//	@FindBy(xpath="//a[text()='HRMS-CORE']")
//	WebElement hrms;
	
//	@FindBy(xpath="//div[text()=' HRMS-CORE ']")
//	WebElement hrms;
	
	By hrms=By.xpath("//div[text()=' HRMS-CORE ']");
	
	By selfcare=By.xpath("//div[text()=' HRMS-SELFCARE ']");
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HrmsHomePage Login(String cn, String un, String pwd) throws InterruptedException {
		//driver.navigate().refresh();
		clientName.sendKeys(cn);
		
		userName.sendKeys(un);
		
		password.sendKeys(pwd);
	
		loginBtn.click();
//		Thread.sleep(1500);

		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		  try {
	            WebElement element = driver.findElement(By.xpath("//div[text()=' HRMS-CORE ']"));
	            if (element.isDisplayed() || element.isEnabled())
//	                flag = false;
	            	ElementUtil.waitForElementPresenseClick(hrms, 10);
//	            	Locationetro.click();
			
	        } catch (Exception e) {

	            ElementUtil.waitForElementPresenseClick(selfcare, 10);
	        } 
			
		
//		ElementUtil.waitForElementPresenseClick(hrms, 10);
//		hrms.click();
		
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		
		
		while(I1.hasNext())
		{
			
		String child_window=I1.next();
		System.out.println(child_window);

		if(!parent.equals(child_window))
		{
			
			driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		}
		
		}
		
		return new HrmsHomePage();
	}

}
