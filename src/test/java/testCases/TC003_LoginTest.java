package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginHomePage;
import pageObjects.LoginPage;
import testBase.BaseTest;

public class TC003_LoginTest extends BaseTest {
	
	
	@Test
	public void verifyLogin() {
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("Email"));
		lp.setPwd(p.getProperty("Password"));
		lp.clickLogin();
		LoginHomePage lhp = new LoginHomePage(driver);
		Assert.assertEquals(lhp.IsMyAccDisplayed(), true);
		
	}
	
	

}
