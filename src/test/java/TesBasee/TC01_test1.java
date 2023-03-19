package TesBasee;

import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC01_test1 extends Base_Class
{
@Test	
public void test_login()
{
	LoginPage lp=new LoginPage(driver);
			lp.clickMyAccount();
	lp.clickOnRegister();
			
}
}



	



