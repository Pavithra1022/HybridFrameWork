package com.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	
	
	private WebDriver driver;
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	public void launchurl(String url)
	{
		driver.get(url);
	}
	 public WebElement getelement(By locator)
	 {
		 return driver.findElement(locator);
	 }
	 
	 public List<WebElement> getelements(By locator)
	 {
		 return driver.findElements(locator);
	 }
	 
	 public void click(By locator)
	 {
		 getelement(locator).click();
	 }
	 public void sendkeys(By locator, String Data)
	 {
		 getelement(locator).sendKeys(Data);
	 }
	 
	 public String gettext(By locator)
	 {
		 return getelement(locator).getText();
	 }
	 
    public boolean iselementdisplayed(By locator)
    {
    	return getelement(locator).isDisplayed();
    }
    public List<String> getelementstext(By locator)
    {
        List<WebElement> webelement1 = getelements(locator);
        List <String> allelements = new ArrayList();
        for(WebElement s :webelement1)
        {
        	String s1 = s.getText();
        	allelements.add(s1);
        }
    	 return allelements;    
    }
    public String gettitle()
    {
    	return driver.getTitle();
    }
    public String geturl()
    {
    	return driver.getCurrentUrl();
    }
}
