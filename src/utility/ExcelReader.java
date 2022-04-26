package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static String readData(int row, int column) throws IOException
	{
		String path = System.getProperty("user.dir")+"//15JanTestData.xlsx";
		
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

//		to access the work book

		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		To locate the exact sheet of the workbook
//		XSSFSheet sh1 = wb.getSheet("Data");
		XSSFSheet sh1 = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();
		String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		
	

//	String dataoncell = sh1.getRow(6).getCell(0).getStringCellValue();

//	System.out.println(dataoncell);

		System.out.println(stringvalue);
		
		return stringvalue;
	}
	
	
	public static void writeData() throws IOException
	{
		String path = System.getProperty("user.dir")+"//15JanTestData.xlsx";
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

//		to access the work book

		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		To locate the exact sheet of the workbook
//		XSSFSheet sh1 = wb.getSheet("Data");
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(12).getCell(0).setCellValue("Write Test");
		
		sh1.createRow(50).createCell(5).setCellValue("50th row data");
		
		wb.write(fos);
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {

		File src = new File("C:\\Users\\A\\Desktop\\15JanTestData.xlsx");

		FileInputStream fis = new FileInputStream(src);

//		to access the work book

		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		To locate the exact sheet of the workbook
//		XSSFSheet sh1 = wb.getSheet("Data");
		XSSFSheet sh1 = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();
		String stringvalue = df.formatCellValue(sh1.getRow(6).getCell(0));

//	String dataoncell = sh1.getRow(6).getCell(0).getStringCellValue();

//	System.out.println(dataoncell);

		System.out.println(stringvalue);

//	WAP to login to OrangeHRM using excel sheetvalue	
		
		
		writeData();

	}

}
