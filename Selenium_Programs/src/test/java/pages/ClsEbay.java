package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay 
{
	public WebDriver wd;
	public ClsEbay(WebDriver driver)
	{
	wd=driver;
	}
	By ddVal=By.id("gh-cat");
	By txtVal=By.id("gh-ac");
	By click=By.id("gh-btn");
	
	public void Select_dropdown(String ddValue)
	{
	Select s=new Select(wd.findElement(ddVal));
	s.selectByVisibleText(ddValue);
	}
	public void text_String(String txtValue)
	{
		wd.findElement(txtVal).sendKeys(txtValue);
	}
	public void on_click()
	{
		wd.findElement(click).click();
	}

}
