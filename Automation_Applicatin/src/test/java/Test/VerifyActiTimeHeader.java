package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.ActitimeHeader;
import Pom.LogInPageClass;



public class VerifyActiTimeHeader {
	 private WebDriver driver ;
	private ActitimeHeader actitimeheader;
	
	@BeforeClass
	public void lounchBrowser() {
		System.out.println("lounchBrowser");
		System.setProperty("webdriver.chrome.driver","D:\\\\VELOCITY CLASS\\\\Automation testing\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.manage().window().maximize();
		}

	//Before method
	@BeforeMethod
	public void  loginActitime (){
		//System.out.println("loginActitime");
        driver.get("http://localhost/login.do");
		LogInPageClass loginpage = new LogInPageClass(driver);
		loginpage.sendUserName();
		loginpage.sendPassWord();
		loginpage.clickOnLoginButton();
		System.out.println("loginActitime");
		 actitimeheader =new ActitimeHeader(driver);
		}
	
	@Test (priority =1)
	public void verifyUserTab() {
		System.out.println("VerifyUserTab");
		actitimeheader.clickOnUserTab();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("http://localhost/administration/userlist.do"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}	
	}

	@Test (priority=2)
	public void toVerifyReportTab() {
		System.out.println("toVerifyReportTab");
		actitimeheader.clickOnReportTab();
		String url =driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("http://localhost/reports/reports.do"))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	
	@AfterMethod
	public void logOutFromActitime() {
		System.out.println("logOutFromActitime");
		actitimeheader.clicOnLogout();
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		System.out.println("BrowserIsClosed");
	}
	

}
