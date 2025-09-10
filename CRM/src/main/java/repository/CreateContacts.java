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
	
	//button[text()='Create Contact']
	@FindBy(xpath = "//button[text()='Create Contact']")
	private WebElement createContactbtn;

	public WebElement getCreateContactButton() {
		return createContactButton;
	}
	public WebElement getCreateContactBtn() {
		return createContactbtn;
	}

	public WebElement getCreateContactId() {
		return createContactId;
	}

	public WebElement getContactId() {
		return contactId;
	}

	public WebElement getOrganizationLabel() {
		return organizationLabel;
	}

	public WebElement getLabelTitle() {
		return labelTitle;
	}

	public WebElement getLabelContactName() {
		return labelContactName;
	}

	public WebElement getLabelMobile() {
		return labelMobile;
	}

	public WebElement getLabelEmail() {
		return labelEmail;
	}

	public WebElement getLabelDepartment() {
		return labelDepartment;
	}

	public WebElement getLabelOfficePhone() {
		return labelOfficePhone;
	}

	public WebElement getLabelCampaign() {
		return labelCampaign;
	}

	public WebElement getContactIdTF() {
		return contactIdTF;
	}

	public WebElement getContactNameTF() {
		return contactNameTF;
	}

	public WebElement getOrganizationNameTF() {
		return organizationNameTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getDepartmentTF() {
		return departmentTF;
	}

	public WebElement getCampaignPlus() {
		return campaignPlus;
	}

	public WebElement getCampaignLabel() {
		return campaignLabel;
	}
	
}
