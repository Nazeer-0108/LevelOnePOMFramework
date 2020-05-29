package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class MyHomePage extends ProjectSpecificationMethod
{
	public MyHomePage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeadsMenu()
	{
		System.out.println("My-Home page to My-Leads Page");
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage(driver);
	}
	
}

