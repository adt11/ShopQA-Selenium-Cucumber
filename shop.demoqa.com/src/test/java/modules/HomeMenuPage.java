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
		
		HomeMenu.menuMyAccount.click();
	}
	
	public void MyWishlist() {
			
		HomeMenu.menuWishList.click();
	}
	
	public void Checkout() {
		
		HomeMenu.menuCheckout.click();
	}
	
	public void Cart() {
		
		HomeMenu.menuMyAccount.click();
	}
	
	public void HomeLogo() {
		
		HomeMenu.menuHomeLogo.click();
	}
	
	public void Home_Page() {
		
		HomeMenu.homePage.click();
	}
	
	public void Search(String text) {
		
		HomeMenu.menuSearchBtn.click();
		HomeMenu.menuSearchText.sendKeys(text);
	}

}
