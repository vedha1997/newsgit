package com.atmecs.MobileAppiumProject.helper;

import java.util.List;

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
	public void selectGender() {
		List<MobileElement> selectMale = driver.findElements(By.xpath("mat-radio-outer-circle"));
		getWait(3);
		selectMale.get(0).click();
		System.out.println("the selected gender is male");
	}
	public void dateOfBirth() {
		List<MobileElement> clickSelectMonth = driver.findElements(By.xpath("//div//mat-select[contains(@aria-label,'Month')]"));
		getWait(3);
		clickSelectMonth.get(5).click();
		System.out.println("clicked on select month");
		MobileElement selectMonth = driver.findElement(By.xpath("//mat-option[contains(@qa-data-attribute-id,'Jan')]"));
		getWait(3);
		selectMonth.click();
		System.out.println("jan month selected");
		MobileElement clickSelectDay = driver.findElement(By.xpath("//div//mat-select[contains(@aria-label,'Day')]"));
		getWait(3);
		clickSelectDay.click();
		System.out.println("clicked on selecdt day");
		MobileElement selectDay = driver.findElement(By.xpath("//mat-option[contains(@qa-data-attribute-id,'04')]"));
		getWait(3);
		selectDay.click();
		System.out.println("selected jan 04");
		MobileElement clickSelectYear = driver.findElement(By.xpath("//div//mat-select[contains(@aria-label,'Year')]"));
		getWait(3);
		clickSelectYear.click();
		System.out.println("clicked on select year");
		MobileElement selectYear = driver.findElement(By.xpath("//mat-option[contains(@qa-data-attribute-id,'2002')]"));
		getWait(3);
		selectYear.click();
		System.out.println("selected year 2002");
	}
	public void enterAddress() {
		MobileElement enterAddress = driver.findElement(By.xpath("//input[contains(@placeholder,'Address Line 1*')]"));
		getWait(3);
		enterAddress.click();
		System.out.println("selected year 2002");
		enterAddress.sendKeys("NorthAmerica");
		System.out.println("City entereds");
	}
	public void enterCity() {
		MobileElement enterCity = driver.findElement(By.xpath("//input[contains(@placeholder,'Address Line 1*')]"));
		getWait(3);
		enterCity.click();
		System.out.println("selected year 2002");
		enterCity.sendKeys("canada");
		System.out.println("City entereds");
	}
	

}
