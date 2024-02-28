package sandboxv2;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.PageActions.Tricentis72954PageActions;
import sandboxv2.Utils.WebDriverFactory;

public class TricentisActivity72954 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() throws Exception{
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/72954/retry");
	}
//	@AfterClass
//	public void AfterClass() throws Exception{
//		driver.quit();
//	}
	
	@Test
	public void ID72954() throws Exception{
		Tricentis72954PageActions.clickBtn(driver);
	}
}
