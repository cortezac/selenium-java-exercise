package sandboxv2.c1.pagevalidations.blue;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.c1.pageactions.blue.C1ProductPageActions;
import sandboxv2.c1.pageactions.blue.C1TeacherDashboardPageActions;
import sandboxv2.c1.pageobjects.blue.C1ProductPageObjects;

public class C1ProductPageValidations {
	
	
	//IMPROVED VERSION - WORK IN PROGRESS 
	public static void hint_menu_displayValidation(WebDriver driver, String option) throws Exception{	
		switch (option) {
		case "Hint_Open":
			C1ProductPageActions.maybeLater_button_click(driver);
			System.out.println("Maybe later button clicked");
			try {
				if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
					System.out.println("Hint Menu found");
				}else {
					throw new NoSuchElementException("Hint Menu not found");
				}
			} catch (Exception e) {
				throw new Exception("Error");
			}
			break;
		case "Hint_Close_01":
			C1ProductPageActions.maybeLater_button_click(driver);
			System.out.println("Maybe later button clicked");
			C1TeacherDashboardPageActions.dropDownMenu_link_click(driver);
			System.out.println("drop down menu clicked");
			try {
				if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
					throw new Exception("Hint Menu found");
				}else {
					System.out.println("Hint Menu not found");
				}
			} catch (Exception e) {
				throw new Exception("Error");
			}
			break;
		case "Hint_Close_02":
			C1ProductPageActions.maybeLater_button_click(driver);
			System.out.println("maybe later button clicked");
			C1ProductPageActions.ok_button_click(driver);
			System.out.println("ok button clicked");
			try {
				if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
					throw new Exception("Hint Menu found");
				}else {
					System.out.println("Hint Menu not found");
				}
			} catch (Exception e) {
				throw new Exception("Error");
			}
			break;
		case "Hint_Close_03":
			C1ProductPageActions.maybeLater_button_click(driver);
			System.out.println("maybe later button clicked");
			C1TeacherDashboardPageActions.home_button_click(driver);
			System.out.println("home button clicked");
			try {
				if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
					throw new Exception("Hint Menu found");
				}else {
					System.out.println("Hint Menu not found");
				}
			} catch (Exception e) {
				throw new Exception("Error");
			}
			break;
		case "Hint_Close_04":
			C1ProductPageActions.maybeLater_button_click(driver);
			System.out.println("maybe later button clicked");
			GenericPageWaits.delay(7);
			try {
				if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
					throw new Exception("Hint Menu found");
				}else {
					System.out.println("Hint Menu not found");
				}
			} catch (Exception e) {
				throw new Exception("Error");
			}
			break;
		default:
			throw new Exception("Error");
		}
	}
	
	
	//Currently working on NEMO110431.java
	public static void hint_menu_displayValidation_01(WebDriver driver) throws Exception{
//		boolean isDisplayed = C1ProductPageActions.hint_menu_isDisplayed(driver);
		if(C1ProductPageObjects.getHintMenu(driver).isDisplayed()) {
			System.out.println("Hint Menu found");
		}else {
			throw new NoSuchElementException("Hint Menu not found");
		}
	}
	
	public static void hint_menu_displayValidation_02(WebDriver driver) throws Exception{
		try {
			WebElement hintMenu = C1ProductPageObjects.getHintMenu(driver);
			System.out.println("hint menu web element stored");
			C1TeacherDashboardPageActions.dropDownMenu_link_click(driver);
			System.out.println("drop down menu clicked");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
			wait.until(ExpectedConditions.invisibilityOf(hintMenu));
			System.out.println("Hint Menu not found");
		}catch(Exception e) {
			throw new Exception("Hint Menu Found");
		}
	}
	
	public static void hint_menu_displayValidation_03(WebDriver driver) throws Exception{
		try {
			WebElement hintMenu = C1ProductPageObjects.getHintMenu(driver);
			System.out.println("hint menu web element stored");
			C1ProductPageActions.ok_button_click(driver);
			System.out.println("ok button clicked");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
			wait.until(ExpectedConditions.invisibilityOf(hintMenu));
			System.out.println("Hint Menu not found");
		}catch(Exception e) {
			throw new Exception("Hint Menu Found");
		}
	}
	
	public static void hint_menu_displayValidation_04(WebDriver driver) throws Exception{
		try {
			WebElement hintMenu = C1ProductPageObjects.getHintMenu(driver);
			System.out.println("hint menu web element stored");
			C1TeacherDashboardPageActions.home_button_click(driver);
			System.out.println("home button clicked");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
			wait.until(ExpectedConditions.invisibilityOf(hintMenu));
			System.out.println("Hint Menu not found");
		}catch(Exception e) {
			throw new Exception("Hint Menu Found");
		}
	}
	
	public static void hint_menu_displayValidation_05(WebDriver driver) throws Exception{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
			wait.until(ExpectedConditions.invisibilityOf(C1ProductPageObjects.getHintMenu(driver)));
			System.out.println("Hint Menu not found");
		}catch(Exception e) {
			throw new Exception("Hint Menu Found");
		}
		
	}
	
}
