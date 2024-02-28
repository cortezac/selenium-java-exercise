package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis72954PageObjects {
	
	public static By btn = By.xpath("//a[starts-with(@id, 'rnd')]");
	public static WebElement getBtn(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(btn);
	}

}
