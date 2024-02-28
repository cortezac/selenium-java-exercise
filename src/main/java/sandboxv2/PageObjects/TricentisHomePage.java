package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TricentisHomePage {
	private WebDriver driver;
	
	public TricentisHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Tricentis2205Page clickObstacle22505() {
		clickBtn("a[href='/Obstacles/22505/retry']");
		return new Tricentis2205Page(driver);
	}
	
	private void clickBtn(String btnCss){
		driver.findElement(By.cssSelector(btnCss)).click();
	}
}
