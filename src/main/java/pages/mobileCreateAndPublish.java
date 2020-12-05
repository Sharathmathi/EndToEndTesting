package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class mobileCreateAndPublish extends PreAndPost{
	// TODO Auto-generated constructor stub
	public mobileCreateAndPublish(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public mobileCreateAndPublish ProductsTabDisplayed() {
		verifyDisplayed(locateElement("xpath", "//li[@id='solutions_menu_item']"));
		return this;
	}
}