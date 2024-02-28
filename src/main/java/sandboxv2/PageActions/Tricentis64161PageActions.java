package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageObjects.Tricentis64161PageObjects;
import sandboxv2.PageObjects.TricentisPageObjects;


public class Tricentis64161PageActions {
	
	public static void clickGenerateIdBtn(WebDriver driver) throws Exception {
		Tricentis64161PageObjects.getGenerateIdBtn(driver).click();	
		System.out.println("Button was clicked");
		enterOrderIdField(driver);
	}
	
	public static String getOrderIdText(WebDriver driver) throws Exception{
		return Tricentis64161PageObjects.getOrderIdValue(driver).getText();
	}
	
	public static void enterOrderIdField(WebDriver driver) throws Exception{
		String orderIdText = getOrderIdText(driver);
		System.out.println("Order ID: " + orderIdText);
		Tricentis64161PageObjects.getOrderIdField(driver).sendKeys(orderIdText);
		GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
	}
	
}
