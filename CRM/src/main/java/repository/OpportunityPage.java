package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunityPage extends basePageN_CRM{
	
	public OpportunityPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//span[text()='Create Opportunity']")
	private WebElement createOpportunityButton;
	
	@FindBy(name = "nextStep")
	private WebElement nextStepTF;
	
	@FindBy(name = "opportunityName")
	private WebElement opportunityNameTF;
	
	
	@FindBy(name = "salesStage")
	private WebElement salesStageTF;
	
	@FindBy(name = "businessType")
	private WebElement businessTypeTF;
	
	@FindBy(name = "assignedTo")
	private WebElement assignedToTF;
	
	
	@FindBy(name = "description")
	private WebElement descriptionTF;
	
	@FindBy(xpath = "//*[name()='svg' and @data-icon=\"plus\"]")
	private WebElement addLead;
	
	
	@FindBy(name = "expectedCloseDate")
	private WebElement expectedCloseDateTF;
	
	
	@FindBy(xpath = "//button[text()='Create Opportunity']")
	private WebElement createOpportunityBtn;
	
	@FindBy(name = "amount")
	private WebElement amountTF;
	
	
	public WebElement getCreateOpportunityButton() {
		return createOpportunityButton;
	}


	public WebElement getNextStepTF() {
		return nextStepTF;
	}


	public WebElement getOpportunityNameTF() {
		return opportunityNameTF;
	}


	public WebElement getSalesStageTF() {
		return salesStageTF;
	}


	public WebElement getBusinessTypeTF() {
		return businessTypeTF;
	}


	public WebElement getAssignedToTF() {
		return assignedToTF;
	}


	public WebElement getDescriptionTF() {
		return descriptionTF;
	}


	public WebElement getAddLead() {
		return addLead;
	}


	public WebElement getExpectedCloseDateTF() {
		return expectedCloseDateTF;
	}


	public WebElement getCreateOpportunityBtn() {
		return createOpportunityBtn;
	}


	public WebElement getAmountTF() {
		return amountTF;
	}


	public WebElement getProbabilityTF() {
		return probabilityTF;
	}

	@FindBy(name = "probability")
	private WebElement probabilityTF;
	
	
	}
