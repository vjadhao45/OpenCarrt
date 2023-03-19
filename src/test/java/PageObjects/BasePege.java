package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePege {
	
WebDriver driver;
	
	public  BasePege(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
