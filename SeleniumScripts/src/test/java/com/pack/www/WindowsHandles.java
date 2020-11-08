package com.pack.www;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Reddy\\Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
        String title=driver.getTitle();
        String whandle=driver.getWindowHandle();
        Set<String>whandles=driver.getWindowHandles();
        for(String mainwin:whandles)
        {
        	driver.switchTo().window(mainwin);
        	if(!mainwin.equalsIgnoreCase(whandle))
        	{
        		driver.close();
        		
        	}
        	 }
        driver.switchTo().window(whandle);
    	System.out.println(driver.getTitle());
   
        
	}

}
