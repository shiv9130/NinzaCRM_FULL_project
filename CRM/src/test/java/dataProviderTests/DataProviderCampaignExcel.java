package dataProviderTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import repository.createCampaign;

public class DataProviderCampaignExcel extends baseClass {

	@Test(dataProvider = "getData")
	public void getCampaign(String cname, String status, String targetsize, String d, String ta, String desp) {
		createCampaign cp = new createCampaign(driver);
		cp.getCreateCampaignButton1().click();
		cp.getTxtCampaignName().sendKeys(cname);
		cp.getTxtCampaignStatus().sendKeys(status);
		cp.getTxtTargetSize().sendKeys(targetsize);
		cp.getDateIcon().sendKeys(d);
		cp.getTargetAudience().sendKeys(ta);
		cp.getDescription().sendKeys(desp);
		cp.getBtnCreateCampaign().click();
	}

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		ExcelFileUtility eu = new ExcelFileUtility();

		int rowCount = eu.getRowCount("campaign");
		Object[][] objArray = new Object[rowCount][6];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < 6; j++) {
				objArray[i][j] = eu.toReadDataFromExcel("campaign", i + 1, j);
			}

		}

		return objArray;
	}

}
