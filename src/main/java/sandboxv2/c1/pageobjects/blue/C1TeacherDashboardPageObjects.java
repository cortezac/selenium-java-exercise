package sandboxv2.c1.pageobjects.blue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class C1TeacherDashboardPageObjects {
	
	public static By getDropdownMenuLink = By.id("dropdownMenuLinkHeader");
	public static WebElement getDropdownMenuLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getDropdownMenuLink);
	}

	public static By getInstallerLink = By.cssSelector("a[class='dropdown-item dwnldInstaller']");
	public static WebElement getInstallerLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getInstallerLink);
	}
	
	public static By getLogoutButton = By.cssSelector("button[class='btn btn-xs btn-white-bordered']");
	public static WebElement getLogoutButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getLogoutButton);
	}
	
	public static By getMyLibraryLink = By.id("myLibrary");
	public static WebElement getMyLibraryLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getMyLibraryLink);
	}
	
	public static By getMaterialsLink = By.xpath("//div[@class='heading4 mt-1' and text()='Class data']");
	public static WebElement getMaterialsLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getMaterialsLink);
	}
	
	public static By getSearchtextField = By.id("bundleName");
	public static WebElement getSearchtextField(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getSearchtextField);
	}
	
	public static By getSearch_ListOption = By.cssSelector("li[class='dropdown-item p-0']");
	public static List<WebElement> getSearch_ListOption(SearchContext driver) throws NoSuchElementException{
		return driver.findElements(getSearch_ListOption);
	}
//	specific product item
//	public static By getSearchOption = By.xpath("//li[@class='dropdown-item p-0']//a[text()='EQA Product Ebook AB01']");
//	public static WebElement getSearchOption(SearchContext driver) throws NoSuchElementException{
//		return driver.findElement(getSearchOption);
//	}
	public static By getCard_ListOption = By.cssSelector("div[class='card bg-white']");
	public static List<WebElement> getCard_ListOption(SearchContext driver) throws NoSuchElementException{
		return driver.findElements(getCard_ListOption);
	}
	
	public static By getViewDetailsLink = By.xpath("//span[text()='View details']");
	public static WebElement getViewDetailsLink(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getViewDetailsLink);
	}
	
//	public static By getDownloadAppBanner = By.cssSelector("div[class='downloadAppBanner']"); 
//	public static By getDownloadAppBanner = By.xpath("//div[text()='Download the Cambridge One Desktop App']");
	public static By getDownloadAppBanner = By.className("downloadAppBanner");
	public static WebElement getDownloadAppBanner(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getDownloadAppBanner);
	}
	
	public static By getDownloadAppBannerText = By.xpath("//div[@class='media-body']//div[@class='heading mt-0']");
	public static WebElement getDownloadAppBannerText(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getDownloadAppBannerText);
	}
	
	public static By getHomeButton = By.cssSelector("img[class='brand-img']");
	public static WebElement getHomeButton(SearchContext driver) throws NoSuchElementException{
		return driver.findElement(getHomeButton);
	}
	
}
