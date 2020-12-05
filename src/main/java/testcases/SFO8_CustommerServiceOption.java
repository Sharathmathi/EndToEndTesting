package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class SFO8_CustommerServiceOption extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="SFO8_CreateServiceOption";
		testDescription="Create Service Option";
		authors="Sharathmathi";
		category="Regression";
		nodes="Sales";
	}
	
	@Test
	public void createAccount() {
		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickLearnMore()
		.switchToWindow(1);
		//.productsTabDisplayed();
	}

}
