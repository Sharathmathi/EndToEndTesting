package pages;

import java.util.Random;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class NewCustomObject extends PreAndPost {

	public NewCustomObject(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public NewCustomObject clickCreateObjectManager() {
		//driver.switchTo().frame(click(locateElement("xpath","//iframe[@title='New Custom Object ~ Salesforce - Developer Edition']")));
		Random randomGenerator = new Random();  

		return this;
	}

}
