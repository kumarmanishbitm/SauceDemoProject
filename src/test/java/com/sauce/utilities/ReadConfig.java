package com.sauce.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path = "D:\\Manish\\Framework630\\Configuration\\Config.properties";
	
	// Constructor
	public ReadConfig(){
		try{
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// method to read keys value from property file
	
	public String getBaseURL(){
		String value  = properties.getProperty("baseURL");
		if(value!=null)
			return value;
		
		else
			throw new RuntimeException("URL is not in property file.");
		}
	
		public String getBrowser(){
			String value  = properties.getProperty("browser");
			if(value!=null)
				return value;
			
			else
				throw new RuntimeException("Browser is not in property file.");
			}


}
