package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class LogoutPage extends ProjectSpecificationMethod
{
	public LogoutPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage clickTestLeafLogout()
	{
		driver.findElementByXPath("//a[contains(text(), 'Logout')]").click();
		System.out.println("Logout from TestLeaf page");
		System.out.println("************************************************************************");
		return new LoginPage(driver);
	}
	
	public LoginPage clickHomePageLogout()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Logout from Home page");
		System.out.println("************************************************************************");
		return new LoginPage(driver);
	}
}
