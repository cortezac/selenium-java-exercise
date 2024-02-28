package sandboxv2.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TricentisPageObjects {
	
	
	//Activity 64161 objects
//	public static By getGenerateIdBtn = By.id("generate");
//	public static WebElement getGenerateIdBtn(SearchContext driver) throws NoSuchElementException{
//		return driver.findElement(getGenerateIdBtn);
//	}
	
	
	
	
	public static By getClickMeBtn = By.cssSelector("a.theme-btn-color");
	public static WebElement getClickMeBtn(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getClickMeBtn);
	}
	
	public static By getSuccessModal = By.cssSelector("div.showSweetAlert");
	public static WebElement getSuccessModal(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getSuccessModal);
	}
	
	public static By getSearchField = By.cssSelector("input#search");
	public static WebElement getSearchField(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getSearchField);
	}
	
	
	
	
	
	
	
	
	public static By getPaginationNumber = By.cssSelector("td > a:not(.btn)");
	public static List<WebElement> getPaginationNumber(SearchContext driver) throws NoSuchElementException {
		return driver.findElements(getPaginationNumber);
	}
	
	public static void tricentis_page_select(WebDriver driver, String page) throws Exception {
		List<WebElement> elems = getPaginationNumber(driver);
		
		for(WebElement elem : elems) {
			if(elem.getText().trim().equals(page)) {
				elem.click();
				break;
			} else if(elem.getText().trim().equals(elems.get(elems.size()-1).getText().trim())) {
				throw new Exception("Page unavailable or was not clicked...");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static By getObstacleRowContainer = By.cssSelector("tbody > tr");										//FOR LOOP PURPOSES
	public static List<WebElement> getObstacleRowContainer(SearchContext driver) throws NoSuchElementException {
		return driver.findElements(getObstacleRowContainer);
	}
	
	public static By getObstacleName = By.cssSelector("td:nth-child(2)");											//ANCHOR - FOR IF CONDITION PURPOSES
	public static WebElement getObstacleName(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getObstacleName);
	}
	
	public static By getObstacleGoForIt = By.cssSelector("td:nth-child(9) > a");									//INTERACTABLE ELEMENT
	public static WebElement getObstacleGoForIt(SearchContext driver) throws NoSuchElementException {
		return driver.findElement(getObstacleGoForIt);
	}
	
	public static void tricentis_obstacleCourse_select(WebDriver driver, String obstacle) throws Exception {
		List<WebElement> elems = getObstacleRowContainer(driver);
		
		for(WebElement elem : elems) {
			if(getObstacleName(elem).getText().trim().equals(obstacle)) {
				getObstacleGoForIt(elem).click();
				break;
			} else if(getObstacleName(elem).getText().trim().equals(getObstacleName(elems.get(elems.size()-1)).getText().trim())) {
				throw new Exception("Page unavailable or was not clicked...");
			}
		}
	}
	
	
}
