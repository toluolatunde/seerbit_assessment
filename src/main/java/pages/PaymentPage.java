package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseContainer.TestBase;
import utilites.utility;


public class PaymentPage extends TestBase{
	
	utility utils = new utility();
	
	String createPayment = OR.getProperty("createPaymentBtn");
	
	String pageName = OR.getProperty("pageName");
	
	String checkboxAmount = OR.getProperty("checkboxAmount");
	
	String closeDialog = OR.getProperty("closeDialog");
	
    String amountFld = OR.getProperty("amountField");
    
    String submitLink = OR.getProperty("submitBtn");
    
    
    public PaymentPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    public void clickCreatePayment() throws Exception {
    	driver.findElement(By.xpath(createPayment)).click();
    	
    }
    
    public void inputPageName() throws Exception {
    	
    	Random rand = new Random();
 	   
        // Generate random integers in range 0 to 999
        int randInt = rand.nextInt(1000);
        String name = "Testing"+randInt;
        
    	driver.findElement(By.name(pageName)).click();
    	System.out.println("name is: "+ name);
    	driver.findElement(By.name(pageName)).sendKeys(name);
    }
    
    public void checkAmountBox() throws Exception {
    	driver.findElement(By.xpath(checkboxAmount)).click();
    	//driver.findElement(By.id(emailField)).sendKeys(utils.fetchData(emailaddress));
    }
//    
    public void closeDialog() throws Exception {
    	driver.findElement(By.xpath(closeDialog)).click();
    	//driver.findElement(By.id(bnameField)).sendKeys(utils.fetchData(businessName));
    }
//   
    public void inputAmount(String Amount) throws Exception {
    	driver.findElement(By.xpath(amountFld)).click();
    	driver.findElement(By.xpath(amountFld)).sendKeys(utils.fetchData(Amount));
    }
    
    public void selectCurrency() throws Exception {
    	Select currency = new Select(driver.findElement(By.name("currency")));
    	currency.selectByVisibleText("Naira");
    }

    public void clickSubmit() throws Exception {
    	driver.findElement(By.xpath(submitLink)).click();
    }

}
