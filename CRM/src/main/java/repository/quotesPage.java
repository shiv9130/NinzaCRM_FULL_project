package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class quotesPage extends basePageN_CRM {

	public quotesPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Create Quote']")
	private WebElement btnQuoteCreate;
	
	@FindBy(name = "quoteId")
	private WebElement txtFquoteId;
	
	@FindBy(name = "subject")
	private WebElement txtFsubject;
	
	@FindBy(name = "validTill")
	private WebElement txtFvalidTill;
	
	@FindBy(name = "quoteStage")
	private WebElement txtFquoteStage;
	
	@FindBy(name="(//*[name()='svg' and @data-icon='plus'])[1]")
	private WebElement addOppplus;
	
	@FindBy(name="(//*[name()='svg' and @data-icon='plus'])[2]")
	private WebElement addContactplus;
	
	@FindBy(xpath = "(//textarea[@name='address'])[1]")
	private WebElement txtFbillingAdd;
	
	@FindBy(xpath = "(//textarea[@name='address'])[2]")
	private WebElement txtFshippingingAdd;
	
	@FindBy(xpath = "(//input[@name='poBox'])[1]")
	private WebElement txtFBillingPo;
	
	@FindBy(xpath = "(//input[@name='poBox'])[2]")
	private WebElement txtFshippingPo;
	
	@FindBy(xpath = "(//input[@name='city'])[1]")
	private WebElement txtFBillingCity;
	
	@FindBy(xpath = "(//input[@name='city'])[2]")
	private WebElement txtFShippingCity;
	
	@FindBy(xpath = "(//input[@name='state'])[1]")
	private WebElement txtFBillingState;
	
	@FindBy(xpath = "(//input[@name='state'])[2]")
	private WebElement txtFShippingState;
	
	@FindBy(xpath = "(//input[@name='postalCode'])[1]")
	private WebElement txtFBillingPostalCode;
	
	@FindBy(xpath = "(//input[@name='postalCode'])[2]")
	private WebElement txtFShippingPostalCode;
	
	@FindBy(xpath = "(//input[@name='country'])[1]")
	private WebElement txtFBillingCountry;
	
	@FindBy(xpath = "(//input[@name='country'])[2]")
	private WebElement txtFShippingCountry;
	
	@FindBy(name="(//*[name()='svg' and @data-icon='plus'])[3]")
	private WebElement addProduct;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnCreateQuote2;

	public WebElement getBtnCreateQuote2() {
		return btnCreateQuote2;
	}

	public void setBtnCreateQuote2(WebElement btnCreateQuote2) {
		this.btnCreateQuote2 = btnCreateQuote2;
	}

	public WebElement getBtnQuoteCreate() {
		return btnQuoteCreate;
	}

	public WebElement getTxtFquoteId() {
		return txtFquoteId;
	}

	public WebElement getTxtFsubject() {
		return txtFsubject;
	}

	public WebElement getTxtFvalidTill() {
		return txtFvalidTill;
	}

	public WebElement getTxtFquoteStage() {
		return txtFquoteStage;
	}

	public WebElement getAddOppplus() {
		return addOppplus;
	}

	public WebElement getAddContactplus() {
		return addContactplus;
	}

	public WebElement getTxtFbillingAdd() {
		return txtFbillingAdd;
	}

	public WebElement getTxtFshippingingAdd() {
		return txtFshippingingAdd;
	}

	public WebElement getTxtFBillingPo() {
		return txtFBillingPo;
	}

	public WebElement getTxtFshippingPo() {
		return txtFshippingPo;
	}

	public WebElement getTxtFBillingCity() {
		return txtFBillingCity;
	}

	public WebElement getTxtFShippingCity() {
		return txtFShippingCity;
	}

	public WebElement getTxtFBillingState() {
		return txtFBillingState;
	}

	public WebElement getTxtFShippingState() {
		return txtFShippingState;
	}

	public WebElement getTxtFBillingPostalCode() {
		return txtFBillingPostalCode;
	}

	public WebElement getTxtFShippingPostalCode() {
		return txtFShippingPostalCode;
	}

	public WebElement getTxtFBillingCountry() {
		return txtFBillingCountry;
	}

	public WebElement getTxtFShippingCountry() {
		return txtFShippingCountry;
	}

	public WebElement getAddProduct() {
		return addProduct;
	}
	
	

}
