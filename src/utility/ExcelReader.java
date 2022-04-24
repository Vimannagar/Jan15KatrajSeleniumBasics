package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

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

	}

}
