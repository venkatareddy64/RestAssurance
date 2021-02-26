package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pomTests.ClsAmazon;

public class Steps {
	public WebDriver driver;
	ClsAmazon obj;

@Given("user launch chrome browser")
public void user_launch_chrome_browser() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
	Thread.sleep(3000);
	driver=new ChromeDriver();
	obj=new ClsAmazon(driver);
		
}

@When("user opens url {string}")
public void user_opens_url(String url)
{
  driver.get(url);
  driver.manage().window().maximize();

}

@When("user click on Signin button")
public void user_click_on_Signin_button()
{
  obj.Signin();
}

@When("user enter email as {string}")
public void user_enter_email_as(String email)
{
  obj.Email(email);
}

@When("user click on continue button")
public void user_click_on_continue_button()
{
    obj.Continue();
}

@When("user enter password as {string}")
public void user_enter_password_as(String pwd) 
{
   obj.Password(pwd);
}

@When("user click on Login button")
public void user_click_on_Login_button()
{
	obj.Login();
   }

@Then("Page url should be {string}")
public void page_url_should_be(String expUrl) 
{
   String actUrl=driver.getCurrentUrl();
   System.out.println(actUrl);
   Assert.assertEquals(expUrl, actUrl);
}



}
