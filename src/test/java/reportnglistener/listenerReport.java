package reportnglistener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities1.ScreenshotTestng;

public class listenerReport extends ScreenshotTestng implements ITestListener{

	public void onTestStart(ITestResult result) {
	Reporter.log("rr test start"+result.getName());	
	System.out.println("syso test start");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("rr test status"+result.getStatus());	
		System.out.println("syso status");
	}

	public void onTestFailure(ITestResult result) {
		try {
			errorscreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	System.out.println("failed check syso");
		//Reporter.log("<a>screenshot</a>");
	}

//	public void onTestSkipped(ITestResult result) {
//	Reporter.log("onTestSkipped");	
//	}
//
//	
//
//	public void onStart(ITestContext context) {
//	Reporter.log("rr test is starting ???");
//	}
//
//	public void onFinish(ITestContext context) {
//	Reporter.log("this test completed name"+context.getName());	
//	}

}
