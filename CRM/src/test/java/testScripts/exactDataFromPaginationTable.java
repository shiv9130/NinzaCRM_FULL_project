package testScripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.WebDriverUtility;
import repository.createCampaign;

public class exactDataFromPaginationTable extends baseClass {

	@Test
	public void exactTableData() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverUtility wu = new WebDriverUtility();
		ExcelFileUtility eu = new ExcelFileUtility();
		createCampaign cp = new createCampaign(driver);
		cp.getCampaignTable();
		List<WebElement> rows = cp.getCampaignTableRow();
		List<WebElement> colms = cp.getCampaignTableColumn();
		// WebElement next = cp.getBtnNext();
		for (int i = 2; i <= 5; i++) {
			WebElement ele = cp.getPaginationButton(driver, i);

			wu.waitForElementToBeClickable(driver, ele);
			ele.click();
		}
		List<WebElement> heading = driver.findElements(By.xpath("//th[5] | //th[6]"));
		List<WebElement> data = driver.findElements(By.xpath("//tr[3]/td[5] | //tr[3]/td[6]"));

		int excelCol = 0; // start writing in column 0
		int excelRow = 0; // or use pageRow if looping pages
		for(WebElement h : heading) {
			String txt1 = h.getText();
			System.out.println(txt1); // debug

			// write into Excel row 0, col0 and col1
			eu.writeDataIntoExcelFile("pagination", excelRow, excelCol, txt1);

			excelCol++; // move to next column

		}
		
		int data_row =1,data_col=0;

		for (WebElement s : data) {
			String txt = s.getText();
			System.out.println(txt); // debug

			// write into Excel row 0, col0 and col1
			eu.writeDataIntoExcelFile("pagination", data_row, data_col, txt);

			data_col++; // move to next column
		}

	}

}
