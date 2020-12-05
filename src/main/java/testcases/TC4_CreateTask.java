package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import lib.selenium.PreAndPost;
import pages.LoginPage;

public class TC4_CreateTask extends PreAndPost{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC004";
		testDescription = "Create Task";
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
		.clickSVGIcon()
		.clickNewTask()
		.enterSubject()
		.selectContact()
		.selectStatus()
		.clickSave()
		.verifyMessage();
		
	}
	

}
