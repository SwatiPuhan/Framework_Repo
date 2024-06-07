package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass 
{
	public static WebDriver driver;
	public FileUtility flib;
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileUtility flib = new FileUtility();
		String URL=flib.getDataFromProperty("url");
		driver.get(URL);
	}
	@BeforeMethod
	public void login() throws IOException 
	{
		wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		lp=new LoginPage(driver);
		String EMAIL = flib.getDataFromProperty("email");
		String PASSWORD = flib.getDataFromProperty("password");
		lp.getEmailTextField().sendKeys(EMAIL);
		lp.getPwdTextField().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		
	}
	@AfterMethod
	public void logout()
	{
		hp=new HomePage(driver);
		hp.getLogoutLink().click();
		
	}
	@AfterClass
	private void closeBrowser() 
	{
		driver.quit();
		

	}

}
