package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class SalesPage extends PreAndPost{

	public SalesPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public SalesPage clickMore()
	{
		clickUsingJavascriptExecutor(locateElement("xpath","//span[@class='slds-p-right_small']"));
		return this;
	}
	
	public AccountsPage clickAccounts()
	{
		clickUsingJavascriptExecutor(locateElement("xpath","//span[text()='Accounts'][1]"));
		return new AccountsPage(driver,test);
	}	

	public NewCasePage clickCase()
	{
		clickUsingJavascriptExecutor(locateElement("xpath","//span[text()='Cases']"));
		return new NewCasePage(driver,test);
	}
	public Object clickLead() {
		// TODO Auto-generated method stub
		return null;
	}

}