package leaftap.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class DuplicateLeadPage extends ProjectSpecificationMethod 
{
	public DuplicateLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public DuplicateLeadPage clickDuplicateButton() throws InterruptedException
	{
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(500);
		return this;
	}
	
	public DuplicateLeadPage enterIndustry(String data)
	{
		driver.findElementById("createLeadForm_industryEnumId").sendKeys(data);
		return this;
	}
	
	public ViewLeadPage clickSubmitDuplicateLead() throws InterruptedException
	{
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(500);
		return new ViewLeadPage(driver);
	}
	
	
}
