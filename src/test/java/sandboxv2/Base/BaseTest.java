package sandboxv2.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageObjects.TricentisHomePage;
import sandboxv2.Utils.WebDriverFactory;

public class BaseTest {
	
	private WebDriver driver;
	protected TricentisHomePage tricentisHomePage;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		beforeMethod();
		tricentisHomePage = new TricentisHomePage(driver);
	}
	
	@BeforeMethod
   public void beforeMethod() {
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/List");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
