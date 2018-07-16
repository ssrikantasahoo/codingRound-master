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
public class SignInPageObjects {

	@FindBy(linkText = "Your trips")
	public WebElement yourTrip;

	@FindBy(id = "SignIn")
	public WebElement signIn;

	@FindBy(id = "signInButton")
	public WebElement signinButton;

	@FindBy(id = "errors1")
	public WebElement errors;

}
