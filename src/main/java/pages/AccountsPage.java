package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AccountsPage extends PreAndPost{


	public AccountsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}	

	public AccountsPage clickSortArrow() {
		click(locateElement("xpath","//th[@title='Account Name']//a"));
		return this;
	}	

	public AccountsPage verifySorting()
	{

		List<String> originalList=new ArrayList();
		List<WebElement> accountName = locateElements("xpath","//table[@data-aura-class='uiVirtualDataTable']//tr//th//span//a");
		for(WebElement ele:accountName)
			originalList.add(ele.getText());
		List<String> tempList=originalList;
		Collections.sort(tempList);
		verifyListContents(originalList,tempList);
		return this;
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

