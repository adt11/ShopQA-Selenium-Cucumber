package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base{
	
	
	@Before
	public void openBrowser(Scenario scenario) throws IOException {
			
		log.info("*******************Browser Initialization*******************");
		System.out.println(scenario.getName());
		//driver = BaseClass.createDriver();
		
	}
	
	@After
	public void tearoff(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
		        try {
		        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
		            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		            scenario.embed(screenshot, "image/png", "FailedScreenshot");
		        } catch (WebDriverException webdriverException) {
		            System.err.println(webdriverException.getMessage());
		        }
	        } 
		//driver.quit();
	}
	
}
