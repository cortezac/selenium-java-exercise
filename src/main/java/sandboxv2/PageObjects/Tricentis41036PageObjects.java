package sandboxv2.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;


public class Tricentis41036PageObjects {
	
	private static By tableRows = By.xpath("//table[@id='randomTable']//tr");
	public static List<WebElement> getTableRows(SearchContext driver) throws NoSuchElementException{
		return driver.findElements(tableRows);
	}
	
	private static By resultTextField = By.id("resulttext");
	public static WebElement getResultTextField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(resultTextField);
	}
	

}
