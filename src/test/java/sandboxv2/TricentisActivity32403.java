package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageActions.Tricentis32403PageActions;
import sandboxv2.PageObjects.TricentisPageObjects;
import sandboxv2.Utils.WebDriverFactory;

//Hard - 15pts

public class TricentisActivity32403 {
private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/32403/retry");
	}

//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}
	
	@Test
	public void ID32403() throws Exception {
		
		Tricentis32403PageActions.enterSolution(driver);
		
	
	}

}
