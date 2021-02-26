package com.pack.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS001_Amazon_ProductSearch 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(3000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		

	}

}
