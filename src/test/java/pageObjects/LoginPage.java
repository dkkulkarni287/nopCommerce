package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPwd;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement btnLogin;
	
	
	public void setEmail(String email) {
		
		txtEmail.sendKeys(email);
		
	}
	
	public void setPwd(String pwd) {
		
		txtPwd.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		btnLogin.click();		
	}
	
	

}
