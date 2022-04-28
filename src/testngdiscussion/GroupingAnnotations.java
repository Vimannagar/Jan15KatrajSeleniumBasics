package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingAnnotations {

	@BeforeGroups("Sanity")
	public void beforeGroup()
	{
		System.out.println("Before group of sanity");
	}
	
	@AfterGroups("Sanity")
	public void afterGroup()
	{
		System.out.println("After group of sanity");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite is executing");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test method");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite is executing");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("After method");
	}
	
	@Test(groups = "Sanity")
	public void loginTest()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void logoutTest()
	{
		System.out.println("Logout to application");
	}

	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	
	
}
