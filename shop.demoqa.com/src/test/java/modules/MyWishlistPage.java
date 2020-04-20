package modules;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObject.MyWishlist;
import stepDefinitions.Base;

public class MyWishlistPage extends Base {
	
	private static MyWishlistPage mywishlistpage = null;
		
	private MyWishlistPage() {
		
		PageFactory.initElements(driver, MyWishlist.class);
	}
	
	public static MyWishlistPage getInstance() {
		
		if(mywishlistpage==null) {
			mywishlistpage = new MyWishlistPage();
		}
		return mywishlistpage;
	}
	
	
	public void add_Wish_List() {
		
		visibleElement(MyWishlist.addWish);
		MyWishlist.addWish.click();
	}
	
	public void verify_Item_Wish_List() {
		
		HomeMenuPage.getInstance().MyWishlist();
		if(!MyWishlist.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST")) {
			
			Assert.assertTrue(MyWishlist.verifyproductName.getText().contains("PINK DROP SHOULDER OVERSIZED T SHIRT"));
			
		}else {
			System.out.println("List Empty");
		}
	}
	
	public void Item_Remove_Wish_List() {
			
		visibleElement(MyWishlist.removeItemWishList);
		MyWishlist.removeItemWishList.click();
				
	}
	
	public void verify_Item_Removed_Wish_List() {
		
		visibleElement(MyWishlist.isWishListEmpty);
		Assert.assertTrue(MyWishlist.isWishListEmpty.getText().contains("NO PRODUCTS ADDED TO THE WISHLIST"));
			
	}

}
