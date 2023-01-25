package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateSheet {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Herbert\\eclipse-workspace\\SampleOne\\Output\\New.xlsx");
		FileInputStream input = new FileInputStream(file);
		// To get the sheet
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheet("Herbert");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> multipleNm = driver
				.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
		int size = multipleNm.size();
		System.out.println(size);

//		for (int i = 0; i < multipleNm.size(); i++) {
//			WebElement webElement = multipleNm.get(i);
//			String text = webElement.getText();              // for Row wise printe
//			Row createRow = sheet.createRow(i);
//			Cell createCell = createRow.createCell(0);
//			createCell.setCellValue(text);
//			FileOutputStream out = new FileOutputStream(file);
//			book.write(out);
		
		Row createRow = sheet.createRow(0);
		for (int i = 0; i < multipleNm.size(); i++) {
			WebElement webElement = multipleNm.get(i);
			String text = webElement.getText();              // for column wise printe

			Cell createCell = createRow.createCell(i);
			createCell.setCellValue(text);
			FileOutputStream out = new FileOutputStream(file);
			book.write(out);

		}

	}

}
