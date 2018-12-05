package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject
{
	@FindBy(css ="[data-id='header_logo_link']")
	private WebElement homePageLogo;
	
	@FindBy(name = "Departure airport")
	private WebElement DepartureTxBx;
	
	@FindBy(name = "Arrival airport")
	private WebElement ArrivalTxBx;
	
	
	@FindBy(id ="search-flight-date-picker--depart")
	private WebElement startDate;
	
	@FindBy(id ="search-flight-date-picker--return")
	private WebElement returnDate;
	
	@FindBy(css ="#panel0 > div > div > div > section > div:nth-child(4) > div.search-flight--hidden-container.grid > div:nth-child(3) > form > button")
	private WebElement searchButton;

	public void selectFlight() {
		
	}
	
}
