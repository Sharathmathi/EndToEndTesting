package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AccountsPage extends PreAndPost{
		// TODO Auto-generated constructor stub
		public AccountsPage(EventFiringWebDriver driver, ExtentTest test) {
			this.driver = driver;
			this.test = test;
		}
		
		public AccountsPage clickNewAccount() {
			click(locateElement("xpath", "//div[text()='New']"));
			return this;
		}

		public AccountsPage accountName(String name) {
			type(locateElement("xpath", "//span[text()='Account Name']/parent::label/following-sibling::input[@class=' input']"), name);
			return this;
		}

		public AccountsPage selectOwnership(String ownership) {
			//click(locateElement("xpath", "//a[@title='"+salut+"']"));
			click(locateElement("xpath", "//a[@title='"+ownership+"']"));
			return this;
			
		}

		public AccountsPage clickOwnership() {
			click(locateElement("xpath", "//span[text()='Ownership']/parent::span/following-sibling::div//a[@class='select']"));
			return this;
		}
		
		public AccountsPage clickSave() {
			click(locateElement("xpath", "//h2[text()='New Account']/following::span[text()='Save']"));
			return this;
		}

		public AccountsPage verifyNewAcct() {
			verifyDisplayed(locateElement("xpath", "//span[@data-aura-class='forceActionsText']"));
			return this;
			
		}

		public AccountsPage verifyConfMsg(String pText) {
			verifyPartialText(locateElement("xpath", "//span[@data-aura-class='forceActionsText']"), pText);
			return this;
		}

}