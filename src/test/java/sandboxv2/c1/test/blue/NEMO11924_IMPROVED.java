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

public class NEMO11924_IMPROVED {
	
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
	public void linux_launcher_link_in_c1_01() throws Exception{
		System.out.println("starting test");
		C1HomePageActions.login_button_click(driver);
		System.out.println("proceeding to login page");
		String username = "", password = "";
		C1LoginPageActions.login_page_actions(driver, username, password);
		System.out.println("login complete");
		//main test
		C1TeacherDashboardPageActions.dropDownMenu_link_click(driver);
		System.out.println("menu link clicked");
		C1TeacherDashboardPageActions.installer_link_click(driver);
		System.out.println("installer link clicked");
		C1DesktopAppPageActions.linuxInstaller_button_clickable(driver);
		System.out.println("linux installer button is clickable");
		System.out.println("ac1 completed");
	}
	
	@Test
	public void linux_launcher_link_in_c1_02() throws Exception{
		System.out.println("starting test");
		String installerLinux = "Linux", fileNameLinux = "Cambridge One Desktop App 1.27.0.AppImage", 
				downloadPath = "";
		C1DesktopAppPageActions.installer_button_click(driver, installerLinux, downloadPath, fileNameLinux);
		System.out.println("ac2 completed");
	}
	

}
