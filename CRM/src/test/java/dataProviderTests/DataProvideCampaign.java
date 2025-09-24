package dataProviderTests;

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
		
		objArray[0][0]= "Tender";
	    objArray[0][1]= "5";
	    objArray[0][2]="Public";
		
		
		return objArray;
	}

}