package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends ProjectSpecificationMethod 
{
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUserName (String data)
	{
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	
	public LoginPage enterPassword (String data)
	{
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}
	
	
	
}
