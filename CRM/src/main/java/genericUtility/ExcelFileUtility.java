package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import exceptionsUtility.FileNotFoundException;

public class ExcelFileUtility {
	

	//Read data from excel
	public String toReadDataFromExcel(String sheetName, int row, int cell)  {
		
		try {
			FileInputStream fis= new FileInputStream("./\\src\\main\\resources\\ninza crm data .xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			wb.close();
			return data;
		} catch (Exception e) {
			 throw new FileNotFoundException("File Not Found: " + e.getMessage());
			
		}
		
	}
	
	//Get the row count
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./\\src\\main\\resources\\ninza crm data .xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		//wb.close();
		return rowCount;
	}
	
	//To write the data back to excel sheet
	
	public void writeDataIntoExcelFile(String sheetName, int rowNum, int cellNum, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./configAppData/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum);
		
		FileOutputStream fos= new FileOutputStream("./configAppData/testScriptData.xlsx");
		wb.write(fos);
		wb.close();
		
	}


}
