package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMenu {

	@FindBy(xpath="//*[@class='navbar-logo']/child::*")
	public static WebElement menuHomeLogo;
	
	@FindBy(xpath="//*[@href='http://shop.demoqa.com/' and @rel='home']")
	public static WebElement homePage;
	
	@FindBy(xpath="//*[@href='http://shop.demoqa.com/wishlist/']")
	public static WebElement menuWishList;
	
	@FindBy(xpath="//*[@href='http://shop.demoqa.com/checkout/']")
	public static WebElement menuCheckout;
	
	@FindBy(xpath="//*[@class='noo-search']")
	public static WebElement menuSearchBtn;
	
	@FindBy(xpath="//*[@class='form-control' and @type='search']")
	public static WebElement menuSearchText;
	
	@FindBy(xpath="//*[@class='pull-right noo-topbar-right']/li/a[@href='http://shop.demoqa.com/my-account/']")
	public static WebElement menuMyAccount;
	
	@FindBy(xpath="//*[@class='cart-name-and-total']/child::*")
	public static WebElement menuCart;
}
