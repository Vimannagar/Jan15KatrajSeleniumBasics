package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase1 {
	
	@Test(groups = {"Sanity" , "Regression"})
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test(groups = "Sanity")
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
	
	@Test(groups = {"Regression", "functional"})
	public void profile()
	{
		System.out.println("Profile Test case");
	}
	
	@Test(groups = {"functional", "Sanity", "Regression"})
	public void home()
	{
		System.out.println("home Test case");
	}
	
	@Test(groups = "Sanity")
	public void logout()
	{
		System.out.println("logout Test case");
	}

	
	

}
