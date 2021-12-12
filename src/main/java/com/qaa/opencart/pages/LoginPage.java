package com.qaa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class LoginPage {

	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbtn = By.xpath("//*[@value='Login']");
	private By loginlink = By.className("(//li/a[text()='Login'])[2]");
	private By forgtnpswdlink = By.xpath("//*[text()='Forgotten Password']");

	private WebDriver driver;
	private ElementUtils elementUtils;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}

	public void clicllogin() {
		elementUtils.click(loginbtn);
	}

	public boolean loginlinexists() {
		return elementUtils.iselementdisplayed(loginlink);
	}

	public boolean forgottenpswdlin() {
		return elementUtils.iselementdisplayed(forgtnpswdlink);
	}

	public void setusnmpswd(String usnm, String pswd) {
		elementUtils.sendkeys(username, usnm);
		elementUtils.sendkeys(password, pswd);

	}

	public String gettitle() {
		return elementUtils.gettitle();
	}

	public String geturl() {
		return elementUtils.geturl();
	}

}