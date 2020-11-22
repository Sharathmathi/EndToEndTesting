package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ObjectManager extends PreAndPost{
	
	public ObjectManager(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ObjectManagerLaunch clickObjectManager() {
		click(locateElement("xpath", "(//a[@title='Object Manager'])[1]"));
		return new ObjectManagerLaunch(driver, test);
	}
	
}
