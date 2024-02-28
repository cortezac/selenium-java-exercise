package sandboxv2.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tricentis2205Page {
	
	private WebDriver driver;
	
	public Tricentis2205Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void obstacle25505Btn() {
		driver.findElement(By.xpath(".//a[text()='Click me!']")).click();
	}

}
