package UtilityMethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureSnap {
public String capture_snap(WebDriver driver) {
	String get_current_time = LocalDateTime.now().toString().replaceAll(":", "-");
	String path="./screen_shots/"+get_current_time+".png";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File destiny = new File(path);
	try {
		FileHandler.copy(src, destiny);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "."+path;
	
}

}
