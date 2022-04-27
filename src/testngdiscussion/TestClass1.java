package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite is executing");
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
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
	
	
}
