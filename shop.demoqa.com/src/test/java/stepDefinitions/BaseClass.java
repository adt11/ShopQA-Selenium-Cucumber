package stepDefinitions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.Utils;


public class BaseClass extends Base{
		
	
	public static WebDriver createDriver() {
		
		switch(Utils.getProperty("browser")) {
		
		case "chrome":
			Base.log.info("****** Chrome browser setting up for you *******");
			System.setProperty("webdriver.chrome.driver", Utils.rpath+"Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver(options);
			return Base.driver;
			
		case "firefox":
			Base.log.info("****** Firefox browser setting up for you *******");
			System.setProperty("webdriver.gecko.driver", Utils.rpath+"Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			return Base.driver;
			
		case "edge":
			Base.log.info("****** Edge browser setting up for you *******");
			System.setProperty("webdriver.ie.driver", Utils.rpath+"/Drivers/edgedriver.exe");
			driver= new EdgeDriver();
			return Base.driver;
		
		case "internet explorer":
			Base.log.info("****** Internet Explorer setting up for you *******");
			System.setProperty("webdriver.edge.driver", Utils.rpath+"/Drivers/iedriver.exe");
			driver = new InternetExplorerDriver();
			return Base.driver;
			
		default:
			Base.log.info("****** Browser selection is not defined *******");
		}
		return Base.driver;
	}
	
	
}
