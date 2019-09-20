package com.atmecs.jetblue.testscripthelper;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import com.atmecs.jetblue.testbase.TestBase;
import com.atmecs.jetblue.utils.Utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;import io.appium.java_client.touch.offset.PointOption;


public class TestScriptHelper  {
	
	
	
	//MobileDriver appiumDriver;

//	public TestScriptHelper(MobileDriver appiumDriver) {
//		super(appiumDriver);
//		// TODO Auto-generated constructor stub
//	}


	public void clickSearch(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Search')]")).click();
	}


	public void handlePopUp(By locators,MobileDriver appiumDriver,int time) {
		Utils.waits(locators, time, appiumDriver);
		appiumDriver.findElement(locators).click();
	}

	public void clickBookIcon(By locators,MobileDriver appiumDriver,int time) {
		Utils.waits(locators, time, appiumDriver);
		appiumDriver.findElement(locators).click();
	}
	public void clickRoute(By locators,MobileDriver appiumDriver,int time) {
		Utils.waits(locators, time, appiumDriver);
		appiumDriver.findElement(locators).click();
	}
	public void enterFromAndToDetails(MobileDriver appiumDriver) {
		Utils.waits(By.xpath("//android.widget.EditText[contains(@text,'From')]"),5,appiumDriver);
		appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@text,'From')]")).click();
		clickSearch(appiumDriver);
		Utils.sendKeys(appiumDriver, "//android.widget.TextView[contains(@resource-id,'com.jetblue.JetBlueAndroid:id/search')]", "JFK");
		appiumDriver.findElement(By.xpath("//android.view.ViewGroup[contains(@content-desc,'JFK')]")).click();
		clickSearch(appiumDriver);
		Utils.sendKeys(appiumDriver, "//android.widget.TextView[contains(@resource-id,'com.jetblue.JetBlueAndroid:id/search')]", "BOS");		
		appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Boston, MA (BOS)')]")).click();

	}
	public void enterDate(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("(//android.widget.TextView[contains(@text,'September 2019')]/following-sibling::android.widget.TextView[contains(@text,'29')])[1]")).click();
		appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@text,'DONE')]")).click();
	}
	public void searchForFlights(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@text,'SEARCH FLIGHTS')]")).click();
	}
	//android.view.View[contains(@resource-id,'exp00')]
	public void selectFlightAndBaggageDetails(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.view.View[contains(@resource-id,'exp00')]")).click();
		appiumDriver.findElement(By.xpath("(//android.view.View[contains(@text,'Blue')])[2]")).click();
		appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@text,'Continue')]")).click();
		appiumDriver.findElement(By.xpath("//android.view.View[contains(@text,'CONTINUE')]")).click();	
	}
	public void selectTitle(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("(//android.widget.Spinner[contains(@text,'Select')])[1]")).click();
		appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Dr')]")).click();
	}
	public void enterFirstName(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e1a76899396fd9c_3')]")).click();
		Utils.sendKeys(appiumDriver, "//android.widget.EditText[contains(@resource-id,'16d3e1a76899396fd9c_3')]", "vedh");	
	}
	public void enterSecondName(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e1a76899396fd9c_4')]")).click();
		Utils.sendKeys(appiumDriver, "//android.widget.EditText[contains(@resource-id,'16d3e1a76899396fd9c_4')]", "nar");
	}
	public void selectGender(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.view.View[contains(@text,'Male')]")).click();//gender
	}
	public void selectDob(MobileDriver appiumDriver) {
		appiumDriver.findElement(By.xpath("//android.widget.Spinner[contains(@text,'MM')]")).click();//month
		appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Jan')]")).click();//jan
		appiumDriver.findElement(By.xpath("//android.widget.Spinner[contains(@text,'DD')]")).click();//click date
		appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'1')]")).click();//give date
		appiumDriver.findElement(By.xpath("//android.widget.Spinner[contains(@text,'YYYY')]")).click();//click year
		appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'2000')]")).click();//select year
	}
	public void enterAddress(MobileDriver appiumDriver) {
		MobileElement addr1 = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e2c70f3636e6131_18')]"));//addrss1
		addr1.click();
		addr1.sendKeys("lekha avenue");
	}
	public void enterCity(MobileDriver appiumDriver) {
		MobileElement city = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e2c70f3636e6131_18')]"));
		city.click();
		city.sendKeys("London");
	}
	public void selectState(MobileDriver appiumDriver) {
		MobileElement clickState = (MobileElement) appiumDriver.findElement(By.xpath("(//android.widget.Spinner[contains(@text,'Select')])[4]"));
		clickState.click();		
		MobileElement selectState = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Alaska')]"));
		selectState.click();		
	}
	public void enterZipCode(MobileDriver appiumDriver) {
		MobileElement clickZip = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e3e1c951c1b1198_21')]"));
		clickZip.click();	
		clickZip.sendKeys("23145");
	}
	public void enterMailAddress(MobileDriver appiumDriver) {
		MobileElement clickMail = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e3e1c951c1b1198_22')]"));
		clickMail.click();	
		clickMail.sendKeys("vedha@gmail.com");
	}
	public void enterConfirmMailAddress(MobileDriver appiumDriver) {
		MobileElement clickConfirmMail = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e3e1c951c1b1198_23')]"));
		clickConfirmMail.click();	
		clickConfirmMail.sendKeys("vedha@gmail.com");
	}
	public void enterPrimaryPhoneNum(MobileDriver appiumDriver) {
		MobileElement clickPrimaryPhone = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'16d3e3e1c951c1b1198_24')]"));
		clickPrimaryPhone.click();	
		clickPrimaryPhone.sendKeys("7984652310");
	}
	public void proceedToContinue(MobileDriver appiumDriver) {
		MobileElement clickContinue = (MobileElement) appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@text,'Continue')]"));
		clickContinue.click();	
	}


	public void giveTravellerDetails() {


	}


	public void bookSeat() {



	}

	public void scrollDown(String xpath,MobileDriver appiumDriver) {
		AndroidElement list = (AndroidElement) appiumDriver.findElementByXPath(xpath);
		
		//scrolldown function
		MobileElement listItem = (MobileElement) appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"\"));"));

	System.out.println(listItem.getLocation());
	listItem.click();
	
	}

	public void swipeScreen(MobileDriver appiumDriver) {
		Dimension dim = appiumDriver.manage().window().getSize();
		int height = dim.getHeight();
		System.out.println(height);
		int width = dim.getWidth();
		System.out.println(width);
		
		int startx = width/4;
		System.out.println(startx  +  "start x");
		int endx = width/4;
		System.out.println(endx   +  "end x");
		int starty = (int) (height*.60);
		System.out.println(starty   +  "start y");
		int endy = (int) (height*.40);
		System.out.println(endy+  "end y");
		
		TouchAction ta = new TouchAction(appiumDriver);
		ta.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform(); 
			}
	
	public void scrollToElement(Boolean flag, MobileElement element,MobileDriver appiumDriver) {
		JavascriptExecutor js = (JavascriptExecutor) appiumDriver;
		js.executeScript("arguments[0].scrollIntoView(" + flag + ");", element);
		}
	
	
	public void scroll(MobileDriver appiumDriver) {
		((JavascriptExecutor) appiumDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}


}
