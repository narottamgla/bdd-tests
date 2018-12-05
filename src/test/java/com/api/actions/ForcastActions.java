package com.api.actions;

import com.api.models.response.Currently;
import com.api.models.response.Daily;
import com.api.models.response.Flags;
import com.api.models.response.Hourly;
import com.api.models.response.Root;
import com.google.gson.Gson;
import com.uiautomation.utils.Constants;

import io.restassured.response.Response;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ForcastActions {

	Response attributeResponse;

	@Step
	public void getForcastDetails(String apiKey, Float lat, Float lang) {

		attributeResponse = SerenityRest.given().when()
				.get(Constants.FORCAST_API_URL + apiKey + "/" + lat + "," + lang);
		
		System.out.println(attributeResponse.asString());
	}

	@Step
	public int getStatusCodeOfResponse() {

		return attributeResponse.then().extract().statusCode();
	}

	@Step
	public String getContentTypeOfResponse() {

		return attributeResponse.then().extract().contentType();
	}

	@Step
	public Currently getCurrently() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getCurrently();

	}

	@Step
	public Daily getDaily() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getDaily();
	}
	
	@Step
	public Hourly getHourly() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getHourly();
	}
	
	@Step
	public Double getLatitude() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getLatitude();
	}
	
	@Step
	public Double getLongitude() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getLongitude();
	}
	
	@Step
	public Double getOffset() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getOffset();
	}
	
	@Step
	public String getTimezone() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getTimezone();
	}
		
	@Step
	public Flags getFlags() {
		Gson gson = new Gson();
		Root root = gson.fromJson(attributeResponse.asString(), Root.class);
		return root.getFlags();
	}
}
