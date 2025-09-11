package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import exceptionsUtility.ElementNotFoundException;

public class PropertyFileUtility {
	
	//Read data from properties
	public String toReadDataFromProperties(String key) throws IOException {
		
		
		 try {
			 FileInputStream fis = new FileInputStream("./src/main/resources/Browser.properties");
				Properties prop = new Properties();
				prop.load(fis);
				String data = prop.getProperty(key);
				return data;
	        } catch (Exception e) {
	            throw new ElementNotFoundException("Login page elements not found: " + e.getMessage());
	        }
	}

}
