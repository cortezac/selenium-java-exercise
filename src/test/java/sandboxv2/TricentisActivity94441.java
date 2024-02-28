package sandboxv2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageActions.Tricentis94441PageActions;
import sandboxv2.PageObjects.TricentisPageObjects;
import sandboxv2.Utils.WebDriverFactory;

public class TricentisActivity94441 {
	//Hard - 15pts

	public class TricentisActivity64161 {
		private WebDriver driver;
		
		@BeforeClass
		public void beforeClass() throws Exception {
			driver = WebDriverFactory.getDriver("chrome");
			GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/94441/retry");
		}

//		@AfterClass
//		public void afterClass() {
//			driver.quit();
//		}
		
		@Test
		public void ID94441() throws Exception {
			String option1 = "Functional testing", option2 = "GUI testing" 
					, option3 = "End2End testing" , option4 = "Exploratory testing";
			
			Tricentis94441PageActions.selectFromMultipleSelectForm(driver, option1);
			Tricentis94441PageActions.selectFromMultipleSelectForm(driver, option2);
			Tricentis94441PageActions.selectFromMultipleSelectForm(driver, option3);
			Tricentis94441PageActions.selectFromMultipleSelectForm(driver, option4);
			GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
		
		}

	}
}
