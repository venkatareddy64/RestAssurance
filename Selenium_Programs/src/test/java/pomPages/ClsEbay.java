package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay 
{
	 WebDriver wd;
	
	public  ClsEbay(WebDriver d)
	{
		wd=d;
	}
	By ddVal=By.id("gh-cat");
	By txtval=By.id("gh-ac");
	By btnClick=By.id("gh-btn");
	public void catSearch(String ddValue)
	{
		WebElement wb=wd.findElement(ddVal);
		Select s=new Select(wb);
		s.selectByVisibleText(ddValue);
	}
	public void prodsearch(String txtValue)
	{
		wd.findElement(txtval).sendKeys(txtValue);
	}
	public void on_Click()
	{
		wd.findElement(btnClick).click();
	}

}
