package leaftap.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import leaftap.api.ProjectSpecificationMethod;

public class CreateLeadPage extends ProjectSpecificationMethod 
{
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage enterCompanyName(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage enterLastName(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber(String data)
	{
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage enterEmailID(String data)
	{
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(data);
		return this;
	}
	
	public CreateLeadPage selectSource(String data)
	{
		driver.findElementById("createLeadForm_dataSourceId").sendKeys(data);
		//WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
		//Select sourceDD = new Select(eleDD1);
		//sourceDD.selectByVisibleText("Employee");
		return this;	
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage(driver);
	}
	
	
	
}
