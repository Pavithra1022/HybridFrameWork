package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.actory.Driverfactory;
import com.qa.utils.constants;

public class Logintest extends BaseTest {
	
	@Test(priority = 1)
	public void loginpagetitleTest()
	{
		 String expectedtitle = loginpage.gettitle();
		 System.out.println(expectedtitle);
		 Assert.assertEquals(expectedtitle,constants.LOGINPAGE_TITLE);
	}
	@Test(priority = 4)
	public void loginopencart()
	{
		loginpage.setusnmpswd(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 6)
	public void loginappTest()
	{
		String ecpecctedurl = loginpage.geturl();
		System.out.println(ecpecctedurl);
		 Assert.assertEquals(ecpecctedurl,constants.Accountspage_url);
	}
	
	@Test(priority=3)
	public void loginlinktest()
	{
		boolean loginlinktext = loginpage.loginlinexists();
		Assert.assertEquals(loginlinktext,"Account Login");
	}
	@Test(priority = 2)
	public void forgottenpswdlintest()
	{
	 Assert.assertTrue(loginpage.forgottenpswdlin());
		
	}
	@Test(priority = 5)
	public void clickloginbn()
	{
		loginpage.clicllogin();
	}
    	
	
}
                                            