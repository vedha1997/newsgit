package com.falcon.testscripts.viewpage;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.falcon.constants.Constants;
import com.falcon.utils.ReadLocatorsfile;
import com.falcon.utils.Utils;
//need to check testng is not invoking
public class ExportFile extends ViewPageTest{
	@Test(priority=1)
	public File verifyDownload(String dirPath) throws IOException {
		Properties prop = ReadLocatorsfile.loadProperty(Constants.VIEW_FILE);

		page = prop.getProperty("viewPage");
		Utils.ignoreClickInterceptAndClickOnElement(driver, "//span[.='View']");
		Utils.ignoreClickInterceptAndClickOnElement(driver, "//span[@role='button']");
		
		 File dir = new File("user.dir" + File.separator  + "Downloads");
		 File[] files = dir.listFiles();
		    if (files == null || files.length == 0) {
		        return null;
		    }
		    File lastModifiedFile = files[0];
		    for (int i = 1; i < files.length; i++) {
		       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
		           lastModifiedFile = files[i];
		       }
		    }
		    return lastModifiedFile;

	}
	
	

}
