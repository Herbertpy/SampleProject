package org.framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrialexSheets {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Herbert\\eclipse-workspace\\SampleOne\\Output\\Dublicate.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("SheetOne");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Iphone");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
		
		
	}
	



}
