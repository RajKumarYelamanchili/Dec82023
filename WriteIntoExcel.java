package seleniumfirst;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
		File scr = new File("D:\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("PASS");
		sheet1.getRow(1).createCell(2).setCellValue("FAIL");
		
		sheet1.getRow(4).createCell(2).setCellValue("PASS");
		sheet1.getRow(6).createCell(2).setCellValue("FAIL");

			
		sheet1.getRow(8).createCell(2).setCellValue("pass");
		sheet1.getRow(9).createCell(2).setCellValue("fail");

		FileOutputStream fout = new FileOutputStream(scr);
		
		wb.write(fout);
		
		wb.close();
		
	}

}
