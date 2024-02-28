package sandboxv2.c1.test.blue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.Utils.WebDriverFactory;
import sandboxv2.c1.pageactions.blue.C1HomePageActions;
import sandboxv2.c1.pageactions.blue.C1LoginPageActions;
import sandboxv2.c1.pageactions.blue.C1TeacherDashboardPageActions;
import sandboxv2.c1.pagevalidations.blue.C1TeacherDashboardPageValidations;

public class NEMO15059 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception{
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "");
	}
	@AfterClass
	public void AfterClass() throws Exception{
		driver.quit();
	}
	@AfterMethod
	public void afterMethod() throws Exception{
		driver.quit();
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "");
	}
	@Test
	public void  download_da_banner_for_pplus_only_01() throws Exception{
		System.out.println("starting test");
		//initialize variables
		String username = "", password = "", 
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test teacher
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);	
		System.out.println("checking for banner");
		C1TeacherDashboardPageValidations.downloadApp_banner_displayValidation(driver);
		
	}
	@Test
	public void  download_da_banner_for_pplus_only_02() throws Exception{
		System.out.println("starting test");
		//initialize variables
		String username = "", password = "";
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test teacher
		C1TeacherDashboardPageActions.materials_link_click(driver);
		System.out.println("materials link clicked");	
		System.out.println("checking for banner");
		C1TeacherDashboardPageValidations.downloadApp_banner_displayValidation(driver);
		
	}

}
