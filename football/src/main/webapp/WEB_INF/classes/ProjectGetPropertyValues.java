package main.webapp.WEB_INF.classes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * Loads the psql data base config files
 */

public class ProjectGetPropertyValues {
    String result = "";
	InputStream inputStream;
 
	public HashMap<String,String> getPropValues() throws IOException {
		HashMap<String, String> variables = new HashMap<>();
 
		try {
			Properties prop = new Properties();
			String propFileName = "main/resources/config/config.properties";

 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			variables.put("DB_PORT", prop.getProperty("DB_PORT"));
			variables.put("DB_SERVER", prop.getProperty("DB_SERVER"));
			variables.put("DB_USER", prop.getProperty("DB_USER"));
			variables.put("DB_PASSWORD", prop.getProperty("DB_PASSWORD"));
			variables.put("DB_NAME", prop.getProperty("DB_NAME"));
 
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return variables;
	}
}
