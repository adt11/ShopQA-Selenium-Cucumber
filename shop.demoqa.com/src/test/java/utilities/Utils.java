package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utils {

	private static Logger logger;
	private static Properties prop;
	private static FileInputStream fis;
	public static String rpath = System.getProperty("user.dir")+"/src/test/resources/";
	public static String spath = System.getProperty("user.dir")+"/src/test/java/";
	
	public static String getProperty(String str) {
		
		prop = new Properties();
		try{
			
			fis = new FileInputStream(rpath+"PropertyFiles/config.properties");
			prop.load(fis);
		}catch(IOException io) {
			io.printStackTrace();
		}
		return prop.getProperty(str);
		
	}
	
	public static Logger LogInfo() {
		
		logger = Logger.getLogger("shop.demoqa.com");
		PropertyConfigurator.configure(rpath+"PropertyFiles/log4j.properties");
		return logger;
	}
}
