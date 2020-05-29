package leaftap.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public String[][] readExcel(String fileName) throws IOException 
	{
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx"); // Enter Workbook
		XSSFSheet sheet = wbook.getSheet("Sheet1"); //Enter into sheet
		int rowCnt = sheet.getLastRowNum(); // get row count
		System.out.println("Row Count: " + rowCnt);
		int colCnt = sheet.getRow(0).getLastCellNum(); //get column count
		System.out.println("Column Count: " + colCnt);
		String [][] data = new String [rowCnt][colCnt]; 
		for (int i=1; i <= rowCnt; i++)   // for row iteration
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j < colCnt; j++)    //for column iteration
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j] = value;	
				System.out.println("Value: " + value);
				
			}
		}
		wbook.close();
		return data; 
	}
}
