package com.falcon.testscripts.viewpage;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.falcon.constants.Constants;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.utils.Utils;
import com.falcon.validatetest.ValidateTestResult;

//need to check testng is not invoking
public class ExportFile extends ViewPageTest {
	String downloadClick;
	String checkDownloadString;
	@Test
	public void verifyDownload() throws IOException, Exception {// String dirPath
		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);

		page = prop.getProperty("viewPage");
		downloadClick = prop.getProperty("downloadClick");
		checkDownloadString= prop.getProperty("checkDownloadString");
		
		Utils.ignoreClickInterceptAndClickOnElement(driver, page);
		Utils.ignoreClickInterceptAndClickOnElement(driver, downloadClick);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(checkDownloadString)).isDisplayed(), "Downloading report, please wait.. is shown in the page");


		File dir = new File("C:\\Users\\Vedha.Venkataraman\\Downloads");
		File[] files = dir.listFiles(); if (files == null || files.length == 0) { } File
		lastModifiedFile = files[0]; 
		for (int i = 1; i < files.length; i++) {
			if(lastModifiedFile.lastModified() < files[i].lastModified())
			{
				lastModifiedFile = files[i];
			}
		} 
		System.out.println(lastModifiedFile);
		log.info(lastModifiedFile  + "This is the downloaded file present in the local system");
	}

}
