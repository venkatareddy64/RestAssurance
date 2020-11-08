package com.pack.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Reddy\\Jars\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://ebay.com");
	    WebElement wb=driver.findElement(By.id("gh-cat"));
	    Select s=new Select(wb);
	    s.selectByVisibleText("Baby");
	    driver.findElement(By.id("gh-ac")).sendKeys("toys");;
	    driver.findElement(By.id("gh-btn")).click();;
	    
	}

}
