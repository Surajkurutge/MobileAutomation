package Testcases;

import org.testng.annotations.Test;

import Pageobjectmodule.testclass;

public class POMTest extends BaseClass {
	
	
	@Test
	public void pomtest() {
		
	
	testclass ref = new testclass(driver);
	ref.addname("suraj");
	ref.selectgender();
	ref.clickonletsshop();

	}
	
}
