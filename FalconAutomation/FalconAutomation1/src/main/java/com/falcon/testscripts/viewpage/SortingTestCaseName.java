package com.falcon.testscripts.viewpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.falcon.constants.Constants;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.utils.Utils;
import com.falcon.validatetest.ValidateTestResult;
public class SortingTestCaseName extends ViewPageTest{
	List<String> name;
	List<String> name1;
	/*
	 * public void listSort() { List<String> name= new ArrayList<String>();
	 * List<WebElement> list =
	 * driver.findElements(By.xpath("//td[@data-title-text = 'Test Case Name']"));
	 * for(WebElement element : list) { name.add(element.getText()); }
	 * Collections.sort(name); System.out.println(name.toString()); }
	 */

	//@Test(priority=1)
	public void sortTestCaseNames() throws InterruptedException, Exception{
		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);
		page = prop.getProperty("viewPage");
		listOfTestCaseNames = prop.getProperty("listOfTestCaseNames");
		clickTestCaseNames = prop.getProperty("clickTestCaseNames");
		getTheNumberOfTestCases = prop.getProperty("getTheNumberOfTestCases");
		/*performing without clicking the testcasenames
		 * 
		 */
		Utils.ignoreClickInterceptAndClickOnElement(driver, page);//clicking view page
		Thread.sleep(1000);
		name= new ArrayList<String>();
		List<WebElement> list =
				driver.findElements(By.xpath(listOfTestCaseNames));//list of test cases  
		for(WebElement element : list)
		{
			name.add(element.getText());
		}
		Collections.sort(name); 
		System.out.println(name.toString());
		/*The  name holds the list of testcasenames
		 * 
		 */

		/*Clicking again to get the ascending list
		 * 
		 */
		Utils.ignoreClickInterceptAndClickOnElement(driver, clickTestCaseNames);//clicking page
		//Thread.sleep(1000);
		name1= new ArrayList<String>();
		List<WebElement> list1 =
				driver.findElements(By.xpath(getTheNumberOfTestCases));
		for(WebElement element : list1)
		{ 
			name1.add(element.getText());
		}
		//		Collections.sort(name1);
		System.out.println(name1.toString());

		/*clicking again to get the descending list
		 * 
		 */
		Utils.ignoreClickInterceptAndClickOnElement(driver, clickTestCaseNames);
		Thread.sleep(1000);
		List<String> name2= new ArrayList<String>();
		List<WebElement> list2 =
				driver.findElements(By.xpath(getTheNumberOfTestCases));
		for(WebElement element : list2) { name2.add(element.getText());
		}
		//Collections.sort(name2); 
		System.out.println(name2.toString());

		//ValidateTestResult.verifyBoolean(name, name1, "passed");
		Collections.reverse(name);
		//System.out.println("name +"+name);
		//System.out.println("name1 +"+name1);
		Assert.assertTrue(name.equals(name1));
		Collections.reverse(name2);
		//System.out.println(name2 +   "name2  ");
		Assert.assertTrue(name2.equals(name1));//asserting the list 
		
	}
	

}


