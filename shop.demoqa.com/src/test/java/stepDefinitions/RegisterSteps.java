package stepDefinitions;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.MyAccountPage;

public class RegisterSteps extends Base{
	
	//MyAccountPage myaccount = MyAccountPage.getInstance(driver);;
	
	@When("User Enter {string} and {string} and {string}")
	public void user_Enter_Username_and_Email_and_Password(String user,String emailId,String pass) {
	    
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance().setRegUserName(user);
		
		log.info("******************* Entering User Name *******************");
		
		MyAccountPage.getInstance().setEmail(emailId);
		
		log.info("******************* Entering Password *******************");
		
		MyAccountPage.getInstance().setRegPassword(pass);
		
	}
	
	@When("^User Enter Following details$")
	public void User_Enter_Following_details(io.cucumber.datatable.DataTable dt) {
	    
		
		List<List<String>> list = dt.asLists();
		for(int i=1;i<list.size();i++) {
									
			log.info("******************* Entering New User Name *******************");
			MyAccountPage.getInstance().setRegUserName(list.get(i).get(0));
			
			log.info("******************* Entering New Email ID *******************");
			MyAccountPage.getInstance().setEmail(list.get(i).get(1));
			
			log.info("******************* Entering New Password *******************");
			MyAccountPage.getInstance().setRegPassword(list.get(i).get(2));
			
		}
	}
	
	@When("^User Enter ([^\"]*) Following details$")
	public void User_Enter_Following_details(String sr, DataTable table) {
	    
		
		List<Map<String,String>> lm = table.asMaps(String.class, String.class);
											
		System.out.println("Username is : "+lm.get(Integer.parseInt(sr)-1).get("UserName"));
		System.out.println("Username is : "+lm.get(Integer.parseInt(sr)-1).get("EmailId"));
		System.out.println("Username is : "+lm.get(Integer.parseInt(sr)-1).get("Password"));
			log.info("******************* Entering New User Name *******************");
			MyAccountPage.getInstance().setRegUserName(lm.get(Integer.parseInt(sr)-1).get("UserName"));
			
			log.info("******************* Entering New Email ID *******************");
			MyAccountPage.getInstance().setEmail(lm.get(Integer.parseInt(sr)-1).get("EmailId"));
			
			log.info("******************* Entering New Password *******************");
			MyAccountPage.getInstance().setRegPassword(lm.get(Integer.parseInt(sr)-1).get("Password"));
		
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

	@Then("User should able to Register successfully")
	public void user_should_able_to_Register() {
	    
		log.info("******************* Verifying user successfully register *******************");
	}
	

}
