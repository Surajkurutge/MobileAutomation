package Testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	 
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	
	@BeforeClass 
	public void ConfigureAppium() throws MalformedURLException {
		 
		 
//		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\SurajKurutge\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
		
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel 5");
		option.setApp("C:\\Users\\SurajKurutge\\eclipse-workspace\\MobileAutomation\\src\\test\\java\\resources\\General-Store.apk");
		
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),option);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	} 
	
	
	 @AfterClass
	public void tearDown() {
//		driver.quit();
//		service.close();
	
	}

}
