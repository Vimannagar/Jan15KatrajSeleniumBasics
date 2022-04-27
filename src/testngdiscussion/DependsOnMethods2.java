package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	@Test(dependsOnMethods = "testngdiscussion.DependsOnMethodsKeyword.homePage", priority = 4)
	public void profile()
	{
		System.out.println("Profile Test case");
	}

	
	@Test(priority = 5)
	public void dashBoard()
	{
		System.out.println("dashboard Test case");
	}

}
