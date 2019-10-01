package com.atmecs.MobileAppiumProject;


import org.testng.annotations.Test;
import com.atmecs.MobileAppiumProject.helper.SeachFlightPageHelper;
import com.atmecs.MobileAppiumProject.testbase.TestBase;

public class SeachFlightPage extends TestBase
{ 

	@Test(priority=0)
	public void searchFlights()  {
		SeachFlightPageHelper helper = new SeachFlightPageHelper(driver);
		helper.selectTriptype();
//		helper.selectCityTo();
		helper.selctCityFrom();
//		helper.selectDate();
//		helper.clickSearchFlights();
	}
	






}
