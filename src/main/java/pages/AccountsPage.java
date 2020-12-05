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
	}
