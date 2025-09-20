package testScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import repository.createCampaign;

public class DataProvideCampaign extends baseClass {
	
	WebDriverUtility wu = new WebDriverUtility();
	JavaUtility ju = new JavaUtility();
	
	@Test(dataProvider = "getData")
	public void getCampaign(String cname, String targetsize, String ta){
		createCampaign cp = new createCampaign(driver);
		cp.getCreateCampaignButton1().click();
		cp.getTxtCampaignName().sendKeys(cname);;
		cp.getTxtTargetSize().sendKeys(targetsize);;
		cp.getTargetAudience().sendKeys(ta);;
		cp.getBtnCreateCampaign().click();
	}

	@DataProvider
	public Object[][] getData() {
		
		Object[][] objArray = new Object[1][3];
		/*
		 * for (int i = 0; i < rowCount; i++) { objArray[i][0] = sh.getRow(i +
		 * 1).getCell(0).getStringCellValue(); objArray[i][1] = sh.getRow(i +
		 * 1).getCell(1).getStringCellValue(); }
		 */
		objArray[0][0]= "Tender";
	    objArray[0][1]= "5";
	    objArray[0][2]="Public";
		
		
		return objArray;
	}

}