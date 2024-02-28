package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.Tricentis73589PageActions;
import sandboxv2.Utils.WebDriverFactory;

public class TricentisActivity73589 {
private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/73589/retry");
	}

//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}
	
	@Test
	public void ID73589() throws Exception {
		Tricentis73589PageActions.bubbleSort(driver);

	
	}

}
