package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.PageObjects.Tricentis12952PageObjects;

public class Tricentis12952PageActions {
	
	public static void clickButton(WebDriver driver) throws Exception{
		Tricentis12952PageObjects.getBtns(driver).get(1).click();
	}

}
