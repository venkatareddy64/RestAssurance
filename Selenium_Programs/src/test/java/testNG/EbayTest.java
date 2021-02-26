package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pomPages.ClsEbay;
import pomTests.Browser;

public class EbayTest {
@Test
	public void search() throws InterruptedException
	{
		WebDriver d=Browser.startBrowser("chrome", "http://ebay.com");
		Thread.sleep(3000);
		ClsEbay cc=new ClsEbay(d);
		cc.catSearch("Baby");
		cc.prodsearch("toys");
		cc.on_Click();

	}

}
