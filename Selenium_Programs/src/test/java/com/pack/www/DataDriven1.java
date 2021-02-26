package com.pack.www;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataDriven1 {

	public static void main(String[] args) throws FilloException {
		Fillo f=new Fillo();
		Connection con=f.getConnection("C:\\Users\\venka\\OneDrive\\Desktop\\Java\\Selenium_Programs\\TestData.xlsx");
		String query="select * from sheet1 where Id like '%a%'";
		Recordset rs=con.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getField("Id")+"-------"+rs.getField("Name")+"------"+rs.getField("App"));

		}
	}

}
