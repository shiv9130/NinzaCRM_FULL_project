package testScripts;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import repository.createLead;
import repository.dashboardPage;

public class createLeadT extends baseClass  {
	
	
	ExcelFileUtility eu = new ExcelFileUtility();
	WebDriverUtility wu = new WebDriverUtility();
	JavaUtility ju = new JavaUtility();
	
	
	@Test
	public void createLeadTest() {
		
		dashboardPage dp = new dashboardPage(driver);
		createLead cl = new createLead(driver);
		
		int rno = ju.generateRandomNumber();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		dp.getLeadsLink().click();
		cl.getBtnCreateLead().click();
		boolean leadlabel = cl.getLabelLeadName().isDisplayed();
		assertEquals(leadlabel, true);
		
		String leadName = eu.toReadDataFromExcel("lead", 1, 0);
		cl.getTxtFLeadName().sendKeys(leadName);
		
		String company = eu.toReadDataFromExcel("lead", 1, 1);
		cl.getTxtCompany().sendKeys(company);
		
		String leadSrc = eu.toReadDataFromExcel("lead", 1, 2);
		cl.getTxtFleadSource().sendKeys(leadSrc);
		
		String indus = eu.toReadDataFromExcel("lead", 1, 3);
		cl.getTxtFIndustry().sendKeys(indus);
		
		String annual = eu.toReadDataFromExcel("lead", 1, 4);
		cl.getTxtFannualRevenue().clear();
		cl.getTxtFannualRevenue().sendKeys(annual);
		
		String noOfEmp = eu.toReadDataFromExcel("lead", 1, 5);
		cl.getTxtFnoOfEmployees().clear();
		cl.getTxtFnoOfEmployees().sendKeys(noOfEmp);
		
		String phone = eu.toReadDataFromExcel("lead", 1, 6);
		cl.getTxtFphone().sendKeys(phone);
		
		String email = eu.toReadDataFromExcel("lead", 1, 7);
		cl.getTxtFemail().sendKeys(email);
		
		String semail = eu.toReadDataFromExcel("lead", 1, 8);
		cl.getTxtFsecondaryEmail().sendKeys(semail);
		
		String lStatus = eu.toReadDataFromExcel("lead", 1, 9);
		cl.getTxtFleadStatus().sendKeys(lStatus);
		
		String rating = eu.toReadDataFromExcel("lead", 1, 10);
		cl.getTxtFrating().clear();
		cl.getTxtFrating().sendKeys(rating);
		
		String assignto = eu.toReadDataFromExcel("lead", 1, 11);
		cl.getTxtFassignedTo().sendKeys(assignto);
		
		String address = eu.toReadDataFromExcel("lead", 1, 12);
		cl.getTxtFaddress().sendKeys(address);
		
		String city = eu.toReadDataFromExcel("lead", 1, 13);
		cl.getTxtFCity().sendKeys(city);
		
		String country = eu.toReadDataFromExcel("lead", 1, 14);
		cl.getTxtFcountry().sendKeys(country);
		
		String pincode = eu.toReadDataFromExcel("lead", 1, 15);
		cl.getTxtFpostalCode().sendKeys(pincode);
		
		String web = eu.toReadDataFromExcel("lead", 1, 16);
		cl.getTxtFwebsite().sendKeys(web);
		
		cl.getPlusicon().click();
		
		String winP = driver.getWindowHandle();
		
		
		Set<String> window = driver.getWindowHandles();
		
		/*window.remove(winP);
		for(String WinId:window) {
			driver.switchTo().window(WinId);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement id = driver.findElement(By.id("search-criteria"));
			Select s = new Select(id);
			s.selectByVisibleText("Campaign ID");
			driver.findElement(By.id("search-input")).sendKeys("CAM00030");
			driver.findElement(By.xpath("//button[text()='Select']")).click();
			driver.switchTo().defaultContent();*/
		
		String parentId = driver.getWindowHandle();
		wu.toSwitchToWindow(driver, parentId);
		driver.findElement(By.xpath("//button[@class='select-btn']")).click();// dynamic

		driver.switchTo().window(parentId);
		
		/*String disc = eu.toReadDataFromExcel("lead", 1, 17);
		cl.getTxtFdescription().sendKeys(disc);*/
		
		cl.getBtnCreateLeadpage().click();		
	
	}

}
