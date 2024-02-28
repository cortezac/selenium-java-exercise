package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Tricentis73589PageObjects {
	
	public static By firstNum = By.xpath("//div[@class='bubble']//div[1]");
	public static WebElement getFirstNum(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(firstNum);
	}
	
	public static By secondNum = By.xpath("//div[@class='bubble']//div[2]");
	public static WebElement getSecondNum(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(secondNum);
	}
	
	public static By swapBtn = By.id("button1");
	public static WebElement getSwapBtn(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(swapBtn);
	}
	
	public static By nextBtn = By.id("button2");
	public static WebElement getNextBtn(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(nextBtn);
	}
	
	public static By result = By.id("sample");
	public static WebElement getResult(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(result);
	}

}
