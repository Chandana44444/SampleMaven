//package UtilityMethods;
//
//import java.time.Duration;
//import java.time.LocalDateTime;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Listeners;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//@Listeners(TestNG_Listener_Class.class)
//public class BaseClass {
//	public static WebDriver driver;
//	public static ExtentHtmlReporter spark;
//	public static ExtentReports extent;
//	
//	@BeforeSuite
//	public void report_configure() {
//		LocalDateTime time = LocalDateTime.now();
//		String date = time.toString().replaceAll(":", "-");
//		spark=new ExtentHtmlReporter("./Reports/date.html");
//		extent=new ExtentReports();
//		extent.attachReporter(spark);//before suite
//	}
//	@BeforeClass
//	public void browserLaunch() {
//		driver = new ChromeDriver();
//	}
//	@BeforeMethod
//	public void login() {
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.partialLinkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("selenium4444@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("xyzabc");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//	}
//	@AfterClass
//	public void closebrowser() {
//		driver.quit();
//	}
//	@AfterMethod
//    public void logout() {
//		driver.findElement(By.linkText("Log out")).click();
//	}
//	@AfterSuite
//	public void flush_report() {
//		extent.flush();
//	}
//
//}
//
