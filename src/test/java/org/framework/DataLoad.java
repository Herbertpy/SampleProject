package org.framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Loading datas from exlsheet
public class DataLoad {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Herbert\\eclipse-workspace\\SampleOne\\Output\\New.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet createSheet = book.createSheet("Herbert");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Iphone");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);

	}

}
