package src.main.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import src.main.utility.BrowserFactory;
import src.main.utility.ConfigDataProvider;
import src.main.utility.Listner;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() {
		config = new ConfigDataProvider();
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Myntra.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeClass
	public void launchApp(){
		
		driver = BrowserFactory.startBrowser(driver, config.getBrowser(), config.getTestURL());
	}
	
	@AfterClass
	public void closeApp(){
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMeth(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS) {
			
			Listner.captureScreenShot(driver);
		}
		report.flush();
	}

}
