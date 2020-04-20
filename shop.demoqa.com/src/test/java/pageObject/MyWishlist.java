package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlist {
	
	
	@FindBy(xpath="//*[@data-product-id='1497']")
	public static WebElement addWish;
	
	@FindBy(xpath="//*[@class='remove remove_from_wishlist']/self::*")
	public static WebElement removeItemWishList;
	
	@FindBy(xpath="//*[@class='product-name']/descendant::a")
	public static WebElement verifyproductName;
	
	@FindBy(xpath="//*[@class='wishlist-items-wrapper']/child::tr/td")
	public static WebElement isWishListEmpty;
	
}
