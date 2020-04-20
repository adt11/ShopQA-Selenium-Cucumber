package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.HomePage;
import modules.MyWishlistPage;

public class MyWishlistSteps extends Base{
	
	@When("User select item and add to wish list")
	public void user_select_item_and_add_to_wish_list() {
	    
		log.info("******************* Add Item to My Wishlist *******************");
		HomePage.getInstance().selectItem();
		MyWishlistPage.getInstance().add_Wish_List();
	}

	@Then("Verify item should added to the wish list")
	public void verify_item_should_added_to_the_wish_list() {
		
		log.info("******************* Verify item added to mywishlist *******************");
		MyWishlistPage.getInstance().verify_Item_Wish_List();;
	}

	@When("User click cross button to remove item from wish list")
	public void user_click_cross_button_to_remove_item_from_wish_list() {
	    
		log.info("******************* Removing item from mywishlist *******************");
		MyWishlistPage.getInstance().Item_Remove_Wish_List();
	}

	@Then("Verify item should removed from the wish list")
	public void verify_item_should_removed_from_the_wish_list() {
		
		log.info("******************* Verify item removed *******************");
		MyWishlistPage.getInstance().verify_Item_Removed_Wish_List();
	}

}
