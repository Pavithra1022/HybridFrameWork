package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.actory.Driverfactory;
import com.qaa.opencart.pages.LoginPage;


public class BaseTest {
	
	 public Driverfactory driverfactory;
	 public WebDriver driver;
	 public LoginPage loginpage;
	 public Properties prop;
	
	 @BeforeTest()
	 public void setup()
	{
		 Driverfactory driverfactory = new Driverfactory();
		 prop = driverfactory.init_property();
		driver = driverfactory.init_browser();
		LoginPage loginpage = new LoginPage(driver);
	}
	
	
	 @AfterTest() public void teardown() { driver.quit(); }
	 
	 
	 

}
