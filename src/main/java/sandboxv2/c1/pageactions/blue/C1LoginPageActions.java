package sandboxv2.c1.pageactions.blue;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.c1.pageobjects.blue.C1LoginPageObjects;

public class C1LoginPageActions {
	
	
	public static void login_page_actions(WebDriver driver, String username, String password) throws Exception{
		GenericPageWaits.delay(3);
		username_textField_sendKeys(driver, username);
		System.out.println("usename inputted");
		password_textField_sendKeys(driver, password);
		System.out.println("password inputted");
		login_button_click(driver);
		System.out.println("login clicked");
	}
	
	public static void username_textField_sendKeys(WebDriver driver, String username) throws Exception{
		C1LoginPageObjects.getUsernametextField(driver).sendKeys(username);
	}
	
	public static void password_textField_sendKeys(WebDriver driver, String password) throws Exception{
		C1LoginPageObjects.getPasswordtextField(driver).sendKeys(password);
	}
	
	public static void login_button_click(WebDriver driver) throws Exception{
		C1LoginPageObjects.getLoginButton(driver).click();
	}
}
