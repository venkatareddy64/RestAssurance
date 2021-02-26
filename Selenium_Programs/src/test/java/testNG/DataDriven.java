package testNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pomTests.Browser;

public class DataDriven {
	public static WebDriver driver;

	 
  @Test(dataProvider = "dp")
  public void search(String ddvalue, String txtValue) throws InterruptedException
  {
	  driver=Browser.startBrowser("firefox", "http://ebay.com");
	  Thread.sleep(3000);

	 // driver.get("http://ebay.com");
	  WebElement wb=driver.findElement(By.id("gh-cat"));
	  Select s=new Select(wb);
	  s.selectByVisibleText(ddvalue);
	  driver.findElement(By.id("gh-ac")).sendKeys(txtValue);
	  driver.findElement(By.id("gh-btn")).click();
	  driver.quit();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  Object[][]data=null;
	  XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir")+"//TestData//TestData.xlsx");
	  XSSFSheet sheet=wb.getSheet("sheet1");
	  int rows=sheet.getPhysicalNumberOfRows();
	  data=new Object[rows][2];
	  for(int i=0;i<rows;i++)
	  {
		  data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		  data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();	
		   
	  }
	  return data;
   
  
  }
}
