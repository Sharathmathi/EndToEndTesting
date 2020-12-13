package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AppLauncherPage extends PreAndPost {

	public AppLauncherPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public ServicePage clickService() {
		click(locateElement("link", "Service"));
		return new ServicePage(driver, test);
	}

	
	public HomePage clickSales()
	{
		click(locateElement("xpath","//p[text()='Sales']"));
		return new HomePage(driver,test);
	}


	public CMSPage clickCMS() {
		String locValue = "//span[@class='slds-truncate label-display']//p[text()='CMS Home']";
		scrollToElement(locateElement("xpath", locValue));
		click(locateElement("xpath", locValue));
		return new CMSPage(driver, test);

	}

	public ServiceConsolePage clickServiceConsole() {
		// TODO Auto-generated method stub
		click(locateElement("xpath","//p[text()='ServicePage.java']"));
		return new ServiceConsolePage(driver, test);
	}

}
