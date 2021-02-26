package com.pack.www;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataDriven {

	public static void main(String[] args) throws FilloException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//.WebDriver driver=new ChromeDriver();
		
		Fillo fillo=new Fillo();
		Connection con=fillo.getConnection("C:\\Users\\venka\\OneDrive\\Desktop\\Java\\Selenium_Programs\\TestData.xlsx");
		String query="select * from sheet1";
		Recordset rs=con.executeQuery(query);
		List<String>list=new ArrayList();
		while(rs.next())
		{
			System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));
			list.add(rs.getField("Name"));
		}
		System.out.println(list.get(0));
		System.out.println("Total number of Rows ina Excel Sheet:"+rs.getCount());
		rs.moveFirst();
		System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));
		rs.moveLast();
		System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));
		rs.movePrevious();
		System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));
		rs.moveNext();
		System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));
		int TotalCols=rs.getFieldNames().size();
		System.out.println("Total number of columns in a Excel Sheet:"+TotalCols);
		String getcolumn=rs.getFieldNames().get(1);
		System.out.println(getcolumn);


		rs.close();
		con.close();
		

	}

}
