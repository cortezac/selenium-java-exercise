package sandboxv2.PageActions;

import org.openqa.selenium.WebDriver;

import sandboxv2.PageObjects.Tricentis73589PageObjects;

public class Tricentis73589PageActions {
	
	public static int getFirstNumber(WebDriver driver) throws Exception{
		int number = Integer.parseInt(Tricentis73589PageObjects.getFirstNum(driver).getText());
		return number;
		
	}
	
	public static int getSecondNumber(WebDriver driver) throws Exception{
		int number = Integer.parseInt(Tricentis73589PageObjects.getSecondNum(driver).getText());
		return number;
	}
	
	public static void clickSwapBtn(WebDriver driver) throws Exception{
		Tricentis73589PageObjects.getSwapBtn(driver).click();
		Thread.sleep(1000);
	}

	public static void clickNextBtn(WebDriver driver) throws Exception{
		Tricentis73589PageObjects.getNextBtn(driver).click();
		Thread.sleep(1000);
	}
	
	public static String checkResultText(WebDriver driver) throws Exception{
		return Tricentis73589PageObjects.getResult(driver).getText();
	}
	
	public static void bubbleSort(WebDriver driver) throws Exception{
		
		while(!checkResultText(driver).equals("Perfect - you did it!")) {
			if(getFirstNumber(driver)>getSecondNumber(driver)){
				clickSwapBtn(driver);
			}else {
				clickNextBtn(driver);
			}
			
		}
		
	}
}
