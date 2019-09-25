package com.atmecs.MobileAppiumProject.helper;

import java.util.List;

import org.openqa.selenium.By;

import com.atmecs.MobileAppiumProject.testbase.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DepartingFlightHelper extends TestBase{

	public DepartingFlightHelper(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public void selectFlight() {
		List<MobileElement> flightList = driver.findElements(By.xpath("(//div[contains(@class,'tripdetail pa3')])"));
		System.out.println("Flights Count::"+flightList.size());
		getWait(3);
		flightList.get(0).click();
		System.out.println("clicked on flight list");
	}
	public void selectTypeOfTravel() {
		List<MobileElement> travelType = driver.findElements(By.xpath("//div[contains(@class,'mat-radio-outer-circle')]"));
		System.out.println("Flights Count::"+travelType.size());
		getWait(3);
		travelType.get(0).click();
		System.out.println("clicked on travel list list");
	}
	public void proceedToContinue() {
		MobileElement clickContinue = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		getWait(3);
		clickContinue.click();
		System.out.println("clicked on continue");

	}

}
