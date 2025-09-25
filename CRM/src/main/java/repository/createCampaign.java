package repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createCampaign extends basePageN_CRM{

	public createCampaign(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//h3[text()='Create Campaign']")
	private WebElement headingCreateCampaign;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createCampaignButton1;
	
	//table[@class="table table-striped table-hover"]
	@FindBy(xpath = "//table[@class='table table-striped table-hover']")
	private WebElement campaignTable;
	
	@FindBy(xpath = "//table[@class='table table-striped table-hover']/tbody/tr")
	private List<WebElement> campaignTableRow;
	
	@FindBy(xpath = "//table[@class='table table-striped table-hover']/tbody/tr/td")
	private List<WebElement> campaignTableColumn;
	
	@FindBy(xpath = "//a[text()='«']")
	private WebElement btnLongBack;
	
	@FindBy(xpath = "//a[text()='⟨']")
	private WebElement btnPrevious;
	
	@FindBy(xpath = "//a[text()='⟩']")
	private WebElement btnNext;
	
	@FindBy(xpath = "//a[text()='»']")
	private WebElement btnLongForward;
	
	@FindBy(xpath = "/a[@aria-label='Go to page number 1']")
	private WebElement linkPageNo;
			
	
	public WebElement getCampaignTable() {
		return campaignTable;
	}

	public List<WebElement> getCampaignTableRow() {
		return campaignTableRow;
	}

	public List<WebElement> getCampaignTableColumn() {
		return campaignTableColumn;
	}

	public WebElement getCreateCampaignButton1() {
		return createCampaignButton1;
	}

	@FindBy(xpath = "//label[text()='Campaign ID:']")
	private WebElement labelCampaignId;
	
	@FindBy(name = "campaignId")
	private WebElement txtCampaignId;
	
	@FindBy(xpath = "//label[text()='Campaign Name']")
	private WebElement labelCampaignName;
	
	@FindBy(name = "campaignName")
	private WebElement txtCampaignName;
	
	@FindBy(name = "//label[text()='Campaign Status:']")
	private WebElement labelCampaignStatus;
	
	@FindBy(name = "campaignStatus")
	private WebElement txtCampaignStatus;
	
	@FindBy(xpath = "//label[text()='Target Size']")
	private WebElement labelTargetSize;
	
	@FindBy(name = "targetSize")
	private WebElement txtTargetSize;
	
	@FindBy(xpath = "//label[text()='Expected Close Date:']")
	private WebElement expectedCloseDateLabel;
	
	@FindBy(name = "expectedCloseDate")
	private WebElement dateIcon;
	
	@FindBy(xpath = "//label[text()='Target Audience:']")
	private WebElement TargetAudienceLabel;
	
	@FindBy(name = "targetAudience")
	private WebElement targetAudience;
	
	@FindBy(xpath = "//label[text()='Description:']")
	private WebElement descriptionLabel;
	
	@FindBy(xpath = "//textarea[@name=\"description\"]")
	private WebElement description;
	
	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement btnCreateCampaign;
	
	@FindBy(xpath="//div[contains(text(), 'Campaign')]")
	private WebElement createCampaignMsg;

	public WebElement getCreateCampaignMsg() {
		return createCampaignMsg;
	}

	public WebElement getHeadingCreateCampaign() {
		return headingCreateCampaign;
	}

	public WebElement getLabelCampaignId() {
		return labelCampaignId;
	}

	public WebElement getTxtCampaignId() {
		return txtCampaignId;
	}

	public WebElement getLabelCampaignName() {
		return labelCampaignName;
	}

	public WebElement getTxtCampaignName() {
		return txtCampaignName;
	}

	public WebElement getLabelCampaignStatus() {
		return labelCampaignStatus;
	}

	public WebElement getTxtCampaignStatus() {
		return txtCampaignStatus;
	}

	public WebElement getLabelTargetSize() {
		return labelTargetSize;
	}

	public WebElement getTxtTargetSize() {
		return txtTargetSize;
	}

	public WebElement getExpectedCloseDateLabel() {
		return expectedCloseDateLabel;
	}

	public WebElement getDateIcon() {
		return dateIcon;
	}

	public WebElement getTargetAudienceLabel() {
		return TargetAudienceLabel;
	}

	public WebElement getTargetAudience() {
		return targetAudience;
	}

	public WebElement getDescriptionLabel() {
		return descriptionLabel;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getBtnCreateCampaign() {
		return btnCreateCampaign;
	}

	public WebElement getBtnLongBack() {
		return btnLongBack;
	}

	public WebElement getBtnPrevious() {
		return btnPrevious;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getBtnLongForward() {
		return btnLongForward;
	}

	public WebElement getLinkPageNo() {
		return linkPageNo;
	}
	
	

}
