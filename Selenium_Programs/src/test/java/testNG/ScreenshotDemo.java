package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//Error.png");
	    FileHandler.copy(f, dest);
		
	}

}
