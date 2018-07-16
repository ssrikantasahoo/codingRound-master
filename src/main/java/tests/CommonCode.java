package tests;
/**
 * 
 */

/**
 * @author Srikanta
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.sun.javafx.PlatformUtil;

public class CommonCode {
	
	

	

	@SuppressWarnings("restriction")
	public void setDriverPath() {
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver_linux");
		}

	}

	public void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
	}

}
