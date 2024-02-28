package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.PageObjects.Tricentis72954PageObjects;

public class Tricentis72954PageActions {
	
	public static void clickBtn(WebDriver driver) throws Exception{
		int i = 0;
		while(i<2) {
			Tricentis72954PageObjects.getBtn(driver).click();
			i++;
			Thread.sleep(3000);
		}
		
	}

}
