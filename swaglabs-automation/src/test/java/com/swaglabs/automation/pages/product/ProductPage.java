package com.swaglabs.automation.pages.product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.swaglabs.automation.pages.base.BasePage;

public class ProductPage extends BasePage {

	public static final Logger logger=LogManager.getLogger(ProductPage.class);
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement addToCartButton;
	
	public boolean isAddToCartButtonPresent() {
		logger.info("Verifying the Add To Cart Button");
		boolean isLoaded=addToCartButton.isDisplayed();
		return isLoaded;
	}
	public void clickaddToCartButton() {
		logger.info("Click Add to Cart Button");
		addToCartButton.click();
	}
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

}
