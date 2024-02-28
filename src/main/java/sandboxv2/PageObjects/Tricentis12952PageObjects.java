package sandboxv2.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis12952PageObjects {
	
	public static By btns = By.id("id");
	public static List<WebElement> getBtns (SearchContext driver) throws NoSuchElementException{
		return driver.findElements(btns);
	}

}
