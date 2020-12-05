package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class HomePage extends PreAndPost{
	
	public HomePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public HomePage clickAppLauncer() {
		click(locateElement("class", "slds-icon-waffle"));
		return this;
	}
	
	public AppLauncherPage clickViewAll() {
		click(locateElement("xpath", "//button[text()='View All']"));
		return new AppLauncherPage(driver, test);
	}
	
	public HomePage clickSVGIcon()
	{
		click(locateElement("xpath","(//div[@data-aura-class='oneGlobalCreate'])//div"));
		return this;
	}
	
	
	public HomePage clickNewTask()
	{
		click(locateElement("xpath","//span[text()='New Task']"));
		return this;
	}
		
	public HomePage enterSubject() {
		type(locateElement("xpath","//input[@role='textbox']"),"\"Bootcamp\"");
		return this;
	}
	public HomePage selectContact() {
		type(locateElement("xpath","//input[@title='Search Contacts']"),"Sarath M");
		click(locateElement("xpath","//div[@title='Sarath M']"));
		//click(locateElement("//a[@title='Sarath M']"));
		return this;
	}
	public HomePage selectStatus() {
		click(locateElement("link","Not Started"));
		click(locateElement("link","Waiting on someone else"));
		return this;
	}
	public HomePage clickSave() {
		click(locateElement("xpath","//div[@class='slds-grid bottomBar']//span"));
		return this;
	}
	public HomePage verifyMessage() {
		verifyPartialText(locateElement("xpath","//span[text()=' was created.']"),"created");
		return this;
	}
	
}


