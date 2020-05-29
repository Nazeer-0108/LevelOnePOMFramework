package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class ViewLeadPage extends ProjectSpecificationMethod
{
	String leadFirstName;
	String duplicateLeadName;
	String mergedCompName;
	
	public ViewLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public ViewLeadPage LeadID()
	{
		System.out.println("View lead");
		String fullLeadID = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Lead ID with name is: " + fullLeadID);
		String[] leadID1 = fullLeadID.split(" ");
		for (int i = 0; i < leadID1.length; i++) 
		{
			System.out.println("Lead ID is: " + leadID1[i]);
		}
		return this;
	}
	
	public ViewLeadPage GetLeadName()
	{
		leadFirstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Lead's First Name is " + leadFirstName);
		return this;
	}
	
	public ViewLeadPage GetDuplicateLeadName()
	{
		duplicateLeadName = driver.findElementById("viewLead_firstName_sp").getText();
		if (leadFirstName.equals(duplicateLeadName))
		{
			System.out.println("Duplicate Lead Name is same as Original Lead Name - " + duplicateLeadName);
		}
		else
		{
			System.out.println("The Duplicate Lead Name is not same as Original Lead Name");
		}
		return this;
	}
		
		public ViewLeadPage GetCompanyName()
		{
			mergedCompName = driver.findElementById("viewLead_companyName_sp").getText();
			System.out.println("Merged Company Name is " + mergedCompName);
			return this;
		}
		
}

