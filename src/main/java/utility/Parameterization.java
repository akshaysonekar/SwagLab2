package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getExceldata(int row,int cell,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\ZerodhaKite\\src\\main\\resources\\TestData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
