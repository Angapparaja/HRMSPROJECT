package com.hrms.util;

import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser_Stack {
	
	public void browserStackConfiguration() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("browserVersion", "14.1");
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("os", "OS X");
		browserstackOptions.put("osVersion", "Big Sur");
		browserstackOptions.put("projectName", "Prople Eployee Profile");
		browserstackOptions.put("buildName", "BUild 3.1");
		browserstackOptions.put("sessionName", "Employee Profile Test");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("seleniumVersion", "3.14.0");
		HashMap<String, Object> safariOptions = new HashMap<String, Object>();
		safariOptions.put("enablePopups", "true");
		browserstackOptions.put("safari", safariOptions);
		capabilities.setCapability("bstack:options", browserstackOptions);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "OS X");
		caps.setCapability("os_version", "Big Sur");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.14.0");
	}

}
