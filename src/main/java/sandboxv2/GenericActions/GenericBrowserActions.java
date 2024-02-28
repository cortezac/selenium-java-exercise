package sandboxv2.GenericActions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import sandboxv2.Utils.WebDriverFactory;

public class GenericBrowserActions {
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public static void openInNewTab(WebDriver driver, WebElement link) {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	public static void openInNewWindow(WebDriver driver, WebElement link) {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
	//CURRENTLY NEED TO MANUALLY CLOSE BROWSER IN TEST FINALLY BLOCK
	public static WebDriver openDesktopBrowser(WebDriver driver, String browser) throws Exception {
		new WebDriverFactory();
		return driver = WebDriverFactory.getDriver(browser);
	}
	
	public static void switchFrame(WebDriver driver, WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	public static void switchFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public static void switchTab(WebDriver driver, String urlpart) {
		try {
			List<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			for (String tab : tabs) {
				driver.switchTo().window(tab);
				if (driver.getCurrentUrl().contains(urlpart)) {
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void switchTab(WebDriver driver,int tabNumber ) {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabNumber));
	}
	
	public static void navigateToURL(WebDriver driver, String newurl) {
		navigateToURL(driver, newurl, 180);
	}
	
	public static void navigateToURL(WebDriver driver, String newurl, int seconds) {
		driver.get(newurl);
		GenericPageWaits.waitPageLoad(driver, seconds);
	}
	
	public static void closeTab(WebDriver driver, String urlpart) {
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			if (driver.getCurrentUrl().contains(urlpart)) {
				driver.close();
				GenericPageWaits.delay();
				break;
			}
		}
		
	    tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	}
	
	public static void returnToDefaultTab (WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public static void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void dismissAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static void refreshBrowser(WebDriver driver) {
		driver.navigate().refresh();
		GenericPageWaits.delay();
		GenericPageWaits.waitPageLoad(driver);
	}
	
	/**
	 * This method utilizes the browsers Back button and navigates one page back
	 * 
	 * @param driver WebDriver
	 */
	public static void navigateBackOnce(WebDriver driver) {
		driver.navigate().back();
		GenericPageWaits.delay();
	}
	
	@SuppressWarnings("deprecation")
	public static void navigateBackUntilElementVisible(WebDriver driver, SearchContext element, By selector, int waitseconds) {
		element = (element == null) ? driver : element;
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		for (int i = 0; i < waitseconds; i++) {
			driver.navigate().back();
			GenericPageWaits.waitPageLoad(driver);
			
			try {
				if (element.findElement(selector).isDisplayed()) {
					i = waitseconds;
				}
			} catch (Exception e) {
			}
		}
		
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		GenericPageWaits.delay();
	}
	
	public static void navigateBackUntilElementVisible(WebDriver driver, By selector) {
		navigateBackUntilElementVisible(driver, null, selector, 180);
	}
	
	public static void navigateBackUntilElementVisible(WebDriver driver, SearchContext element, By selector) {
		navigateBackUntilElementVisible(driver, element, selector, 180);
	}
	
	/**
	 * This method utilizes the browsers Back button
	 * <p>
	 * Will keep on navigating back until the specified element is visible/displayed
	 * 
	 * @param driver WebDriver
	 * @param selector WebElement indicator to stop the navigation
	 * @param waitseconds Seconds before the script times out
	 */
	public static void navigateBackUntilElementVisible(WebDriver driver, By selector, int waitseconds) {
		navigateBackUntilElementVisible(driver, null, selector, waitseconds);
	}
}
