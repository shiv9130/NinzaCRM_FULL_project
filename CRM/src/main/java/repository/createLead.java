package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createLead extends basePageN_CRM{

	public createLead(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Create Lead']")
	private WebElement btnCreateLead;
	
	@FindBy(xpath="//h3[text()='Create Lead']")
	private WebElement HeadingCreateLead;
	
	@FindBy(xpath="//label[text()='Lead ID: ']")
	private WebElement labelCreateLead;
	
	@FindBy(name="leadId")
	private WebElement txtFCreateLead;
	
	@FindBy(xpath="//label[text()='Lead Name']")
	private WebElement labelLeadName;
	
	@FindBy(name = "name")
	private WebElement txtFLeadName;
	
	@FindBy(xpath="//label[text()='Company']")
	private WebElement labelCompany;
	
	@FindBy(name = "company")
	private WebElement txtCompany;
	
	@FindBy(xpath="//label[text()='Lead Source']")
	private WebElement labelLeadSource;
	
	@FindBy(name = "leadSource")
	private WebElement txtFleadSource;
	
	@FindBy(xpath="//label[text()='Industry']")
	private WebElement labelIndustry;
		
	@FindBy(name = "industry")
	private WebElement txtFIndustry;
	
	@FindBy(xpath="//label[text()='Annual Revenue:']")
	private WebElement labelAnnualRevenue;
	
	@FindBy(name = "annualRevenue")
	private WebElement txtFannualRevenue;
	
	@FindBy(xpath="//label[text()='Number of Employees:']")
	private WebElement labelNoofEmployee;
	
	@FindBy(name ="noOfEmployees")
	private WebElement txtFnoOfEmployees;
	
	@FindBy(xpath="//label[text()='Phone']")
	private WebElement labelPhone;
	
	@FindBy(name ="phone")
	private WebElement txtFphone;
	
	@FindBy(xpath="//label[text()='Email:']")
	private WebElement labelEmail;
	
	@FindBy(name="email")
	private WebElement txtFemail;
	
	@FindBy(xpath="//label[text()='Secondary Email:']")
	private WebElement labelSecondaryEmail;
	
	@FindBy(name ="secondaryEmail")
	private WebElement txtFsecondaryEmail;
	
	@FindBy(xpath="//label[text()='Lead Status']")
	private WebElement labelLeadStatus;
	
	@FindBy(name="leadStatus")
	private WebElement txtFleadStatus;
	
	@FindBy(xpath="//label[text()='Rating:']")
	private WebElement labelRating;
	
	@FindBy(name="rating")
	private WebElement txtFrating;
	
	@FindBy(xpath="//label[text()='Assigned To:']")
	private WebElement labelAssigned;
	
	@FindBy(name ="assignedTo")
	private WebElement txtFassignedTo;
	
	@FindBy(xpath="//label[text()='Address:']")
	private WebElement labeladdress;
	
	@FindBy(name="address")
	private WebElement txtFaddress;
	
	@FindBy(xpath="//label[text()='City:']")
	private WebElement labelCity;
	
	@FindBy(name="city")
	private WebElement txtFCity;
	
	@FindBy(xpath="//label[text()='Country:']")
	private WebElement labelCountry;
	
	@FindBy(name ="country")
	private WebElement txtFcountry;
	
	@FindBy(xpath="//label[text()='Postal Code:']")
	private WebElement labelPostalCode;
	
	@FindBy(name ="postalCode")
	private WebElement txtFpostalCode;
		
	@FindBy(xpath="//label[text()='Website:']")
	private WebElement labelWebsite;
	
	@FindBy(name="website")
	private WebElement txtFwebsite;
	
	@FindBy(xpath="//label[text()='Campaign']")
	private WebElement labelCampaignPlus;
	
	@FindBy(xpath="//*[name()='svg' and @data-icon='plus']")
	private WebElement plusicon;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement labelDescription;
	
	@FindBy(name="description")
	private WebElement txtFdescription;
	
	@FindBy(xpath="//button[text()='Create Lead']")
	private WebElement BtnCreateLeadpage;

	public WebElement getBtnCreateLead() {
		return btnCreateLead;
	}

	public WebElement getHeadingCreateLead() {
		return HeadingCreateLead;
	}

	public WebElement getLabelCreateLead() {
		return labelCreateLead;
	}

	public WebElement getTxtFCreateLead() {
		return txtFCreateLead;
	}

	public WebElement getLabelLeadName() {
		return labelLeadName;
	}

	public WebElement getTxtFLeadName() {
		return txtFLeadName;
	}

	public WebElement getLabelCompany() {
		return labelCompany;
	}

	public WebElement getTxtCompany() {
		return txtCompany;
	}

	public WebElement getLabelLeadSource() {
		return labelLeadSource;
	}

	public WebElement getTxtFleadSource() {
		return txtFleadSource;
	}

	public WebElement getLabelIndustry() {
		return labelIndustry;
	}

	public WebElement getTxtFIndustry() {
		return txtFIndustry;
	}

	public WebElement getLabelAnnualRevenue() {
		return labelAnnualRevenue;
	}

	public WebElement getTxtFannualRevenue() {
		return txtFannualRevenue;
	}

	public WebElement getLabelNoofEmployee() {
		return labelNoofEmployee;
	}

	public WebElement getTxtFnoOfEmployees() {
		return txtFnoOfEmployees;
	}

	public WebElement getLabelPhone() {
		return labelPhone;
	}

	public WebElement getTxtFphone() {
		return txtFphone;
	}

	public WebElement getLabelEmail() {
		return labelEmail;
	}

	public WebElement getTxtFemail() {
		return txtFemail;
	}

	public WebElement getLabelSecondaryEmail() {
		return labelSecondaryEmail;
	}

	public WebElement getTxtFsecondaryEmail() {
		return txtFsecondaryEmail;
	}

	public WebElement getLabelLeadStatus() {
		return labelLeadStatus;
	}

	public WebElement getTxtFleadStatus() {
		return txtFleadStatus;
	}

	public WebElement getLabelRating() {
		return labelRating;
	}

	public WebElement getTxtFrating() {
		return txtFrating;
	}

	public WebElement getLabelAssigned() {
		return labelAssigned;
	}

	public WebElement getTxtFassignedTo() {
		return txtFassignedTo;
	}

	public WebElement getLabeladdress() {
		return labeladdress;
	}

	public WebElement getTxtFaddress() {
		return txtFaddress;
	}

	public WebElement getLabelCity() {
		return labelCity;
	}

	public WebElement getTxtFCity() {
		return txtFCity;
	}

	public WebElement getLabelCountry() {
		return labelCountry;
	}

	public WebElement getTxtFcountry() {
		return txtFcountry;
	}

	public WebElement getLabelPostalCode() {
		return labelPostalCode;
	}

	public WebElement getTxtFpostalCode() {
		return txtFpostalCode;
	}

	public WebElement getLabelWebsite() {
		return labelWebsite;
	}

	public WebElement getTxtFwebsite() {
		return txtFwebsite;
	}

	public WebElement getLabelCampaignPlus() {
		return labelCampaignPlus;
	}

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getLabelDescription() {
		return labelDescription;
	}

	public WebElement getTxtFdescription() {
		return txtFdescription;
	}

	public WebElement getBtnCreateLeadpage() {
		return BtnCreateLeadpage;
	}
	
	
	
	

}
