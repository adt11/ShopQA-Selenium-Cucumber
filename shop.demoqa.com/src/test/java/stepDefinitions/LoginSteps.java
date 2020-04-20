package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.HomeMenuPage;
import modules.MyAccountPage;
import utilities.Utils;

public class LoginSteps extends Base {
	
	
	@Given("^User Launch browser and open URL http:\\/\\/shop.demoqa.com\\/$")
	public void user_Launch_browser_and_open_URL_http_shop_demoqa_com() {
	    
		log.info("******************* Launch Browser and Navigate to URL *******************");
		driver.get(Utils.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@And("^User should able to see home page of the application$")
	public void user_should_able_to_see_home_page_of_the_application() {
		
		log.info("******************* Verify Home Page *******************");
		Assert.assertEquals(driver.getTitle(),"ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site"); 
	}

	@And("User should able to go the MyAccount page")
	public void user_should_able_to_go_the_MyAccount_page() {
	   
		log.info("******************* Go to the MyAccount page *******************");
		HomeMenuPage.getInstance().MyAccount();
	}
	
	@When("User enter {string} and {string} in the Login Frame")
	public void user_enter_user_name_and_password_in_the_Login_Frame(String user,String pass) {
		
		
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance().setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		MyAccountPage.getInstance().setPassword("login", pass);
	}
	
	@When("^User enter Single ([^\"]*) and Single ([^\"]*) in the Login Frame$")
	public void user_enter_single_user_name_and_password_in_the_Login_Frame(String user,String pass) {
		
		
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance().setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		MyAccountPage.getInstance().setPassword("login", pass);
	}
	
	@When("^User enter Multiple ([^\"]*) and Multiple ([^\"]*)$")
	public void user_enter_multiple_user_name_and_multiple_password_in_the_Login_Frame(String user, String pass) {
		
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance().setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		MyAccountPage.getInstance().setPassword("login", pass);
		
	}

	@And("^click on the Login button$")
	public void click_on_the_Login_button() {
		
		log.info("******************* Click on Login Button *******************");
		MyAccountPage.getInstance().clickLogin();
	}

	@Then("^User should able to login with valid credentials$")
	public void user_should_able_to_login_with_valid_credentials() {
	    
		log.info("******************* verifying login successfully *******************");
		MyAccountPage.getInstance().Verify_Login_Valid_Credentials();
	}
	
	@Then("^User should not able to login and getting error message$")
	public void user_should_not_able_to_login_with_invalid_credentials() {
	    
		log.info("******************* Verifying User unable to login and getting error message *******************");
		MyAccountPage.getInstance().Verify_Login_Invalid_Credentials();
	}
	
	@Then("^User should able to click on Dashboard menu$")
	public void user_should_able_to_click_on_Dashboard_menu() {
	    
		log.info("******************* Go To Dashboard Menu *******************");
		MyAccountPage.getInstance().Dashboard();
		HomeMenuPage.getInstance().MyAccount();
	}

	@Then("^User should able to click on Order menu$")
	public void user_should_able_to_click_on_Order_menu() {
		
		log.info("******************* Go To Order Menu *******************");
		MyAccountPage.getInstance().Orders();
		HomeMenuPage.getInstance().MyAccount();
	}

	@Then("^User should able to click on Downloads menu$")
	public void user_should_able_to_click_on_Downloads_menu() {
		
		log.info("******************* Go To Downloads Menu *******************");
		MyAccountPage.getInstance().Downloads();
		HomeMenuPage.getInstance().MyAccount();
	}

	@Then("^User should able to click on Addresses menu$")
	public void user_should_able_to_click_on_Addresses_menu() {
		
		log.info("******************* Go To Addresses Menu *******************");
		MyAccountPage.getInstance().Addresses();
		HomeMenuPage.getInstance().MyAccount();
	}

	@Then("^User should able to click on Account details menu$")
	public void user_should_able_to_click_on_Account_details_menu() {
		
		log.info("******************* Go To Account detail Menu *******************");
		MyAccountPage.getInstance().Accountdetails();
		HomeMenuPage.getInstance().MyAccount();
	}

	@When("^User click on Logout button$")
	public void User_click_on_Logout_button() throws InterruptedException {
		
		log.info("******************* click logout button *******************");
		MyAccountPage.getInstance().Logout();
		
	}
	@Then("^User should able to logout successfully$")
	public void user_should_able_to_logout_successfully() throws InterruptedException {
		
		log.info("******************* Logout successfully from Application *******************");
		Assert.assertTrue(driver.getTitle().equals("My Account – ToolsQA Demo Site"));
		
	}

}
