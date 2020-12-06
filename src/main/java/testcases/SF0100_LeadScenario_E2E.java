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
		dataSheetName="Lead";
	}
	
	@Test(dataProvider = "fetchData")
	public void newLead(String username, String password, String salutation, String firstname, String lastname, String company, String title, String phonenumber, String email, String leadstatus) {
		new LoginPage(driver, test)
		.typeUserName(username)
		.typePassword(password)
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickSales()
		.clickLead()
		.clickNew()
		.clickSalutation()
		.selectSalutation(salutation)
		.typeFirstName(firstname)
		.typeLastName(lastname)
		.typeCompanyName(company)
		.typeTitle(title)
		.typePhoneNumber(phonenumber)
		.typeEmail(email)
		.clickLeadStatus()
		.selectLeadStatus(leadstatus)
		.clickSaveLead();
		
	}
}
