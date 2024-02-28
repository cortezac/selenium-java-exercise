package sandboxv2.Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public static WebDriver getDriver(String browser) throws Exception {
		
		if(browser == null || browser == "") {
			browser = "Chrome";
		}
		
		boolean LT = false;
		
		String driverpath = "C:\\selenium-drivers\\";
    	WebDriver driver = null;
    	
    	if(LT) {
    		driver = setLambdaDriver(browser);
    	} else {
    		driver = setDriver(browser, driverpath);
    	}
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		
		return driver;
    }
	
	private static WebDriver setLambdaDriver(String browser) {
		RemoteWebDriver driver = null;
		
		String un = System.getenv("LT_UN");
		String ak = System.getenv("LT_AK");
		String url= "https://" + un + ":" + ak + "@hub.lambdatest.com/wd/hub";
		String run= "Regression";
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("version"	, "105.0");
		capabilities.setCapability("platform"	, "Windows 10");
		capabilities.setCapability("resolution"	, "1024x768");
		capabilities.setCapability("build"		, "Test");
		capabilities.setCapability("name"		, run);
		capabilities.setCapability("network"	, false);
		capabilities.setCapability("visual"		, true);
		capabilities.setCapability("video"		, true);
		capabilities.setCapability("console"	, false);
		
	    try {
	    	driver = new RemoteWebDriver(new URL(url), capabilities);
	    } catch (Exception e) {
	    	System.out.println("Invalid grid URL");
	    	e.printStackTrace();
		}
		
		return driver;
	}
	
	private static WebDriver setDriver(String browser, String driverpath) throws MalformedURLException {
		WebDriver driver = null;
		
		switch (browser.toLowerCase()) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				
				FirefoxOptions ffopt = new FirefoxOptions();
			
				ffopt.setAcceptInsecureCerts(true);
				// ffopt.addPreference("browser.helperApps.alwaysAsk.force", false);
				ffopt.addPreference("browser.download.folderList", 2);
				ffopt.addPreference("browser.download.manager.showWhenStarting", false);
//				ffopt.addPreference("browser.download.dir", MainTest.config.getFFDownloadPath());
//				ffopt.addPreference("browser.helperApps.neverAsk.saveToDisk", MainTest.config.getDownloadMimes());
				
				FirefoxProfile ffProfile = new FirefoxProfile();
				ffProfile.setPreference("browser.download.folderList", 2);
				ffProfile.setPreference("browser.download.manager.showWhenStarting", false );
//				ffProfile.setPreference("browser.download.dir", MainTest.config.getFFDownloadPath());
//				ffProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", MainTest.config.getDownloadMimes());
				ffProfile.setPreference("pdfjs.disabled", true ); 
				ffProfile.setPreference("media.navigator.permission.disabled", false); 
				ffProfile.setPreference("permissions.default.microphone", 1); 
				ffopt.setProfile(ffProfile);
				
				driver = new FirefoxDriver(ffopt);
				break;
				
			case "chrome":
				WebDriverManager.chromedriver().setup();
				
				Map<String, Object> prefs = new HashMap<String, Object>();
				
				prefs.put("profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1);
				prefs.put("download.prompt_for_download", "false");
				prefs.put("download.extensions_to_open", "text/csv");
				prefs.put("profile.default_content_settings.popups", 1);
				prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
				prefs.put("plugins.always_open_pdf_externally", true);
				prefs.put("plugins.plugins_disabled", new String[] {
					    "Adobe Flash Player","Chrome PDF Viewer"
					    });
				DesiredCapabilities caps = new DesiredCapabilities();
				ChromeOptions copt = new ChromeOptions();
				
				copt.addArguments(Arrays.asList("test-type", "disable-popup-blocking", "disable-default-apps", "auto-launch-at-startup",
						"always-authorize-plugins", "disable-infobars", "disable-infobar-for-protected-media-identifier",
						"safebrowsing-disable-download-protection", "ignore-certificate-errors", "--disable-backgrounding-occluded-windows",
						"start-maximized"));
				
				copt.setExperimentalOption("prefs", prefs);
//				copt.setCapability("javascriptEnabled", true);
				caps.setCapability(ChromeOptions.CAPABILITY, copt);
				
				driver = new ChromeDriver(copt);
				break;
			
			case "safari":
				driver = new SafariDriver();
				break;
				
			default:
				System.setProperty("webdriver.edge.driver", driverpath + "MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
		}
		
		return driver;
	}
}
