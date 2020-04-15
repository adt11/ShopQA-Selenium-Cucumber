package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyActivityPage {
	
	WebDriver ldriver;
	WebDriverWait wait;
	static MyActivityPage map;
	
	
	private MyActivityPage(WebDriver rdriver) {
		super();
		this.ldriver=rdriver;
	}
	
	public static MyActivityPage getInstance(WebDriver driver, WebDriverWait wait) {
		
		if(map==null) {
			map = new MyActivityPage(driver);
			map.wait = wait;
			
		}
		return map;
	}
	
	@FindBy(xpath="//*[@class='pull-right noo-topbar-right']/li/a[@href='http://shop.demoqa.com/my-account/']")
	WebElement myaccount;

	public void MyActivity() {
		
		wait.until(ExpectedConditions.visibilityOf(myaccount));
		myaccount.click();
	}
	
	public class Login{
			
			@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='username']")
			WebElement userName;
			
			@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='password']")
			WebElement password;
			
			@FindBy(xpath="//*[@class='woocommerce-button button woocommerce-form-login__submit' and @name='login']")
			WebElement loginBtn;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-content']/descendant::p/strong[1]")
			WebElement verifyText;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[1]")
			WebElement dashboard;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[2]")
			WebElement order;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[3]")
			WebElement download;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[4]")
			WebElement adresses;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[5]")
			WebElement account;
			
			@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[6]")
			WebElement logout;
			
			@FindBy(xpath="//*[@href='http://shop.demoqa.com/']")
			WebElement HomePage;
			
			@FindBy(xpath="//*[@class='woocommerce-error']/li/strong")
			WebElement ErrorMessage;
			
			
			public void HomePage() {
				
				HomePage.click();
			}
			
			public void setUserName(String user) {
				
				userName.clear();
				userName.sendKeys(user);
			}
			
			public void setPassword(String pass) {
				
				password.clear();
				password.sendKeys(pass);
			}
			
			public void clickLogin() {
				
				loginBtn.click();
			}
			
			public void Verify_Login_Valid_Credentials() {
				
				Assert.assertTrue(verifyText.getText().equals("qaselenium"));
			}
			
			public void Verify_Login_Invalid_Credentials() {
				
				wait.until(ExpectedConditions.visibilityOf(ErrorMessage));
				Assert.assertTrue(ErrorMessage.getText().contains("ERROR"));
			}
			
			public void Dashboard() {
				
				wait.until(ExpectedConditions.visibilityOf(dashboard));
				dashboard.click();
			}
			
			public void Orders() {
				
				wait.until(ExpectedConditions.visibilityOf(order));
				order.click();
			}
			
			public void Downloads() {
				
				wait.until(ExpectedConditions.visibilityOf(download));
				download.click();
			}
			
			public void Addresses() {
				
				wait.until(ExpectedConditions.visibilityOf(adresses));
				adresses.click();
			}
			
			public void Accountdetails() {
				
				wait.until(ExpectedConditions.visibilityOf(account));
				account.click();
			}
			
			public void Logout() {
	
				wait.until(ExpectedConditions.visibilityOf(logout));
				logout.click();
				
			}
			
			
		}
	
	public class Registration{
		
		@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_username']")
		WebElement reguserName;
		
		@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_email']")
		WebElement regemail;
		
		@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_password']")
		WebElement regpassword;
		
		@FindBy(xpath="//*[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit' and @name='register']")
		WebElement registerBtn;
		
		@FindBy(xpath="//*[@class='woocommerce-error']/li/strong")
		WebElement ErrorMessage;
		
		public void setUserName(String user) {
			
			reguserName.clear();
			reguserName.sendKeys(user);
		}
		
		public void setPassword(String pass) {
			
			regpassword.clear();
			regpassword.sendKeys(pass);
		}
		
		public void setEmail(String email) {
					
			regemail.clear();
			regemail.sendKeys(email);
		}
		
		public void clickRegister() {
			
			registerBtn.click();
		}
		
		public void Verify_User_Already_Register() {
			
			wait.until(ExpectedConditions.visibilityOf(ErrorMessage));
			Assert.assertTrue(ErrorMessage.getText().contains("ERROR"));
		}
	}
	

}
