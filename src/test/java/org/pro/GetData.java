package org.pro;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData {
	public static String getData(int rowNo , int cellNo) throws Throwable {
		
		String str = null;
		File loc = new File("D:\\Tamizhbharathi\\My_Workspace\\CrazySales\\TestData\\Credentials.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		str = c.getStringCellValue();
		//System.out.println(str);
		stream.close();
		return str;
	
	}
	
		
	}


