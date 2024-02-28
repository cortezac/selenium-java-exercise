package sandboxv2.c1.pagevalidations.blue;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import sandboxv2.c1.pageobjects.blue.C1TeacherDashboardPageObjects;

public class C1TeacherDashboardPageValidations {
	
	//IMPROVED VERSION
	public static void downloadApp_banner_displayValidation(WebDriver driver) throws Exception{
		
		if(!C1TeacherDashboardPageObjects.getDownloadAppBanner(driver).isDisplayed()) {
			throw new NoSuchElementException("Banner not found");
		}else {
			System.out.println("Banner found");
		}
	}

	public static void downloadApp_banner_textValidation(WebDriver driver) throws Exception{
		if(!C1TeacherDashboardPageObjects.getDownloadAppBannerText(driver).getText().trim().equals("Download the Cambridge One Desktop App")) {
			throw new Exception("Banner Text did not match");
		}else {
			System.out.println("Banner Text matches");
		}
	}

	public static void installer_link_textValidation(WebDriver driver) throws Exception{
		if(!C1TeacherDashboardPageObjects.getInstallerLink(driver).getText().trim().equals("The Cambridge One Desktop App")) {
			throw new Exception("Link Text did not match");
		}else {
			System.out.println("Link Text matches");
		}
	}

//	public static void downloadApp_banner_displayValidation(WebDriver driver) throws Exception{
//		if(!C1TeacherDashboardPageActions.downloadApp_banner_isDisplayed(driver)) {
//			throw new NoSuchElementException("Banner not found");
//		}else {
//			System.out.println("Banner found");
//		}
//	}
//
//	public static void downloadApp_banner_textValidation(WebDriver driver) throws Exception{
//		String bannerText = C1TeacherDashboardPageActions.downloadApp_banner_getText(driver);
//		if(!bannerText.trim().equals("Download the Cambridge One Desktop App")) {
//			throw new Exception("Banner Text did not match");
//		}else {
//			System.out.println("Banner Text matches");
//		}
//	}
//
//	public static void installer_link_textValidation(WebDriver driver) throws Exception{
//		String linkText = C1TeacherDashboardPageActions.installer_link_getText(driver);
//		if(!linkText.trim().equals("The Cambridge One Desktop App")) {
//			throw new Exception("Link Text did not match");
//		}else {
//			System.out.println("Link Text matches");
//		}
//	}

}
