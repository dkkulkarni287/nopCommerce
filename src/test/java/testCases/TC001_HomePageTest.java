package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseTest;

public class TC001_HomePageTest extends BaseTest {

	@Test
	public void verifyHomePage() {

		HomePage hp = new HomePage(driver);
		Assert.assertEquals(hp.verifyPresenceOfSitename(), true); 
		Assert.assertEquals(hp.verifyPresenceOfSearchbox(), true);
		Assert.assertEquals(hp.verifyPresenceOfSearchbtn(), true);
		hp.clickRegister();

	}

}
