package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Locators

	@FindBy(xpath="//img[@alt='nopCommerce demo store']")
	WebElement txtSiteName;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement srcStore;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSearch;
	
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement lnkLogin;

	// Actions

	public boolean verifyPresenceOfSitename() {
		boolean sitename = txtSiteName.isDisplayed();
		return sitename;
	}

	public boolean verifyPresenceOfSearchbox( ) {
		boolean searchbox = srcStore.isDisplayed();
		return searchbox;
	}
     
	public boolean verifyPresenceOfSearchbtn( ) {
		
		boolean searchbtn= btnSearch.isDisplayed();
		return searchbtn;
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() {
		lnkLogin.click();
		
		
	}


}
