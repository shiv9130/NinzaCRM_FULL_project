package testScripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import repository.createCampaign;

public class createCampaignTest extends baseClass{
	
	ExcelFileUtility eu = new ExcelFileUtility();
	JavaUtility ju = new JavaUtility();
	
	@Test
	public void createCampaignTestPage() {
		int random = ju.generateRandomNumber();
		createCampaign cp = new createCampaign(driver);
		cp.getCreateCampaignButton1().click();
		
		String campaignName = eu.toReadDataFromExcel("campaign", 1, 0);
		cp.getTxtCampaignName().sendKeys(campaignName+random);
		
		boolean textcampaign = cp.getLabelCampaignName().isDisplayed();
	    assertEquals(textcampaign, true);
		
		String campaignStatus = eu.toReadDataFromExcel("campaign", 1, 1);
		cp.getTxtCampaignStatus().sendKeys(campaignStatus);
		
		String target = eu.toReadDataFromExcel("campaign", 1, 2);
		cp.getTxtTargetSize().clear();
		cp.getTxtTargetSize().sendKeys(target+random);
		
		String date = eu.toReadDataFromExcel("campaign", 1, 3);
		cp.getExpectedCloseDateLabel().sendKeys(date);
		
		String targetAud = eu.toReadDataFromExcel("campaign", 1, 4);
		cp.getTargetAudience().sendKeys(targetAud);
		
		String desc = eu.toReadDataFromExcel("campaign", 1, 5);
		cp.getDescription().sendKeys(desc);
		
		cp.getBtnCreateCampaign().click();
		
	

	

		
		
		
	}

}
