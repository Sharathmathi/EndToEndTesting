package pages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class AppLauncherPage extends PreAndPost{
	
	public AppLauncherPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public ServicePage clickService() {
		click(locateElement("link", "Service"));
		return new ServicePage(driver, test);
	}
	
	public SalesPage clickSales()
	{
		click(locateElement("xpath","//p[text()='Sales']"));
		return new SalesPage(driver,test);
	}
	
}
