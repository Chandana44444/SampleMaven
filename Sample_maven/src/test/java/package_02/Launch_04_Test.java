package package_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_04_Test {
	@Test
	public void launch() throws InterruptedException {
//	String url = System.getProperty("url");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.bikewale.com/new-bikes-in-india/");
//	driver.get(url);
	Thread.sleep(2000);
	Reporter.log("package2,script-02",true);
	driver.quit();
}
}
