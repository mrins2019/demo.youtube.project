package com.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLib {

	String filePath = "./config.properties";

	public String getPropertiesData(String key) throws Exception{
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(filePath));
			if (prop.isEmpty()){
				throw new Exception();
			}else{
				System.out.println(prop.getProperty(key));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}

