package extent_reports;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SAMPLE_EXTENT_REPORT_02 {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replaceAll(":", "-");
//		ExtentHtmlReporter spark=new ExtentHtmlReporter("./Reports/time.html");
//		ExtentReports extent=new ExtentReports();
//		extent.attachReporter(spark);//before suite
//		ExtentTest ref = extent.createTest("sample-01","practise");
//		ChromeDriver driver=new ChromeDriver();
//		ref.info("launching chrome browser");
//		driver.manage().window().maximize();
//		ref.log(Status.INFO, "browser is maximized");
//		driver.get("https://demowebshop.tricentis.com/");
//		ref.log(Status.INFO, "navigating to dws app");
//		driver.findElement(By.id("small-searchterms")).sendKeys("Shoes",Keys.ENTER);
//		ref.log(Status.PASS, "searching");
//		Thread.sleep(2000);
//		driver.quit();
//		ref.log(Status.INFO, "close browser");
//		extent.flush();//after suite
		
		//version-3
	}
}
