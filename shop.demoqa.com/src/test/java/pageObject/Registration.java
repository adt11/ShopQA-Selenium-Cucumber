package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

	@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_username']")
	public static WebElement reguserName;
	
	@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_email']")
	public static WebElement regemail;
	
	@FindBy(xpath="//*[@class='woocommerce-Input woocommerce-Input--text input-text' and @id='reg_password']")
	public static WebElement regpassword;
	
	@FindBy(xpath="//*[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit' and @name='register']")
	public static WebElement registerBtn;
	
	@FindBy(xpath="//*[@class='woocommerce-error' and @role='alert']/li/child::strong")
	public static WebElement ErrorMessage;
}
