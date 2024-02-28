package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sandboxv2.GenericActions.GenericJSActions;
import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageObjects.GooglePageObjects;

public class GooglePageActions {
	public static void clickGoogleAboutLink(WebDriver driver) throws Exception {
		try {

			WebElement elem = GooglePageObjects.getAboutLink(driver);
			GenericJSActions.scrollIntoView(driver, elem);
			elem.click();
			GenericPageWaits.waitElementVisible(driver, GooglePageObjects.getAboutImg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
