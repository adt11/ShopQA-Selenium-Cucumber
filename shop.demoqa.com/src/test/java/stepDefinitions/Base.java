package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utils;

public class Base {
	
	public static Logger log = Utils.LogInfo();
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void ElementClickable(WebElement element) {
		waitInit();
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void visibleElement(WebElement element) {
		waitInit();
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void isClickable(WebElement e) {
		
		waitInit();
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
	
	private void waitInit() {
		wait = new WebDriverWait(driver,120);
	}

}
