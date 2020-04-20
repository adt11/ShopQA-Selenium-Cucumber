package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.HomePage;
import modules.MyCartPage;

public class MyCartSteps extends Base {
	
	@When("User select item and add to cart")
	public void user_select_item_and_add_to_cart() {
	   
		log.info("******************* Add Item to My Cart *******************");
		HomePage.getInstance().selectItem();
		MyCartPage.getInstance().addItemCart();
	}

	@Then("Verify item should added to the cart")
	public void verify_item_should_added_to_the_cart() {
		
		log.info("******************* Verify Item addede to cart *******************");
		MyCartPage.getInstance().VerifyAddedCart();
	}

	@When("User click cross button to remove item from cart")
	public void user_click_cross_button_to_remove_item_from_cart() {
	    
		log.info("******************* Removing item from cart *******************");
		MyCartPage.getInstance().RemoveCart();
	}

	@Then("Verify item should removed from the cart")
	public void verify_item_should_removed_from_the_cart() {
	    
		log.info("******************* Verify item removed from cart *******************");
		MyCartPage.getInstance().verifyRemovedCart();
	}

}
