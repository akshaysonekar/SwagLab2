package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser1;
import pom.SwagLabLoginPage;
import utility.ExtentReport;
import utility.SwagLabElement;
@Listeners(utility.Listeners.class)
public class SwagLabLoginTest extends SwagLabElement {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
		reports=ExtentReport.getReports();
	}
	
	@BeforeMethod
	public void chrome() {
		driver=Browser1.openChromeBrowser();
	}
	@Test
	public void LoginwithCredentials() {
		test=reports.createTest("LoginwithCredentials");
		SwagLabLoginPage swagLabLoginPage=new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUserName("standard_user");
		swagLabLoginPage.enterPassword("secret_sauce");
		swagLabLoginPage.clickOnLogin();
	}
	public void captureResults(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else {
			test.log(Status.SKIP,result.getName());
		}
		
	}
	@AfterTest
	public void flushResutls() {
		reports.flush();
	}

}
