package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestClassForListeners {
	

	@Test
	public void login()
	{
		System.out.println("Login to application");
		
		Assert.assertTrue(false);
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
	@Test
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	@Test(dependsOnMethods = "login")
	public void home()
	{
		System.out.println("home Test case");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout Test case");
		
		Assert.assertEquals(false, true);
	}
}
