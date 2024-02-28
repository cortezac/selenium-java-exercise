package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis94441PageObjects {
	
	public static By multipleSelectForm = By.id("multiselect");
	public static WebElement getMultipleSelectForm(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(multipleSelectForm);
	}
	
}
