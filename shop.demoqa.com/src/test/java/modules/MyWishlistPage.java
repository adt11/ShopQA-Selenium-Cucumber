package modules;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObject.HomeMenu;
import pageObject.MyWishlist;
import stepDefinitions.Base;

public class MyWishlistPage extends Base {
	
	public static MyWishlistPage mywishlistpage = null;
		
	private MyWishlistPage() {
		
		super(driver, wait);
		PageFactory.initElements(driver, MyWishlist.class);
		PageFactory.initElements(driver, HomeMenu.class);
	}
	
	public static MyWishlistPage getInstance() {
		
		if(mywishlistpage==null) {
			mywishlistpage = new MyWishlistPage();
		}
		return mywishlistpage;
	}
	
	
	
	public void add_Wish_List() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(listProductName));
		MyWishlist.listProductName.click();
		//wait.until(ExpectedConditions.visibilityOf(addWish));
		MyWishlist.addWish.click();
	}
	
	public void verify_Item_Wish_List() {
		
		HomeMenu.menuWishList.click();
		if(!MyWishlist.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST")) {
			
			Assert.assertTrue(MyWishlist.verifyproductName.getText().contains("PINK DROP SHOULDER OVERSIZED T SHIRT"));
			
		}else {
			System.out.println("List Empty");
		}
	}
	
	public void Item_Remove_Wish_List() {
			
		MyWishlist.removeItemWishList.click();
				
	}
	
	public void verify_Item_Removed_Wish_List() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(MyWishlist.isWishListEmpty));
		Assert.assertTrue(MyWishlist.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST"));
		Thread.sleep(3000);
			
	}

}
