package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCheckout {
	
	@FindBy(id="billing_first_name")
	public static WebElement fName;
	
	@FindBy(id="billing_last_name")
	public static WebElement lName;
	
	@FindBy(id="billing_company")
	public static WebElement cName;
	
	@FindBy(id="billing_address_1")
	public static WebElement billing_address_1;
	
	@FindBy(id="billing_address_2")
	public static WebElement billing_address_2;
	
	@FindBy(id="billing_city")
	public static WebElement billing_city;
	
	@FindBy(id="billing_postcode")
	public static WebElement billing_postcode;
	
	@FindBy(id="billing_phone")
	public static WebElement billing_phone;
	
	@FindBy(id="billing_email")
	public static WebElement billing_email;
	
	@FindBy(id="createaccount")
	public static WebElement createaccountCheck;
	
	@FindBy(id="order_comments")
	public static WebElement order_comments;
	
	@FindBy(id="terms")
	public static WebElement termsCheck;
	
	@FindBy(id="place_order")
	public static WebElement place_orderBtn;
	
	@FindBy(id="select2-billing_country-container")
	public static WebElement countrylist;
	
	@FindBy(xpath="//*[@class='select2-search__field']")
	public static WebElement searchKey;
	
	@FindBy(xpath="//*[@class='select2-results__options']/child::li[2]")
	public static WebElement selectListIndia;
	
	@FindBy(xpath="//*[@class='select2-results__options']/child::li")
	public static WebElement selectList;
	
	@FindBy(id="select2-billing_state-container")
	public static WebElement stateList;
	
	@FindBy(xpath="//*[@class='woocommerce-thankyou-order-received']")
	public static WebElement confirmText;
	
	@FindBy(xpath="//*[@class='payment_box payment_method_cod']/child::p")
	public static WebElement codText;
	
	//Thank you. Your order has been received.


	
	
}
