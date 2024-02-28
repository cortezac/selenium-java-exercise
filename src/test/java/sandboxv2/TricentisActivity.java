package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.TricentisPageActions;
import sandboxv2.Utils.WebDriverFactory;

public class TricentisActivity {
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/22505/retry");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	@Test
	public void ID22505() throws Exception {
		boolean res = false;
		
		TricentisPageActions.clickClickMeBtn(driver);
		TricentisPageActions.enterSearchParamater(driver, "ENGLISH NUMBER ONE");
		System.out.println("Test");
		
		Assert.assertEquals(res, "true");
		
		Thread.sleep(3000);
	}
	
	
}
