package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class NewCasePage extends PreAndPost{

	public NewCasePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public NewCasePage clickNew()
	{
		click(locateElement("xpath","//div[text()='New']"));
		return this;
	}
	
	public NewCasePage chooseContactName()
	{
		type(locateElement("xpath","//input[@title='Search Contacts']"),"Naveen Elumalai");
		click(locateElement("xpath","//div[@title='Naveen Elumalai']"));
		return this;
	}
	
	public NewCasePage selectStatus()
	{
		click(locateElement("xpath","(//input[@class='slds-input slds-combobox__input'])[2]"));
		click(locateElement("xpath","//span[text()='--None--']"));
		return this;
	}
	public NewCasePage typeSubject()
	{
		type(locateElement("xpath","(//span[text()='Subject'])[2]//following::input"),"Testing");
		return this;
	}
	
	public NewCasePage typeDescription()
	{
		type(locateElement("xpath","(//span[text()='Description']//following::textarea)[1]"),"Automation testing");
		return this;
	}
	
	public NewCasePage clickSave()
	{
		click(locateElement("xpath","(//span[text()='Save'])[2]"));
		return this;
	}
	
	public NewCasePage verifyMessage()
	{
		verifyPartialText(locateElement("xpath","//span[text()='Review the errors on this page.']"),"errors");
		return this;
	}
	
}
