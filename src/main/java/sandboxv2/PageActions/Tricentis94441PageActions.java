package sandboxv2.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import sandboxv2.PageObjects.Tricentis94441PageObjects;


public class Tricentis94441PageActions {
	
	 public static void selectFromMultipleSelectForm(WebDriver driver,String option) throws Exception{
		 findMultipleSelectElement(driver).selectByVisibleText(option);
	    }
	
	private static Select findMultipleSelectElement(WebDriver driver) throws Exception{
        return new Select(Tricentis94441PageObjects.getMultipleSelectForm(driver));
    }

}
