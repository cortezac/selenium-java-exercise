package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.Tricentis12952PageActions;
import sandboxv2.Utils.WebDriverFactory;

public class TricentisActivity12952 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/12952/retry");
	}
//	@AfterClass
//	public void AfterClass() {
//		driver.quit();
//	}
	@Test
	public  void ID12952() throws Exception{
		Tricentis12952PageActions.clickButton(driver);
	}

}
