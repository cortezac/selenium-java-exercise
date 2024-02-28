package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis92248PageObjects {
	
	public static By editBtn = By.xpath("//td[text()='John']/following-sibling::td[text()='Doe']/following-sibling::td[2]//button[text()='Edit']");
	public static WebElement getEditBtn(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(editBtn);
	}

}
