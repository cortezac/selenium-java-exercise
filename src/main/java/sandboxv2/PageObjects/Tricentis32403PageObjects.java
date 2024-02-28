package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis32403PageObjects {
	
	private static By generatedFirstNumber = By.id("no1");
	public static WebElement getGeneratedFirstNumber(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(generatedFirstNumber);
	}
	
	private static By generatedSecondNumber = By.id("no2");
	public static WebElement getGeneratedSecondNumber(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(generatedSecondNumber);
	}
	
	private static By generatedSymbol = By.id("symbol1");
	public static WebElement getGeneratedSymbol(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(generatedSymbol);
	}

	private static By resultField = By.id("result");
	public static WebElement getResultField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(resultField);
	}
	
}
