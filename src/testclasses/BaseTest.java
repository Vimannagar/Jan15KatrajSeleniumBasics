package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;
import pages.LoginPageAdvance;

public class BaseTest {
	static WebDriver driver;
	LoginPageAdvance lp;
	@BeforeSuite
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/");
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@BeforeClass
	public void objectCreation()
	{
		 lp = new LoginPageAdvance(driver);
	}

}
