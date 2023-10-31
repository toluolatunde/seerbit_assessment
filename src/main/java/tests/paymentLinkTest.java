package tests;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.PaymentPage;
import pages.loginPage;
import pages.paymentLinkPage;

public class paymentLinkTest extends TestBase{
	
	@Test(priority=1)
	public void testPaymenyLink() throws Exception {
		//Navigate to Sign Up Page
		driver.get(config.getProperty("paymentLink"));
		Thread.sleep(5000);
		paymentLinkPage actn = new paymentLinkPage();
		Thread.sleep(5000);
		actn.inputFirstName();
		Thread.sleep(5000);
		actn.inputFirstName();
		Thread.sleep(5000);
		actn.inputEmailAddress();
		Thread.sleep(5000);
		actn.clickSubmit();
		Thread.sleep(5000);
		actn.clickDisplayTestCard();
		Thread.sleep(5000);
		actn.selectTestCard();
		Thread.sleep(5000);
		actn.payPrice();
		Thread.sleep(5000);
		actn.authorizePayment();
		Thread.sleep(5000);
		actn.submitAuthorization();
	}

}
