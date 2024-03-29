package com.generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.POM.Methods.HomePage;
import com.POM.Methods.LoginPage;

public class Base {
	public WebDriver driver;
	public WebDriverUtility driverUtility;

	@BeforeClass
	public void getDriver() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888");

		driverUtility = new WebDriverUtility(driver);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	@BeforeMethod
	public void loginToApp() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}

	@AfterMethod
	public void logOutApp() {
		HomePage hp = new HomePage(driver);
		hp.logOutFromApp();
	}

}
