package testScripts;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
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
		for (int i = 2; i <= 10; i++) {
			WebElement ele = cp.getPaginationButton(driver, i);

			wu.waitForElementToBeClickable(driver, ele);
			ele.click();
		}

		List<WebElement> data = driver.findElements(By.xpath("//tr[9]/td[1] | //tr[9]/td[2]"));
		for (WebElement s : data) {
			
			Reporter.log(s.getText(),true);
			String txt = s.getText();
			for(int i=0;i<=2;i++) {
			eu.writeDataIntoExcelFile("pagination", i, i, txt);
			}
			
		}

	}

}
