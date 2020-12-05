package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class LeadsPage extends PreAndPost{

	public LeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public LeadsPage clickNew() {
		click(locateElement("xpath", "//div[@title='New']"));
		return new LeadsPage(driver, test);
		}
	
	
	public LeadsPage clickSalutation() {
		click(locateElement("xpath", "//a[@class='select']"));
		return this;
	}
	
	
	public LeadsPage selectSalutation(String salut) {
		click(locateElement("xpath", "//a[@title='"+salut+"']"));
		return this;
	}
	
	
	public LeadsPage typeFirstName(String fName) {
		type(locateElement("xpath","//input[@placeholder='First Name']"),fName);
		return this;
		
	}
	
	
	public LeadsPage typeLastName(String lName) {
		type(locateElement("xpath", "//input[@placeholder='Last Name']"),lName);
		return this;
	}
	
	
	public LeadsPage typeCompanyName(String company) {
		type(locateElement("xpath", "(//input[@class=' input'])[3]"),company);
		return this;
	}
	
	
	public LeadsPage typeTitle(String title) {
		type(locateElement("xpath", "(//span[text()='Title'])[2]/following::input"),title);
		return this;
	}
	
	
	public LeadsPage typePhoneNumber(String phone) {
		type(locateElement("xpath", "//input[@type='tel']"),phone);
		return this;
	}
	
	
	public LeadsPage typeEmail(String email) {
		type(locateElement("xpath", "//input[@inputmode='email']"),email);
		return this;
	}
	
	
	public LeadsPage clickLeadStatus() {
		click(locateElement("xpath", "//h2[text()='New Lead']/following::span[text()='Lead Status']/following::a[1]"));
		return this;
	}
	
	
	public LeadsPage selectLeadStatus(String lStatus) {
		
		click(locateElement("xpath", "//a[@title='"+lStatus+"']"));
		return this;
	}
	
	
	// Click Save and Verify the lead James Allen has created.
	
	public LeadsPage clickSaveLead() {
		click(locateElement("xpath", "(//span[text()='Save'])[2]"));
		verifyPartialText(locateElement("xpath", "//span[@data-aura-class='forceActionsText']"), "was created");
		
		/*
		if(result.contains("was created")) {
			System.out.println("Lead created successfully - "+ result);
		}else {
			System.err.println("Lead was not created - "+result);
		}
		*/
		return this;
		
	}
	
}
