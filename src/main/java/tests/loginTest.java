package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.loginPage;

public class loginTest extends TestBase{
	
	
	@Test(dataProvider = "LoginData",priority=0)
	public void validLogin(String email, String password) throws Exception {
		Thread.sleep(5000);
		loginPage actn = new loginPage(driver);
		Thread.sleep(5000);
		actn.inputEmail(email);
		Thread.sleep(5000);
		actn.inputPassword(password);
		Thread.sleep(5000);
		actn.clickLogin();
	}
	
	
	@DataProvider(name = "LoginData")
    public Object[][] testData() throws Exception
    {
        return new Object[][]
                {
        				{"email", "password"},
        				
                };
    }

}
