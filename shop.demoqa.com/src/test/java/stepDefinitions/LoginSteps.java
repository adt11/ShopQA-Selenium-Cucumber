package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.HomeMenuPage;
import modules.MyAccountPage;
import utilities.Utils;

public class LoginSteps extends Base{
	
	HomeMenuPage hMenu;
	MyAccountPage myaccount;	
	
	@Before
	public void openBrowser() throws IOException {
			
		Base.log.info("*******************Browser Initialization*******************");
		driver = BaseClass.createDriver();
		hMenu = HomeMenuPage.getInstance();
		myaccount = MyAccountPage.getInstance(driver);
		
	}
	
	@After
	public void tearoff(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
		        try {
		        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
		            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		            scenario.embed(screenshot, "image/png", "FailedScreenshot");
		        } catch (WebDriverException webdriverException) {
		            System.err.println(webdriverException.getMessage());
		        }
	        } 
		driver.close();
	}

	
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
		hMenu.MyAccount();
		
	}
	
	@When("User enter {string} and {string} in the Login Frame")
	public void user_enter_user_name_and_password_in_the_Login_Frame(String user,String pass) {
		
		
		log.info("******************* Entering User Name *******************");
		
		myaccount.setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		myaccount.setPassword("login", pass);
	}
	
	@When("User enter Single([^\"]*) and Single([^\"]*) in the Login Frame")
	public void user_enter_single_user_name_and_password_in_the_Login_Frame(String user,String pass) {
		
		
		log.info("******************* Entering User Name *******************");
		
		myaccount.setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		myaccount.setPassword("login", pass);
	}
	
	@When("^User enter Multiple ([^\"]*) and Multiple ([^\"]*)$")
	public void user_enter_multiple_user_name_and_multiple_password_in_the_Login_Frame(String user, String pass) {
		
		log.info("******************* Entering User Name *******************");
		
		myaccount.setUserName("login", user);
		
		log.info("******************* Entering Password *******************");
		myaccount.setPassword("login", pass);
		
	}

	@And("^click on the Login button$")
	public void click_on_the_Login_button() {
		
		log.info("******************* Click on Login Button *******************");
		myaccount.clickLogin();
	}

	@Then("^User should able to login with valid credentials$")
	public void user_should_able_to_login_with_valid_credentials() {
	    
		log.info("******************* verifying login successfully *******************");
		myaccount.Verify_Login_Valid_Credentials();
	}
	
	@Then("^User should not able to login and getting error message$")
	public void user_should_not_able_to_login_with_invalid_credentials() {
	    
		log.info("******************* Verifying User unable to login and getting error message *******************");
		myaccount.Verify_Login_Invalid_Credentials();
	}
	
	@Then("^User should able to click on Dashboard menu$")
	public void user_should_able_to_click_on_Dashboard_menu() {
	    
		log.info("******************* Go To Dashboard Menu *******************");
		myaccount.Dashboard();
		hMenu.MyAccount();
	}

	@Then("^User should able to click on Order menu$")
	public void user_should_able_to_click_on_Order_menu() {
		
		log.info("******************* Go To Order Menu *******************");
		myaccount.Orders();
		hMenu.MyAccount();
	}

	@Then("^User should able to click on Downloads menu$")
	public void user_should_able_to_click_on_Downloads_menu() {
		
		log.info("******************* Go To Downloads Menu *******************");
		myaccount.Downloads();
		hMenu.MyAccount();
	}

	@Then("^User should able to click on Addresses menu$")
	public void user_should_able_to_click_on_Addresses_menu() {
		
		log.info("******************* Go To Addresses Menu *******************");
		myaccount.Addresses();
		hMenu.MyAccount();
	}

	@Then("^User should able to click on Account details menu$")
	public void user_should_able_to_click_on_Account_details_menu() {
		
		log.info("******************* Go To Account detail Menu *******************");
		myaccount.Accountdetails();
		hMenu.MyAccount();
	}

	@When("^User click on Logout button$")
	public void User_click_on_Logout_button() throws InterruptedException {
		
		log.info("******************* click logout button *******************");
		myaccount.Logout();
		Thread.sleep(3000);
		
	}
	@Then("^User should able to logout successfully$")
	public void user_should_able_to_logout_successfully() throws InterruptedException {
		
		log.info("******************* Logout successfully from Application *******************");
		Assert.assertTrue(driver.getTitle().equals("My Account – ToolsQA Demo Site"));
		
	}

}
