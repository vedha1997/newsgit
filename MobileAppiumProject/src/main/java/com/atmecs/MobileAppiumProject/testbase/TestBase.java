package com.atmecs.MobileAppiumProject.testbase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.atmecs.MobileAppiumProject.helper.SeachFlightPageHelper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	protected AndroidDriver<MobileElement> driver;
	DesiredCapabilities capabilities;
	
	public TestBase() {
		super();
	}
	
	public TestBase(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	
	@BeforeTest
	public void setup() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Y2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "2a7696df");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability(CapabilityType.VERSION, "8.1");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("locationServicesAuthorized", true);
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoGrantPermissions", true);
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		driver.get("http://www-int2.jetblue.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	

//	capabilities = new DesiredCapabilities();
//	capabilities.setCapability("deviceName", "Custom Phone");
//	capabilities.setCapability("platformName", "Android");
//	capabilities.setCapability("udid", "192.168.162.101:5555");
//	//capabilities.setCapability("browserName", "chrome");
//	capabilities.setCapability(CapabilityType.VERSION, "7.1");
//	String path = "C:\\Users\\Vedha.Venkataraman\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium-chromedriver\\chromedriver\\win\\chromedriver.exe";
//	capabilities.setCapability("chromedriverExecutable", path);
//	
//	//System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
//	
//	capabilities.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
//	capabilities.setCapability("appPackage", "com.android.chrome");
//	
//	capabilities.setCapability("fullReset", false);
//	capabilities.setCapability("locationServicesAuthorized", false);
//	capabilities.setCapability("noReset", true);
//	driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
//	driver.get("http://www-int2.jetblue.com");
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	public void waitsUntilPresenceOfElement(By locators ,int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
	}

	public WebDriverWait getWait(int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait;
	}

	//@AfterMethod
	public void quit() {
		driver.quit();
	}


}
