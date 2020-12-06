package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class SFO54_CreateNewCMS extends PreAndPost {

	
	@BeforeTest
	public void setData() {
		testCaseName = "SFO54";
		testDescription = "Create New CMS";
		authors = "Venkatesh";
		category = "smoke";
		nodes = "Service";
	}

	@Test
	public void creatCMS() {
		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickCMS()
		.clickCreateCMSWorkspaces()
		.typeCMSName("CMS Name " + Double.toString( Math.random()).substring(3, 6))
		.typeCMSDescription("CMS Desc")
		.clickNext()
		.clickCreateChannel()
		.typeChannelName("Channel Name")
		.clickPublicConnectionType()
		.clickCreate()
		.verifyChannelCreation()
		.clickAddChannels(1)
		.clickNext()
		.clickContributors(2)
		.clickNext()
		.selectIntegrationUserRole("Content Manager")
		.selectSecurityUserRole("Content Admin")
		.clickNext()
		.selectTranslationLanguage("German")
		.selectDefaultLanguage("German")
		.clickNext()
		.clickDone()
		.verifyWorkSpaceCreation();
		
		
		
		

	}

}
