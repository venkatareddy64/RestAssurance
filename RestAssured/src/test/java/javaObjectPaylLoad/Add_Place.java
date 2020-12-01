package javaObjectPaylLoad;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Add_Place {

	public static void main(String[] args) 
	{
		PayloadObject obj=new PayloadObject();
		obj.setAccuracy(50);
		obj.setAddress("29, side layout, cohen 09");
		obj.setName("Frontline house");
		obj.setWebsite("http://google.com");
		obj.setLanguage("French-IN");
		obj.setPhone_number("(+91) 983 893 3937");
		Location l=new Location();
		l.setLang(-38.383494);
		l.setLat(33.427362);
		obj.setLocation(l);
		List<String>al=new ArrayList<String>();
		al.add("shoe park");
		al.add("shop");
		obj.setTypes(al);
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response response=given().log().all().queryParam("key", "qaclick123")
		.body(obj).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response();

		String res=response.asString();
		System.out.println(res);

	}

}
