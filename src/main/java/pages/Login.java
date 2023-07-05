package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='userEmail']") WebElement username;
	@FindBy(xpath = "//*[@id='userPassword']") WebElement password;
	@FindBy(xpath = "//*[@id='login']") WebElement loginbutton;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterCredential()
	{
		username.sendKeys("stevenholmes@gmail.com");
		password.sendKeys("Aa123456789");
	}
	
	public void verifyLoginbutton()
	{
		loginbutton.click();
	}

}
