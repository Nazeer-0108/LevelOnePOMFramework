package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod
{
	public HomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFALink()
	{
		System.out.println("CRMSFA Home page to My Home Page");
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}
	
}

