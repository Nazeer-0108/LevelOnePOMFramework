package leaftap.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.DeleteLeadPage;
import leaftap.pages.FindLeadPage;
import leaftap.pages.HomePage;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;
import leaftap.pages.MyHomePage;
import leaftap.pages.MyLeadsPage;


public class TC004_DeleteLead extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "DeleteLead";
	}
	
	@Test(dataProvider = "getData")
	public void deleteLead(String uName, String pwd, String phone) throws InterruptedException
	{
		System.out.println("Delete Lead starts here ***************");
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();

		new HomePage(driver).clickCRMSFALink();
		
		new MyHomePage(driver).clickLeadsMenu();
		
		new MyLeadsPage(driver).clickFindLeadsLink();
		
		new FindLeadPage(driver)
		.clickPhoneTab()
		.phoneNumberSearch(phone)
		.clickFindLeadButton();
	
		new DeleteLeadPage(driver).clickDeleteButton();
		
		System.out.println("Delete done for phone number: " + phone);
		System.out.println("Delete Lead ends here ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage(driver).clickTestLeafLogout();
	}
	
}
