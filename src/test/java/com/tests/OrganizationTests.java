package com.tests;

import org.testng.annotations.Test;

import com.POM.Methods.OrganizationPage;
import com.generic.Base;

public class OrganizationTests extends Base{

	
	@Test
	public void createOrg() {
		OrganizationPage organizationPage = new OrganizationPage(super.driver);
		organizationPage.createOrg();
	}
}
