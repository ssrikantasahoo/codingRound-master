/**
 * 
 */
package page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Srikanta
 *
 */
public class HotelBookingPageObjects {

	@FindBy(linkText = "Hotels")
	public WebElement hotelLink;

	@FindBy(id = "Tags")
	public WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	public WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	public WebElement travellerSelection;

}
