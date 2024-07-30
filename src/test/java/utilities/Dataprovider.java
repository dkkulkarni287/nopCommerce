package utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataprovider {

	
    @DataProvider (name= "regdata")
	public Object[][] regData() throws IOException {

		String path = "./testdata/Test Data.xlsx" ;
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet = wb.getSheet("registration data");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][colcount];
		for (int row = 1 ; row <=rowcount ; row++) {

			for (int col=0 ; col < colcount ; col++) {

				data[row-1][col] = new DataFormatter().formatCellValue(sheet.getRow(row).getCell(col));

			}
		}
		wb.close();
		return data;	
	}
}
