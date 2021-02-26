package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClsAmazon 
{
	public WebDriver driver;
	public ClsAmazon(WebDriver wd)
	{
		driver=wd;
	}
	By signIn=By.xpath("//*[@id='nav-link-accountList']/span[1]");
	By email=By.id("ap_email");
	By conti=By.id("continue");
	By pass=By.id("ap_password");
	By login=By.id("signInSubmit");
	By txtSearch=By.xpath("//*[@id=\'twotabsearchtextbox\']");
	By search=By.xpath("//*[@id=\'nav-search-submit-text\']/input");
	public void Signin()
	{
		driver.findElement(signIn).click();
	}
	public void Email(String Email)
	{
		driver.findElement(email).sendKeys(Email);
	}
	public void Continue()
	{
		driver.findElement(conti).click();
	}
	public void Password(String Pass)
	{
		driver.findElement(pass).sendKeys(Pass);
	}
	public void Login()
	{
		driver.findElement(login).click();
	}
	public void TextSearch(String text)
	{
		driver.findElement(txtSearch).sendKeys(text);
	}
	public void Search()
	{
		driver.findElement(search).click();
	}

}
