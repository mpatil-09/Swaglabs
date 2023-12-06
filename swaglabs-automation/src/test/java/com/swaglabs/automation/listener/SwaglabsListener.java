package com.swaglabs.automation.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class SwaglabsListener extends TestListenerAdapter {

	public static WebDriver driver;

	public static final Logger logger = LogManager.getLogger(SwaglabsListener.class);

	public void onTestStart(ITestResult result) {

		ITestNGMethod method = result.getMethod();
		String currentMethodName = method.getMethodName();
		logger.info("Test Execution Started -" + currentMethodName);

	}

	public void onTestSuccess(ITestResult result) {
		ITestNGMethod method = result.getMethod();
		String currentMethodName = method.getMethodName();
		logger.info("Test Execution Successful -" + currentMethodName);
	}

	public void onTestFailure(ITestResult result) {
		ITestNGMethod method = result.getMethod();
		String currentMethodName = method.getMethodName();
		logger.info("Test Execution Failed -" + currentMethodName);

	}

	public void onTestSkipped(ITestResult result) {

		ITestNGMethod method = result.getMethod();
		String currentMethodName = method.getMethodName();
		logger.info("Test Execution Skipped -" + currentMethodName);
	}

	public void onConfigurationFailure(ITestResult result) {

		logger.info("configuration failure, verify the before suite");
	}

}
