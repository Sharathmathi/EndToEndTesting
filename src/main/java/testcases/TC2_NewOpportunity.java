package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import lib.selenium.PreAndPost;
import pages.LoginPage;

public class TC2_NewOpportunity extends PreAndPost{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002";
		testDescription = "Opportunity Page";
		authors = "RaniNiveda";
		category = "smoke";
		nodes = "Service";
	}
		
	@Test
	public void login() {
		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickSales()
		.clickOpportunities()
		.clickNew()
		.enterDate()
		.clickSave()
		.verifyMessage();
		
	}
	

}
