package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.WebDriverUtility;
import repository.createCampaign;

public class exactDataFromPaginationTable extends baseClass {
	
	@Test
	public void exactTableData() throws InterruptedException {
		WebDriverUtility wu = new WebDriverUtility();
		createCampaign cp = new createCampaign(driver);
		cp.getCampaignTable();
		List<WebElement> rows = cp.getCampaignTableRow();
		List<WebElement> colms = cp.getCampaignTableColumn();
		//WebElement next = cp.getBtnNext();
		for(int i=2;i<=50;i++) {
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Go to page number "+i+"']"));
		
		wu.waitForElementToBeClickable(driver, ele);
		ele.click();
		}
		
	 /*List<WebElement> data = driver.findElements(By.xpath("//tr[9]/td[1] | //tr[9]/td[2]"));
	 for(WebElement s:data) {
		 System.out.println(s.getText());
	 }*/
		
		
		
		
		
		
	}

}
