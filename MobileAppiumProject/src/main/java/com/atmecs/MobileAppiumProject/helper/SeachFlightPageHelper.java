package com.atmecs.MobileAppiumProject.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.MobileAppiumProject.testbase.TestBase;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SeachFlightPageHelper extends TestBase {

	public SeachFlightPageHelper(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	public void searchCityInList(String cityCode) {
		MobileElement clickOnSearch = 	driver.findElement(By.xpath("//input[contains(@id,'city-selector-ORIGIN')]"));
		clickOnSearch.click();
		getWait(2);
		clickOnSearch.sendKeys(cityCode);
	}
	public void selectTriptype() {
		MobileElement tripType = driver.findElement(By.xpath("//label[contains(text(),' One-way')]"));
		tripType.click();
		System.out.println("one-way route clicled");
	}
	public void selctCityFrom() {
		MobileElement fromCity = 	driver.findElement(By.xpath("//input[contains(@placeholder,'Where from?')]"));
		fromCity.click();
		System.out.println("from city button clicked");
		getWait(3);
		searchCityInList("JFK");
		getWait(3);
		System.out.println("searched jfk city");
		getWait(5);
		MobileElement selectCity = 	driver.findElement(By.xpath("(//span[contains(text(),'JFK')])[1]"));
		waitsUntilPresenceOfElement(By.xpath("(//span[contains(text(),'JFK')])[1]"),5);
		getWait(3);
		selectCity.click();
		System.out.println("selected city jfk");
	}
	public void selectCityTo() {
		MobileElement toCity = 	driver.findElement(By.xpath("//input[contains(@placeholder,'Where to?')]"));
		toCity.click();
		getWait(3);
		System.out.println("to city button clicked");
		searchCityInList("BOS");
		System.out.println("BOS city searched");
		MobileElement selectCity = 	driver.findElement(By.xpath("//span[contains(text(),'BOS')]"));
		getWait(3);
		selectCity.click();
		System.out.println("clicked on selected city");
	}
	public void selectDate() {
		MobileElement clickOnDate = 	driver.findElement(By.xpath("//input[contains(@placeholder,'Select Date')]"));
		clickOnDate.click();
		getWait(3);
		System.out.println("date button clicked");
		MobileElement selectDate = 	driver.findElement(By.xpath("//div//table//tbody//td[contains(@aria-label,'Sep 26 2019 clickable')]"));
		selectDate.click();
		System.out.println("selected date 26 sep");
		getWait(3);
		MobileElement clickDone = 	driver.findElement(By.xpath("//button[contains(text(),'Done')]"));
		clickDone.click();
		System.out.println("clicked done after selecting date");
	}
	public void clickSearchFlights() {
		MobileElement clickOnSearchOnFlights = 	driver.findElement(By.xpath("//span[contains(text(),'Search flights')]"));
		clickOnSearchOnFlights.click();
		System.out.println("clicked on search flighst");
	}

}
