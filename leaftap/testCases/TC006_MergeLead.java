package leaftap.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.HomePage;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;
import leaftap.pages.MyHomePage;
import leaftap.pages.MyLeadsPage;
import leaftap.pages.ViewLeadPage;
import leaftap.pages.MergeLeadPage;

public class TC006_MergeLead extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "MergeLead";
	}
	
	@Test(dataProvider = "getData")
	public void duplicateLead(String uName, String pwd) throws InterruptedException
	{
		System.out.println("Merge Lead starts here ***************");
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();

		new HomePage(driver).clickCRMSFALink();
		
		new MyHomePage(driver).clickLeadsMenu();
		
		new MyLeadsPage(driver).clickMergeLead();
		
		new MergeLeadPage(driver)
		.clickFromLeadImage()
		.clickToLeadImage()
		.clickMergeButton()
		.clickMergeAlert();

		new ViewLeadPage(driver).GetCompanyName();
	
		System.out.println("Merge Lead ends here ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage(driver).clickTestLeafLogout();
	}
	
}
