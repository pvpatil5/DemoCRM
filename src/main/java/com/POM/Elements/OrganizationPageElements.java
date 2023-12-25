package com.POM.Elements;

import org.openqa.selenium.By;

public interface OrganizationPageElements {
	By organizationModule=By.xpath("//a[@href='index.php?module=Accounts&action=index']");
	By createOrgBtn=By.xpath("//img[@alt='Create Organization...']");
	By searchOrgTextBox= By.name("search_text");
	By orgtypeDD=By.id("bas_searchfield");
	By searchOrgBtn= By.name("submit");
	By searchedOrgText=By.xpath("(//a[@title='Organizations'])[1]");
	By OrgText=By.xpath("//a[@href='index.php?action=ListView&module=Accounts&parenttab=Marketing']");
	By orgNameTextbox=By.name("accountname");
	By industruDD=By.name("industry");
	By orgSaveBtn=By.xpath("//input[@accesskey='S']");

}
