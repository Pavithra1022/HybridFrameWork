package com.qa.actory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	private Properties prop;
	private WebDriver driver;
	public  Properties init_property()
	{
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\HybridFramework\\resources\\config\\config.properties");
			prop = new Properties();
				prop.load(fis);
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		}
	
	public WebDriver init_browser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(init_property().getProperty("url"));
		driver.manage().window().maximize();

		return driver;
		
	}

}
