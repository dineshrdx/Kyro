package com.kyro.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
	public static Properties p;
	public configurationReader() throws IOException {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\KyroCucumber\\src\\test\\java\\com\\kyro\\properties\\confriguration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;
	}
	public  String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
}
