package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility 
{
	protected WebDriver driver;


	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}

	public void enterData(By locator,String data)
	{
		driver.findElement(locator).sendKeys(data);
	}

	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}

	public String getTextFromElement(By locator) {
		String str=driver.findElement(locator).getText();
		return str;
	}
	
	public void mouseHover(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locator)).build().perform();
	} 
	
	public void selectFromDropDown(By locator,String text) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(text);
	}

}
