package seleniumfirst;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		File scr = new File("D:\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		    int rowCount  =  sheet1.getLastRowNum();
		    System.out.println("Number of rows: " + rowCount);
		
		for(int i=0;i<=rowCount; i++)
		{
			
		String un	= sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Username is : " + un);
		
		String pwd = sheet1.getRow(i).getCell(1).getStringCellValue();
		System.out.println("Password is : " + pwd);
		Thread.sleep(1000);
					
				
		}
      wb.close();
	}

}
