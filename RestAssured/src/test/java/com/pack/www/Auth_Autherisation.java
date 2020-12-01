package com.pack.www;
import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
public class Auth_Autherisation
{

	public static void main(String[] args) 
	{
		String code="4%2F0AY0e-g4cUNqOEhWXtwFGeuwqm77E_tKnSsyZ_VfIKN1X2APg4tMG0K7_MOJMdk1OegmcFA";
     String resp=given().urlEncodingEnabled(false)
    		 .queryParam("code", code)
    		 .queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
    		 .queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
    		 .queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
    		 .queryParam("grant_type", "authorization_code")
     .when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
     JsonPath js=new JsonPath(resp);
    String accessToken=js.getString("access_token");
    System.out.println("Actual Response:" +accessToken);
	String response=given().log().all().queryParam("access_token", accessToken)
		.when().get("https://rahulshettyacademy.com/getCourse.php")
		.then().log().all().assertThat().statusCode(200).extract().asString();
	System.out.println(response);
	}

}
