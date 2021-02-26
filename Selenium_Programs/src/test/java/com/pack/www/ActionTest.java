package com.pack.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click();
		
	}

}
