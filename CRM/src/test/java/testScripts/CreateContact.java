package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import repository.CreateContacts;
import repository.createCampaign;
import repository.dashboardPage;

public class CreateContact extends baseClass{
	ExcelFileUtility eu = new ExcelFileUtility();
	JavaUtility ju = new JavaUtility();
	
	@Test
	public void CreateContactTest() throws InterruptedException {
		
		int random = ju.generateRandomNumber();
		CreateContacts cp = new CreateContacts(driver);
		dashboardPage dp = new dashboardPage(driver);
		WebDriverUtility wu= new WebDriverUtility();
		Thread.sleep(20000);
		
		dp.getContactsLink().click();
		cp.getCreateContactButton().click();
		
		String orgname = eu.toReadDataFromExcel("contact", 1, 0);
		cp.getOrganizationNameTF().sendKeys(orgname);
		
		String title = eu.toReadDataFromExcel("contact", 1, 1);
		cp.getTitleTF().sendKeys(title);
		
		String dept = eu.toReadDataFromExcel("contact", 1, 2);
		cp.getDepartmentTF().sendKeys(dept);
		
		String offphn = eu.toReadDataFromExcel("contact", 1, 3);
		cp.getOfficePhoneTF().sendKeys(offphn);
		
		String cname = eu.toReadDataFromExcel("contact", 1, 4);
		cp.getContactNameTF().sendKeys(cname);
		
		String mob = eu.toReadDataFromExcel("contact", 1, 5);
		cp.getContactNameTF().sendKeys(mob);
		
		String email = eu.toReadDataFromExcel("contact", 1, 6);
		cp.getEmailTF().sendKeys(email);
		
		//String camp = eu.toReadDataFromExcel("contact", 1, 7);
	//	cp.getCampaignPlus().click();
		
		String parentId = driver.getWindowHandle();
		wu.toSwitchToWindow(driver, parentId);
       //dropdown
		WebElement categoryDD = driver.findElement(By.id("search-criteria"));
		Select ddSel = new Select(categoryDD);
		ddSel.selectByValue("campaignName");
		driver.findElement(By.xpath("(//button[text()='Select'])[1]")).click();
	//	driver.switchTo().defaultContent();
		
		
		cp.getCreateContactBtn().click();
		
		
		
		
	}

}
