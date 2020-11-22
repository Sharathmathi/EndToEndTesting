package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ObjectManagerLaunch extends PreAndPost{
	
	public ObjectManagerLaunch(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ObjectManagerLaunch clickCreateObjectManager() {
		click(locateElement("xpath", "//a[@title='Create Menu']/following::span[text()='Create']"));
		return this;
	}
	public NewCustomObject clickCustomObject() {
		click(locateElement("xpath", "//span[text()='Custom Object']"));
		return new NewCustomObject(driver, test);
	}
	
}
