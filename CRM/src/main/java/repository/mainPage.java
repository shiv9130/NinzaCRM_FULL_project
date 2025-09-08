package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage extends basePageN_CRM {

	public mainPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//b[text()='NINZA CRM']" )
	private WebElement txtHeading;
	
	@FindBy(xpath ="//p[contains(text(),'Manage all ')]" )
	private WebElement txtPara1;
	
	@FindBy(xpath ="//img[@alt='Inventory Management']" )
	private WebElement imgLogo;
	
	@FindBy(xpath ="//div[text()='Effortless Control, Maximum Impact']" )
	private WebElement txtDynamic;
	
	@FindBy(xpath ="//h2[text()='Sign In']" )
	private WebElement txtlabelSignIn;
	
	@FindBy(xpath ="//label[text()='Username']" )
	private WebElement txtUNlabel;
	
	@FindBy(id = "username")
	private WebElement txtFieldUn;
	
	@FindBy(xpath ="//label[text()='Password']" )
	private WebElement txtlabelPw;
	
	@FindBy(id = "inputPassword")
	private WebElement txtfieldPw;
	
	@FindBy(xpath ="//button[text()='Sign In']" )
	private WebElement btnSignIn;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement txtLinkForgot;
	
	@FindBy(linkText = "Create Account")
	private WebElement txtLinkCreate;
	
	@FindBy(xpath = "//username req error msg : //div[text()='Username is required']")
	private WebElement EmptyUN;
	
	@FindBy(xpath ="//password req error msg : //div[text()='Password is required']")
	private WebElement EmptyPw;

	public WebElement getTxtHeading() {
		return txtHeading;
	}

	public WebElement getTxtPara1() {
		return txtPara1;
	}

	public WebElement getImgLogo() {
		return imgLogo;
	}

	public WebElement getTxtDynamic() {
		return txtDynamic;
	}

	public WebElement getTxtlabelSignIn() {
		return txtlabelSignIn;
	}

	public WebElement getTxtUNlabel() {
		return txtUNlabel;
	}

	public WebElement getTxtFieldUn() {
		return txtFieldUn;
	}

	public WebElement getTxtlabelPw() {
		return txtlabelPw;
	}

	public WebElement getTxtfieldPw() {
		return txtfieldPw;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public WebElement getTxtLinkForgot() {
		return txtLinkForgot;
	}

	public WebElement getTxtLinkCreate() {
		return txtLinkCreate;
	}

	public WebElement getEmptyUN() {
		return EmptyUN;
	}

	public WebElement getEmptyPw() {
		return EmptyPw;
	}
	
	
	
}


