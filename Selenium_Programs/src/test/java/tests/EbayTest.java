package tests;

import org.openqa.selenium.WebDriver;

import pages.ClsEbay;
import pomtsts.BrowserFactory;

public class EbayTest
{
	public static void main(String args[]) throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriver driver=BrowserFactory.startBrowser("chrome","http://ebay.com");
		ClsEbay obj=new ClsEbay(driver);
		obj.Select_dropdown("Books");
		Thread.sleep(3000);
		obj.text_String("Selenium");
		obj.on_click();
	}

}
