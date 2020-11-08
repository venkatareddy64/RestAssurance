package com.pack.www;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import payload.Add_Place;

public class SumValidation
{
	@Test
	public void sumOfCourse()
	{
		JsonPath js=new JsonPath(Add_Place.Course());
		int Countcourses=js.getInt("courses.size()");
		for(int i=0;i<Countcourses;i++)
		{
			int price=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
			int amount=price+copies;
			System.out.println(amount);

		}
		
	}

}
