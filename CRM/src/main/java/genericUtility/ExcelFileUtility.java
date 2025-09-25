package genericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
		public void writeDataIntoExcelFile(String sheetName, int rowNum, int cellNum, String data) 
	        throws EncryptedDocumentException, IOException {

	    String filePath = "./src/main/resources/ninza.xlsx";  
	    File file = new File(filePath);
	    Workbook wb;
	    Sheet sheet;

	    if (file.exists()) {
	        // File exists → load workbook
	        FileInputStream fis = new FileInputStream(file);
	        wb = WorkbookFactory.create(fis);
	        fis.close();
	        
	        sheet = wb.getSheet(sheetName);
	        if (sheet == null) {
	            sheet = wb.createSheet(sheetName); // create sheet if not present
	        }
	    } else {
	        // File not exists → create new workbook and sheet
	        wb = new XSSFWorkbook();  
	        sheet = wb.createSheet(sheetName);
	    }

	    // Create row if not exist
	    Row row = sheet.getRow(rowNum);
	    if (row == null) {
	        row = sheet.createRow(rowNum);
	    }

	    // Create cell and set value
	    Cell cell = row.createCell(cellNum);
	    cell.setCellValue(data);

	    // Write changes into file
	    FileOutputStream fos = new FileOutputStream(filePath);
	    wb.write(fos);

	    fos.close();
	    wb.close();
	}


}
