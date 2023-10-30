package utilites;

import java.io.FileInputStream;
import java.util.Properties;

import baseContainer.TestBase;

public class utility extends TestBase{
	
String projectlocation = System.getProperty("user.dir");
	
	public String fetchconfig(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/src/main/resources/propertyfiles/config.properties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String fetchLocators(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/src/main/resources/propertyFiles/OR.propperties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String fetchData(String key) throws Exception{
		// parentName childName = new parentName();
		FileInputStream file = new FileInputStream(projectlocation+"/src/main/resources/propertyFiles/dataSaver.properties");
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String verifyAccount() {
		
		driver.navigate();
		return "";
	}

}
