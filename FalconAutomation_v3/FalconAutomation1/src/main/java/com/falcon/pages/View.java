package com.falcon.pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.falcon.constants.Constants;
import com.falcon.logreports.LogReports;
import com.falcon.testbase.TestBase;
import com.falcon.testscripts.viewpage.ViewPageTest;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.validatetest.ValidateTestResult;

public class View {
	LogReports log = new LogReports();
		int testCounts;
	//getters
	//get xpath	

	public String getProductTestListXpath() {
		return "//td[@data-title-text = 'Test Case Name']";
	}
	//actions
	public List<String> getAllProductList(WebDriver driver){
		List<String> name= new ArrayList<String>();
		List<WebElement> list;

		list = driver.findElements(By.xpath(getProductTestListXpath()));//list of test cases  
		for(WebElement element : list)
		{
			name.add(element.getText());
		}

		return name;
	}

	public int getToggleCounts(WebDriver driver,String xpath){
		List<WebElement> list =
				driver.findElements(By.xpath(xpath));
		testCounts  = list.size();
		System.out.println(testCounts);
		return testCounts;
	}
	public File file(String FilePath,String Validation) {
		File dir = new File(FilePath);//	C:\Users\Vedha.Venkataraman\Downloads
		File[] files = dir.listFiles();
		/*
		 * if (files == null || files.length == 0) { }
		 */ File
		lastModifiedFile = files[0]; 
		for (int i = 1; i < files.length; i++) {
			if(lastModifiedFile.lastModified() < files[i].lastModified())
			{
				lastModifiedFile = files[i];
			}
		} 
		System.out.println(lastModifiedFile);
		ValidateTestResult.verifyBoolean(lastModifiedFile, Validation, "pass");
		log.info(lastModifiedFile  + "This is the downloaded file present in the local system");
		return lastModifiedFile;
		
	}
}
