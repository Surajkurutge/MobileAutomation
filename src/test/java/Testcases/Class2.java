package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumDriver;

public class Class2 {

	 
	@Test
	public String getScreenshotPath(String TestcaseName ,AppiumDriver driver) throws IOException {
		 
		File source =  driver.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"//reports"+TestcaseName +".png";
		FileUtils.copyFile(source, new File (destinationfile));
		return destinationfile;
		
	}
	
	
	
}
