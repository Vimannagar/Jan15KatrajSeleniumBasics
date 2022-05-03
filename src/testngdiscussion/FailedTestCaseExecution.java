package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExecution {
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
	
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
		
		Assert.assertEquals(false, false);
	}

	
	@Test(dependsOnMethods = "dashBoard")
	public void profile()
	{
		System.out.println("profile to application");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout Test case");
	}
}
