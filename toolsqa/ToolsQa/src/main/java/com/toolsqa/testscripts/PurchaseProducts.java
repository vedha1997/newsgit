package com.toolsqa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.toolsqa.ToolsQa.TestBase;
import com.toolsqa.helper.GrandTotalHelper;
import com.toolsqa.logreports.LogReports;
import com.toolsqa.utils.Utils;
import com.toolsqa.validation.ValidateTestResult;

public class PurchaseProducts extends TestBase {
	String productNumber;
	String productNumber2;
	String cartProductNumber;
	String cartProductNumber2;

	LogReports log = new LogReports();
	GrandTotal gt = new GrandTotal();
	GrandTotalHelper gth = new GrandTotalHelper();


	@Test
	public void ValidateProductSAndAddToCart()
	{
		Utils.ignoreClickInterceptAndClickOnElement(driver, product1);
		Utils.ignoreClickInterceptAndClickOnElement(driver, quantityPlus);
		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, chooseColor, "Grey");
		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, chooseSize, "40");
		productNumber = driver.findElement(By.xpath(ProductNumberXpath)).getText();
		System.out.println(productNumber);
		Utils.waitForElement(driver, addTocart);
		Utils.ignoreClickInterceptAndClickOnElement(driver, addTocart);
		ValidateTestResult.isDisplayed(validateMessageForAddingToCart, "Assertion passed", "products added to cart is displayed", driver);


		Utils.ignoreClickInterceptAndClickOnElement(driver, shopToolsQaImage);
		Utils.waitForElement(driver, product2);
		Utils.ignoreClickInterceptAndClickOnElement(driver, product2);
		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, chooseColor, "Black");
		Utils.ignoreClickInterceptAndClickOnElementforViewPage(driver, chooseSize, "32");
		productNumber2 = driver.findElement(By.xpath(ProductNumberXpath)).getText();
		System.out.println(productNumber2);
		Utils.waitForElement(driver, addTocart);
		Utils.ignoreClickInterceptAndClickOnElement(driver, addTocart);	
		ValidateTestResult.isDisplayed(validateMessageForAddingToCart, "Assertion passed", "products added to cart is displayed", driver);
	}

	@Test(priority=1)
	public void checkAvailablityOfProductsInCart() {
		Utils.waitForElement(driver, cartxpath);
		Utils.ignoreClickInterceptAndClickOnElement(driver, cartxpath);

		Utils.ignoreClickInterceptAndClickOnElement(driver, product1FromTheCart);
		cartProductNumber = driver.findElement(By.xpath(ProductNumberXpath)).getText();
		ValidateTestResult.verifyBoolean(productNumber, cartProductNumber, "This is the actual element in the cart");
		log.info("Validation success");

		Utils.waitForElement(driver, cartxpath);
		Utils.ignoreClickInterceptAndClickOnElement(driver, cartxpath);

		System.out.println("cm");
		Utils.waitForElement(driver, product2FromTheCart);
		System.out.println("cmd");
		Utils.waitForElement(driver, product2FromTheCart);
		ValidateTestResult.verifyBoolean(productNumber2, cartProductNumber2, "This is the actual element in the cart");
		log.info("Validation success");

		
		Utils.ignoreClickInterceptAndClickOnElement(driver, product2FromTheCart);
		System.out.println("cmddddd");
		cartProductNumber2 = driver.findElement(By.xpath(ProductNumberXpath)).getText();
		System.out.println(cartProductNumber2);
		ValidateTestResult.verifyBoolean(productNumber2, cartProductNumber2, "This is the actual element in the cart");
		Utils.waitForElement(driver, cartxpath);
		Utils.ignoreClickInterceptAndClickOnElement(driver, cartxpath);
		
		
		
				
		
		
		

	}
	//@Test(priority=2)
	public void checkGrandtotal() {
		gt.firstProductTotal();
	}






}
