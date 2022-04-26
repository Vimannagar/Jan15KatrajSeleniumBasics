package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test(priority = 56)
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
	@Test(priority = -400)
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	@Test(priority = 389)
	public void home()
	{
		System.out.println("home Test case");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout Test case");
	}

}
