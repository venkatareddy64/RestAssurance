package pages;

import org.openqa.selenium.WebDriver;

public class BrowserFactory
{
	public WebDriver driver;
	public WebDriver startBrowser(String bname,String url)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\Drivers\\chromedriver.exe"));
		}
		else 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}

}
