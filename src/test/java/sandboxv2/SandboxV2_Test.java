package sandboxv2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import sandboxv2.GenericActions.GenericBrowserActions;
import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.Utils.WebDriverFactory;

//@Listeners(value=ListenersTestNG.class)
public class SandboxV2_Test {

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = WebDriverFactory.getDriver("chrome");
		GenericBrowserActions.navigateToURL(driver, "https://obstaclecourse.tricentis.com/Obstacles/List");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//	}

//	@Test(enabled=false)
//	public void ID_22505_negative() throws Exception {
//		TricentisPageActions.clickClickMeBtn(driver);
//	}
//	
//	@Test(enabled=false)
//	public void ID_22505_positive() throws Exception {
//		TricentisPageActions.clickClickMeBtn(driver);
//	}
//	
//	@Test
//	public void ID_22507() throws Exception {
//		TricentisPageActions.clickClickMeBtn(driver);
//	}
	
	
	
	
	@Test
	public void Google_About() throws Exception {
//		GenericPageWaits.waitElementVisible(driver, GooglePageObjects.getGoogleImg);
//		GooglePageActions.clickGoogleAboutLink(driver);
//
//		assertEquals(true, driver.findElements(GooglePageObjects.getAboutImg).size() != 0);
//
//		GenericPageWaits.delay(5);
//		assertEquals(true, true);
		
		System.out.println("START");
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe.lazyloaded"));
		
		GenericBrowserActions.switchFrame(driver, iframe);
		
		GenericPageWaits.waitElementVisible(driver, By.cssSelector("li.ui-draggable"));
		System.out.println("TEST START");
		
		List<WebElement> elems = driver.findElements(By.cssSelector("li.ui-draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#trash"));
		
		for(WebElement elem : elems) {
			System.out.println("TEST");
			this.dragAndDrop(driver, elem, target);
			Thread.sleep(5000);
		}
	}
	
	@Test
	public void Test1() throws Exception {
		assertEquals(true, false);
	}
	
	@Test
	public void Test2() throws Exception {
		assertEquals(true, true);
	}
	
	public void dragAndDrop(WebDriver driver, WebElement token, WebElement target) throws Exception {
		Actions builder = new Actions(driver);
		builder
		.clickAndHold(token)
		.moveToElement(target)
		.release()
		.build()
		.perform();
	}
}
