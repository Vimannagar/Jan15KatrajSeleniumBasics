package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	
	@DataProvider(name="testdata")
	public static String[][] dptest() throws IOException
	{
		String path = "E:\\desktop\\Katraj\\15 Jan\\15JanDPdata.xlsx";
		
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);

//		to access the work book

		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		To locate the exact sheet of the workbook
//		XSSFSheet sh1 = wb.getSheet("Data");
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int row = sh1.getLastRowNum();
		
		System.out.println("Row count is :"+row);
		
		int column = sh1.getRow(0).getLastCellNum();
		
		
		System.out.println("Column count is :"+column);
		
		String data [][] = new String [row+1][column];
		
		for(int i=0; i<=row;i++)
		{
			for(int j=0; j<column;j++ )
			{
				data [i][j]	=sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
	
		
	}
	
	
	public static void main(String[] args) throws IOException {
		dptest();
	}

}
