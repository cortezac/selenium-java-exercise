package sandboxv2.PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sandboxv2.PageObjects.Tricentis41036PageObjects;

public class Tricentis41036PageActions {
	
	private static List<WebElement> getTableRows(WebDriver driver) throws Exception{
		return Tricentis41036PageObjects.getTableRows(driver);
	}
	
	private static void enterResult(WebDriver driver, String result) throws Exception{
		Tricentis41036PageObjects.getResultTextField(driver).sendKeys(result);;
	}
	
	public static void enterTableData(WebDriver driver) throws Exception{
		boolean isPresent = false;
		for (WebElement trList : getTableRows(driver)) {
			List<WebElement> tdList = trList.findElements(By.tagName("td"));
			for (WebElement td: tdList) {
				if(td.getText().equals("15")) { 
//					enterResult(driver,"True");
					isPresent = true;
					break;
				}
			}
		}
		if(!isPresent) {
			enterResult(driver,"False");
		}else {
			enterResult(driver,"True");
		}
	}

	
}
