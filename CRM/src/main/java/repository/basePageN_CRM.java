package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePageN_CRM {
	
	WebDriver driver;
	
	public basePageN_CRM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}

}
