package com.uiautomation.steps;

import org.junit.Assert;

import com.uiautomation.pages.BookFlightPage;
import com.uiautomation.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightSteps
{
	HomePage homePage;
	BookFlightPage bookFlightPage;

	@Given("^that Bill has decided to check available flights$")
	public void that_Bill_has_decided_to_check_available_flights() throws Exception
	{
		homePage.open();
		Assert.assertTrue(homePage.isNavigatedToHomePage());
	}

	@When("^he looks at a return trip from \"([^\"]*)\" to \"([^\"]*)\" leaving one week from now$")
	public void he_looks_at_a_return_trip_from_to_leaving_one_week_from_now(String dept, String dest) throws Exception
	{
		bookFlightPage.selectFlightLocation(dept, dest);
		bookFlightPage.clickContnueButton();
		bookFlightPage.selectDuration();
		bookFlightPage.clickSearchButton();
	}

	@Then("^he should be shown the cheapest return ticket from DXB to LHR$")
	public void he_should_be_shown_the_cheapest_return_ticket_from_DXB_to_LHR() throws Exception
	{
		Assert.assertTrue(bookFlightPage.isNavigatedToSearchPage());
		Assert.assertTrue(bookFlightPage.isLowestPriceTextDisplayed());
	}

}
