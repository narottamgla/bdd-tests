package com.uiautomation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BookFlightPage extends PageObject
{
	@FindBy(name = "Departure airport")
	private WebElement DepartureTxBx;

	@FindBy(name = "Arrival airport")
	private WebElement ArrivalTxBx;

	@FindBy(css = "input#search-flight-date-picker--depart")
	private WebElement startDateCal;

	@FindBy(css = "input#search-flight-date-picker--return")
	private WebElement returnDate;

	@FindBy(xpath = "(//span[text()=\"Search flights\"])[2]")
	private WebElement searchButton;
	
	@FindBy(css="#mainContainer > div > div.your-search-holder > h2")
	private WebElement searchPageHeader;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueButton;
	
	
	@FindBy(xpath ="(//table[@role='presentation'])[1]//tr/td")
	private List<WebElement> deptdates;
	
	@FindBy(css="#ctl00_c_ctlLowPrice_dvLowestPriceDisplay > div.summary > div.details.js-summary-holder-content > h2")
	private WebElement lowestPrice;


	public void selectFlightLocation(String dept, String dest)
	{
		DepartureTxBx.clear();
		DepartureTxBx.sendKeys(dept);
		ArrivalTxBx.clear();
		ArrivalTxBx.sendKeys(dest);
	}
	
	
	public void clickSearchButton() {
		try {
			continueButton.click();
		}catch(Exception  e) {
			
		}
		waitFor(searchButton);
		searchButton.click();
	}
	
	public void clickContnueButton() {
		try {
			continueButton.click();
		}catch(Exception  e) {
			
		}
	}
	
	public boolean isNavigatedToSearchPage() {
		return searchPageHeader.isDisplayed();
	}

	public void selectDuration()
	{
		startDateCal.click();
		selectDateByText("10");
		waitFor(5000);
		returnDate.click();
		selectDateByText("25");
	}
	
	
	private void selectDateByText(String date) {
		for(int i=0; i< deptdates.size();i++) {
			waitFor(1000);
			if(deptdates.get(i).getText().trim().equalsIgnoreCase(date)) {
				deptdates.get(i).click();
				break;
			}
		}
	}
	
	public boolean isLowestPriceTextDisplayed() {
		waitFor(180000);
		waitFor(lowestPrice);
		return lowestPrice.isDisplayed();
	}
}
