package com.toolsqa.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.toolsqa.ToolsQa.TestBase;
import com.toolsqa.helper.GrandTotalHelper;
import com.toolsqa.utils.Utils;

public class GrandTotal extends TestBase {
	GrandTotalHelper gth = new GrandTotalHelper();
	
	
	//@Test(priority=3)
	public static void firstProductTotal() {
		
		//Utils.waitForElement(driver, cartxpath);
		//Utils.ignoreClickInterceptAndClickOnElement(driver, cartxpath);
		//String priceBeforeConverting1 = driver.findElement(By.xpath(firstProductPrice)).getText();
		String priceBeforeConverting1 = "₹22.00";
		String priceBeforeConverting2 = priceBeforeConverting1.replaceFirst(String.valueOf(priceBeforeConverting1.charAt(0)), "");
		int price1 = Integer.parseInt(priceBeforeConverting2);
		System.out.println(price1);
		
		
		
	//	int price1 = Integer.parseInt(priceBeforeConverting2);
		/*
		 * System.out.println(price1); String quantityBeforeConverting =
		 * driver.findElement(By.xpath(firstProductQuantity)).getText(); int quantity1 =
		 * Integer.parseInt(quantityBeforeConverting);
		 * gth.calculaterTotalPrice(quantity1, price1); System.out.println(gth);
		 */
		
	}
	public static void main(String[] args) {
		firstProductTotal();
	}
	
	
	
}
