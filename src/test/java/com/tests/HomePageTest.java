package com.tests;

import org.testng.annotations.Test;

import com.POM.Methods.HomePage;
import com.generic.Base;

public class HomePageTest extends Base
{

	

	@Test
	public void valiDateHomePage() {
		
		HomePage homePage = new HomePage(super.driver);
		homePage.getHomePageTitle();
	}
	
	
	
}
