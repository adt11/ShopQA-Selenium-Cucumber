package modules;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObject.LoginIN;
import pageObject.Registration;
import stepDefinitions.Base;

public class MyAccountPage extends Base {
	
	private static MyAccountPage myactivity = null;
	
	private MyAccountPage() {
		
		PageFactory.initElements(driver, LoginIN.class);
		PageFactory.initElements(driver, Registration.class);
	}
	
	public static MyAccountPage getInstance() {
		
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
		
		visibleElement(LoginIN.ErrorMessage);
		Assert.assertTrue(LoginIN.ErrorMessage.getText().contains("ERROR"));
		return myactivity;
	}
	
	public MyAccountPage Dashboard() {
		
		visibleElement(LoginIN.dashboard);
		LoginIN.dashboard.click();
		return myactivity;
	}
	
	public MyAccountPage Orders() {
		
		visibleElement(LoginIN.order);
		LoginIN.order.click();
		visibleElement(LoginIN.verifyOrder);
		return myactivity;
	}
	
	public MyAccountPage Downloads() {
		
		visibleElement(LoginIN.download);
		LoginIN.download.click();
		visibleElement(LoginIN.verifyDownload);
		return myactivity;
	}
	
	public MyAccountPage Addresses() {
		
		visibleElement(LoginIN.adresses);
		LoginIN.adresses.click();
		visibleElement(LoginIN.verifyAddress);
		return myactivity;
	}
	
	public MyAccountPage Accountdetails() {
		
		visibleElement(LoginIN.account);
		LoginIN.account.click();
		visibleElement(LoginIN.verifyAccount);
		return myactivity;
	}
	
	public MyAccountPage Logout() {

		visibleElement(LoginIN.logout);
		LoginIN.logout.click();
		visibleElement(LoginIN.userName);
		Assert.assertTrue(driver.getTitle().equals("My Account – ToolsQA Demo Site"));
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
		
		visibleElement(Registration.ErrorMessage);
		Assert.assertTrue(Registration.ErrorMessage.getText().contains("Error:"));
		return myactivity;
	}
	
}
