package com.toolsqa.utils;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Utils {
	static WebDriver driver;
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	//some elments wont wait for explicit ,so this will wait until the time
	public static void ignoreClickInterceptAndClickOnElement(WebDriver driver,final String xpath) {
		FluentWait<WebDriver> fluentWait =  new FluentWait<WebDriver>( driver)
				.ignoring(ElementClickInterceptedException.class)
				.pollingEvery(1, TimeUnit.SECONDS)//every 1 sec it will check the element is present or not
				.withTimeout(30,TimeUnit.SECONDS);//till 30sec it will wait (max 30)

		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath(xpath));
				element.click();
				return true;
			}
		});
	}

	//for drop down	
	public static void ignoreClickInterceptAndClickOnElementforViewPage(WebDriver driver,final String xpath,final String visibleText) {
		FluentWait<WebDriver> fluentWait =  new FluentWait<WebDriver>( driver)
				.ignoring(ElementClickInterceptedException.class)
				.pollingEvery(1, TimeUnit.SECONDS)
				.withTimeout(30,TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath(xpath));
				Select option = new Select(element);
				option.selectByVisibleText(visibleText);
				return true;
			}
		});

	}
	
	public static boolean waitForElement(WebDriver driver, String xpath) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		}
		catch(Exception exception) {
			
			return false;
		}
		return true;
	}
	

}

