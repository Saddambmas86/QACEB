package ceb.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utility1 {
	
public static String fetchValueFromFile(String key) throws Exception{
	FileInputStream Fin=new FileInputStream("./config/property");
	Properties property=new Properties();
	property.load(Fin);
	return property.get(key).toString();
}
}
