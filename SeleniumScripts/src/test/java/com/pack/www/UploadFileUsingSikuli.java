package com.pack.www;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFileUsingSikuli {

	public static void main(String[] args) throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Reddy\\Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click here to add files")).click();
		
		String ImageField="C:\\Users\\Venkat Reddy\\";
		String UploadImage="C:\\Users\\Venkat Reddy\\";
		
		Screen s=new Screen();
		
		Pattern textf=new Pattern(ImageField+"textfield.png");
		Pattern openc=new Pattern(ImageField+"open.png");
        Thread.sleep(5000);
       
        
        s.wait(textf,20);
        s.type(textf,UploadImage+"text.txt");
        s.click(openc);
        
	}

}
