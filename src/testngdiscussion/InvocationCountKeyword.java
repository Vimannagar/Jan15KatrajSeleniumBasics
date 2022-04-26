package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	@Test(invocationCount = 5, priority = -1)
	public void home()
	{
		System.out.println("home Test case");
	}

	
	@Test
	public void logout()
	{
		System.out.println("logout Test case");
	}

	
	@Test(priority = 56)
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
}
