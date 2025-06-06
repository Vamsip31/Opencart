package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups={"regression","master"})
	public void verify_login() {
		logger.info("***** Starting TC_002_LoginTest  ****");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link.. ");
		hp.clickLogin();
		logger.info("Clicked on Login Link.. ");
		
		LoginPage lp=new LoginPage(driver);
		lp.setLoginEmail(p.getProperty("email"));
		lp.setLoginPwd(p.getProperty("password"));
		lp.clickLogin();
		logger.info("Login Successful.. ");
		
		MyAccountPage ap=new MyAccountPage(driver);
		Boolean targetPage=ap.isMyAccountPageExists();
		
		Assert.assertTrue(targetPage);
		}
		catch(Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}
	}

}
