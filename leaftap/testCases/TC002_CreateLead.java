package leaftap.testCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.CreateLeadPage;
import leaftap.pages.HomePage;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;
import leaftap.pages.MyHomePage;
import leaftap.pages.MyLeadsPage;

public class TC002_CreateLead extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "CreateLead";
	}
	
	@Test(dataProvider = "getData")
	public void createLead(String uName, String pwd, String cName, String fName, String lName, String phone, String email, String source)
	{
		System.out.println("Create Lead starts heree ***************");
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		
		new HomePage(driver).clickCRMSFALink();
		
		new MyHomePage(driver).clickLeadsMenu();
		
		new MyLeadsPage(driver).clickCreateLeadLink();
		
		new CreateLeadPage(driver)
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNumber(phone)
		.enterEmailID(email)
		.selectSource(source)
		.clickCreateLeadButton()
		.LeadID();

		System.out.println("Create Lead done for " + fName+ " " + lName);
		System.out.println("Create Lead ends heree ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage(driver).clickTestLeafLogout();
	}
}
