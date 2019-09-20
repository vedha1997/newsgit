package com.atmecs.jetblue.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.jetblue.testbase.TestBase;
import com.atmecs.jetblue.testscripthelper.TestScriptHelper;
import io.appium.java_client.MobileElement;

public class HomePage extends TestBase {
	
	
//	public HomePage(MobileDriver appiumDriver) {
//		super(appiumDriver);
//		// TODO Auto-generated constructor stub
//	}
	TestScriptHelper scripHelper = new TestScriptHelper();



	//@Test
	public void tripDetails() {
		scripHelper.handlePopUp(By.xpath("//android.widget.Button[contains(@text,'OK')]"), appiumDriver, 5);
		scripHelper.clickBookIcon(By.xpath("//android.widget.TextView[contains(@text,'BOOK')]"), appiumDriver, 5);
		scripHelper.clickRoute(By.xpath("//android.widget.RadioButton[contains(@text,'One-way')]"), appiumDriver, 5);
		scripHelper.enterFromAndToDetails(appiumDriver);
		scripHelper.enterDate(appiumDriver);
		scripHelper.searchForFlights(appiumDriver);
	}
	@Test
	public void testWithTouchAction() throws Exception {
		//scripHelper.handlePopUp(By.xpath("//android.widget.Button[contains(@text,'OK')]"), appiumDriver, 5);
		System.out.println("swipe starts");
		Thread.sleep(5000);
		scripHelper.swipeScreen(appiumDriver);
		System.out.println("swipe passed");
	}
	//@Test
	public void testWithExecuter() throws Exception {
		MobileElement element = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@instance,'7')]"));

		System.out.println("swipe starts");
		Thread.sleep(5000);
		scripHelper.scrollToElement(true,element,appiumDriver);
		System.out.println("swipe ends");
		element.click();

	}
	//@Test
	public void testWithScroll() {
		System.out.println("scroll starts");
		scripHelper.scroll(appiumDriver);
		System.out.println("scroll stops");
	}
		//@Test
		public void sample() {
			System.out.println("run");
		}

		
	}

