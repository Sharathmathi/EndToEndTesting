package pages;

import lib.selenium.PreAndPost;

public class CMSPage extends PreAndPost {

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

	public void clickPlusIcon() {
		click(locateElement("xpath", "(//label[@class='slds-checkbox_faux'])[1]"));
	}

}
