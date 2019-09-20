package com.toolsqa.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.toolsqa.ToolsQa.TestBase;
import com.toolsqa.validation.ValidateTestResult;

public class ValidateHome extends TestBase{
	String validationtext = "Search box is displayed";

	@Test
	public void validatePage() {
		ValidateTestResult.isDisplayed(searchBoxXpath, "Search box is displayed", "passed",driver);
		ValidateTestResult.isDisplayed(shopToolsQaImage, "The logo is displayed", "passed", driver);
		ValidateTestResult.isDisplayed(cartxpath, "The cart button is displayed", "passed", driver);
	}
	
	

}
