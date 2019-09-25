package com.atmecs.MobileAppiumProject.helper;

import java.awt.List;

import org.openqa.selenium.By;

import com.atmecs.MobileAppiumProject.testbase.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TravellersDetailsHelper extends TestBase {

	public TravellersDetailsHelper(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public void selectTiltle() {
		MobileElement enterTitle = 	driver.findElement(By.xpath("//jb-form-dropdown[contains(@name,'title')]//mat-form-field"));
		enterTitle.click();
		System.out.println("clicked on title");
		getWait(3);
		MobileElement clickTitleDr = 	driver.findElement(By.xpath("//mat-option[contains(@qa-data-attribute-id,'Dr')]"));
		clickTitleDr.click();
		System.out.println("selected dr ttile");

	}
	public void enterFirstName() {
		MobileElement clickOnFirstName = 	driver.findElement(By.xpath("//input[contains(@placeholder,'First Name*')]"));
		getWait(3);
		clickOnFirstName.click();
		System.out.println("clicked on first Name");
		getWait(3);
		clickOnFirstName.sendKeys("vedha");
		System.out.println("entered first name as vedha");
	}
	public void lastName() {
		MobileElement clickOnLastName = driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name*')]"));
		getWait(3);
		clickOnLastName.click();
		System.out.println("clicked on last Name");
		clickOnLastName.sendKeys("narayn");
	}
//	public void selectGender() {
//		List<MobileElement> selectMale = driver.findElements(By.xpath(""));
//		getWait(3);
//		selectMale.click();
//		System.out.println("the selected gender is male");
//	}

}
