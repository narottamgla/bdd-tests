package com.api.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;

import com.api.actions.ForcastActions;
import com.uiautomation.utils.Constants;

import net.thucydides.core.annotations.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForcastSteps {

	@Steps
	ForcastActions forcastActions;
	String apiKey;

	@Given("^i have valid API key$")
	public void i_have_valid_API_key() throws Exception {

		apiKey = Constants.API_KEY;

	}

	@When("^i request forcast api with valid lat as \"([^\"]*)\" and lang as \"([^\"]*)\"$")
	public void i_request_forcast_api_with_valid_lat_as_and_lang_as(String lat, String lang) throws Exception {
		forcastActions.getForcastDetails(apiKey, Float.valueOf(lat), Float.valueOf(lang));

	}

	@Then("^response should have status code as (\\d+) and content-type as JSON$")
	public void response_should_have_status_code_as_and_content_type_as_JSON(int statusCode) throws Exception {
		assertThat("Verify Content Type for Log-In Api ", forcastActions.getContentTypeOfResponse(),
				equalTo("application/json; charset=utf-8"));
		assertThat("Verify Status code for Log-In Api ", forcastActions.getStatusCodeOfResponse(), equalTo(statusCode));
	}

	@Then("^response should contain \"([^\"]*)\" as field$")
	public void response_should_contain_as_field(String arg1) throws Exception {
		if (arg1 == "latitude") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getLatitude()) != null);
		}

		if (arg1 == "longitude") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getLongitude()) != null);
		}

		if (arg1 == "timezone") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getTimezone()) != null);
		}

		if (arg1 == "currently") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getCurrently()) != null);
		}

//		if (arg1 == "minutely") {
//			assertThat("Have node as:" + arg1, hasItem(forcastActions.getDaily()) != null);
//		}

		if (arg1 == "hourly") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getHourly()) != null);
		}

		if (arg1 == "daily") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getDaily()) != null);
		}

		if (arg1 == "flags") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getFlags()) != null);
		}

		if (arg1 == "offset") {
			assertThat("Have node as:" + arg1, hasItem(forcastActions.getOffset()) != null);
		}
	}

	@Then("^minutely object data array should have (\\d+) items$")
	public void minutely_object_data_array_should_have_items(int arg1) throws Exception {
		//Assert.assertEquals(forcastActions.get, arg1);

	}

	@Then("^hourly object data array should have (\\d+) items$")
	public void hourly_object_data_array_should_have_items(int arg1) throws Exception {
		Assert.assertEquals(forcastActions.getHourly().getData().size(), arg1);

	}

	@Then("^daily object data array should have (\\d+) items$")
	public void daily_object_data_array_should_have_items(int arg1) throws Exception {
		Assert.assertEquals(forcastActions.getDaily().getData().size(), arg1);

	}
}
