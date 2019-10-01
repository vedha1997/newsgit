package com.atmecs.MobileAppiumProject;



import java.util.List;

import org.openqa.selenium.By;

import com.atmecs.MobileAppiumProject.testbase.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TravellerDetailsPage extends TestBase {
	
	public TravellerDetailsPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}


	public void iteratingList() {
		
		List<MobileElement> forJfk = driver.findElements(By.xpath("//jb-booker-air//form[contains(@class,'ng-untouched ng-pristine ng-valid')]"));
		System.out.println(forJfk.toString());
		
		for(int i=0; i<=forJfk.size();i++) {
			System.out.println(forJfk.get(i).toString());
			
		}
		
	}
}
