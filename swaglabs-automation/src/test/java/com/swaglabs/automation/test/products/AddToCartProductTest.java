package com.swaglabs.automation.test.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.automation.pages.home.HomePage;
import com.swaglabs.automation.pages.login.LoginPage;
import com.swaglabs.automation.pages.product.ProductPage;
import com.swaglabs.automation.test.base.SwaglabsBaseTest;
import com.swaglabs.automation.utility.PropertyReader;

public class AddToCartProductTest extends SwaglabsBaseTest {

	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;

	@Test
	public void launchAppTest() {

		driver.get(PropertyReader.retrieveProperty("url"));
		loginPage = new LoginPage();
		Assert.assertTrue(loginPage.isUsernameInputBoxPresent(), "Application not loaded");

	}

	@Test(dependsOnMethods = "launchAppTest")
	public void loginTest() throws InterruptedException {
		loginPage.typeUsername("standard_user");
		loginPage.typePassword("secret_sauce");
		homePage = loginPage.clickLoginLink();

	}

	@Test(dependsOnMethods = "loginTest")
	public void addToCartTest() {
		Assert.assertTrue(homePage.isSauceLabsBackpackLinkPresent(), "SauceLabsBackpackLink not present");
		productPage = homePage.clickSauceLabsBackpackLink();
		productPage.clickaddToCartButton();

	}

}
