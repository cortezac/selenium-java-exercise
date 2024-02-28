package sandboxv2.GenericActions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;

import com.google.common.collect.ImmutableMap;

public class GenericNetworkActions {
	public static void disableDesktopInternetConnection() throws Exception {
		Runtime.getRuntime().exec("cmd /c ipconfig /release");
		GenericPageWaits.delay(5);
	}
	
	public static void enableDesktopInternetConnection() throws Exception {
		Runtime.getRuntime().exec("cmd /c ipconfig /renew");
		GenericPageWaits.delay(5);
	}

	public static void setNetwork(WebDriver driver, boolean offline) throws Exception {

		Map<String, Object> net = new HashMap<String, Object>();
		net.put("offline", offline);
		net.put("latency", 5);
		net.put("download_throughput", 500);
		net.put("upload_throughput", 1024);

		CommandExecutor ce = ((ChromeDriver) driver).getCommandExecutor();
		@SuppressWarnings("unused")
		Response response = ce.execute(new Command(((ChromeDriver) driver).getSessionId(),"setNetworkConditions", ImmutableMap.of("network_conditions", ImmutableMap.copyOf(net))));
		GenericPageWaits.delay(10);

		if (offline) {
			System.out.println("OFFLINE");
		} else {
			System.out.println("ONLINE");
		}

	}
}
