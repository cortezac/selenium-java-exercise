package sandboxv2.c1.pageactions.blue;

import org.openqa.selenium.WebDriver;

import sandboxv2.c1.pageobjects.blue.C1HomePageObjects;

public class C1HomePageActions {
	
	public static void login_button_click(WebDriver driver) throws Exception{
		C1HomePageObjects.getLoginButton(driver).click();
	}

}
