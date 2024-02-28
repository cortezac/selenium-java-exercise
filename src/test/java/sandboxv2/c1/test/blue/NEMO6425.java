package sandboxv2.c1.test.blue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.Utils.WebDriverFactory;
import sandboxv2.c1.pageactions.blue.C1DesktopAppPageActions;
import sandboxv2.c1.pageactions.blue.C1HomePageActions;
import sandboxv2.c1.pageactions.blue.C1LoginPageActions;
import sandboxv2.c1.pageactions.blue.C1TeacherDashboardPageActions;

public class NEMO6425 {
	
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
	public void download_installer() throws Exception{
		System.out.println("starting test");
		String username = "", password = "";
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.dropDownMenu_link_click(driver);
		System.out.println("menu link clicked");
		C1TeacherDashboardPageActions.installer_link_click(driver);
		System.out.println("installer link clicked");
		C1DesktopAppPageActions.linuxInstaller_button_click(driver);
		System.out.println("linux installer downloaded and found");
		C1DesktopAppPageActions.macInstaller_button_click(driver);
		System.out.println("mac installer downloaded and found");
		C1DesktopAppPageActions.windowsInstaller_button_click(driver);
		System.out.println("windows installer downloaded and found");
		System.out.println("ac1 completed");
	}
	
}
