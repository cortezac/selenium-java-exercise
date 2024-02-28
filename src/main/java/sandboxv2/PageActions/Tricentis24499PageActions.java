package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.PageObjects.Tricentis24499PageObjects;

public class Tricentis24499PageActions {
	
	private static String getRequiredText(WebDriver driver) throws Exception{
		return Tricentis24499PageObjects.getRequiredText(driver).getText();
	}
	
	public static void enterAnswer(WebDriver driver) throws Exception {
		String text = getRequiredText(driver);
		Tricentis24499PageObjects.getAutoCompleteField(driver).sendKeys(text);	
		enterResultsField(driver);
	}
	
	private static void enterResultsField(WebDriver driver) throws Exception{
		int result  = getResultsCount(driver);
		Tricentis24499PageObjects.getResultField(driver).sendKeys(String.valueOf(result));
	}
	
	private static int getResultsCount(WebDriver driver) throws Exception{
		return Tricentis24499PageObjects.getResultCount(driver).size();
	}

}
