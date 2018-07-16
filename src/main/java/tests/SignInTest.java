package tests;
import com.sun.javafx.PlatformUtil;

import page.Objects.SignInPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends SeleniumTestPlan{

  
 
    SignInPageObjects obj = new SignInPageObjects();

    @Test 
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

       
    	driver.get("https://www.cleartrip.com/");
        waitFor(2000);
        
        PageFactory.initElements(driver, obj);
        obj.yourTrip.click();
        obj.signIn.click();
        waitFor(5000);
		driver.switchTo().frame("modal_window");
		obj.signinButton.click();
		String errors1 = obj.errors.getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
		
    }

   
    }



