package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class Assesment extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="SFO19_CreateAccount";
		testDescription="Create New Account";
		authors="Sharathmathi";
		category="Regression";
		nodes="Sales";
	}
	
	@Test
	public void createAccount() throws AWTException {
		String strFile = null;
		String strExt = null;
		new LoginPage(driver, test)
		.typeUserName("makaia@testleaf.com")
		.typePassword("Bootcamp$123")
		.clickLogIn()
		.clickAppLauncer()
		.clickViewAll()
		.clickServiceConsole()
		.clickShowNavigationMenu()
		.clickFiles()
		.ClickUploadFiles()
		.UploadFiles("C:\\Users\\dell\\Desktop\\Day3 java Questions.txt")
		.callRobotClass()
		.finishDownlaod()
		.clickfileDropdown()
		.clickViewFile()
		.verifyIfFileMatches("Day3 java Questions")	
		.verifyIfFileMatches("txt")
		.closeFileWindow()
		.clickLastModifiedItem()
		.clickShare()
		.clickSearchUser()
		.clickUserName()
		.verifyIfFileMatches("Can't share file with the file owner.")
		.clickCancel()
		.clickCloseDialog()
		.clickNewlyUploadedFile()
		.clickDelete()
		.confirmDelete()
		.verifyMessage("Can't share file with the file owner.");
		}

}