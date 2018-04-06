package org.selenium.test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetlNew {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:/SeleniumBTM/TestPackage/TestData/new.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invoices Summary");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);

		String unValue = cell.toString();
		String pwdValue = wb.getSheet("Invoices Summary").getRow(1).getCell(5).toString();
		System.out.println(unValue +":" + pwdValue);
	}
}
