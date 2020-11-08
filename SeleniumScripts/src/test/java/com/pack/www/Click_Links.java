package com.pack.www;



import java.io.Closeable;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Links {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the link name:");
		String link=sc.nextLine();
		boolean isAvail=false;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Reddy\\Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		List<WebElement>list=driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(WebElement links:list)
		{
			if(links.getText().equalsIgnoreCase(link))
			{
			
			links.click();
			}
			else
			{
				System.out.println("Please choose correct link.......");
			}

		}

		
	}

}
