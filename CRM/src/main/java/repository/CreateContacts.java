package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContacts extends basePageN_CRM{
	
	public CreateContacts(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//span[text()='Create Contact']")
	private WebElement createContactButton;
	
	@FindBy(xpath = "//label[text()='Contact ID: ']")
	private WebElement createContactId;
	
	@FindBy(xpath = "//label[text()='Contact ID: ']")
	private WebElement contactId;
	
	@FindBy(xpath = "//label[text()='Organization']")
	private WebElement organizationLabel;
	
	@FindBy(xpath = "//label[text()='Title']")
	private WebElement labelTitle;
	
	@FindBy(xpath = "//label[text()='Contact Name']")
	private WebElement labelContactName;
	
	@FindBy(xpath = "//label[text()='Mobile']")
	private WebElement labelMobile;
	
	@FindBy(xpath = "//label[text()='Email:']")
	private WebElement labelEmail;
	
	@FindBy(xpath = "//label[text()='Department:']")
	private WebElement labelDepartment;
	
	@FindBy(xpath = "//label[text()='Office Phone:']")
	private WebElement labelOfficePhone;
	
	@FindBy(xpath = "//label[text()='Campaign']")
	private WebElement labelCampaign;
	
	@FindBy(name = "contactId")
	private WebElement contactIdTF;
	
	@FindBy(name = "contactName")
	private WebElement contactNameTF;
	
	@FindBy(name = "organizationName")
	private WebElement organizationNameTF;
	
	@FindBy(name = "mobile")
	private WebElement mobileTF;
	
	@FindBy(name = "title")
	private WebElement titleTF;
	
	@FindBy(name = "email")
	private WebElement emailTF;
	
	@FindBy(name = "department")
	private WebElement departmentTF;
	
	@FindBy(xpath = "//*[name()='svg' and @data-icon='plus']")
	private WebElement campaignPlus;
	
	@FindBy(xpath = "//label[text()='Campaign']")
	private WebElement campaignLabel;
	
}
