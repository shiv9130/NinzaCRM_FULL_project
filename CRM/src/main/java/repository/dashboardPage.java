package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashboardPage extends basePageN_CRM {

	public dashboardPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	@FindBy(linkText = "Quotes")
	private WebElement quotesLink;
	
	@FindBy(linkText = "Purchase Order")
	private WebElement purchaseOrderLink;
	
	@FindBy(linkText = "Sales Order")
	private WebElement salesOrderLink;
	
	@FindBy(xpath = "//li[text()='Admin Console']")
	private WebElement adminConsole;
	
	@FindBy(linkText = "Invoice")
	private WebElement invoiceLink;
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement userIcon;
	
	@FindBy(linkText = "Sales Order")
	private WebElement salesOrderLink1;
	
	@FindBy(xpath = "//div[text()='rmgyantra']")
	private WebElement username;
	
	@FindBy(xpath = "//*[name()='svg' and @data-icon='user']")
	private WebElement usericon;
	
	public WebElement getUsericon() {
		return usericon;
	}

	@FindBy(xpath = "//div[text()='ADMIN']")
	private WebElement admin;
	
	@FindBy(xpath = "//div[text()='Logout ']")
	private WebElement logout;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampaign;
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement searchCampaign;
	
	@FindBy(xpath = "//input[@placeholder='Search by Campaign Id']")
	private WebElement searchCampaignId;

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getAdminConsole() {
		return adminConsole;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getSalesOrderLink1() {
		return salesOrderLink1;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCreateCampaign() {
		return createCampaign;
	}

	public WebElement getSearchCampaign() {
		return searchCampaign;
	}

	public WebElement getSearchCampaignId() {
		return searchCampaignId;
	}
	

}
