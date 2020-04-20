package modules;

import org.openqa.selenium.support.PageFactory;

import pageObject.Home;
import stepDefinitions.Base;

public class HomePage extends Base{
	
private static HomePage home = null;
	
	private HomePage() {
		
		PageFactory.initElements(driver, Home.class);
	}
	
	public static HomePage getInstance() {
		
		if(home==null) {
			home = new HomePage();
		}
		return home;
	}
	
	public HomePage selectItem() {
		
		visibleElement(Home.ProductName);
		Home.ProductName.click();
		return home;
	}

}
