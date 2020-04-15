package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utils;

public class Base {
	
	public static Logger log = Utils.LogInfo();
	public static WebDriver driver;
	public static WebDriverWait wait;
	

}
