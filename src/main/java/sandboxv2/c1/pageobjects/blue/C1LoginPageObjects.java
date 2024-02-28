package sandboxv2.c1.pageobjects.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1LoginPageObjects {
	
	public static By getUsernametextField = By.id("gigya-loginID-56269462240752180");
	public static WebElement getUsernametextField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getUsernametextField);
	}
	
	public static By getPasswordtextField = By.id("gigya-password-56383998600152700");
	public static WebElement getPasswordtextField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getPasswordtextField);
	}
	
	public static By getLoginButton  = By.cssSelector("input[class='gigya-input-submit'][value='Log in']");
	public static WebElement getLoginButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getLoginButton);
	}

}
