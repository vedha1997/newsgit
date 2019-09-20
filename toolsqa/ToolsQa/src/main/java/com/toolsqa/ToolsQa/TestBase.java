package com.toolsqa.ToolsQa;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.toolsqa.constants.Constants;
import com.toolsqa.utils.PropertyReader;
import com.toolsqa.utils.ReadLocatorsfile;



public class TestBase {
	public WebDriver driver;
	Properties baseClass;
	String url;
	String browser;
	

	static PropertyReader propReader = PropertyReader.getInstance();
	
	protected static String searchBoxXpath = propReader.getValue("searchBoxXpath");
	protected static String shopToolsQaImage = propReader.getValue("shopToolsQaImage");
	protected static String cartxpath = propReader.getValue("cartxpath");
	protected static String product1 = propReader.getValue("product1");
	protected static String quantityPlus = propReader.getValue("quantityPlus");
	protected static String chooseColor = propReader.getValue("chooseColor");
	protected static String chooseSize = propReader.getValue("chooseSize");
	protected static String addTocart = propReader.getValue("addTocart");
	protected static String product2 = propReader.getValue("product2");
	protected static String chooseColorproduct2 = propReader.getValue("chooseColorproduct2");
	protected static String chooseSizeproduct2 = propReader.getValue("chooseSizeproduct2");
	protected static String validateMessageForAddingToCart = propReader.getValue("validateMessageForAddingToCart");
	protected static String ProductNumberXpath = propReader.getValue("ProductNumberXpath");
	protected static String product1FromTheCart = propReader.getValue("product1FromTheCart");
	protected static String product2FromTheCart = propReader.getValue("product2FromTheCart");
	protected static String firstProductPrice = propReader.getValue("firstProductPrice");
	protected static String firstProductQuantity = propReader.getValue("firstProductQuantity");



			
	
	@BeforeClass
	public void intitailizeBrowser() throws IOException {
		baseClass = ReadLocatorsfile.loadProperty(Constants.CONFIG_FILE);

		url = baseClass.getProperty("URL");
		browser= baseClass.getProperty("chromeBrowser");
		System.out.println("browser is "+browser);

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_FILE);
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_FILE);
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		BasicConfigurator.configure();

	}
	public static void main(String[] args) {
		System.out.println(searchBoxXpath);
	}


	

	@AfterClass
	public void endTest()
	{
		driver.quit();
	}
}

