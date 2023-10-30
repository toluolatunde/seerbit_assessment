package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilites.utility;


public class loginPage extends TestBase{
	
	utility utils = new utility();
	
    String emailField = OR.getProperty("emailField");

    String passwordField = OR.getProperty("passwordFld");

    String loginBtn = OR.getProperty("submitBtn");
    
    String clickSignup = OR.getProperty("signUpBtn");
    
    public loginPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    
    public void inputEmail(String username) throws Exception {
    	driver.findElement(By.cssSelector(emailField)).click();
    	driver.findElement(By.cssSelector(emailField)).sendKeys(utils.fetchData(username));
    }
    
    public void inputPassword(String password) throws Exception {
    	driver.findElement(By.cssSelector(passwordField)).click();
    	driver.findElement(By.cssSelector(passwordField)).sendKeys(utils.fetchData(password));
    }
    
    public void clickLogin() throws InterruptedException {
    	Thread.sleep(500);
    	driver.findElement(By.xpath(loginBtn)).click();
    }
    
    public void clearEmailField() {
    	driver.findElement(By.cssSelector(emailField)).clear();
    }
    
    public void clearPswdField() {
    	driver.findElement(By.cssSelector(passwordField)).clear();
    }
    
    public void NaviatetoSignUp() {
    	//driver.switchTo().frame(4);
    	driver.findElement(By.xpath(clickSignup)).click();
    }

}
