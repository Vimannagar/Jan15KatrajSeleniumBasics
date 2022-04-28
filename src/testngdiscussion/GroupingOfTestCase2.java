package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {
	
	
	@Test(groups = "functional")
	public void admin()
	{
		System.out.println("admin application");
	}
	
	@Test(groups = "Sanity")
	public void myInfo()
	{
		System.out.println("My info Test case");
	}
	
	@Test(groups = "Regression")
	public void buyShares()
	{
		System.out.println("buy share Test case");
	}
	
	@Test(groups = "Regression")
	public void sellShares()
	{
		System.out.println("sell shares Test case");
	}
	
	@Test(groups = "Sanity")
	public void searchShares()
	{
		System.out.println("search shares Test case");
	}

}
