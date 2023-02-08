package com.hrms.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.base.TestBase;


public class WaitFactory extends TestBase {
	
	public WaitFactory() {
	};
	public static WebElement performWaitFactory(WaitStrategy strategy, WebElement Element) {
		WebElement element = Element;
		if (strategy == WaitStrategy.CLICKABLE) {
			System.out.println(ImplicitlyWait);
			element = new WebDriverWait(driver, Duration.ofSeconds(ImplicitlyWait))
					.until(ExpectedConditions.elementToBeClickable(element));
		} else if (strategy == WaitStrategy.PRESENCE) {
			element = (new WebDriverWait(driver, Duration.ofSeconds(ImplicitlyWait))
					.until(ExpectedConditions.presenceOfElementLocated((By) element)));
		} else if (strategy == WaitStrategy.VISIBILITY) {
			element = new WebDriverWait(driver, Duration.ofSeconds(ImplicitlyWait))
					.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		} else {
			System.out.println("Enter the valid strategy");
		}
		return element;
	}

}
