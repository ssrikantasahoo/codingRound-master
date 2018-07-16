package tests;

import com.sun.javafx.PlatformUtil;

import page.Objects.HotelBookingPageObjects;
import page.Objects.SignInPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends SeleniumTestPlan {

	HotelBookingPageObjects obj = new HotelBookingPageObjects();

	@Test (retryAnalyzer=Retry.class)
	public void shouldBeAbleToSearchForHotels() {

		PageFactory.initElements(driver, obj);
		obj.hotelLink.click();

		obj.localityTextBox.sendKeys("Indiranagar, Bangalore");

		new Select(obj.travellerSelection).selectByVisibleText("1 room, 2 adults");

		obj.searchButton.click();

	}

}
