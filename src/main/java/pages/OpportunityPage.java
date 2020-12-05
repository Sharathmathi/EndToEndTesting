package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class OpportunityPage extends PreAndPost{
	
	public OpportunityPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	public OpportunityPage clickNew()
	{
		click(locateElement("xpath","//div[@title='New']"));
		return this;
	}
	
	public OpportunityPage enterDate()
	{
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DATE,1);
		Date time = calendar.getTime();
		String tomorrowsDate = new SimpleDateFormat("MM/dd/yyyy").format(time); 
		type(locateElement("xpath","//div[@class='form-element']//input"),tomorrowsDate);
		return this;
	}
	
	public OpportunityPage clickSave()
	{
		click(locateElement("xpath","(//span[text()='Save'])[2]"));
		return this;
	}
	public OpportunityPage verifyMessage()
	{
		verifyPartialText(locateElement("xpath","//ul[@class='errorsList']/li[1]"),"required fields");
		return this;
	}
	
}
