package com.swaglabs.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyReader {

	@Test
	public static String retrieveProperty(String key) {

		Properties properties = new Properties();
		InputStream inputStream = null;

		try {
			inputStream = new FileInputStream("env.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String value = properties.getProperty(key);
		return value;

	}

}
