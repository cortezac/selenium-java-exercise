package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.Tricentis64161PageActions;
import sandboxv2.PageActions.Tricentis92248PageActions;
import sandboxv2.Utils.WebDriverFactory;


//Hard - 15pts

public class TricentisActivity92248 {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/92248/retry");
	}

//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	}
	
	@Test
	public void ID92248() throws Exception {
		
		Tricentis92248PageActions.clickEditBtn(driver);

	
	}

}
