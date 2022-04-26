package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
	

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
	
	@Test
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
