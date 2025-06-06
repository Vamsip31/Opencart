package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtLoginEmail;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtLoginPassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setLoginEmail(String email) {
		txtLoginEmail.sendKeys(email);
	}
	public void setLoginPwd(String pwd) {
		txtLoginPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
}
