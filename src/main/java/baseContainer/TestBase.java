package baseContainer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.utility;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static Properties OR  = new Properties();
	public static String browser;
	String projectlocation = System.getProperty("user.dir");
	
	@BeforeSuite
	public void setUp () {
		
		if (driver==null) {
			
			try {
				fis = new FileInputStream (projectlocation+"/src/main/resources/propertyFiles/config.properties");
		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				fis = new FileInputStream (projectlocation+"/src/main/resources/propertyFiles/OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//Parameterizing build browser 
	if(System.getenv("browser")!=null && System.getenv("browser").isEmpty()) {
				
				browser = System.getenv("browser");
			}else {
				browser = config.getProperty("browser");
			}
			config.setProperty("browser", browser);
		
			if(config.getProperty("browser").equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if (config.getProperty("browser").equals("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();		
		}
	}
	@AfterSuite
	public void afterRunning() {
		driver.close();
		driver.quit();
	}

}
