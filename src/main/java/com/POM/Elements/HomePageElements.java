package com.POM.Elements;

import org.openqa.selenium.By;

public interface HomePageElements {

	
	By homePageLink= By.xpath("//a[@href='index.php?action=index&module=Home']");

	By profileImage=By.xpath("//img[@src='themes/softed/images/user.PNG']");
	By signOutBtn= By.xpath("//a[text()='Sign Out']");


}
