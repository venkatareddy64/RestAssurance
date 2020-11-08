package com.pack.www;

import io.restassured.path.json.JsonPath;
import junit.framework.Assert;
import payload.Add_Place;

public class CoursePriceAPI {

	public static void main(String[] args) 
	{
		JsonPath js=new JsonPath(Add_Place.Course());
		int Countcourses=js.getInt("courses.size()");
		//1. Print No of courses returned by API
		System.out.println(Countcourses);

		//2.Print Purchase Amount
		int amount=js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);

		//3. Print Title of the first course
		
		String FirstTitle=js.getString("courses[0].title");
		System.out.println(FirstTitle);
		

		//4. Print All course titles and their respective Prices

		for(int i=0;i<Countcourses;i++)
		{
		String courses=js.getString("courses["+i+"].title");
		int prices=js.getInt("courses["+i+"].price");
		System.out.println(courses+"  "+prices);
		}
		//5. Print no of copies sold by RPA Course
		for(int i=0;i<Countcourses;i++)
		{
			String title=js.getString("courses["+i+"].title");
			if(title.equals("RPA"))
			{
              int RPAcopies=js.getInt("courses["+i+"].copies");
              System.out.println(RPAcopies);
              break;
			}
		}
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
			for(int i=0;i<Countcourses;i++)
			{
				
				int price=js.getInt("courses["+i+"].price");
				//System.out.println(price);
				int copies=js.getInt("courses["+i+"].copies");
				//System.out.println(copies);
				int amount1=price*copies;
				sum=sum+amount1;
			}
		    System.out.println(sum);
		    int purchase=js.getInt("dashboard.purchaseAmount");
		    Assert.assertEquals(sum,purchase );

	}
}