package com.atmecs.MobileAppiumProject;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.MobileAppiumProject.helper.SeachFlightPageHelper;
import com.atmecs.MobileAppiumProject.testbase.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SeachFlightPage extends TestBase
{ 

	@Test(priority=0)
	public void searchFlights()  {
		SeachFlightPageHelper helper = new SeachFlightPageHelper(driver);
		helper.selectTriptype();
		helper.selctCityFrom();
		helper.selectCityTo();
		helper.selectDate();
		helper.clickSearchFlights();
	}
	






}
