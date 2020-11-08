package com.pack.www;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Add_Place;
import payload.ReusableMethods;


public class Add_PlaceRestAPI {

	public static void main(String[] args) 
	{
		//validate add_place api working as expected or not
		//given():-all the input details
		//when():-submit the data
		//then():-validate the responce
		//send the data to the api by using post request
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Add_Place.place()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();

		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String place_id=js.get("place_id");
		System.out.println(place_id);
		//Update place
		String newAddress="summer walk, Africa";
		String responce=given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+place_id+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ " \r\n"
				+ " \r\n"
				+ "")
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();
		System.out.println(responce);
		//Get place
		String getplace_Address=given().log().all().queryParam("key","qaclick123").queryParam("place_id",place_id)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath j=ReusableMethods.rawMethods(getplace_Address);
		String actual_Address=j.getString("address");
		Assert.assertEquals(newAddress, actual_Address);
	}

}
