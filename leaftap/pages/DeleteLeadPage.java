package leaftap.pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class DeleteLeadPage extends ProjectSpecificationMethod 
{
	public DeleteLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public DeleteLeadPage clickDeleteButton() throws InterruptedException
	{
		String deleteLeadID = driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").getText();
		System.out.println("Lead ID to delete is: " + deleteLeadID);
		driver.findElementByXPath("(//tbody/tr//div[@unselectable ='on']/a[@class='linktext'])[1]").click();
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(500);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(deleteLeadID);
		driver.findElementByXPath("(//tbody/tr//em[@unselectable='on']/button[@type='button'])[7]").click();
		Thread.sleep(500);
		String searchResult = driver.findElementByClassName("x-paging-info").getText();
		System.out.println("Search Result after delete is: " + searchResult);
		Thread.sleep(500);  
		return this;
	}
	
			
}
