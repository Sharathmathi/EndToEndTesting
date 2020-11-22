package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class CMSPage extends PreAndPost {

	public CMSPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public CMSPage clickCreateCMSWorkspaces() {
		click(locateElement("xpath", "//button[@title='Create a CMS Workspace']"));
		return this;

	}

	public CMSPage typeCMSName(String cName) {
		type(locateElement("xpath", "//label[text()='Name']/following::input[1]"), cName);
		return this;

	}

	public CMSPage typeCMSDescription(String cDesc) {
		type(locateElement("xpath", "//label[text()='Description']/following::textarea[1]"), cDesc);
		return this;

	}

	public CMSPage clickNext() {
		click(locateElement("xpath", "//button[text()='Next']"));
		return this;
	}

	public CMSPage clickCreateChannel() {
		click(locateElement("xpath", "//button[text()='Create Channel']"));
		return this;
	}

	public CMSPage typeChannelName(String chnlName) {
		type(locateElement("xpath", "(//label/abbr//following::input)[1]"), chnlName);
		return this;
	}

	public CMSPage clickPublicConnectionType() {
		click(locateElement("xpath", "//h2[@title='Public']"));
		return this;

	}

	public CMSPage clickRestrictedConnectionType() {
		click(locateElement("xpath", "//h2[@title='Restricted']"));
		return this;
	}

	public CMSPage clickCreate() {
		click(locateElement("xpath", "//button[text()='Create']"));
		return this;
	}

	public CMSPage verifyChannelCreation() {
		verifyExactText(locateElement("xpath", "//span[@data-aura-class='forceActionsText']"),
				"Channel settings were saved.");
		return this;
	}

	public CMSPage clickSinglePlusIcon(int index) {
		String locValue = "(//label[@class='slds-checkbox_faux'])[" + index + "]";
		click(locateElement("xpath", locValue));
		return this;
	}

	public CMSPage clickMultiplePlusIcon(int count) {

		for (int i = 1; i <= count; i++) {
			String locValue = "(//label[@class='slds-checkbox_faux'])[" + i + "]";
			click(locateElement("xpath", locValue));
		}

		return this;

	}

	public CMSPage selectIntegrationUserRole(String role) {
		String locValue;
		locValue = "(//span[text()='" + role + "'])[1]";
		click(locateElement("xpath",
				"//h2[text()='Add CMS Workspace']//following::label[text()='New Contributor Role'][1]//following::input[1]"));
		click(locateElement("xpath", locValue));

		return this;

	}

	public CMSPage selectSecurityUserRole(String role) {
		String locValue;
		locValue = "(//span[text()='" + role + "'])[2]";
		click(locateElement("xpath",
				"//h2[text()='Add CMS Workspace']//following::label[text()='New Contributor Role'][2]//following::input[1]"));
		click(locateElement("xpath", locValue));

		return this;

	}

	public CMSPage selectTranslationLanguage(String lang) {
		String locValue;
		locValue = "//h3[text()='Add Languages']//following::span[text()='Available']//following::span[text()='" + lang
				+ "']";

		click(locateElement("xpath", locValue));
		click(locateElement("xpath",
				"//h3[text()='Add Languages']//following::button[@title='Move selection to Selected']"));
		return this;
	}

	public CMSPage selectDefaultLanguage(String lang) {
		String locValue;
		locValue = "//h3[text()='Add Languages']//following::label[text()='Default Language']//following::span[text()='"
				+ lang + "']";
		click(locateElement("xpath",
				"//h3[text()='Add Languages']//following::label[text()='Default Language']//following::input[1]"));
		click(locateElement("xpath", locValue));
		return this;
	}

	public CMSPage clickDone() {
		click(locateElement("xpath", "//h3[text()='Almost there!']//following::button[text()='Done']"));
		return this;
	}

	public CMSPage verifyWorkSpaceCreation() {
		verifyExactText(locateElement("xpath", "//span[@data-aura-class='forceActionsText']"),
				"Workspace successfully created	");
		return this;
	}
}
