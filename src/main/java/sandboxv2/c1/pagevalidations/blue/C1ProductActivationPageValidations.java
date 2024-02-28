package sandboxv2.c1.pagevalidations.blue;

import org.openqa.selenium.WebDriver;

import sandboxv2.c1.pageobjects.blue.C1ProductActivationPageObjects;

public class C1ProductActivationPageValidations {
	
	//improved
	public static void presentationPlus_link_textValidation(WebDriver driver,String productName)throws Exception{
		if(!C1ProductActivationPageObjects.getProductNameHeading(driver).getText().trim().equals(productName+": Presentation Plus")) {
			throw new Exception("Product name did not match");
		}else {
			System.out.println("Product name matches");
		}
	}
}
