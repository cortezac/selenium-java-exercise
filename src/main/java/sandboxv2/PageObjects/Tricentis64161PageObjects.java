package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis64161PageObjects {
	
	private static By generateIdBtn = By.id("generate");
	public static WebElement getGenerateIdBtn(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(generateIdBtn);
	}
	
	private static By orderIdValue = By.xpath("//div[contains(text(),'10')]");
	public static WebElement getOrderIdValue(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(orderIdValue);
	}
	
	private static By orderIdField = By.id("offerId");
	public static WebElement getOrderIdField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(orderIdField);
	}

//	private static By orderIdValue = By.xpath("//div[text()='order id']/following-sibling::div");
//	public static WebElement getOrderIdValue(SearchContext driver) throws NoSuchElementException {
//		return driver.findElement(orderIdValue);
//	}
	
	
	////td[text()='John']/following-sibling::td[text()='Doe']/following-sibling::td[2]
}
