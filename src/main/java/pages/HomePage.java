package pages;

import org.openqa.selenium.WebElement;
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
	
	public LeadsPage clickLead() {
		/*		
		WebElement eleLeads = driver.findElementByXPath("//span[text()='Leads']");
		driver.executeScript("arguments[0].click()", eleLeads);
		Thread.sleep(6000);
		*/
		jsClick(locateElement("xpath", "//span[text()='Leads']"));
		return new LeadsPage(driver, test);
	}

}
