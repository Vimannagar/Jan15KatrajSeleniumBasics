package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualUsageExampleOfAnnotations {
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Opening the browser");
	}
	@AfterTest
	public void navBackToOriginalURL()
	{
		System.out.println("Navigate back to original URL");
	}
	
	
	@AfterSuite
	public void quitBrowser()
	{
		System.out.println("Closing the browser");
	}
	
	@BeforeTest
	public void navToURL()
	{
		System.out.println("Navigate to URL");
	}
	@BeforeClass
	public void loginToApp()
	{
		System.out.println("Login to application");
	}
	
	@AfterClass
	public void logoutFromApp()
	{
		System.out.println("Logout from application");
	}
	
	@AfterMethod
	public void navBackToHome()
	{
		System.out.println("Navigating back to home page");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}

	@BeforeMethod
	public void navToTestCaseURL()
	{
		System.out.println("Navigating to the test url");
	}
	
	
	
}
