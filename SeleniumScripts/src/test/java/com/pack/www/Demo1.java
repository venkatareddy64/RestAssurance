package com.pack.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Reddy\\Jars\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://amazon.in");
  }
}
