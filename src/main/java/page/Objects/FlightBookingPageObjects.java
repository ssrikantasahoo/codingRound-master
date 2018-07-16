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
public class FlightBookingPageObjects {

	@FindBy(id = "OneWay")
	public WebElement oneWay;

	@FindBy(id = "FromTag")
	public WebElement fromTag;

	@FindBy(id = "ToTag")
	public WebElement toTag;

	@FindBy(xpath = "//input[@id='DepartDate']")
	public WebElement datepicker;

	@FindBy(id = "SearchBtn")
	public WebElement SearchBtn;

}
