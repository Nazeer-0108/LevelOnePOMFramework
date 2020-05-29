package leaftap.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class EditLeadPage extends ProjectSpecificationMethod 
{
	public EditLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public EditLeadPage clickEditButton() throws InterruptedException
	{
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(500);
		return this;
	}
	
	public EditLeadPage editTitle(String data)
	{
		driver.findElementById("updateLeadForm_generalProfTitle").clear();
		driver.findElementById("updateLeadForm_generalProfTitle").sendKeys(data);
		return this;
	}
	
	public EditLeadPage editDescription(String data)
	{
		driver.findElementById("updateLeadForm_description").clear();
		driver.findElementById("updateLeadForm_description").sendKeys(data);
		return this;
	}
	
	public EditLeadPage clickUpdate() throws InterruptedException
	{
		driver.findElementByName("submitButton").click();
		Thread.sleep(500);
		System.out.println("Update lead done");
		return this;
	}
		
}
