/**
 * 
 */
package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


/**
 * @author Srikanta
 *
 */

public class SeleniumTestPlan extends CommonCode{
	WebDriver driver;
	@BeforeMethod
	public void startBroswer() {
		new CommonCode().setDriverPath();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-fullscreen");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		
		
	}

	@AfterMethod
	public void quitBroswer() {
		// close the browser
		driver.quit();
	}

}
