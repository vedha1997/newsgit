package com.falcon.testscripts.viewpage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.falcon.constants.Constants;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.utils.Utils;
import com.falcon.validatetest.ValidateTestResult;

public class ToggleDashboard extends ViewPageTest {
	int testCounts;
	int passTestsCounts;
	int failTestsCounts;
	String clickTogglePass;
	String failToggle;
	String searchFail;

	//
	@Test(priority=1)
	public void validateToggleDashBoard() throws Exception {
		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);
		page = prop.getProperty("viewPage");
		clickDashBoardToggle = prop.getProperty("clickDashBoardToggle");
		listOfTestCaseNames = prop.getProperty("listOfTestCaseNames");
		clickTogglePass = prop.getProperty("clickTogglePass"); 
		viewPass = prop.getProperty("viewPass");
		failToggle = prop.getProperty("failToggle");
		searchFail = prop.getProperty("searchFail");
		/*Validating the dashboard total test count with total number of testcase count
		 * 
		 */
		Utils.ignoreClickInterceptAndClickOnElement(driver, page);
		Utils.ignoreClickInterceptAndClickOnElement(driver,clickDashBoardToggle);
		List<WebElement> list =
				driver.findElements(By.xpath(listOfTestCaseNames));
		testCounts  = list.size();
		System.out.println(testCounts);
		Assert.assertEquals(10, testCounts);
		log.info("The  test counts  is matching the actual results");
		/*
		 *validating the number of pass in dasboard with actual number of passed tests 
		 */

		Utils.ignoreClickInterceptAndClickOnElement(driver,clickTogglePass);
		List<WebElement> element = driver.findElements(By.xpath(viewPass));
		passTestsCounts = element.size();
		System.out.println(passTestsCounts);
		//Assert.assertEquals(9, passTestsCounts);
		ValidateTestResult.verifyBoolean(passTestsCounts, 9, "passed counts are equal");
		log.info("pass Tests are" + passTestsCounts);
		/*
		 *validating the number of pass in dasboard with actual number of failed tests 
		 */

		Utils.ignoreClickInterceptAndClickOnElement(driver, failToggle);
		List<WebElement> element1 = driver.findElements(By.xpath(searchFail));
		failTestsCounts = element1.size();
		System.out.println(failTestsCounts);
		ValidateTestResult.verifyBoolean(failTestsCounts, 1, "failed counts are equal");

		log.info("pass Tests are" + failTestsCounts);


	}
	



}
