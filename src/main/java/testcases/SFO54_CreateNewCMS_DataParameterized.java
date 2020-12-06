package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class SFO54_CreateNewCMS_DataParameterized extends PreAndPost {

	 
	@BeforeTest
	public void setData() {
		testCaseName = "SFO54";
		testDescription = "Create New CMS";
		authors = "Venkatesh";
		category = "smoke";
		nodes = "Service";
		dataSheetName="CreateCMS";
		
		
	}

	@Test(dataProvider = "fetchData")
	public void creatCMS(String cName, String cDesc, String chName, String lang) {
		
//		System.out.println("CMS Name" + cName);
//		System.out.println("CMS Desc" + cDesc);
//		System.out.println("Channel Name" + chName);
//		System.out.println("CMS Lang" + lang);
//		
		

		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickCMS()
		.clickCreateCMSWorkspaces()
		.typeCMSName(cName + Double.toString( Math.random()).substring(3, 6))
		.typeCMSDescription( cDesc)
		.clickNext()
		.clickCreateChannel()
		.typeChannelName(chName)
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
		.selectTranslationLanguage(lang)
		.selectDefaultLanguage(lang)
		.clickNext()
		.clickDone()
		.verifyWorkSpaceCreation();
		
		
		
		

	}

}
