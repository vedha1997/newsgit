package com.atmecs.MobileAppiumProject;

import org.testng.annotations.Test;

import com.atmecs.MobileAppiumProject.helper.DepartingFlightHelper;
import com.atmecs.MobileAppiumProject.testbase.TestBase;

public class DepartingFlightPage extends TestBase {

	//@Test(priority =1)
	public void selectFlightAndDepart() {
		DepartingFlightHelper helper = new DepartingFlightHelper(driver);
		helper.selectFlight();
		helper.selectTypeOfTravel();
		helper.proceedToContinue();
	}

}
