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
import com.falcon.pages.View;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.utils.Utils;
import com.falcon.validatetest.ValidateTestResult;

public class ToggleDashboard extends ViewPageTest {
	//int testCounts;
	int passTestsCounts;
	int failTestsCounts;
	String clickTogglePass;
	String failToggle;
	String searchFail;

	View viewpage = new View();

	//
	//@Test(priority=1)
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
		int testCounts = viewpage.getToggleCounts(driver, listOfTestCaseNames);//listOfTestCaseNames=   //td[@data-title-text = 'Test Case Name']  
		System.out.println(testCounts);
		ValidateTestResult.verifyBoolean(testCounts, 10, "TOTAL COUNTS ARE EQUAL");
		log.info("The  test counts  is matching the actual results");
		/*
		 *validating the number of pass in dasboard with actual number of passed tests 
		 */

		Utils.ignoreClickInterceptAndClickOnElement(driver,clickTogglePass);
		int testCounts1 = viewpage.getToggleCounts(driver, viewPass);
		ValidateTestResult.verifyBoolean(testCounts1, 9, "passed counts are equal");
		log.info("pass Tests are" + testCounts1);
		/*
		 *validating the number of pass in dasboard with actual number of failed tests 
		 */
		Utils.ignoreClickInterceptAndClickOnElement(driver, failToggle);
		int testCounts2 = viewpage.getToggleCounts(driver, searchFail);
		ValidateTestResult.verifyBoolean(testCounts2, 1, "failed counts are equal");
		log.info("pass Tests are" + testCounts2);
	}
}
