package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createCampaign extends basePageN_CRM{

	public createCampaign(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//h3[text()='Create Campaign']")
	private WebElement headingCreateCampaign;
	
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
	
	@FindBy(name = "description")
	private WebElement description;
	
	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement btnCreateCampaign;

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
	
	

}
