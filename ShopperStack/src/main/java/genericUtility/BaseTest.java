package genericUtility;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.Register.HomePage;
import com.ShoppersStack.Register.LoginPage;
import com.ShoppersStack.Register.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest 
{
	public WebDriver driver;
	public static WebDriver listenersDriver;
	public FileUtility file=new FileUtility();
	public WebdriverUtility webdriverutil=new WebdriverUtility();
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public JavaUtility java=new JavaUtility();
	public HomePage homepage;
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuit");
		spark=new ExtentSparkReporter("./Reports"+java.localDateTime()+".html");
		
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest");
		report=new ExtentReports();
		report.attachReporter(spark);
		test=report.createTest("demo");
	}
	
	@BeforeClass
	public void bc() throws IOException
	{
		String url=file.readPropertyData("url");
		String browser=file.readPropertyData("browser");
		
		//String url=System.getProperty("url");

		//String browser=System.getProperty("browser");
		
		System.out.println("BeforeClass");
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide proper browser");
		}
		listenersDriver=driver;
		homepage=new HomePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(url);

	}
	
	@BeforeMethod
	public void bm() throws IOException, InterruptedException
	{
		System.out.println("BeforeMethod");
		test.log(Status.INFO, "navigated");
		
		WelcomePage welcome=new WelcomePage(driver);
		Thread.sleep(10000);
		welcome.getLoginButton().click();
		
		LoginPage page=new LoginPage(driver);
		page.getEmail().sendKeys(file.readPropertyData("username"));
		page.getPassword().sendKeys(file.readPropertyData("password"));
		page.getLoginBtn().click();
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
		homepage.getProfileSetting().click();
		homepage.getLogout().click();
	}
	
	@AfterClass
	public void ac() throws InterruptedException
	{
		System.out.println("AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("AfterTest");
		report.flush();
	}
}
