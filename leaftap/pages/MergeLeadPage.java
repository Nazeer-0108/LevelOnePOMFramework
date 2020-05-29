package leaftap.pages;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.api.ProjectSpecificationMethod;

public class MergeLeadPage extends ProjectSpecificationMethod 
{
	public MergeLeadPage(RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public MergeLeadPage clickFromLeadImage() throws InterruptedException
	{
		driver.findElementByXPath("(//img[@src= '/images/fieldlookup.gif'])[1]").click();
		Thread.sleep(500);
		Set <String> setWin1 = driver.getWindowHandles();
		List<String> lstWin1 = new ArrayList<String>(setWin1);
		driver.switchTo().window(lstWin1.get(1));
		System.out.println(driver.getTitle());
		System.out.println("From Contact: " + driver.findElementByXPath("//a[@class='linktext'][1]").getText());
		driver.findElementByXPath("//a[@class='linktext'][1]").click();
		Thread.sleep(500);
		Set <String> setWin2 = driver.getWindowHandles();
		List<String> lstWin2 = new ArrayList<String>(setWin2);
		driver.switchTo().window(lstWin2.get(0));
		System.out.println(driver.getTitle());
		return this;
	}
	
	public MergeLeadPage clickToLeadImage() throws InterruptedException
	{
		driver.findElementByXPath("(//img[@src= '/images/fieldlookup.gif'])[2]").click();
		Set <String> setWin3 = driver.getWindowHandles();
		List<String> lstWin3 = new ArrayList<String>(setWin3);
		driver.switchTo().window(lstWin3.get(1));
		System.out.println(driver.getTitle());
		System.out.println("To Contact: " + driver.findElementByXPath("(//tbody/tr//div[@unselectable='on']/a[@class='linktext'])[6]").getText());
		driver.findElementByXPath("(//tbody/tr//div[@unselectable='on']/a[@class='linktext'])[6]").click();
		Thread.sleep(500);
		Set <String> setWin4 = driver.getWindowHandles();
		List<String> lstWin4 = new ArrayList<String>(setWin4);
		driver.switchTo().window(lstWin4.get(0));
		System.out.println(driver.getTitle());
		return this;
	}
	
	public MergeLeadPage clickMergeButton()
	{
		driver.findElementByClassName("buttonDangerous").click();
		return this;
	}
	
	public ViewLeadPage clickMergeAlert()
	{
		driver.switchTo().alert().accept();
		System.out.println("Title of the page: " + driver.getTitle());
		return new ViewLeadPage(driver);
	}

}
