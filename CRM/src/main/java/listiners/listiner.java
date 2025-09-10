package listiners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClassNinzaCrmFull.baseClass;
import genericUtility.JavaUtility;

public class listiner implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test sucessfull");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		JavaUtility ju = new JavaUtility();
		String dt = ju.getSystemDateAndTimeForScreenshot();
		TakesScreenshot ts = (TakesScreenshot) baseClass.sdriver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("./repository9\\CRM\\sShot"+dt+".png");
		try {
			FileHandler.copy(src, tgt);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
