package sandboxv2.c1.pageobjects.blue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1DesktopAppPageObjects {
	
	public static By getLinuxInstallerButton = By.cssSelector("button[class='downoadButton linux']");
	public static WebElement getLinuxInstallerButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getLinuxInstallerButton);
	}

	public static By getWindowsInstallerButton = By.cssSelector("button[class='downoadButton windows']");
	public static WebElement getWindowsInstallerButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getWindowsInstallerButton);
	}
	
	public static By getMacInstallerButton = By.cssSelector("button[class='downoadButton mac']");
	public static WebElement getMacInstallerButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getMacInstallerButton);
	}
}
