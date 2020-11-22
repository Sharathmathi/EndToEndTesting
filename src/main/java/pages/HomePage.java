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
	
	public HomePage clickGlobalSvgICon() {
		click(locateElement("xpath", "(//div[@data-aura-class='oneGlobalCreate'])//div"));
		return this;
	}
	
	public HomePage clickNewOpportunity() {
		click(locateElement("xpath", "//span[@class='actionLabel' and text()='New Opportunity']"));
		return this;
	}
	
	public HomePage clickNewCase() {
		click(locateElement("xpath", "//span[@class='actionLabel' and text()='New Case']"));
		return this;
	}
	
	public mobileCreateAndPublish MobilePublisherLearnMore() {
		click(locateElement("xpath", "//button[@title='Learn More']"));
		return new mobileCreateAndPublish(driver, test);
	}

}
