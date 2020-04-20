package modules;

import org.openqa.selenium.support.PageFactory;
import pageObject.HomeMenu;
import stepDefinitions.Base;

public class HomeMenuPage extends Base{
	
	private static HomeMenuPage homemenupage = null;
	
	private HomeMenuPage() {
		
		PageFactory.initElements(driver, HomeMenu.class);

	}
	
	public static HomeMenuPage getInstance() {
		
		if(homemenupage==null) {
			homemenupage = new HomeMenuPage();
		}
		return homemenupage;
	}
	
	public void MyAccount() {
		
		visibleElement(HomeMenu.menuMyAccount);
		HomeMenu.menuMyAccount.click();
	}
	
	public void MyWishlist() {
			
		visibleElement(HomeMenu.menuWishList);
		HomeMenu.menuWishList.click();
	}
	
	public void Checkout() {
		
		visibleElement(HomeMenu.menuCheckout);
		HomeMenu.menuCheckout.click();
	}
	
	public void Cart() {
		
		visibleElement(HomeMenu.menuCart);
		HomeMenu.menuCart.click();
	}
	
	public void HomeLogo() {
		
		visibleElement(HomeMenu.menuHomeLogo);
		HomeMenu.menuHomeLogo.click();
	}
	
	public void Home_Page() {
		
		visibleElement(HomeMenu.homePage);
		HomeMenu.homePage.click();
	}
	
	public void Search(String text) {
		
		visibleElement(HomeMenu.menuSearchBtn);
		HomeMenu.menuSearchBtn.click();
		visibleElement(HomeMenu.menuSearchText);
		HomeMenu.menuSearchText.sendKeys(text);
	}

}
