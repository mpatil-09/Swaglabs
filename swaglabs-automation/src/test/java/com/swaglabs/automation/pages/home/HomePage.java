package com.swaglabs.automation.pages.home;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.swaglabs.automation.pages.base.BasePage;

public class HomePage extends BasePage {

	public static final Logger logger = LogManager.getLogger(HomePage.class);

	@FindBy(xpath = "//div[contains(text(),'Swag')]")
	WebElement title;

	@FindBy(id = "react-burger-menu-btn")
	WebElement menuButton;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement productSortDropdowm;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
	WebElement sauceLabsBackpackLink;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartSauceLabsBackpackLink;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Bike Light')]")
	WebElement sauceLabsBikeLightLink;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addToCartSauceLabsBikeLightLink;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")
	WebElement sauceLabsBoltTShirtLink;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addToCartSauceLabsBoltTShirtLink;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Fleece Jacket')]")
	WebElement sauceLabsFleeceJacketLink;

	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]")
	WebElement sauceLabsOnesieLink;

	@FindBy(xpath = "//div[contains(text(),'Test.allTheThings() T-Shirt (Red)")
	WebElement testAllTheThingsTshirtLink;

	// Validations, Actions and Navigations

	public boolean isTitlePresent() {
		logger.info("Verifying the Title");
		boolean isLoaded = title.isDisplayed();
		return isLoaded;

	}

	public boolean isMenuButtonPresent() {
		logger.info("Verifying the MenuButton");
		boolean isLoaded = menuButton.isDisplayed();
		return isLoaded;
	}

	public HomePage clickMenu() {
		logger.info("Click on MenuButton ");
		menuButton.click();
		return new HomePage();

	}

	public boolean isProductSortDropdowmPresent() {
		logger.info("Verifying the ProductSortDropdowm");
		boolean isLoaded = productSortDropdowm.isDisplayed();
		return isLoaded;

	}

	public HomePage clickProductSortDropdown() {
		logger.info("Click on ProductSortDropdowm");
		productSortDropdowm.click();
		return new HomePage();
	}

	public boolean isSauceLabsBackpackLinkPresent() {
		logger.info("Verifying the SauceLabsBackpackLink");
		boolean isLoaded = sauceLabsBackpackLink.isDisplayed();
		return isLoaded;

	}

	public boolean isAddToCartSauceLabsBackpackLinkPresent() {
		logger.info("Verifying the AddToCartSauceLabsBackpackLink");
		boolean isLoaded = addToCartSauceLabsBackpackLink.isDisplayed();
		return isLoaded;
	}

	public HomePage clickAddToCartSauceLabsBackpackLink() {
		logger.info("Click on AddToCartSauceLabsBackpackLink");
		addToCartSauceLabsBackpackLink.click();
		return new HomePage();

	}

	public boolean isSauceLabsBikeLightLinkPresent() {
		logger.info("Verifying the SauceLabsBikeLightLink");
		boolean isLoaded = sauceLabsBikeLightLink.isDisplayed();
		return isLoaded;

	}

	public boolean isAddToCartSauceLabsBikeLightLinkPresent() {
		logger.info("Verifying the AddToCartSauceLabsBikeLightLink");
		boolean isLoaded = addToCartSauceLabsBikeLightLink.isDisplayed();
		return isLoaded;
	}
	
	public HomePage clickAddToCartSauceLabsBikeLightLink() {
		logger.info("Click on AddToCartSauceLabsBikeLightLink ");
		addToCartSauceLabsBikeLightLink.click();
		return new HomePage();
	}

	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub

		return false;
	}

}
