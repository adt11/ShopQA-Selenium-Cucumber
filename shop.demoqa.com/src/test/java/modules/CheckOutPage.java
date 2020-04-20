package modules;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObject.MyCheckout;
import stepDefinitions.Base;

public class CheckOutPage extends Base {

	private static CheckOutPage checout = null;

	private CheckOutPage() {

		PageFactory.initElements(driver, MyCheckout.class);
	}

	public static CheckOutPage getInstance() {

		if (checout == null) {
			checout = new CheckOutPage();
		}
		return checout;
	}

	public void readyCheckout() {

		HomeMenuPage.getInstance().Checkout();
		visibleElement(MyCheckout.codText);
	}

	public void EnterFields(List<List<String>> list) {
		
		try{
			
			Fields(list);
		}catch(org.openqa.selenium.StaleElementReferenceException stale) {
			driver.navigate().refresh();
			Fields(list);
		}
	}
	
	private void Fields(List<List<String>> list) {

		for (int i = 1; i < list.size(); i++) {

			visibleElement(MyCheckout.fName);
			MyCheckout.fName.clear();
			MyCheckout.fName.sendKeys(list.get(i).get(0));
			System.out.println("First_Name " + list.get(i).get(0));

			MyCheckout.lName.clear();
			MyCheckout.lName.sendKeys(list.get(i).get(1));
			System.out.println("First_Name " + list.get(i).get(1));

			MyCheckout.cName.clear();
			MyCheckout.cName.sendKeys(list.get(i).get(2));
			System.out.println("First_Name" + list.get(i).get(2));

			MyCheckout.countrylist.click();
			visibleElement(MyCheckout.searchKey);
			MyCheckout.searchKey.sendKeys(list.get(i).get(3));
			MyCheckout.selectListIndia.click();
			System.out.println("First_Name" + list.get(i).get(3));

			visibleElement(MyCheckout.stateList);
			MyCheckout.stateList.click();
			visibleElement(MyCheckout.searchKey);
			MyCheckout.searchKey.sendKeys(list.get(i).get(7));
			MyCheckout.selectList.click();
			System.out.println("First_Name" + list.get(i).get(7));

			MyCheckout.billing_address_1.clear();
			MyCheckout.billing_address_1.sendKeys(list.get(i).get(4));
			System.out.println("First_Name" + list.get(i).get(4));

			MyCheckout.billing_address_2.clear();
			MyCheckout.billing_address_2.sendKeys(list.get(i).get(5));
			System.out.println("First_Name" + list.get(i).get(5));

			MyCheckout.billing_city.clear();
			MyCheckout.billing_city.sendKeys(list.get(i).get(6));
			System.out.println("First_Name" + list.get(i).get(6));

			MyCheckout.billing_postcode.clear();
			MyCheckout.billing_postcode.sendKeys(list.get(i).get(8));
			System.out.println("First_Name" + list.get(i).get(8));

			MyCheckout.billing_phone.clear();
			MyCheckout.billing_phone.sendKeys(list.get(i).get(9));
			System.out.println("First_Name" + list.get(i).get(9));

			MyCheckout.billing_email.clear();
			MyCheckout.billing_email.sendKeys(list.get(i).get(10));
			System.out.println("First_Name" + list.get(i).get(10));

			MyCheckout.order_comments.clear();
			MyCheckout.order_comments.sendKeys(list.get(i).get(11));
			System.out.println("First_Name" + list.get(i).get(11));
		}

	}

	public void checkout_Create_Account() {

		MyCheckout.createaccountCheck.click();
	}

	public void place_order() {

		Actions actions = new Actions(driver);
		actions.moveToElement(MyCheckout.termsCheck).click().build().perform();
		
		actions.moveToElement(MyCheckout.place_orderBtn).click().build().perform();
		

	}

	public void verify_Order_Placed() {

		visibleElement(MyCheckout.confirmText);
		Assert.assertTrue(MyCheckout.confirmText.getText().contains("Thank you. Your order has been received."));
	}

	
}
