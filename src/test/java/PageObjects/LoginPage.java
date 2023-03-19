package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePege {
	
	
	public LoginPage(WebDriver driver)
	{
	super(driver);
	}
	

	@FindBy(xpath="//span[text()='My Account']")
	WebElement Myaccount;
	
	@FindBy(linkText="Register")
	WebElement LnkRegister;

	public void clickMyAccount()
	{
			Myaccount.click();
	}
	public void clickOnRegister()
	{
	LnkRegister.click();
	}

}
