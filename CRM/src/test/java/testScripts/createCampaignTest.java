package testScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import repository.createCampaign;

public class createCampaignTest extends baseClass {

	ExcelFileUtility eu = new ExcelFileUtility();
	JavaUtility ju = new JavaUtility();

	@Test
	public void createCampaignTestPage() throws InterruptedException {
		int random = ju.generateRandomNumber();
		createCampaign cp = new createCampaign(driver);
		WebDriverUtility wu= new WebDriverUtility();
		Thread.sleep(20000);
		cp.getCreateCampaignButton1().click();

		String campaignName = eu.toReadDataFromExcel("campaign", 1, 0);
		cp.getTxtCampaignName().sendKeys(campaignName + random);

		boolean textcampaign = cp.getLabelCampaignName().isDisplayed();
		assertEquals(textcampaign, true);

		String campaignStatus = eu.toReadDataFromExcel("campaign", 1, 1);
		cp.getTxtCampaignStatus().sendKeys(campaignStatus);

		String target = eu.toReadDataFromExcel("campaign", 1, 2);
		cp.getTxtTargetSize().clear();
		cp.getTxtTargetSize().sendKeys(target);

		String date1 = eu.toReadDataFromExcel("campaign", 1, 3);
		cp.getDateIcon().sendKeys(date1);

		String targetAud = eu.toReadDataFromExcel("campaign", 1, 4);
		cp.getTargetAudience().sendKeys(targetAud);

		String desc = eu.toReadDataFromExcel("campaign", 1, 5);
		cp.getDescription().sendKeys(desc);

		cp.getBtnCreateCampaign().click();
		Thread.sleep(5000);
		WebElement message =cp.getCreateCampaignMsg();
		wu.waitForVisibilityOfElement(driver, message);
		String msg = message.getText();
		  
		 assertEquals(message.getText().contains(campaignName), msg.contains(campaignName));
		 
	}

}
