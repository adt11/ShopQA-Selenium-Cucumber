package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.datatable.DataTable;
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

public class RegisterSteps extends Base{
	
	

	
	@When("User Enter Username and Email and Password")
	public void user_Enter_Username_and_Email_and_Password(String user,String emailId,String pass) {
	    
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance(driver).setUserName("register", user);
		
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance(driver).setEmail(emailId);
		
		log.info("******************* Entering Password *******************");
		
		MyAccountPage.getInstance(driver).setPassword("register", pass);
		
	}
	
	@When("^User Enter Following details$")
	public void User_Enter_Following_details(io.cucumber.datatable.DataTable dt) {
	    
		
		List<List<String>> list = dt.asLists();
		for(int i=1;i<list.size();i++) {
									
			log.info("******************* Entering New User Name *******************");
			MyAccountPage.getInstance().setUserName("register", list.get(i).get(0));
			
			log.info("******************* Entering New Email ID *******************");
			MyAccountPage.getInstance().setEmail(list.get(i).get(1));
			
			log.info("******************* Entering New Password *******************");
			MyAccountPage.getInstance().setPassword("register",list.get(i).get(2));
			
		}
	}
	
	@When("^User Enter ([^\\\"]* Following details)$")
	public void User_Enter_Following_details(int sr, DataTable table) {
	    
		
		List<Map<String,String>> lm = table.asMaps(String.class, String.class);
											
		System.out.println("Username is : "+lm.get(sr).get("UserName"));
		System.out.println("Username is : "+lm.get(sr).get("EmailId"));
		System.out.println("Username is : "+lm.get(sr).get("Password"));
			log.info("******************* Entering New User Name *******************");
			MyAccountPage.getInstance().setUserName("register",lm.get(sr).get("UserName"));
			
			log.info("******************* Entering New Email ID *******************");
			MyAccountPage.getInstance().setEmail(lm.get(sr).get("EmailId"));
			
			log.info("******************* Entering New Password *******************");
			MyAccountPage.getInstance().setPassword("register",lm.get(sr).get("Password"));
		
	}

	@And("click on the Register button")
	public void click_on_the_Register_button() {
	    
		log.info("******************* Click on Register Button *******************");
		MyAccountPage.getInstance().clickRegister();
	}
	
	@Then("Verify User Already Registered and getting error message")
	public void Verify_User_Already_Registered() {
	    
		log.info("******************* Verify User Already Registered and getting error message *******************");
		MyAccountPage.getInstance().Verify_User_Already_Register();
	}

	@Then("User should able to Register")
	public void user_should_able_to_Register() {
	    
		log.info("******************* Verifying user successfully register *******************");
	}
	

}
