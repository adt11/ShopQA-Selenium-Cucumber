package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationHome {
	
	WebDriver ldriver;
	WebDriverWait wait;
	
	public AutomationHome(WebDriver rdriver) {
		ldriver = rdriver;
		wait = new WebDriverWait(ldriver, 200);
	}

	
	@FindBy(xpath="//*[@class='noo-loop-cart']/a[@class='button product_type_variable add_to_cart_button' and @data-product_id='1497']")
	WebElement selectItem;
	
	@FindBy(xpath="//*[@data-product-id='1497']")
	WebElement addWish;
	
	@FindBy(xpath="//*[@class='remove remove_from_wishlist']/self::*")
	WebElement removeItemWishList;
	
	@FindBy(xpath="//*[@class='product-name']/descendant::a")
	WebElement verifyproductName;
	
	@FindBy(xpath="//*[@class='noo-product-thumbnail']/following-sibling::h3/a[@href='http://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/']")
	WebElement listProductName;
	
	@FindBy(xpath="//*[@class='wishlist-items-wrapper']/child::tr/td")
	WebElement isWishListEmpty;
	
	@FindBy(xpath="//*[@class='woocommerce product compare-button']/child::a[@data-product_id='1497']")
	WebElement hoverCompare1;
	
	@FindBy(xpath="//*[@class='woocommerce product compare-button']/child::a[@data-product_id='1479']")
	WebElement hoverCompare2;
	
	@FindBy(xpath="//*[@class='noo-quick-view icon_zoom-in_alt']/self::*")
	WebElement hoverzoomIN;
	
	@FindBy(xpath="//*[@class='quick-view-wrap']/child::div/div[@class='quick-right']/child::a")
	WebElement SelectOption;
	
	@FindBy(xpath = "//*[@id='pa_color']")
	WebElement selectColor;
	
	@FindBy(xpath="pa_size")
	WebElement selectSize;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::button[@class='qty-decrease']")
	WebElement qtyDecr;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::button[@class='qty-increase']")
	WebElement qtyIncr;
	
	@FindBy(xpath="//*[@class='noo-quantity-attr']/child::input[@id='noo-quantity-4155']")
	WebElement qtyTxt;
	
	@FindBy(xpath="//*[@class='quantity']/following::button[@type='submit']")
	WebElement addCart;
	
	
	@FindBy(xpath="//*[@class='quantity']/following::div[@class='yith-wcwl-add-to-wishlist  wishlist-fragment on-first-load add-to-wishlist-1497']/following::a[@href='http://shop.demoqa.com?action=yith-woocompare-add-product&id=1497']")
	WebElement compare;
	
	
	public void add_Wish_List() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(listProductName));
		listProductName.click();
		//wait.until(ExpectedConditions.visibilityOf(addWish));
		addWish.click();
	}
	
	public void verify_Item_Wish_List() {
		
		this.menuWishList.click();
		if(!this.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST")) {
			
			Assert.assertTrue(this.verifyproductName.getText().contains("PINK DROP SHOULDER OVERSIZED T SHIRT"));
			
		}else {
			System.out.println("List Empty");
		}
	}
	
	public void Item_Remove_Wish_List() {
			
		this.removeItemWishList.click();
				
	}
	
	public void verify_Item_Removed_Wish_List() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(isWishListEmpty));
		Assert.assertTrue(this.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST"));
		Thread.sleep(3000);
			
	}
	
	public void compareProduct() {
		
		
	}
	
	public void zoomIN() {
		
		
	}

}
