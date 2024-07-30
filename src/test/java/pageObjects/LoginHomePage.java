package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePage extends BasePage {

	public LoginHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath = "//a[@class='ico-account']")
	WebElement lnkMyacc;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement lnkLogout;


	public boolean IsMyAccDisplayed() {

		return lnkMyacc.isDisplayed();

	}
	
	public void clickLogout() {
		lnkLogout.click();
		
	}


}
