package leaftap.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class FindLeadPage extends ProjectSpecificationMethod 
{
	String leadID;
	public FindLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public FindLeadPage clickPhoneTab()
	{
		System.out.println("Phone Tab");
		driver.findElementByXPath("//span[contains(text(), 'Phone')]").click();
		return this;
	}
	
	public FindLeadPage phoneNumberSearch(String data)
	{
		System.out.println("Phone Number: "+ data);
		driver.findElementByName("phoneNumber").sendKeys(data);
		return this;
	}
	
	public FindLeadPage clickFindLeadButton() throws InterruptedException
	{
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@type='button'])[7]").click();
		Thread.sleep(500);
		return this;
	}
	
	public EditLeadPage clickFirstLeadID()
	{
		leadID = driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").getText();
		System.out.println("Lead ID is: " + leadID);
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		return new EditLeadPage(driver);
	}
	
	
}
