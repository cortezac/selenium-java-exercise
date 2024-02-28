package sandboxv2.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis24499PageObjects {
	
	private static By requiredText = By.id("typeThis");
	public static WebElement getRequiredText(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(requiredText);
	}
	
	private static By autoCompleteField = By.id("s2id_autogen1");
	public static WebElement getAutoCompleteField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(autoCompleteField);
	}
	
	private static By resultField = By.id("entryCount");
	public static WebElement getResultField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(resultField);
	}
	
	private static By resultCount = By.className("select2-match");
	public static List<WebElement> getResultCount(SearchContext driver) throws NoSuchElementException{
		return driver.findElements(resultCount);
		
	}
	

}
