package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//*[@class='noo-product-thumbnail']/following-sibling::h3/a[@href='http://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/']")
	public static WebElement ProductName;

}
