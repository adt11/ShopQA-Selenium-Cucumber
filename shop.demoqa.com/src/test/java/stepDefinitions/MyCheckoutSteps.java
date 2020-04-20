package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.CheckOutPage;

public class MyCheckoutSteps extends Base {
	
	
	@When("User go to the checkout page")
	public void user_go_to_the_checkout_page() {

		log.info("******************* Go to the Checkout Page *******************");
		CheckOutPage.getInstance().readyCheckout();
	}

	@And("User billing address as follows")
	public void User_billing_address_as_follows(io.cucumber.datatable.DataTable dt) throws InterruptedException {
		
		log.info("******************* Filling user billing details *******************");
		
		CheckOutPage.getInstance().EnterFields(dt.asLists());
		Thread.sleep(3000);
	}
	
	@When("click terms and click place order")
	public void click_create_account_and_click_place_order() {
	   
		log.info("******************* Submit to Place order *******************");
		CheckOutPage.getInstance().place_order();
		
	}

	@Then("User should able to place order successfully")
	public void user_should_able_to_place_order_successfully() {
	   
		log.info("******************* verifying order placed *******************");
		CheckOutPage.getInstance().verify_Order_Placed();
	}
}
