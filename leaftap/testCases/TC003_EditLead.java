package leaftap.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.EditLeadPage;
import leaftap.pages.FindLeadPage;
import leaftap.pages.HomePage;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;
import leaftap.pages.MyHomePage;
import leaftap.pages.MyLeadsPage;
import leaftap.pages.ViewLeadPage;

public class TC003_EditLead extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "EditLead";
	}
	
	@Test(dataProvider = "getData")
	public void editLead(String uName, String pwd, String phone, String title, String desc) throws InterruptedException
	{
		System.out.println("Edit Lead starts here ***************");
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
		.clickFindLeadButton()
		.clickFirstLeadID();
		
		
		new EditLeadPage(driver)
		.clickEditButton()
		.editTitle(title)
		.editDescription(desc)
		.clickUpdate();
		
		new ViewLeadPage(driver).LeadID();
		
		System.out.println("Edit Lead done for the Phone Number " + phone);
		System.out.println("Edit Lead ends here ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage(driver).clickTestLeafLogout();
	}
	
}
