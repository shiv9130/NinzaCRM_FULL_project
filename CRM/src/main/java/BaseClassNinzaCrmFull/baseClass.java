package BaseClassNinzaCrmFull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import exceptionsUtility.FileNotFoundException;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import repository.dashboardPage;
import repository.mainPage;

public class baseClass {
	
	public static WebDriver sdriver = null;
	PropertyFileUtility pu = new PropertyFileUtility();
	WebDriverUtility wu = new WebDriverUtility();
	public static WebDriver driver = null;
	

    @BeforeSuite(groups= {"smokeTest","regressionTest"})
    public void configBS() {
    	
    	Reporter.log("DB connectivity started",true);
    	
    }
    
    @BeforeTest(groups= {"smokeTest","regressionTest"})
    public void configBT() {
    	
    	Reporter.log("precondition = user already has ninzaCrm account",true);
    	
    }
    @BeforeClass(groups= {"smokeTest","regressionTest"})
    public void configBC(){
    	try {
    		String brow = pu.toReadDataFromProperties("Browser");
        	String url = pu.toReadDataFromProperties("URL");
        	
        	if(brow.equalsIgnoreCase("chrome")) {
        		driver= new ChromeDriver();
        	}else if (brow.equalsIgnoreCase("edge")) {
        		driver = new EdgeDriver();
        	}else if (brow.equalsIgnoreCase("firefox")) {
        		driver = new FirefoxDriver();
        	}else {
        		driver = new ChromeDriver();
        	}
        	
        	driver.get(url);
        	driver.manage().window().maximize();
        	wu.waitForPageToLoad(driver);
			
		} catch (Exception e) {
			throw new FileNotFoundException("File Not Found"+e.getMessage());
		}
    	Reporter.log("browser open sucessfully and enter url",true);
    		
    }
    @BeforeMethod(groups= {"smokeTest","regressionTest"})
    public void configBM() {
    	
    	String un,pw;
		try {
			 un = pu.toReadDataFromProperties("Username");
			 pw = pu.toReadDataFromProperties("Password");
			 mainPage mp= new mainPage(driver);
		     mp.loginCRM(un, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new FileNotFoundException("File Not Found "+e.getMessage());
		}
    	
		Reporter.log("user signin to ninzaCRM",true);
    	  	
    }
    
    @AfterMethod(groups= {"smokeTest","regressionTest"})
    public void configAM() {
    	
    	dashboardPage dp = new dashboardPage(driver);
    	wu.waitForVisibilityOfElement(driver, dp.getUserIcon());     
    	wu.moveToElement(driver, dp.getUserIcon());
        dp.getLogout().click();
        
    	Reporter.log("user logout sucessfully",true);
    	
    }
    
    @AfterClass(groups= {"smokeTest","regressionTest"})
    public void configAC(){
    	
    	driver.close();
    	driver.quit();
    	Reporter.log("browser close sucessfully",true);
    	
    }
    @AfterTest(groups= {"smokeTest","regressionTest"})
    public void configAT() {
    	
    	Reporter.log("post-condition",true);
    }
    
    @AfterSuite(groups= {"smokeTest","regressionTest"})
    public void configAS() {
    	Reporter.log("database closed sucessfully",true);
    }
    
    
}