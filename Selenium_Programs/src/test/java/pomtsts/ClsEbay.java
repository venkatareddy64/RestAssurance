package pomtsts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClsEbay 
{
	public static WebDriver wd;
	public ClsEbay(WebDriver driver)
	{
		wd=driver;
	}
	By ddVal=By.id("gh-cat");
	By txtVal=By.id("gh-ac");
	By search=By.id("gh-btn");
	public void selectDropDown(String ddValue)
	{
		wd.findElement(ddVal).sendKeys(ddValue);
	}
	public void textString(String textValue)
	{
		wd.findElement(txtVal).sendKeys(textValue);
	}
	public void click_Button()
	{
		wd.findElement(search).click();
	}
	
	}
