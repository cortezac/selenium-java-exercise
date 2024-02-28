package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.Tricentis24499PageActions;
import sandboxv2.Utils.WebDriverFactory;

//Hard - 15pts
public class TricentisActivity24499 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/24499/retry");
	}

//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}
	
	@Test
	public void ID24499() throws Exception {
		Tricentis24499PageActions.enterAnswer(driver);
	
	}
}
