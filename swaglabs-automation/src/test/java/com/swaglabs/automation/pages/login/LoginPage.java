package com.swaglabs.automation.pages.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swaglabs.automation.pages.base.BasePage;
import com.swaglabs.automation.pages.home.HomePage;

public class LoginPage extends BasePage {

	public static final Logger logger = LogManager.getLogger(LoginPage.class);

	@FindBy(id = "user-name")
	WebElement usernameInputBox;

	@FindBy(id = "password")
	WebElement passwordInputBox;

	@FindBy(id = "login-button")
	WebElement loginLink;

	@FindBy(xpath = "//div[contains(text(),'Swag Labs')]")
	WebElement logo;

	// Validations, Actions and Navigations

	public boolean isUsernameInputBoxPresent() {
		logger.info("Verifying the UsernameInputBox ");
		boolean isLoaded = usernameInputBox.isDisplayed();
		return isLoaded;

	}

	public void typeUsername(String username) {
		logger.info("typing the username");
		usernameInputBox.sendKeys(username);

	}

	public boolean isPasswordInputBoxPresent() {
		logger.info("Verifying the PasswordInputBox");
		boolean isLoaded = passwordInputBox.isDisplayed();
		return isLoaded;

	}

	public void typePassword(String password) {
		logger.info("typing the password");
		passwordInputBox.sendKeys("password");

	}

	public boolean isLoginLinkPresent() {
		logger.info("verifying the LoginLink");
		boolean isLoaded = loginLink.isDisplayed();
		return isLoaded;
	}

	public HomePage clickLoginLink() {
		logger.info("click the Login link");
		loginLink.click();
		return new HomePage();
	}

	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

}
