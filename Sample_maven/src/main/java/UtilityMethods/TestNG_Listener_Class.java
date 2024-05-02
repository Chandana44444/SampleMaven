//package UtilityMethods;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.LocalDateTime;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.io.FileHandler;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//public class TestNG_Listener_Class extends BaseClass implements ITestListener{
//@Override
//public void onTestSuccess(ITestResult result) {
//	Reporter.log("success of test script"+result.getName(),true);
//}
//@Override
//public void onTestFailure(ITestResult result) {
//	LocalDateTime time = LocalDateTime.now();
//	String date = time.toString().replaceAll(":", "-");
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	File destiny=new File("./screen_shots"+date+".png");
//	try {
//		FileHandler.copy(src,destiny);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//@Override
//public void onTestStart(ITestResult result) {
//	// TODO Auto-generated method stub
//	Reporter.log("test case execution started",true);
//}
//@Override
//public void onTestSkipped(ITestResult result) {
//	Reporter.log("test case execution got skipped",true);
//}
//@Override
//public void onStart(ITestContext context) {
//	Reporter.log("on test started"+context.getName(),true);//test level ,test name
//}
//@Override
//public void onFinish(ITestContext context) {
//	Reporter.log("on test finished"+context.getName(),true);
//}
//}
