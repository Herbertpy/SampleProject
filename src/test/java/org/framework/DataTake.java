package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Taking datas from the Xlsheet
public class DataTake {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Herbert\\eclipse-workspace\\SampleOne\\Output\\New.xlsx");
		FileInputStream input = new FileInputStream(file);
		// To get the sheet
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("Herbert");
		// to get the row
		Row row = sheet.getRow(0);
		// To get the cell
		Cell cell = row.getCell(0);
		// get the value from the cell
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

	}
}
