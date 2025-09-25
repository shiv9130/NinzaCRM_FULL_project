package dataProviderTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClassNinzaCrmFull.baseClass;
import repository.CreateContacts;
import repository.dashboardPage;

public class createContactDataProvider extends baseClass {
	
	
	
	@DataProvider
	public Object[][] getContactdata(){
		
		Object [][] contact = new Object [1][4];
		contact[0][0] = "it software";
		contact[0][1] = "testing";
		contact[0][2] = "user";
		contact[0][3] = "9852147321";
		
		return contact;
		
	}
	@Test(dataProvider = "getContactdata")
	public void createContactTestData(String org, String title, String contactN, String mob)  {
		
		dashboardPage dp = new dashboardPage(driver);
		CreateContacts cp = new CreateContacts(driver);
		
		dp.getContactsLink().click();
		
		cp.getCreateContactButton().click();
		
		cp.getOrganizationNameTF().sendKeys(org);
		cp.getTitleTF().sendKeys(title);
		cp.getContactNameTF().sendKeys(contactN);
		cp.getMobileTF().sendKeys(mob);
		
		
		
	}
 
}
