package com.POM.Methods;

import org.openqa.selenium.WebDriver;

import com.POM.Elements.OrganizationPageElements;
import com.generic.WebDriverUtility;

public class OrganizationPage  extends WebDriverUtility implements OrganizationPageElements  {

	public OrganizationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnOrgPage() {
		
	}
	
	public void createOrg() {
		clickOnElement(organizationModule);
		clickOnElement(createOrgBtn);
		enterData(orgNameTextbox, "DELL India");
		selectFromDropDown(industruDD, "Energy");
		clickOnElement(orgSaveBtn);	
	}

}
