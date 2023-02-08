package com.hrms.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.hrms.base.TestBase;







public class ElementUtil  extends TestBase{
	
	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType) {
		case "id":
			locator = By.id(locatorValue);
			break;

		case "name":
			locator = By.name(locatorValue);
			break;

		case "className":
			locator = By.className(locatorValue);
			break;

		case "linkText":
			locator = By.linkText(locatorValue);
			break;

		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;

		case "xpath":
			locator = By.xpath(locatorValue);
			break;

		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;

		case "tagName":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("Please pass the correct locator " + locatorType);
			break;
		}

		return locator;
	}

	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}



	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSendKeys(By locator, String value) {
		WebElement ele = getElement(locator);
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	public void clickOnElement(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		for (WebElement e : eleList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

	public List<String> getLinksTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();

		List<WebElement> eleList = getElements(locator);
		System.out.println("element count: " + eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public boolean isElementExist(By locator) {
		List<WebElement> listEle = getElements(locator);
		if (listEle.size() > 0) {
			System.out.println("element is present");
			return true;
		}
		System.out.println("element is not present");
		return false;
	}

	
	/************************ Drop Down Utils (Select tag) ***********************/


	
	
	
	/************************ Drop Down Utils (Select tag) ***********************/
	public  WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	
	public static WebElement waitForElementPresenseSelectVisible(By locator,String text,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static WebElement waitForElementPresense(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String waitForElementPresenseGetText(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
	}
	
	public static WebElement waitForElementPresenseClick(By locator,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		return null;
	}
	
	
//	public static void waitForElementPresenseSendkeys(By locator,int timeOut,String Text) {
//		WebDriverWait wait=new WebDriverWait(driver,timeOut);
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Text);
//	}
	
	public static WebElement waitForElementPresenseSelectByValue(int timeOut,By locator,String text) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static WebElement waitForElementPresenseSelectByIndex(By locator,int text,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		Select select = new Select(getElement(locator));
		select.selectByIndex(text);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static void isSelectedCheckBox(By locator) {
		boolean selectedelement = getElement(locator).isSelected();
		if(selectedelement == false) {
			getElement(locator).click();
		//	PersonDetailsSelectAlls.click();
		//	ElementUtil.doClick(ProfileoverAll);
		}
		else if(selectedelement == true){
			System.out.println("All checkbox are already checked");
		}
	}
	
	
	//****************** NEW MODULE DATA ***************************
	
	static String toasterMessage;

	public static String toasterMessage() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//div[@class='toast-message']"));
		Thread.sleep(500);
		toasterMessage = element.getAttribute("innerText");
		System.out.println(toasterMessage);
		Thread.sleep(500);
		javaScriptClickEvent(element);
		return toasterMessage;
	}
	
	public static void toasterMessage(String message) throws InterruptedException {
		try {
			if (toasterMessage().trim().equals(message)) {
				System.out.println("Verified!! -> " + toasterMessage);
			} else {
				System.out.println("Bug!! -> Expect: " + message + " Actual: " + toasterMessage);
			}
		} catch (Exception e) {
			System.out.println("Bug: Toaster message not displayed:--> Expected: " + message);
		}
	}
	
	
	public static void javaScriptClickEvent(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
		} catch (Exception e2) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			try {
				Thread.sleep(2000);
				js.executeScript("arguments[0].click()", e);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				js.executeScript("arguments[0].click()", e);
			}
		}
	}
	
	public static String month = "";
	public static String year;
	public static String dates;

	public static void getDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = sdf.format(date);
		// System.out.println(formattedDate);
		String ar[] = formattedDate.split("/");
		if (ar[0].length() > 2 && !ar[0].equals("10")) {
		} else {
			month = ar[0].replace("0", "");
		}
		if (ar[1].equals("01") || ar[1].equals("02") || ar[1].equals("03") || ar[1].equals("04") || ar[1].equals("05")
				|| ar[1].equals("06") || ar[1].equals("07") || ar[1].equals("08") || ar[1].equals("09")) {
			dates = ar[1].replace("0", "");
		} else {
			dates = ar[1];
		}
		month = Integer.toString(Integer.parseInt(month) - 1);
		year = ar[2];
}
	
	public static void dateSelection(String date, String Month, String Year) throws InterruptedException {
		try {
//			new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByValue(Year);
//			new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByValue(Month);
			
			Select showenteriesmonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
			showenteriesmonth.selectByVisibleText(Month);
			
			Select showenteries = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
			showenteries.selectByVisibleText(Year);
//					javaScriptClickEvent(driver.findElement(By.xpath("//*[text()='" + date + "']")));
//					driver.findElement(By.xpath("//*[text()='" + date + "']")).click();
			javaScriptClickEvent(
					driver.findElement(By.xpath("//a[contains(@class,'ui-stat') and text()='" + date + "']")));
			

		} catch (Exception e) {
			javaScriptClickEvent(driver.findElement(By.xpath("(//*[text()='" + date + "'])[1]")));
		}
	}
	
	
//	public static Boolean tM(String message) throws InterruptedException {
//		boolean flag = false;
//		String actualToste = toastMessage();
//		try {
//			if (actualToste.equalsIgnoreCase(message)) {
//				System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + "Toast Message Verified: " + message
//						+ ConsoleColors.RESET);
//				testInfo.pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
//				flag = true;
//			} else {
//				System.out.println(ConsoleColors.RED_BACKGROUND + "Bug: Actual: " + actualToste + "  Expected: "
//						+ message + ConsoleColors.RESET);
//				testInfo.fail(MarkupHelper.createLabel("Bug: Actual: " + actualToste + "  Expected: " + message,
//						ExtentColor.RED));
//			}
//		} catch (Exception e) {
//			System.out.println(
//					ConsoleColors.RED_BACKGROUND + "Bug: Tost message not displayed:-->  Expected toaste message: -> : "
//							+ message + ConsoleColors.RESET);
//			testInfo.fail(MarkupHelper.createLabel(
//					"Bug: Toste message not displayed:-->  Expected toaste message: -> : " + message, ExtentColor.RED));
//		}
//		return flag;
//	}
	
	
	static String message;

//	public static String toastMessage() throws InterruptedException {
//		try {
//			javascriptExecutorBorderGreen(CPO.tMVerify);
//			message = CPO.tMVerify.getText().trim();
//			Thread.sleep(1000);
//			ConstantMethods.click(CPO.tMVerify);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Bug!! --> Toste message is not displayed");
//		}
//		Thread.sleep(500);
//		return message;
//	}
	
	public static void javascriptExecutorBorder(WebElement element) {
		try {
			if (driver == null) {
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].style.border='3px solid red'", element);
			} else {
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].style.border='3px solid red'", element);
			}
		} catch (Exception e) {
		}
	}
	
	public static void changeColor(WebElement element) {
		if (driver == null) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			String colorString = element.getCssValue("backgroundColor");
			for (int i = 0; i < 15; i++) {
				jsExecutor.executeScript("arguments[0].style.backgroundColor='rgb(0,200,0)'", element);
				jsExecutor.executeScript("arguments[0].style.backgroundColor='" + colorString + "'", element);

			}
		} else {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			String colorString = element.getCssValue("backgroundColor");
			for (int i = 0; i < 15; i++) {
				jsExecutor.executeScript("arguments[0].style.backgroundColor='rgb(0,200,0)'", element);
				jsExecutor.executeScript("arguments[0].style.backgroundColor='" + colorString + "'", element);

			}
		}
	}
	
	public static void javascriptExecutorBorderGreen(WebElement element) {
		if (driver == null) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='3px solid green'", element);
		} else {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='3px solid green'", element);
		}
	}

	public static void scrollUpDaown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-250)");
	}

	public static void generateAlert(String message) throws InterruptedException {
		if (driver == null) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("alert('" + message + "')");
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} else {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("alert('" + message + "')");
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	}

	public static  String generate_EntireTextPage() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		textPage = jsExecutor.executeScript("return document.documentElement.innerText").toString();
		return textPage;
	}

	public String currentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public static void click(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
		} catch (Exception e2) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			try {
				Thread.sleep(2000);
				js.executeScript("arguments[0].click()", e);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				js.executeScript("arguments[0].click()", e);
			}
		}
	}

	public String dateFormat() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
		return formattedDate;
	}

