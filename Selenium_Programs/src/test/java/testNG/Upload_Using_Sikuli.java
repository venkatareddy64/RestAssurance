package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import pomTests.Browser;

public class Upload_Using_Sikuli
{

	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		WebDriver driver=Browser.startBrowser("chrome", "https://transfer.pcloud.com/");
		driver.findElement(By.xpath("//*[@id=\'upload-form\']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
		Screen s=new Screen();
		String FileInputPath="C:\\Users\\venka\\OneDrive\\Pictures\\Screenshots\\";
		String open="C:\\Users\\venka\\OneDrive\\Pictures\\Screenshots\\";
		Pattern File=new Pattern(FileInputPath+"Textbox.png");
		Pattern Open=new Pattern(FileInputPath+"open.png");
		Thread.sleep(3000);
		s.wait(File, 10);
		s.type(File,open+"open.png");
		s.click(Open);
		

	}

}
