package TestUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;

public class AppiumUtilities {

	
	
	
	public String getScreenshotPath(String TestcaseName ,AppiumDriver driver) throws IOException {
		 
		File source =  driver.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"//reports"+TestcaseName +".png";
		FileUtils.copyFile(source, new File (destinationfile));
		return destinationfile;
		
	}
}
