package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productPage extends basePageN_CRM{

	public productPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Add Product']")
	private WebElement btnAddProduct;
	
	@FindBy(name = "productId")
	private WebElement txtFproductId;
	
	@FindBy(name = "productName")
	private WebElement txtFproductName;
	
	@FindBy(name = "productCategory")
	private WebElement dropDproductCategory;
	
	@FindBy(name = "quantity")
	private WebElement txtFquantity;
	
	@FindBy(name="price")
	private WebElement txtFprice;
	
	@FindBy(name="vendorId")
	private WebElement dropDvendorId;
	
	@FindBy(name = "//button[@type='submit']")
	private WebElement btnAdd;
	
	
	
	
	
	

}
