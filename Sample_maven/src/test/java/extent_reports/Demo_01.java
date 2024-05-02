package extent_reports;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import UtilityMethods.ToCaptureSnap;
import net.bytebuddy.matcher.FieldTypeMatcher;

public class Demo_01 {
@Test
public void report() {
	WebDriver driver;
	ToCaptureSnap snap=new ToCaptureSnap();
	String time = LocalDateTime.now().toString().replaceAll(":", "-");
	ExtentReports reports=new ExtentReports();
	ExtentSparkReporter extent=new ExtentSparkReporter("./Reports/"+time+".html");
	reports.attachReporter(extent);
	ExtentTest tc_01 = reports.createTest("login");
	driver=new ChromeDriver();
	tc_01.log(Status.INFO, "lauching browser");
	driver.manage().window().maximize();
	tc_01.log(Status.INFO, "lauching maximising");
	driver.get("https://demowebshop.tricentis.com/login");
	tc_01.log(Status.INFO, "navigating to DWS app");
	driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
	tc_01.log(Status.INFO, "entering data in email-id field");
	driver.findElement(By.id("Password")).sendKeys("xyc");
	tc_01.log(Status.INFO, "entering data in password field");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	tc_01.log(Status.PASS, "user is able to login successfully with valid credentails");
	try {
		if(driver.findElement(By.linkText("Log out")).isDisplayed()){
			tc_01.pass(MediaEntityBuilder.createScreenCaptureFromPath(snap.capture_snap(driver)).build());
		}
	}catch(Exception e) {
		tc_01.fail(MediaEntityBuilder.createScreenCaptureFromPath(snap.capture_snap(driver)).build());
	}
	reports.flush();
}	
}

