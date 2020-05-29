package leaftap.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;

public class TC001_LoginLogout extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "LoginSheet";
	}
	
	@Test(dataProvider = "getData") 
	public void loginLogout(String uName, String pwd)
	{
		System.out.println("Login page starts heree ***************");
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
	
		System.out.println("Login & Logout done for " + uName);
		System.out.println("Login page ends heree ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage(driver).clickHomePageLogout();
	}
	
}
