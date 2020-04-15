package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginIN {
	
	@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='username']")
	public static WebElement userName;
	
	@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='password']")
	public static WebElement password;
	
	@FindBy(xpath="//*[@class='woocommerce-button button woocommerce-form-login__submit' and @name='login']")
	public static WebElement loginBtn;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-content']/descendant::p/strong[1]")
	public static WebElement verifyText;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[1]/a")
	public static WebElement dashboard;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[2]/a")
	public static WebElement order;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[3]/a")
	public static WebElement download;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[4]/a")
	public static WebElement adresses;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[5]/a")
	public static WebElement account;
	
	@FindBy(xpath="//*[@class='woocommerce-MyAccount-navigation']/ul/child::li[6]/a")
	public static WebElement logout;
	

	
	@FindBy(xpath="//*[@class='woocommerce-error']/li/strong")
	public static WebElement ErrorMessage;

}
