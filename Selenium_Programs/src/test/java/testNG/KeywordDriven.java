package testNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeywordDriven {
	public WebDriver driver;
  @Test
  public void sampletest() throws IOException
  {
	  XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir")+"//TestData//Demo.xlsx");
	  XSSFSheet sheet=wb.getSheet("sheet1");
	  int rows=sheet.getPhysicalNumberOfRows();
	  for(int i=1;i<rows;i++)
	  {
		  String cTestcase=sheet.getRow(i).getCell(0).getStringCellValue();
		  String cLocType=sheet.getRow(i).getCell(1).getStringCellValue();
		  String cLocVal=sheet.getRow(i).getCell(2).getStringCellValue();
		  String cTestData=sheet.getRow(i).getCell(3).getStringCellValue();
		 
		  switch(cTestcase)
		  {
		  case "open_browser":
			  if(cTestData.equalsIgnoreCase("chrome"))
			  {
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			  driver=new ChromeDriver();
			  }
			  else
			  {
				  WebDriverManager.firefoxdriver().version("65").setup();
				  driver=new FirefoxDriver();
			  }
			  driver.manage().window().maximize();
			  break;
		  case "enter_url":
			  driver.get(cTestData);
			  break;
		  case "select_dropdown":
			  
			  WebElement wb1=driver.findElement(LocatorInto(cLocType,cLocVal));
			  Select s=new Select(wb1);
			  s.selectByVisibleText(cTestData);
			  break;
		  case "enter_text":
			  driver.findElement(LocatorInto(cLocType,cLocVal)).sendKeys(cTestData);
			  break;
		  case "click_button":
			  driver.findElement(LocatorInto(cLocType,cLocVal)).click();
		  }
	  }
  }
		  @Test  
		  public By LocatorInto(String ctype,String cVal)
		  {
			  By b=null;
			  switch(ctype)
			  {
			  case "id":
				  b=By.id(cVal);
				  break;
			  
			   }
		  return b;
	  }
  }

