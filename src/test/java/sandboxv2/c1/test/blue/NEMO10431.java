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
import sandboxv2.c1.pageactions.blue.C1ProductPageActions;
import sandboxv2.c1.pageactions.blue.C1TeacherDashboardPageActions;
import sandboxv2.c1.pagevalidations.blue.C1ProductPageValidations;

public class NEMO10431 {
	
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
	public void download_app_menu_hint_01() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "",
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);
		System.out.println("product details clicked");
		C1ProductPageActions.maybeLater_button_click(driver);
		System.out.println("maybe later button clicked");
		C1ProductPageValidations.hint_menu_displayValidation_01(driver);
	}
	@Test
	public void download_app_menu_hint_02() throws Exception{
		System.out.println("starting test"); 
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "",
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);
		System.out.println("product details clicked");
		C1ProductPageActions.maybeLater_button_click(driver);
		System.out.println("maybe later button clicked");
		C1ProductPageValidations.hint_menu_displayValidation_02(driver);
	}
	
	@Test
	public void download_app_menu_hint_03() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "",
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);
		System.out.println("product details clicked");
		C1ProductPageActions.maybeLater_button_click(driver);
		System.out.println("maybe later button clicked");
		C1ProductPageValidations.hint_menu_displayValidation_03(driver);
	}
	
	@Test
	public void download_app_menu_hint_04() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "",
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);
		System.out.println("product details clicked");
		C1ProductPageActions.maybeLater_button_click(driver);
		System.out.println("maybe later button clicked");
		C1ProductPageValidations.hint_menu_displayValidation_04(driver);
	}
	
	@Test
	public void download_app_menu_hint_05() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "",
				bundleName = "EQA Product Ebook AB01";
		int itemNumber = 0, cardNumber = 0;
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.myLibrary_link_click(driver);
		System.out.println("my library link clicked");
		C1TeacherDashboardPageActions.search_textField_sendKeys(driver, bundleName);
		System.out.println("searching product");
		C1TeacherDashboardPageActions.search_ListOption_click(driver, itemNumber);
		System.out.println("option clicked");
		C1TeacherDashboardPageActions.card_ListOption_click(driver, cardNumber);
		System.out.println("product clicked");
		C1TeacherDashboardPageActions.viewDetails_link_click(driver);
		System.out.println("product details clicked");
		C1ProductPageActions.maybeLater_button_click(driver);
		System.out.println("maybe later button clicked");
		C1ProductPageValidations.hint_menu_displayValidation_05(driver);
	}
}
