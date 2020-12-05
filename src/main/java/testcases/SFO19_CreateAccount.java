package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class SFO19_CreateAccount extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="SFO19_CreateAccount";
		testDescription="Create New Account";
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
		.clickAppLauncer()
		.clickViewAll()
		.clickSales()
		.clickAccounts()
		.clickNewAccount()
		.accountName("Test_001")
		.clickOwnership()
		.selectOwnership("Public")
		.clickSave()
		.verifyNewAcct()
		.verifyConfMsg("was created");
		
	}

}