package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject
{
	@FindBy(css = "[data-id='header_logo_link']")
	private WebElement homePageLogo;

	public boolean isNavigatedToHomePage()
	{
		waitFor(homePageLogo);
		getDriver().manage().window().maximize();
		return homePageLogo.isDisplayed();
	}

}
