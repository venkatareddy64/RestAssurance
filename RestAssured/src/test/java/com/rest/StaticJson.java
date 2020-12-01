package com.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import load.Payload;

public class StaticJson {

	public static void main(String[] args) throws IOException
	{

		RestAssured.baseURI="https://rahulshettyacademy.com";
	    given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Venkat Reddy\\Desktop\\Java\\staticJson.json"))))
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);

		
	}

}
