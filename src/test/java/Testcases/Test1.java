package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BaseClass{
	
	@Test
	public void Tests() {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("suraj");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsSh")).click();
		 
	}
	

}
