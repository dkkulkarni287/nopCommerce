package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseTest;
import utilities.Dataprovider;

public class TC002_RegistrationPageTest extends BaseTest {

	@Test (dataProvider = "regdata" , dataProviderClass = Dataprovider.class)
	public void userRegistration(String fn, String ln, String d, String m, String y, String email, String cname, String pwd) {
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		RegistrationPage regpage = new RegistrationPage(driver);
		Assert.assertEquals(regpage.verifyRegText(), true);
		regpage.selectMGender();
		regpage.setFName(fn);
		regpage.setLName(ln);
		regpage.setDOBD(d);
		regpage.setDOBM(m);
		regpage.setDOBY(y);
		regpage.setEmail(email);
		regpage.setCompanyName(cname);
		regpage.setPassword(pwd);
		regpage.setConfirmPwd(pwd);
		regpage.clickRegister();
		regpage.clickContinue();
		regpage.clickLogout();

	}

	
}
