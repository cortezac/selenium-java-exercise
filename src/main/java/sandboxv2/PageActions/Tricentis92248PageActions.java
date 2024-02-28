package sandboxv2.PageActions;import org.openqa.selenium.WebDriver;

import sandboxv2.PageObjects.Tricentis92248PageObjects;

public class Tricentis92248PageActions {
	
	public static void clickEditBtn(WebDriver driver) throws Exception {
		Tricentis92248PageObjects.getEditBtn(driver).click();
	}

}
