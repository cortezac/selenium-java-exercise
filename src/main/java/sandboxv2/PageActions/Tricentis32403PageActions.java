package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.PageObjects.Tricentis32403PageObjects;
import sandboxv2.PageObjects.TricentisPageObjects;


public class Tricentis32403PageActions {

	public static int getFirstNumber(WebDriver driver) throws Exception{
		int firstNum = Integer.parseInt(Tricentis32403PageObjects.getGeneratedFirstNumber(driver).getText());
		return firstNum;
	}
	
	public static int getSecondNumber(WebDriver driver) throws Exception{
		int secondNum = Integer.parseInt(Tricentis32403PageObjects.getGeneratedSecondNumber(driver).getText());
		return secondNum;
	}
	
	public static String getSymbol(WebDriver driver) throws Exception{
		return Tricentis32403PageObjects.getGeneratedSymbol(driver).getText();
	}
	
	public static void enterResult(WebDriver driver, String result) throws Exception {
		Tricentis32403PageObjects.getResultField(driver).sendKeys(result);
	}
	
	public static void enterSolution(WebDriver driver) throws Exception{
		
		int firstNum = getFirstNumber(driver);
		int secondNum = getSecondNumber(driver);
		String textSymbol = getSymbol(driver);
				
		if(textSymbol.equals("+")) {
			int sum = firstNum + secondNum;
			Tricentis32403PageActions.enterResult(driver, String.valueOf(sum));
			GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
		} else if(textSymbol.equals("-")){
			int difference = firstNum - secondNum;
			Tricentis32403PageActions.enterResult(driver, String.valueOf(difference));
			GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
		} else if(textSymbol.equals("*")){
			int product = firstNum * secondNum;
			Tricentis32403PageActions.enterResult(driver, String.valueOf(product));
			GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
		} else if(textSymbol.equals("%")) {
			int modulo = firstNum % secondNum;
			Tricentis32403PageActions.enterResult(driver, String.valueOf(modulo));
			GenericPageWaits.waitElementVisible(driver, TricentisPageObjects.getSuccessModal);
		}
	}
}
