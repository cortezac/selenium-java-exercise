package sandboxv2.c1.test.blue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.Utils.WebDriverFactory;
import sandboxv2.c1.pageactions.blue.C1HomePageActions;
import sandboxv2.c1.pageactions.blue.C1LoginPageActions;
import sandboxv2.c1.pageactions.blue.C1TeacherDashboardPageActions;
import sandboxv2.c1.pagevalidations.blue.C1TeacherDashboardPageValidations;

public class NEMO10161 {
	
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
	@Test
	public void rename_desktop_app_in_header_menu() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "";
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.dropDownMenu_link_click(driver);
		System.out.println("dropdown menu header clicked");
		C1TeacherDashboardPageValidations.installer_link_textValidation(driver);
		
	}

}
