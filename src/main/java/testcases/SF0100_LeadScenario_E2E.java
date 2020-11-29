package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class SF0100_LeadScenario_E2E extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="SFO100_LeadScenario E2E";
		testDescription="Create New Lead";
		authors="bharath";
		category="Regression";
		nodes="Sales";
	}
	
	@Test
	public void newLead() {
		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickSales()
		.clickLead()
		.clickNew()
		.clickSalutation()
		.selectSalutation("Mr.")
		.typeFirstName("James")
		.typeLastName("Allen")
		.typeCompanyName("ABC")
		.typeTitle("Business Analyst")
		.typePhoneNumber("987654321")
		.typeEmail("test@email.com")
		.clickLeadStatus()
		.selectLeadStatus("Open - Not Contacted")
		.clickSaveLead();
		
	}
}
