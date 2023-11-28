package com.swaglabs.automation.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	public static WebDriver driver;

	public BasePage() {

		PageFactory.initElements(driver, this);

	}

	public abstract boolean isPageLoaded();

}