//	public static void smokeTest() {
//		System.out
//				.println("===========================================================================================");
//		driver.navigate().to(properties.getProperty("url"));
//		LoginPageObjects.clientName.sendKeys(properties.getProperty("clientName"));
//		LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
//		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
//		click(LoginPageObjects.login);
//		click(LoginPageObjects.HRMS_CORE_Link);
//		WH(driver.getWindowHandles().size() - 1);
//	}

//	public static void dateSelection(int months, int years, int dates) {
//		System.out.println(years);
//		new Select(CPO.year).selectByValue(Integer.toString(years));
//		try {
//			new Select(CPO.month).selectByValue(Integer.toString(months));
//		} catch (Exception e) {
//			new Select(CPO.month).selectByValue(Integer.toString(months));
//		}
//		click(driver.findElement(By.xpath("//*[text()='" + Integer.toString(dates) + "']")));
//	}
//	
//	
//	public static void PF(String passFail, String message) {
//		if (passFail.equals("p")) {
//			testInfo.pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
//		} else if (passFail.equals("f")) {
//			testInfo.fail(MarkupHelper.createLabel(message, ExtentColor.RED));
//		} else if (passFail.equals("i")) {
//			testInfo.info(MarkupHelper.createLabel(message, ExtentColor.ORANGE));
//		} else if (passFail.equals("s")) {
//			try {
//				testInfo.info(message, MediaEntityBuilder
//						.createScreenCaptureFromBase64String(ExtentReportConfiguration.getScreenShotsBase64(methodName))
//						.build());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	public static void WH(int num) {
		driver.switchTo().window((driver.getWindowHandles().toArray()[num].toString()));
	}
	
	
}
