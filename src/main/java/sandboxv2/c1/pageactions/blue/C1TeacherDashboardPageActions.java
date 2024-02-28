package sandboxv2.c1.pageactions.blue;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.c1.pageobjects.blue.C1TeacherDashboardPageObjects;

public class C1TeacherDashboardPageActions {
	
	public static void dropDownMenu_link_click(WebDriver driver) throws Exception{
	  C1TeacherDashboardPageObjects.getDropdownMenuLink(driver).click();
	}
	
	public static void installer_link_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getInstallerLink(driver).click();
	}
	
	public static void logout_button_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getLogoutButton(driver).click();
	}
	
	public static void myLibrary_link_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getMyLibraryLink(driver).click();
	}
	
	public static void search_textField_sendKeys(WebDriver driver, String bundleName) throws Exception{
		C1TeacherDashboardPageObjects.getSearchtextField(driver).sendKeys(bundleName);
	}
	
	public static void search_ListOption_click(WebDriver driver, int itemNumber) throws Exception{
		C1TeacherDashboardPageObjects.getSearch_ListOption(driver).get(itemNumber).click();
	}
//	specific product item
//	public static void search_option_click(WebDriver driver) throws Exception{
//		C1TeacherDashboardPageObjects.getSearchOption(driver).click();
//	}
	public static void card_ListOption_click(WebDriver driver, int itemNumber) throws Exception{
		C1TeacherDashboardPageObjects.getCard_ListOption(driver).get(itemNumber).click();
		GenericPageWaits.delay(3);
	}
	
	public static void viewDetails_link_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getViewDetailsLink(driver).click();
		GenericPageWaits.delay(3);
	}
	
	public static void materials_link_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getMaterialsLink(driver).click();
		GenericPageWaits.delay(3);
	}
	
//	public static String downloadApp_banner_getText(WebDriver driver) throws Exception{
//		return C1TeacherDashboardPageObjects.getDownloadAppBannerText(driver).getText();
//	}
//	
//	public static String installer_link_getText(WebDriver driver) throws Exception{
//		return C1TeacherDashboardPageObjects.getInstallerLink(driver).getText();
//	}
//	
//	public static boolean downloadApp_banner_isDisplayed(WebDriver driver) throws Exception{
//		return C1TeacherDashboardPageObjects.getDownloadAppBanner(driver).isDisplayed();
//	}
	
	public static void home_button_click(WebDriver driver) throws Exception{
		C1TeacherDashboardPageObjects.getHomeButton(driver).click();
	}
}
