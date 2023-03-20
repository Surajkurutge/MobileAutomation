package Pageobjectmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class testclass {

	
	  AndroidDriver idriver;
	
	public testclass(AndroidDriver rdriver) {
		 
		this.idriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	  WebElement namefield;
	
	@FindBy(id="com.androidsample.generalstore:id/radioFemale")
	  WebElement gender;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	  WebElement letsshop;
	
	
	public void addname(String str) {
		namefield.sendKeys(str);
	}
	
	public void selectgender( ) {
		gender.click();
	}
	
	public void clickonletsshop( ) {
		letsshop.click();
	}
	
}
