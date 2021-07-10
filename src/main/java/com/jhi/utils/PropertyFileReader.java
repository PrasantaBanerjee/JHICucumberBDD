package com.jhi.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	private FileInputStream fis;
	private Properties prop;
	private final String configFilepath = ".\\src\\main\\resources\\config.properties";

	public PropertyFileReader() {
		try {
			fis = new FileInputStream(configFilepath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}
}
