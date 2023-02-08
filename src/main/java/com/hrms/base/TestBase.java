package com.hrms.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

import com.hrms.util.ElementUtil;
import com.hrms.util.TestUtil;


import io.github.bonigarcia.wdm.WebDriverManager;





public class TestBase {
	
	public static WebDriver driver;
	public static File folder;
	public static Properties prop;
	@SuppressWarnings("deprecation")
	public static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	public static String MainWindow;
	public static SoftAssert softAssert;
	
	public static String parentWindow = "";     
	public static String childWindows = "";
	public static String selfcareWindow = "";
	public static String selfcareWindow1 = "";
	static Set<String> childwindows1;
	
	
	private final String pathString = "src\\main\\java\\com\\qa\\config\\congi.Properties";
	public static Properties properties = null;
	public static byte ImplicitlyWait = 2;
	protected byte pageLoadTimeOut = 100;
	private String browserName = null;	
	public static WebDriverWait wait;	
	public static String methodName, defaultUserFieldBox, otpText, cancelText;
	public static ExtentTest testInfo;
	public static String slefcareWindow1;
	public static String slefcareWindow2;
	public static String url = null;
	public static String textPage = null;
	public static Select date;
	public static Date d = new Date();
	@SuppressWarnings("deprecation")
	static int year = d.getYear();
	protected static int currentYear = year + 1900;
	Calendar cal = Calendar.getInstance();
	// browser stack
	public static final String AUTOMATE_USERNAME = "hariofficial_5OrlzM";
	public static final String AUTOMATE_ACCESS_KEY = "pv6QXkT83PEZATxqENd9";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";
	
	//Read global parameters from config.properties file
	//Driver initialization and opens URL (Parent Class)
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/hrms/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
//	public Properties loadPropertyFile() throws IOException {
//
//		FileInputStream stream = new FileInputStream("Config.propertise");
//		propertise = new Properties();
//		propertise.load(stream);
//		return propertise;
//	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
//		folder =new File(UUID.randomUUID().toString());
//		folder.mkdir();
		
		
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
//			folder =new File("increment upload :"+UUID.randomUUID().toString());
//			folder.mkdir();		
//			ChromeOptions options =new ChromeOptions();		
//			Map<String,Object> prefs =new HashMap<String,Object>();
//			prefs.put("profile.default_content_settings.popups", 0);
//			prefs.put("download.default_directory", folder.getAbsolutePath());	
//			options.setExperimentalOption("prefs", prefs);
//			DesiredCapabilities cap =DesiredCapabilities.chrome();
//			cap.setCapability(ChromeOptions.CAPABILITY, options);
			//driver = new ChromeDriver(cap);
			
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/BrowserDriverFile/chromedriver109.exe");
			WebDriverManager.chromedriver().arch64().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/BrowserDriverFile/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		e_driver = new EventFiringWebDriver(driver);
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
//		MainWindow = driver.getWindowHandle();
		
	}
	
	
	
//
//	//****************** NEW MODULE DATA ***************************
//	public static void smokeTest() {
//		System.out
//				.println("===========================================================================================");
//		driver.navigate().to(properties.getProperty("url"));
//		LoginPageObjects.clientName.sendKeys(properties.getProperty("clientName"));
//		LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
//		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
//		ElementUtil.click(LoginPageObjects.login);
//		ElementUtil.click(LoginPageObjects.HRMS_CORE_Link);
//		ElementUtil.WH(driver.getWindowHandles().size() - 1);
//	}
	

}
