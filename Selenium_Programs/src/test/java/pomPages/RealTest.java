package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomTests.Browser;

public class RealTest {
  @Test(dataProvider = "dp")
  public void search(String ddValue, String txtValue) throws InterruptedException 
  {
	  Thread.sleep(3000);
	  WebDriver driver=Browser.startBrowser("chrome", "http://ebay.com");
	  ClsEbay obj=new ClsEbay(driver);
	  obj.catSearch(ddValue);
	  obj.prodsearch(txtValue);
	  obj.on_Click();
  }

  @DataProvider
  public Object[][] dp() throws IOException 
  {
	  Object[][]data=ClsEbayTest.getEbayTest(System.getProperty("user.dir")+"//TestData//TestData.xlsx");
	  
   
  
  return data;
  }
}
