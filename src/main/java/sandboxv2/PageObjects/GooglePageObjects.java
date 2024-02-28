package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class GooglePageObjects {
	public static By getGoogleImg = By.cssSelector("img[alt=Google]");
	public static WebElement getGoogleImg(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getGoogleImg);
	}
	
	public static By getAboutLink = By.linkText("About");
	public static WebElement getAboutLink(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getAboutLink);
	}
	
	public static By getAboutImg = By.cssSelector("a[data-g-cta_text=\"Explore the Year in Search\"] img");
	public static WebElement getAboutImg(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getAboutImg);
	}
}
