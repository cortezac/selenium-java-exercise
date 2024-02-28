package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageObjects.TricentisPageObjects;

public class TricentisPageActions {
	
	public static void clickClickMeBtn(WebDriver driver) throws Exception {
		TricentisPageObjects.getClickMeBtn(driver).click(); 								//CLICK ACTION
		GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);	//VERIFICATION IF ACTION WAS PERFORMED
		System.out.println("Button was clicked");
	}
	
	public static void enterSearchParamater(WebDriver driver, String value) throws Exception {
		TricentisPageObjects.getSearchField(driver).sendKeys(value); 						//ENTER ACTION
		if(TricentisPageObjects.getSearchField(driver).getAttribute("value").equals(value)) {
			//PASS IF EQUAL																	//VERIFICATION IF ACTION WAS PERFORMED
		} else {
			//FAIL IF NOT EQUAL
		}
	}
}
