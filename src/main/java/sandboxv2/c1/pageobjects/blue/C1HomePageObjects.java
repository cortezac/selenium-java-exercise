package sandboxv2.c1.pageobjects.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1HomePageObjects {
	
	public static By getLoginButton = By.id("onboarding-header-login-btn");
	public static WebElement getLoginButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getLoginButton);
	}
	

}
