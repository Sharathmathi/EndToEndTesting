package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import lib.selenium.PreAndPost;
import pages.LoginPage;

public class TC5_CaseWithoutMandatory extends PreAndPost{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC005";
		testDescription = "CaseWithoutMandatory";
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
		.clickCase()
		.clickNew()
		.chooseContactName()
		.selectStatus()
		.typeSubject()
		.typeDescription()
		.clickSave()
		.verifyMessage();
		
	}
	

}
