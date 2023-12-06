package com.swaglabs.automation.test.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.swaglabs.automation.listener.SwaglabsListener;
import com.swaglabs.automation.pages.base.BasePage;
import com.swaglabs.automation.utility.PropertyReader;

@Listeners(SwaglabsListener.class)
public class SwaglabsBaseTest {

	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(SwaglabsBaseTest.class);

	@BeforeSuite(alwaysRun = true)
	public void init() {

		logger.info("test execution started");
		String browserValue = PropertyReader.retrieveProperty("browser");
		logger.info("browser from properties is " + browserValue);

		if (browserValue.equals("chrome")) {
			String chromePathValue=PropertyReader.retrieveProperty("chromePath");
			System.setProperty("webdriver.chrome.driver",chromePathValue);
			logger.info("launching the chrome browser");
			driver = new ChromeDriver();

		} else if (browserValue.equals("edge")) {

			System.setProperty("webdriver.edge.driver", PropertyReader.retrieveProperty("edgePath"));
			logger.info("launching the edge browser");
			driver = new EdgeDriver();

		}

		BasePage.driver = driver;
		SwaglabsListener.driver=driver;

	}

	@AfterSuite
	public void teardown() throws InterruptedException {

		logger.info("Cleaning the browser session");
		Thread.sleep(5000);
		driver.quit();
	}

}
