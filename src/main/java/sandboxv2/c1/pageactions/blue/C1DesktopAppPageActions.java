package sandboxv2.c1.pageactions.blue;

import java.io.File;

import org.openqa.selenium.WebDriver;
import sandboxv2.GenericActions.GenericPageWaits;
import sandboxv2.c1.pageobjects.blue.C1DesktopAppPageObjects;

public class C1DesktopAppPageActions {
	
	public static void linuxInstaller_button_clickable(WebDriver driver) throws Exception{
		GenericPageWaits.waiteElementToBeClickable(driver, C1DesktopAppPageObjects.getLinuxInstallerButton(driver));
	}
	//IMPROVED VERSION
	public static void installer_button_click(WebDriver driver,String installerName,String downloadPath, String fileName) throws Exception{
		switch(installerName){
		case "Windows":
			C1DesktopAppPageObjects.getWindowsInstallerButton(driver).click();
			System.out.println("waiting for windows installer download to finish");
			while (!isFileDownloaded(downloadPath, fileName)) {
				isFileDownloaded(downloadPath, fileName);
			}
			System.out.println("windows installer downloaded");
			break;
		case "Linux":
			C1DesktopAppPageObjects.getLinuxInstallerButton(driver).click();
			System.out.println("waiting for linux installer download to finish");
			while (!isFileDownloaded(downloadPath, fileName)) {
				isFileDownloaded(downloadPath, fileName);
			}
			System.out.println("linux installer downloaded");
			break;
		case "Mac":
			C1DesktopAppPageObjects.getMacInstallerButton(driver).click();
			System.out.println("waiting for mac installer download to finish");
			while (!isFileDownloaded(downloadPath, fileName)) {
				isFileDownloaded(downloadPath, fileName);
			}
			System.out.println("mac installer downloaded");
			break;
		default:
			throw new Exception("Error");
		}
	}
	
	public static boolean isFileDownloaded(String downloadPath, String fileName) {
		//made some changes
		  boolean isFilePresent = false;
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          dirContents[i].delete();
		          isFilePresent = true;
		          break;
		      }
		  }
		  if(isFilePresent) {
			  return true;
		  }else {
			  return false;
		  }
		 
	}
		//old
		public static void linuxInstaller_button_click(WebDriver driver) throws Exception{
			C1DesktopAppPageObjects.getLinuxInstallerButton(driver).click();
			System.out.println("waiting for download to finish");
			GenericPageWaits.delay(30);
			
			String downloadPath = "C:\\Users\\acortez\\Downloads", fileName = "Cambridge One Desktop App 1.27.0.AppImage";
			isFileDownloaded(downloadPath, fileName);
		}
		//old
		public static void windowsInstaller_button_click(WebDriver driver) throws Exception{
			C1DesktopAppPageObjects.getWindowsInstallerButton(driver).click();
			System.out.println("waiting for download to finish");
			GenericPageWaits.delay(30);
			
			String downloadPath = "C:\\Users\\acortez\\Downloads", fileName = "Cambridge One Desktop App Setup 1.27.0.exe";
			isFileDownloaded(downloadPath, fileName);
		}
		//old
		public static void macInstaller_button_click(WebDriver driver) throws Exception{
			C1DesktopAppPageObjects.getMacInstallerButton(driver).click();
			System.out.println("waiting for download to finish");
			GenericPageWaits.delay(30);
			
			String downloadPath = "C:\\Users\\acortez\\Downloads", fileName = "Cambridge One Desktop App-1.27.0.dmg";
			isFileDownloaded(downloadPath, fileName);
		}
	
}
