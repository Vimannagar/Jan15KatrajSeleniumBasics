package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethods {
	
	
	@Test(priority = 1)
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login Test case");
	}
	
	@Test(priority = 3)
	public void home()
	{
		System.out.println("Home test case");
	}
	

}
