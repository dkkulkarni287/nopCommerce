package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// Locators

	@FindBy(xpath="//h1[normalize-space()='Register']")
	WebElement txtRegister;

	@FindBy(xpath="//input[@id='gender-male']")
	WebElement rbtnGenderM;

	@FindBy(xpath="//input[@id='gender-female']")
	WebElement rbtnGenderF;

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastName;

	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement plDOBDay;

	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement plDOBM;

	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	WebElement plDOBY;

	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtComp;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPwd;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement txtConfPwd;

	@FindBy(xpath = "//button[@id='register-button']")
	WebElement btnRegister;
	
	@FindBy(xpath="//a[@class='button-1 register-continue-button']")
	WebElement btnContinue;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement lnkLogout;

	// Actions

	public boolean verifyRegText() {

		boolean regtext = txtRegister.isDisplayed();
		return regtext;
	}

	public void selectMGender() {
		rbtnGenderM.click();
	}

	public void selectFGender() {
		rbtnGenderF.click();
	}

	public void setFName( String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLName( String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setDOBD(String day) {
		plDOBDay.sendKeys(day);		
	}

	public void setDOBM(String month) {
		plDOBM.sendKeys(month);		
	}

	public void setDOBY(String year) {
		plDOBY.sendKeys(year);
	}

	public void setEmail (String email) {
		txtEmail.sendKeys(email);
	}
	public void setCompanyName(String compname) {
		txtComp.sendKeys(compname);	
	}
	public void setPassword (String pwd) {
		txtPwd.sendKeys(pwd);
	}
	public void setConfirmPwd(String pwd) {
		txtConfPwd.sendKeys(pwd);

	}
	public void clickRegister() {
		btnRegister.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	public void clickLogout() {
		lnkLogout.click();
	}
}

