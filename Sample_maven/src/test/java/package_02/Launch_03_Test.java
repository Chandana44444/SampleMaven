package package_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_03_Test {
	@Test
	public void launch() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.kalkifashion.com/");
	Reporter.log("package2,script-01",true);
	Thread.sleep(2000);
	driver.quit();
}
}
