package lib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import lib.utils.DataInputProvider;

public class PreAndPost extends WebDriverServiceImpl {

	public String dataSheetName;
	public String pwd = "Bootcamp$123";

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}

	@BeforeClass
	public void beforeClass() {
		startTestCase(testCaseName, testDescription);
	}

	@BeforeMethod
	public void beforeMethod() {
		// for reports
		startTestModule(nodes);// each data row -> one testcase
		test.assignAuthor(authors);
		test.assignCategory(category);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		webdriver = new ChromeDriver(options);
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();// write report
	}

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
