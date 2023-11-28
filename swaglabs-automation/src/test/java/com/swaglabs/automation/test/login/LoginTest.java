package com.swaglabs.automation.test.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.swaglabs.automation.pages.login.LoginPage;
import com.swaglabs.automation.test.base.SwaglabsBaseTest;
import com.swaglabs.automation.utility.ExcelReader;
import com.swaglabs.automation.utility.PropertyReader;

public class LoginTest extends SwaglabsBaseTest {

	LoginPage loginPage;
	public static final Logger logger = LogManager.getLogger(LoginTest.class);

	@Test
	public void launchApplicationTest() {

		driver.get(PropertyReader.retrieveProperty("url"));
		loginPage = new LoginPage();
		Assert.assertTrue(loginPage.isUsernameInputBoxPresent(), "Application not loaded");

	}

	@Test(dependsOnMethods = "launchApplicationTest")
	public void verifyAllFieldsTest() {
		Assert.assertTrue(loginPage.isUsernameInputBoxPresent(), "Username InputBox Loaded");
		Assert.assertTrue(loginPage.isPasswordInputBoxPresent(), "Password InputBox Loaded");
		Assert.assertTrue(loginPage.isLoginLinkPresent(), "Login Link Loaded");

	}

	@Test(dependsOnMethods = "verifyAllFieldsTest", dataProvider = "loginData")
	public void enterDetailsTest(String username, String password) {
		loginPage.typeUsername(username);
		loginPage.typePassword(password);
		loginPage.clickLoginLink();

	}

	@DataProvider(name = "loginData")
	public Object[][] userDetails() throws Exception {
		
		Object[][] userData = ExcelReader.getTableArray("src/test/resources/test-data/login-data.xlsx", "users");
		return userData;
	}

}
