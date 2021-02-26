package pomTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser
{
	public static WebDriver wd;
	public static WebDriver startBrowser(String bName,String url)
	{
		if(bName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			wd=new ChromeDriver();
		}
		else
		{
			if(bName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
				wd=new FirefoxDriver();
				
			}
		}
		wd.manage().window().maximize();
		wd.get(url);
		
	
	return wd;
	}

}
