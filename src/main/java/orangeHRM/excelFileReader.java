package orangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFileReader {

	public static void main(String[] args) throws Exception {
		File file=new File("E:\\Bharati_Automation\\secondMProject\\src\\main\\java\\utility\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		int colcount=sheet.getRow(1).getLastCellNum();
		
		String data[][]=new String[rowCount-1][colcount];
		for(int i=0;i<rowCount-1;i++) {
			
			for(int c=0;c<colcount;c++) {
		DataFormatter df=new DataFormatter();
				data[i][c]=df.formatCellValue(sheet.getRow(i+1).getCell(c));

			}
			
		}
		
		
		workbook.close();
		sheet.getClass();
		for(String[] dataar:data) {
			System.out.println(Arrays.toString(dataar));
		}
	}

}
