package testScripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import repository.createCampaign;

public class Campaign_Page_table extends baseClass{
	
	@Test
	public void campaign_tableTest() throws EncryptedDocumentException, IOException {
		
		createCampaign cp = new createCampaign(driver);
		ExcelFileUtility eu = new ExcelFileUtility();
		List<WebElement> rows = cp.getCampaignTableRow();
		
		
		for(int i=0; i < rows.size(); i++) {
			
	        List<WebElement> cells = cp.getCampaignTableColumn();
	        for (int j = 0; j < cells.size(); j++) {
	            String cellText = cells.get(j).getText();
	            eu.writeDataIntoExcelFile("Sheet1", i + 1, j, cellText);
	        }
		}		
		
	}

}
