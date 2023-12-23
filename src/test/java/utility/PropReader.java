package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropReader {

	public static String readProperties(String key) {
		String val="";
		String path=System.getProperty("user.dir")+"//src//test//resources//config.properties";
		Properties prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(path);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		val=prop.getProperty(key);
		return val;
	}
	
	
	
}
