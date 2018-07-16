package tests;

import com.sun.javafx.PlatformUtil;

import page.Objects.FlightBookingPageObjects;
import page.Objects.SignInPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FlightBookingTest extends SeleniumTestPlan {

	FlightBookingPageObjects obj = new FlightBookingPageObjects();

	@Test (retryAnalyzer=Retry.class)
	public void testThatResultsAppearForAOneWayJourney() {

		PageFactory.initElements(driver, obj);
		obj.oneWay.click();

		obj.fromTag.clear();
		obj.fromTag.sendKeys("Bangalore");

		// wait for the auto complete options to appear for the origin

		waitFor(2000);
		List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
		originOptions.get(0).click();

		obj.toTag.clear();
		obj.toTag.sendKeys("Delhi");

		// wait for the auto complete options to appear for the destination

		waitFor(2000);
		// select the first item from the destination auto complete list
		List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
		destinationOptions.get(0).click();

		// Current system Date
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);

		obj.datepicker.sendKeys(strDate);

		Actions action = new Actions(driver);

		action.moveToElement(obj.datepicker, obj.datepicker.getLocation().x, (obj.datepicker.getLocation().y) + 70)
				.click().build().perform();

		waitFor(2000);
		// all fields filled in. Now click on search
		obj.SearchBtn.click();

		waitFor(5000);
		// verify that result appears for the provided journey search
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));

	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
