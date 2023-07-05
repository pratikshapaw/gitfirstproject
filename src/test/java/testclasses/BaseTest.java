package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.Login;

public class BaseTest {
	
	WebDriver driver;
	Login login;
	
	@BeforeSuite
	public void initBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.rahulshettyacademy.com/client");
	}
	
	@BeforeClass
	public void createObject()
	{
		login = new Login(driver);
	}


}
