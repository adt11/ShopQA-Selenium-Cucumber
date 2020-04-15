package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.LoginIN;
import pageObject.Registration;
import stepDefinitions.Base;

public class MyAccountPage extends Base {
	
	private static MyAccountPage myactivity = null;
	
	private MyAccountPage() {
		
		PageFactory.initElements(driver, LoginIN.class);
		PageFactory.initElements(driver, Registration.class);
		wait = new WebDriverWait(driver, 120);
	}
	
	public static MyAccountPage getInstance(WebDriver driver) {
		
		if(myactivity==null) {
			myactivity = new MyAccountPage();
		}
		return myactivity;
	}

		
	public MyAccountPage setUserName(String className, String user) {
		
		LoginIN.userName.clear();
		LoginIN.userName.sendKeys(user);
		return myactivity;
		
	}
	
	public MyAccountPage setPassword(String className, String pass) {
		
		LoginIN.password.clear();
		LoginIN.password.sendKeys(pass);
		return myactivity;
	}
	
	public MyAccountPage setRegUserName(String user) {
		
		Registration.reguserName.clear();
		Registration.reguserName.sendKeys(user);
		return myactivity;
	}
	
	public MyAccountPage setRegPassword(String pass) {
		
		Registration.regpassword.clear();
		Registration.regpassword.sendKeys(pass);
		return myactivity;
	}
	
	public MyAccountPage clickLogin() {
		
		LoginIN.loginBtn.click();
		return myactivity;
	}
	
	public MyAccountPage Verify_Login_Valid_Credentials() {
		
		Assert.assertTrue(LoginIN.verifyText.getText().equals("qaselenium"));
		return myactivity;
	}
	
	public MyAccountPage Verify_Login_Invalid_Credentials() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.ErrorMessage));
		Assert.assertTrue(LoginIN.ErrorMessage.getText().contains("ERROR"));
		return myactivity;
	}
	
	public MyAccountPage Dashboard() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.dashboard));
		LoginIN.dashboard.click();
		return myactivity;
	}
	
	public MyAccountPage Orders() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.order));
		LoginIN.order.click();
		return myactivity;
	}
	
	public MyAccountPage Downloads() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.download));
		LoginIN.download.click();
		return myactivity;
	}
	
	public MyAccountPage Addresses() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.adresses));
		LoginIN.adresses.click();
		return myactivity;
	}
	
	public MyAccountPage Accountdetails() {
		
		wait.until(ExpectedConditions.visibilityOf(LoginIN.account));
		LoginIN.account.click();
		return myactivity;
	}
	
	public MyAccountPage Logout() {

		wait.until(ExpectedConditions.visibilityOf(LoginIN.logout));
		LoginIN.logout.click();
		return myactivity;
		
	}
	
	public MyAccountPage setEmail(String email) {
				
		Registration.regemail.clear();
		Registration.regemail.sendKeys(email);
		return myactivity;
	}
	
	public MyAccountPage clickRegister() {
		
		Registration.registerBtn.click();
		return myactivity;
	}
	
	public MyAccountPage Verify_User_Already_Register() {
		
		wait.until(ExpectedConditions.visibilityOf(Registration.ErrorMessage));
		Assert.assertTrue(Registration.ErrorMessage.getText().contains("ERROR"));
		return myactivity;
	}
	
}
