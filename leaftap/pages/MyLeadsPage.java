package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import leaftap.api.ProjectSpecificationMethod;

public class MyLeadsPage extends ProjectSpecificationMethod
{
	public MyLeadsPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public MergeLeadPage clickMergeLead()
	{
		System.out.println("MyLeads page to Merge Lead Page");
		driver.findElementByXPath("(//a[@href= '/crmsfa/control/mergeLeadsForm'])").click();
		return new MergeLeadPage(driver);
	}
	
	public CreateLeadPage clickCreateLeadLink()
	{
		System.out.println("My Leads Page to Create Lead Page");
		driver.findElementByXPath("//a[contains(text(), 'Create Lead')]").click();
		return new CreateLeadPage(driver); 
	}
	
	public FindLeadPage clickFindLeadsLink()
	{
		System.out.println("My Leads Page to Find Lead Page");
		driver.findElementByXPath("//a[contains(text(), 'Find Leads')]").click();
		return new FindLeadPage(driver);
	}
	
}

