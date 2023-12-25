package com.POM.Methods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.POM.Elements.HomePageElements;
import com.generic.WebDriverUtility;

public class HomePage extends WebDriverUtility implements HomePageElements {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void getHomePageTitle() 
	{
	
		String actualtext=getTextFromElement(homePageLink);
		Assert.assertEquals("Home", actualtext);
		
	}
	
	public void logOutFromApp() {
		mouseHover(profileImage);
		clickOnElement(signOutBtn);
	}

}
