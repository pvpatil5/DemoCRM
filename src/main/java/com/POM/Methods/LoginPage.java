package com.POM.Methods;

import org.openqa.selenium.WebDriver;

import com.POM.Elements.LoginPageElemets;
import com.generic.WebDriverUtility;

public class LoginPage extends WebDriverUtility implements LoginPageElemets 
{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	public void login() 
	{
		enterData(userNametxtBox, "admin");
		enterData(passwordtxtbox, "12345");
		clickOnElement(loginbtn);
	}
}
