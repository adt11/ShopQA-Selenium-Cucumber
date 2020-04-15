package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlist {
	
	@FindBy(xpath="//*[@class='noo-loop-cart']/a[@class='button product_type_variable add_to_cart_button' and @data-product_id='1497']")
	public static WebElement selectItem;
	
	@FindBy(xpath="//*[@data-product-id='1497']")
	public static WebElement addWish;
	
	@FindBy(xpath="//*[@class='remove remove_from_wishlist']/self::*")
	public static WebElement removeItemWishList;
	
	@FindBy(xpath="//*[@class='product-name']/descendant::a")
	public static WebElement verifyproductName;
	
	@FindBy(xpath="//*[@class='noo-product-thumbnail']/following-sibling::h3/a[@href='http://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/']")
	public static WebElement listProductName;
	
	@FindBy(xpath="//*[@class='wishlist-items-wrapper']/child::tr/td")
	public static WebElement isWishListEmpty;
	
}
