package pages;

import java.util.Random;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class NewCustomObject extends PreAndPost {
	public int number;
	public String label;

	public NewCustomObject(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public NewCustomObject clickCreateObjectManager() {
		switchToFrame(locateElement("xpath","//iframe[@title='New Custom Object ~ Salesforce - Developer Edition']"));
		number = RandomNumberGenerate();
		label = "Employee"+number;
		return this;
	}
	
	public NewCustomObject EnterLabel() {
		type(locateElement("xpath","//input[@id='MasterLabel']"),label);
		return this;
	}
	
	public NewCustomObject EnterPluralLabel() {
		type(locateElement("id","PluralLabel"),label);
		return this;
	}
	
	

}
