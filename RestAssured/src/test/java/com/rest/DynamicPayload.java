package com.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import load.Payload;

public class DynamicPayload {

	@Test(dataProvider="getData")
	public void dynamic(String site)
	{
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Add_Place("website",site)).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String place_id=js.get("scope");
		System.out.println(place_id);


	}
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"venky"},{"ram"}};
	}
	
}
