package com.atmecs.jetblue.utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.jetblue.testbase.TestBase;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class Utils {
	
//	public Utils(MobileDriver appiumDriver) {
//		super(appiumDriver);
//		// TODO Auto-generated constructor stub
//	}


	//static WebDriver driver;
	static MobileDriver appiumDriver;

	public static void sendKeys(MobileDriver driver,String xpath,String sendKeys ) {
		appiumDriver.findElement(By.xpath(xpath)).sendKeys(sendKeys);
		appiumDriver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}
	
	public static void ClickOnElement(String xpath,int time,MobileDriver appiumDriver) {
		
		appiumDriver.findElement(By.xpath(xpath)).click();
	}
	

	public static boolean isDisplayed( String XPathIsDisplayed) {
		boolean isDisplayed = false;
		try {
		isDisplayed = appiumDriver.findElement(By.xpath(XPathIsDisplayed)).isDisplayed();

		} catch (Exception e) {
		isDisplayed = false;
		}
		return isDisplayed;
		}
	

	public static void waits(By locators,int time,MobileDriver appiumDriver) {
		WebDriverWait wait = new WebDriverWait(appiumDriver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
	}
	
	
	
	
	 
	



}
