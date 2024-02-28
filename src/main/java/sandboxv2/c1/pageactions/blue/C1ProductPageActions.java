package sandboxv2.c1.pageactions.blue;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.c1.pageobjects.blue.C1ProductPageObjects;

public class C1ProductPageActions {
	
	public static void presentationPlus_link_click(WebDriver driver) throws Exception{
		C1ProductPageObjects.getPresentationPlusLink(driver).click();
		GenericPageWaits.delay(3);
	}
	
//	public static String productName_link_getText(WebDriver driver) throws Exception{
//		return C1ProductPageObjects.getProductNameLink(driver).getText();
//	}
	
	public static void maybeLater_button_click(WebDriver driver) throws Exception{
		C1ProductPageObjects.getMaybeLaterButton(driver).click();
	}
	
	public static void ok_button_click(WebDriver driver) throws Exception{
		C1ProductPageObjects.getOkButton(driver).click();
	}
	
//	public static boolean hint_menu_isDisplayed(WebDriver driver) throws Exception{
//		return C1ProductPageObjects.getHintMenu(driver).isDisplayed();
//	}
	
}
