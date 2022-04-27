package testngdiscussion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	@Test
	public void home()
	{
		System.out.println("home Test case");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout Test case");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test method");
	}
	
}
