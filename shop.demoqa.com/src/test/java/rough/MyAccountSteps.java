package rough;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.MyActivity;
import pageObject.AutomationHome;
import pageObject.MyActivityPage;
import rough.Register;
import utilities.Utils;

public class MyAccountSteps{
	
	/*
	 * public MyAccountSteps(WebDriver driver, WebDriverWait wait) { super(driver,
	 * wait); }
	 * 
	 * 
	 * @Given("User Launch browser and open URL http:\\/\\/shop.demoqa.com\\/")
	 * public void user_Launch_browser_and_open_URL_http_shop_demoqa_com() {
	 * 
	 * log.
	 * info("******************* Launch Browser and Navigate to URL *******************"
	 * ); driver.get(Utils.getProperty("url"));
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @And("User should able to see home page of the application") public void
	 * user_should_able_to_see_home_page_of_the_application() {
	 * 
	 * if(driver.getTitle().
	 * equals("ToolsQA Demo Site – ToolsQA – Demo E-Commerce Site")) {
	 * 
	 * log.info("******************* Verify Home Page *******************"); } }
	 * 
	 * @And("User should able to go the MyAccount page") public void
	 * user_should_able_to_go_the_MyAccount_page() {
	 * 
	 * log.info("******************* Go to the MyAccount page *******************");
	 * MyActivity.getInstance() myactivitypage.MyActivity(); register =
	 * myactivitypage.new Registration(); PageFactory.initElements(driver,
	 * register);
	 * 
	 * login = myactivitypage.new Login(); PageFactory.initElements(driver, login);
	 * }
	 * 
	 * @When("User Enter Username and Email and Password") public void
	 * user_Enter_Username_and_Email_and_Password() {
	 * 
	 * 
	 * log.info("******************* Entering New User Name *******************");
	 * register.setUserName(baseclass.getProp("newUserName"));
	 * 
	 * log.info("******************* Entering New Email ID *******************");
	 * register.setEmail(baseclass.getProp("newEmail"));
	 * 
	 * log.info("******************* Entering New Password *******************");
	 * register.setPassword(baseclass.getProp("newPassword")); }
	 * 
	 * @When("^User Enter Following details$") public void
	 * User_Enter_Following_details(io.cucumber.datatable.DataTable dt) {
	 * 
	 * 
	 * List<List<String>> list = dt.asLists(); for(int i=1;i<list.size();i++) {
	 * 
	 * log.info("******************* Entering New User Name *******************");
	 * register.setUserName(list.get(i).get(0));
	 * 
	 * log.info("******************* Entering New Email ID *******************");
	 * register.setEmail(list.get(i).get(1));
	 * 
	 * log.info("******************* Entering New Password *******************");
	 * register.setPassword(list.get(i).get(2)); click_on_the_Register_button(); } }
	 * 
	 * @When("^User Enter ([^\\\"]* Following details)$") public void
	 * User_Enter_Following_details(int sr, DataTable table) {
	 * 
	 * 
	 * List<Map<String,String>> lm = table.asMaps(String.class, String.class);
	 * 
	 * System.out.println("Username is : "+lm.get(sr).get("UserName"));
	 * System.out.println("Username is : "+lm.get(sr).get("EmailId"));
	 * System.out.println("Username is : "+lm.get(sr).get("Password"));
	 * log.info("******************* Entering New User Name *******************");
	 * register.setUserName(lm.get(sr).get("UserName"));
	 * 
	 * log.info("******************* Entering New Email ID *******************");
	 * register.setEmail(lm.get(sr).get("EmailId"));
	 * 
	 * log.info("******************* Entering New Password *******************");
	 * register.setPassword(lm.get(sr).get("Password"));
	 * 
	 * }
	 * 
	 * @And("click on the Register button") public void
	 * click_on_the_Register_button() {
	 * 
	 * log.info("******************* Click on Register Button *******************");
	 * register.clickRegister(); }
	 * 
	 * @Then("Verify User Already Registered and getting error message") public void
	 * Verify_User_Already_Registered() {
	 * 
	 * log.
	 * info("******************* Verify User Already Registered and getting error message *******************"
	 * ); register.Verify_User_Already_Register(); }
	 * 
	 * @Then("User should able to Register") public void
	 * user_should_able_to_Register() {
	 * 
	 * log.
	 * info("******************* Verifying user successfully register *******************"
	 * ); }
	 * 
	 * @When("User enter {string} and {string} in the Login Frame") public void
	 * user_enter_user_name_and_password_in_the_Login_Frame(String user,String pass)
	 * {
	 * 
	 * log.info("******************* Entering User Name *******************");
	 * 
	 * login.setUserName(user);
	 * 
	 * log.info("******************* Entering Password *******************");
	 * login.setPassword(pass); }
	 * 
	 * @When("^User enter Multiple ([^\"]*) and Multiple ([^\"]*)") public void
	 * user_enter_multiple_user_name_and_multiple_password_in_the_Login_Frame(String
	 * user, String pass) {
	 * 
	 * log.info("******************* Entering User Name *******************");
	 * 
	 * login.setUserName(user);
	 * 
	 * log.info("******************* Entering Password *******************");
	 * login.setPassword(pass);
	 * 
	 * }
	 * 
	 * @And("click on the Login button") public void click_on_the_Login_button() {
	 * 
	 * log.info("******************* Click on Login Button *******************");
	 * login.clickLogin(); }
	 * 
	 * @Then("User should able to login with valid credentials") public void
	 * user_should_able_to_login_with_valid_credentials() {
	 * 
	 * log.
	 * info("******************* verifying login successfully *******************");
	 * login.Verify_Login_Valid_Credentials(); }
	 * 
	 * @Then("User should not able to login and getting error message") public void
	 * user_should_not_able_to_login_with_invalid_credentials() {
	 * 
	 * log.
	 * info("******************* Verifying User unable to login and getting error message *******************"
	 * ); login.Verify_Login_Invalid_Credentials(); }
	 * 
	 * @Then("User should able to click on Dashboard menu") public void
	 * user_should_able_to_click_on_Dashboard_menu() {
	 * 
	 * log.info("******************* Go To Dashboard Menu *******************");
	 * login.Dashboard(); myactivitypage.MyActivity(); }
	 * 
	 * @Then("User should able to click on Order menu") public void
	 * user_should_able_to_click_on_Order_menu() {
	 * 
	 * log.info("******************* Go To Order Menu *******************");
	 * login.Orders(); myactivitypage.MyActivity(); }
	 * 
	 * @Then("User should able to click on Downloads menu") public void
	 * user_should_able_to_click_on_Downloads_menu() {
	 * 
	 * log.info("******************* Go To Downloads Menu *******************");
	 * login.Downloads(); myactivitypage.MyActivity(); }
	 * 
	 * @Then("User should able to click on Addresses menu") public void
	 * user_should_able_to_click_on_Addresses_menu() {
	 * 
	 * log.info("******************* Go To Addresses Menu *******************");
	 * login.Addresses(); myactivitypage.MyActivity(); }
	 * 
	 * @Then("User should able to click on Account details menu") public void
	 * user_should_able_to_click_on_Account_details_menu() {
	 * 
	 * log.info("******************* Go To Account detail Menu *******************"
	 * ); login.Accountdetails(); myactivitypage.MyActivity(); }
	 * 
	 * @Then("User should able to click on Logout menu") public void
	 * user_should_able_to_click_on_Logout_menu() throws InterruptedException {
	 * 
	 * log.info("******************* Logout from Application *******************");
	 * login.Logout(); Thread.sleep(3000);
	 * 
	 * }
	 * 
	 */}
