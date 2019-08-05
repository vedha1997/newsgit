package com.falcon.pages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.falcon.constants.Constants;
import com.falcon.utils.ReadLocatorsfile;

public class Help {
	String customerName;
	String moduleName;
	String status;
	public   static String page;
	String testCaseName;
	int passTests;
	int failTests;
	int skipTests;
	static String listOfTestCaseNames;
	String recenRunPage; //= prop.getProperty("recenRunPage");//getting xpath of resentruns page	;
	List<String> name3;
	String viewPass; 
	String	clickDashBoardToggle;
	static String viewFail; 
	static String clickTestCaseNames;
	static String getTheNumberOfTestCases;
	
	public  String getPropertiess() throws Exception {
		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);

		page = prop.getProperty("viewPage");
		customerName = prop.getProperty("customerName");
		moduleName = prop.getProperty("moduleName");
		status = prop.getProperty("testStatus");
		viewFail = prop.getProperty("viewfail");
		viewPass = prop.getProperty("viewPass");
		listOfTestCaseNames = prop.getProperty("listOfTestCaseNames");
		clickTestCaseNames = prop.getProperty("clickTestCaseNames");
		getTheNumberOfTestCases = prop.getProperty("getTheNumberOfTestCases");
		System.out.println(page);
		return page;
		
		
	}
	/*
	 * public static void main(String[] args) throws Exception { Help please = new
	 * Help();
	 * 
	 * please.getPropertiess(); }
	 */
}
