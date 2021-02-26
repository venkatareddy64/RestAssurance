package pomPages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClsEbayTest
{
	public static Object[][]getEbayTest(String path) throws IOException
	{
		Object[][]data=null;
		XSSFWorkbook wb=new XSSFWorkbook(path);
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
