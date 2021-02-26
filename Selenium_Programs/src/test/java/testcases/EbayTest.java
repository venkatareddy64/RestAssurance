package testcases;

import org.openqa.selenium.WebDriver;

import pomTests.Browser;
import pomtsts.BrowserFactory;
import pomtsts.ClsEbay;

public class EbayTest
{

	public static void main(String[] args)
	{
		
		WebDriver dd=Browser.startBrowser("http://ebay.com","firefox");
		ClsEbay obj=new ClsEbay(dd);
		obj.selectDropDown("Book");
		obj.textString("Selenium");
		obj.click_Button();
		
	}

}
