package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilites.utility;

public class paymentLinkPage extends TestBase{
	
	utility utils = new utility();
	
	String firstNameField = OR.getProperty("fName");
	
	String lastNameField = OR.getProperty("lName");
	
	String emailField = OR.getProperty("email");
	
	String submitBtn = OR.getProperty("submitBtn");
	
	String displayTestCardsBtn = OR.getProperty("displayTestCardsBtn");
	
	String selectCard = OR.getProperty("cardSelection");
	
	String payButton = OR.getProperty("payButton");
	
	String submitAuth = OR.getProperty("submitButton");
	
	
	
	//cardSelection
	
	public void PaymentLinkPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
	 public void inputFirstName() throws Exception {
	    	
	    	Random rand = new Random();
	 	   
	        // Generate random integers in range 0 to 999
	        int randInt = rand.nextInt(1000);
	        String name = "Testing"+randInt;
	        driver.switchTo().frame(0);
	        //driver.switchTo().frame("seerbit-frame");
	    	driver.findElement(By.id(firstNameField)).click();
	    	System.out.println("name is: "+ name);
	    	driver.findElement(By.id(firstNameField)).sendKeys(name);
	    }
 
	 public void inputlastName() throws Exception {
	    	
	    	Random rand = new Random();
	 	   
	        // Generate random integers in range 0 to 999
	        int randInt = rand.nextInt(1000);
	        String name = "Testing"+randInt;
	        
	    	driver.findElement(By.id(lastNameField)).click();
	    	System.out.println("name is: "+ name);
	    	driver.findElement(By.id(lastNameField)).sendKeys(name);
	    }
	 
	 public void inputEmailAddress() throws Exception {
	    	
	    	Random rand = new Random();
	 	   
	        // Generate random integers in range 0 to 999
	        int randInt = rand.nextInt(1000);
	        String email = "Testing"+randInt + "@yopmail.com";
	        
	    	driver.findElement(By.id(emailField)).click();
	    	System.out.println("name is: "+ email);
	    	driver.findElement(By.id(emailField)).sendKeys(email);
	    }
	 
	 public void clickSubmit() throws Exception {
	    	driver.findElement(By.xpath(submitBtn)).click();
	    }
	 
	 public void clickDisplayTestCard() throws Exception {
	    	driver.findElement(By.xpath(displayTestCardsBtn)).click();
	    }
	 
	 public void selectTestCard() throws Exception {
	    	driver.findElement(By.xpath(selectCard)).click();
	    }
	 
	 public void payPrice() throws Exception {
	    	driver.findElement(By.xpath(payButton)).click();
	    }
	 
	 public void authorizePayment() throws Exception {
	    	driver.findElement(By.xpath(payButton)).click();
	    }
	 
	 public void submitAuthorization() throws Exception {
	    	driver.findElement(By.xpath(submitAuth)).click();
	    }
	 
	 


}
