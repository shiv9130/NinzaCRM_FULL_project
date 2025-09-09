package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	//Read data from properties
	public String toReadDataFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./configAppData/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
