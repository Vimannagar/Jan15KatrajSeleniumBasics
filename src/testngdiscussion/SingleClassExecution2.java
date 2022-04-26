package testngdiscussion;

import org.testng.annotations.Test;

public class SingleClassExecution2 {
	
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

}
