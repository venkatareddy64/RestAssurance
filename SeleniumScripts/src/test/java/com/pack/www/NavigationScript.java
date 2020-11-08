package com.pack.www;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationScript {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Venkat Reddy\\\\Jars\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
