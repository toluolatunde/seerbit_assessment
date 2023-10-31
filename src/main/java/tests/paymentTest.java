package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.loginPage;
import pages.PaymentPage;

public class paymentTest extends TestBase{
//	@Test(priority=0)
//	public void navigateToSignUp() throws Exception {
//		
//	}
	
	@Test(priority=1)//dataProvider = "SignUpData"
	public void createPaymentLink() throws Exception {
		//Navigate to Sign Up Page
		Thread.sleep(5000);
		loginPage actn = new loginPage(driver);
		Thread.sleep(5000);
		actn.inputEmail("email");
		Thread.sleep(5000);
		actn.inputPassword("password");
		Thread.sleep(5000);
		actn.clickLogin();
		PaymentPage act = new PaymentPage(driver);
		Thread.sleep(10000);
		act.closeDialog();
		driver.get(config.getProperty("testsiteurl"));
		Thread.sleep(10000);
		act.clickCreatePayment();
		Thread.sleep(1000);
		act.inputPageName();
		Thread.sleep(1000);
		act.checkAmountBox();
		Thread.sleep(1000);
		act.inputAmount("amount");
		Thread.sleep(1000);
		act.selectCurrency();
		Thread.sleep(1000);
		act.clickSubmit();
		Thread.sleep(10000);
	}
}