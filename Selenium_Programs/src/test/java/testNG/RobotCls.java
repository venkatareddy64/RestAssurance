package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomTests.Browser;

public class RobotCls {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{

		WebDriver driver=Browser.startBrowser("chrome", "https://transfer.pcloud.com/");

		StringSelection str=new StringSelection("Desktop\\Resume.pdfDesktop\\Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		driver.findElement(By.xpath("//*[@id='upload-form']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
	}

}
