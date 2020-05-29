package leaftap.api;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftap.utils.ReadExcel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificationMethod
{
	public RemoteWebDriver driver;
	public String excelFile;
	
	@BeforeMethod
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://leaftaps.com/opentaps");
	}
	
	@DataProvider
	public String[][] getData () throws IOException
	{
		return new ReadExcel().readExcel(excelFile);
	}
	
	@AfterMethod
	public void winClose() 
	{
		driver.close();
	}
}