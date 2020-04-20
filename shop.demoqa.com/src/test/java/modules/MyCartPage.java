package modules;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObject.MyCart;
import stepDefinitions.Base;

public class MyCartPage extends Base {
	
	private static MyCartPage cart = null;
	
	private MyCartPage() {
		
		PageFactory.initElements(driver, MyCart.class);
	}
	
	public static MyCartPage getInstance() {
		
		if(cart==null) {
			cart = new MyCartPage();
		}
		return cart;
	}
	
	public MyCartPage addItemCart() {
		
		visibleElement(MyCart.selectColor);
		Select color = new Select(MyCart.selectColor);
		color.selectByValue("pink");
		Select siz = new Select(MyCart.selectSize);
		siz.selectByValue("37");
		MyCart.addCart.click();
		return cart;
	}
	
	public MyCartPage VerifyAddedCart() {
		
		HomeMenuPage.getInstance().Cart();
		visibleElement(MyCart.verifyCart);
		//Cart.viewCart.click();
		Assert.assertTrue(MyCart.verifyCart.getText().contains("PINK DROP SHOULDER OVERSIZED T SHIRT - PINK"));
		
		return cart;
	}
	
	public MyCartPage RemoveCart() {
		
		HomeMenuPage.getInstance().Cart();
		MyCart.removeCart.click();
		
		return cart;
	}


	public MyCartPage verifyRemovedCart() {
	
	HomeMenuPage.getInstance().Cart();
	visibleElement(MyCart.verifyRemoved);
	Assert.assertTrue(MyCart.verifyRemoved.getText().contains("RETURN TO SHOP"));
	
	return cart;
}


}
