package payload;

import io.restassured.path.json.JsonPath;

public class ReusableMethods
{
	public static JsonPath rawMethods(String response)
	{
		JsonPath js=new JsonPath(response);
		return js;
	}

}
