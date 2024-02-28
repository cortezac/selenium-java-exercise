package sandboxv2.c1.pageobjects.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1ProductActivationPageObjects {
	
	public static By getProductNameHeading = By.cssSelector("h1[class='class-audio-heading']");
	public static WebElement getProductNameHeading(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getProductNameHeading);
	}

}
