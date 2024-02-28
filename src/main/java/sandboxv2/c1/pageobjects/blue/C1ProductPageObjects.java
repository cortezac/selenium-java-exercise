package sandboxv2.c1.pageobjects.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1ProductPageObjects {
	
	public static By getPresentationPlusLink = By.xpath("//div[@class='media-body' and div[text()='Presentation Plus']]");
	public static WebElement getPresentationPlusLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getPresentationPlusLink);
	}
	
	public static By getProductNameLink = By.cssSelector("a[class='heading dropdown-toggle product-dropdown-toggle']");
	public static WebElement getProductNameLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getProductNameLink);
	}

	public static By getMaybeLaterButton = By.cssSelector("a[class='btn-mayBeLater']");
	public static WebElement getMaybeLaterButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getMaybeLaterButton);
	}
	
	public static By getOkButton = By.cssSelector("button[class='btn btn-purple']");
	public static WebElement getOkButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getOkButton);
	}
	
	public static By getHintMenu = By.cssSelector("div[class='downloadAppHint-container']");
	public static WebElement getHintMenu(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getHintMenu);
	}

}
