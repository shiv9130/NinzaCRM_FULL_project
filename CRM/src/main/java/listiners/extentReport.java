package listiners;

import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import genericUtility.JavaUtility;

public class extentReport implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports report;
	public ExtentTest test;
	JavaUtility ju = new JavaUtility();
	String reportName;
	
	@Override
	public void onStart(ITestContext context) {
		String dt = ju.getSystemDateAndTimeForScreenshot();
		reportName = "Test_report"+dt+".html";
		sparkReporter.config().setDocumentTitle("Ninzacrm");
		sparkReporter.config().setReportName("NinzaCrmAutomation");
		sparkReporter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(sparkReporter);
		
		report.setSystemInfo("username",System.getProperty("username"));
		
		String brow = context.getCurrentXmlTest().getParameter("browser");
		report.setSystemInfo("browser", brow);
		
		String ops = context.getCurrentXmlTest().getParameter("os");
		report.setSystemInfo("os", ops);
		
		List<String> group = context.getCurrentXmlTest().getIncludedGroups();
		if(!group.isEmpty()) {
			report.setSystemInfo("group", group.toString());
		}
			
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test=report.createTest(result.getTestClass().getTestName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, "test pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
	

}
