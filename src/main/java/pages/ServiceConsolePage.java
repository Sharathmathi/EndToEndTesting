package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ServiceConsolePage extends PreAndPost{
	
	public ServiceConsolePage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ServiceConsolePage clickShowNavigationMenu() {
		click(locateElement("xpath", "//button[@title='Show Navigation Menu']"));
		return this;
	}

	public ServiceConsolePage clickFiles() {
		click(locateElement("xpath", "//span[text()='Files']"));
		return this;
	}
	
	public ServiceConsolePage ClickUploadFiles() {
		moveToElement(locateElement("xpath","//div[text()='Upload Files']"));
		return this;
	}

	public ServiceConsolePage finishDownlaod() {
		moveToElement(locateElement("xpath","//span[text()='Done']"));
		return this;
	}

	public ServiceConsolePage clickfileDropdown() {
		click(locateElement("xpath", "//div[@data-aura-class='forceVirtualAction']/a"));
		return this;
	}
	
	public ServiceConsolePage clickViewFile() {
		click(locateElement("xpath", "//a[@title='View File Details"));
		return this;
	}

	public ServiceConsolePage verifyIfFileMatches(String text) {
		verifyExactText(locateElement("xpath", "//div[text()='File']/following::span"), text);
		return this;		
	}

	public ServiceConsolePage closeFileWindow() {
		click(locateElement("xpath", "//div[@class='close slds-col--bump-left slds-p-left--none slds-context-bar__icon-action ']"));
		return this;
		
	}

	public ServiceConsolePage clickLastModifiedItem() {
		click(locateElement("xpath", "(//div[@class='slds-truncate']//span)[1]"));
		return this;
	}
	
	public ServiceConsolePage clickShare() {
		click(locateElement("xpath", "//button[@title='Share']"));
		return this;
	}
	
	public ServiceConsolePage clickSearchUser() {
		click(locateElement("xpath", "//input[@title='Search People']"));
		return this;
	}
	
	public ServiceConsolePage clickUserName() {
		click(locateElement("xpath", "//div[text()='Derrick Dsouza']"));
		return this;
	}
	
	public ServiceConsolePage clickCancel() {
		click(locateElement("xpath", "(//span[text()='Cancel'])[2]"));
		return this;
	}
	
	public ServiceConsolePage clickCloseDialog() {
		click(locateElement("xpath", "//button[@title='Close']"));
		return this;
	}

	public ServiceConsolePage clickNewlyUploadedFile() {
		click(locateElement("xpath", "//li[@class='oneActionsDropDown']//a"));
		return this;
	}
	
	public ServiceConsolePage clickDelete() {
		click(locateElement("xpath", "//a[@title='Delete']"));
		return this;
	}
	
	public ServiceConsolePage confirmDelete() {
		click(locateElement("xpath", "(//span[text()='Delete']"));
		return this;
	}

	public ServiceConsolePage verifyMessage(String string) {
		verifyExactText(locateElement("xpath", "//span[@class='toastMessage slds-text-heading--small forceActionsText']"), string);
		return this;
	}

	public ServiceConsolePage UploadFiles(String stringSelection) {
		StringSelection strSelection = new StringSelection(stringSelection);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		return this;
	}

	public ServiceConsolePage callRobotClass() throws AWTException {
		Robot robot = new Robot();

		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		return this;
	}
	
}
