package com.atmecs.jetblue.testbase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	
	public MobileDriver appiumDriver;
	
	DesiredCapabilities capabilities;
	
		
//	public TestBase(MobileDriver appiumDriver) {
//		this.appiumDriver = appiumDriver;
//	}



	@BeforeTest
	public void setup() throws MalformedURLException  {

		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Y2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "2a7696df");
		capabilities.setCapability(CapabilityType.VERSION, "8.1");
//		capabilities.setCapability("appPackage", "com.jetblue.JetBlueAndroid");
//		capabilities.setCapability("appActivity", "com.jetblue.JetBlueAndroid.features.home.HomeActivity");
		
		capabilities.setCapability("appPackage", "com.android.settings");
		capabilities.setCapability("appActivity", "com.android.settings.MainSettings");
		
		capabilities.setCapability("locationServicesAuthorized", true);
		capabilities.setCapability("autoAcceptAlerts", true);
	//	capabilities.setCapability("autoDismissAlerts", true);
		capabilities.setCapability("autoGrantPermissions", true);

		appiumDriver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);	
		System.out.println("started");
		//driver.switchTo().alert().accept();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


	}
}
