package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCart {
	
	
	@FindBy(xpath = "//*[@id='pa_color']")
	public static WebElement selectColor;
	
	@FindBy(xpath="//*[@id='pa_size']")
	public static WebElement selectSize;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::button[@class='qty-decrease']")
	public static WebElement qtyDecr;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::button[@class='qty-increase']")
	public static WebElement qtyIncr;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::input[@id='noo-quantity-4155']")
	public static WebElement qtyTxt;
	
	@FindBy(xpath="//*[@class='quantity']/following::button[@type='submit']")
	public static WebElement addCart;
	
	@FindBy(xpath="//*[@href='http://shop.demoqa.com/cart/' and @class='button wc-forward']")
	public static WebElement viewCart;
	
	@FindBy(xpath="//*[@class='product-name' and @data-title='Product']/child::a")
	public static WebElement verifyCart;
	
	@FindBy(xpath="//*[@class='product-remove']/child::a")
	public static WebElement removeCart;
	
	@FindBy(xpath="//*[@class='button wc-backward']")
	public static WebElement verifyRemoved;
	

}
